-- ex23_view.sql

/*

뷰(view)
  - DB Object중 하나(테이블, 시퀀스, 제약사항, 뷰...)
  - 가상 테이블, 테이블 복사본
  - 뷰 테이블 -> 실제 테이블처럼 취급한다.
  - 장점(개발자 입장) -> 코드 비용 감소 + 가독성 향상 + 생산성 향상
  - 장점(서버 입장) -> 네트워크 트래픽 감소 + 서버 처리 일부 생략 + 비용 감소 + 시스템 처리 속도 향상
  - 자주 사용하는 select의 결과를 저장하는 용도로 잘 쓴다.
  
  -- 뷰는 결과셋의 복사본이 아니라 select 쿼리 자체를 저장하는 객체이다.(***********************************************)
  
  -- 뷰는 읽기전용으로 사용한다.(************************) > select만 사용

생성
create view 뷰이름
as
select문;

삭제
drop view 뷰이름;

뷰의 종류
1. 단순 뷰
  - 하나의 테이블을 사용해서 만든 뷰

2. 복합 뷰
  - 두개 이상의 테이블을 사용해서 만든 뷰
  - join, union, subquery

*/

-- vwInsa -> tblInsa 복사본 느낌
create view vwInsa
as
select * from tblInsa;

-- 뷰 호출하기(사용하기)
select * from vwInsa;

-- ORA-00955: name is already used by an existing object (이미 뷰가 존재)
create view vwInsa
as
select * from tblInsa;

-- [or replace] -> 이미 뷰가 존재하면 대체한다.
create or replace view vwInsa
as
select * from tblInsa where buseo = '기획부';

select * from vwInsa;

-- 누군가가 날마다 tblInsa 테이블로부터 기획부 직원만을 가져오는 일을 반복한다.
-- 1.
select * from tblInsa where buseo = '기획부';
-- 2.
select * from vw기획부;


-- 남자 직원 테이블
create or replace view vwMale
as
select * from tblInsa where substr(ssn, 8, 1) = '1';

-- 남자 직원
select * from vwMale;

create or replace view vwDailyCheck
as
select
    m.name as "회원명",
    v.name as "비디오제목",
    r.rentdate as "대여날짜",
    g.period as "대여기간",
    case
        when r.retdate is null then '반납안함'
        when r.retdate is not null then '반납함'
    end as "반납상태",
    case
        when r.retdate is null then round(sysdate - (r.rentdate + g.period))
        when r.retdate is not null then null
    end as "연체기간"
from tblMember m                                 -- A
    inner join tblRent r                         -- + B
        on m.seq = r.member                      -- A & B 연결 조건
            inner join tblVideo v                -- + C
                on v.seq = r.video               -- B & C 연결 조건
                    inner join tblGenre g        -- + D
                        on g.seq = v.genre;      -- C & D 연결 조건


select * from vwDailyCheck;


-- 뷰는 테이블의 실시간 상태를 반영한다.
select * from tblStaff;

-- 컬럼 리스트 일부 가져오기
create or replace view vwStaff
as
select name, address from tblStaff;

-- 컬럼 리스트 모두 가져오기
create or replace view vwStaff
as
select * from tblStaff;

select * from vwStaff; -- 뷰 -> 실명
select * from (select name, address from tblStaff); -- 서브쿼리(인라인 뷰) -> 익명(1회용 뷰)

commit;

delete from tblStaff where seq = 6;

-- 뷰는 테이블처럼 취급한다.
-- 아래 항목들이 가능한가?
-- 1. select : O
-- 2. insert : X or O -> 결론 : 하지 말 것!(의미없음..) -> 삽입은 테이블에 직접 삽입할 것
-- 3. update : X or O -> 테이블에 직접 수정할 것
-- 4. delete : X or O -> 테이블에 직접 삭제할 것
-- 5. join : O
-- 6. union : O
select * from vwStaff;

-- ORA-01400: cannot insert NULL into ("HR"."TBLSTAFF"."SEQ")
insert into vwStaff(name, address) values ('홍길동', '서울시');

-- ORA-00904: "SEQ": invalid identifier
insert into vwStaff(seq, name, salary, address) values (6, '홍길동', 300, '서울시');


-- join
select * from tblGenre;
select * from tblVideo;

select * from tblGenre g
    inner join tblVideo v
        on g.seq = v.genre;
        
create or replace view vwGenre
as
select seq, name, price from tblGenre;

create or replace view vwVideo
as
select name, genre from tblVideo;

select * from vwGenre;
select * from vwVideo;

-- view join view (O)
select * from vwGenre g inner join vwVideo v on g.seq = v.genre;

-- table join view (O)
select * from tblGenre g inner join vwVideo v on g.seq = v.genre;

-- union (O)
select name from vwGenre
union
select name from vwVideo;










