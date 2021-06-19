-- ex20_join.sql

-- 직원 + 프로젝트 테이블
drop table tblStaff;

create table tblStaff
(
    seq number primary key,                 -- 직원 번호(PK)
    name varchar2(30) not null,             -- 직원명
    salary number not null,                 -- 급여
    address varchar2(300) not null,         -- 거주지
    project varchar2(300) null              -- 담당 프로젝트
);

insert into tblStaff (seq, name, salary, address, project)
    values (1, '홍길동', 300, '서울시', '홍콩 수출');

insert into tblStaff (seq, name, salary, address, project)
    values (2, '아무개', 250, '인천시', 'TV 광고');

insert into tblStaff (seq, name, salary, address, project)
    values (3, '호호호', 350, '의정부', '매출 분석');

select * from tblStaff;

-- 홍길동 + 프로젝트 1건 추가
insert into tblStaff (seq, name, salary, address, project)
    values (4, '홍길동', 300, '서울시', '고객 관리');

-- 하하하 + 프로젝트 2건
insert into tblStaff (seq, name, salary, address, project)
    values (5, '하하하', 300, '서울시', '일본 수출, 대리점 개설');


-- ***************************************************************************
-- 관계형 데이터베이스가 싫어하는 것!!!
-- 1. null 상태의 셀. null이 다량으로 발생하는 상태를 싫어한다.
-- 2. 동일한 데이터가 2군데 이상 동시에 존재하는 것을 싫어한다. > 중복값
-- 3. 하나의 셀에 분리가 가능한 데이터가 들어있는 것을 싫어한다. > 원자화

-- 홍콩 수출건을 담당하는 직원명?
select name from tblStaff where project = '홍콩 수출';

-- 일본 수출건을 담당하는 직원명?
select name from tblStaff where instr(project, '일본 수출') > 0;

select * from tblStaff;

--------------------------------------------------------------------------------

-- 직원 테이블 + 프로젝트 테이블

drop table tblStaff;
drop table tblProject;

-- 직원 테이블(부모 테이블)
create table tblStaff
(
    seq number primary key,                 -- 직원 번호(PK)
    name varchar2(30) not null,             -- 직원명
    salary number not null,                 -- 급여
    address varchar2(300) not null         -- 거주지
);

-- 프로젝트 테이블(자식 테이블)
create table tblProject
(
    seq number primary key,                             -- 프로젝트 번호(PK)
    project varchar2(300) not null,                     -- 담당 프로젝트
    staff number not null references tblStaff(seq)      -- 담당 직원 번호(FK)
);

insert into tblStaff (seq, name, salary, address) values (1, '홍길동', 300, '서울시');
insert into tblStaff (seq, name, salary, address) values (2, '아무개', 200, '광주시');
insert into tblStaff (seq, name, salary, address) values (3, '하하하', 350, '제주시');

insert into tblProject (seq, project, staff) values (1, '홍콩 수출', 1);
insert into tblProject (seq, project, staff) values (2, 'TV 광고', 2);
insert into tblProject (seq, project, staff) values (3, '매출 분석', 3);
insert into tblProject (seq, project, staff) values (4, '대리점 분양', 1);
insert into tblProject (seq, project, staff) values (5, '홈쇼핑 판매', 3);

select * from tblStaff;
select * from tblProject;


-- *****
-- A. 신입사원 입사 > 신규 프로젝트 담당
-- A-1. 신입사원 추가
insert into tblStaff (seq, name, salary, address) values (4, '호호호', 200, '대전시');

-- A-2. 신규 프로젝트 추가
insert into tblProject (seq, project, staff) values (6, '자재 매입', 4);


-- B. 신입사원 입사 > 신규 프로젝트 담당
-- B-1. 문제 발생!!!!!!!!!!!! -> 담당자가 없는 프로젝트가 생성. -> 이 상황을 사람은 인지하는데 오라클은 인지 못한다.
-- FK(Foreign Key) 적용 후
-- ORA-02291: integrity constraint (HR.SYS_C007180) violated - parent key not found
insert into tblProject (seq, project, staff) values (7, '고객 유치', 5); -- success(문제 발생..)


-- C. '홍길동' 퇴사
--commit;
--rollback;

-- C-1. '홍길동' 삭제
-- 문제 발생!!!!!!!!!!!! -> 담당자가 없는 프로젝트가 존재. -> 이 상황을 사람은 인지하는데 오라클은 인지 못한다.
-- FK 적용 후
-- ORA-02292: integrity constraint (HR.SYS_C007180) violated - child record found
delete from tblStaff where name = '홍길동';


-- D. '홍길동' 퇴사
-- D-1. '홍길동' 모든 업무 -> 위임 //업무 인수 인계
update tblProject set staff = 2 where staff = 1; -- 담당자 교체(1 -> 2)
-- D-2. '홍길동' 삭제
delete from tblStaff where name = '홍길동';


-- 관계가 있는 부모/자식 테이블
-- 생성 : 1. 부모 > 2. 자식
-- 삭제 : 1. 자식 > 2. 부모

drop table tblUser;
drop table tblOrder;

-- 쇼핑몰. 고객
create table tblUser
(
    seq number primary key,                 -- 고객번호(PK)
    name varchar2(30) not null,             -- 이름
    address varchar2(300) not null          -- 주소(배송지)
);

-- 쇼핑몰. 주문
create table tblOrder
(
    seq number primary key,                             -- 주문번호(PK)
    price number not null,                              -- 주문금액
    orderdate date not null,                            -- 주문날짜
    useq number not null references tblUser(seq)        -- 고객번호(FK)
);


insert into tblUser (seq, name, address) values (1, '홍길동', '서울시 강남구 역삼동');
insert into tblUser (seq, name, address) values (2, '아무개', '서울시 강남구 대치동');
insert into tblUser (seq, name, address) values (3, '하하하', '서울시 강동구 천호동');

insert into tblOrder (seq, price, orderdate, useq) values (1, 30000, '2020-10-01', 1); -- 홍길동
insert into tblOrder (seq, price, orderdate, useq) values (2, 50000, '2020-10-03', 2); -- 아무개
insert into tblOrder (seq, price, orderdate, useq) values (3, 100000, '2020-10-04', 1); -- 홍길동
insert into tblOrder (seq, price, orderdate, useq) values (4, 200000, '2020-10-05', 5); -- 5번 고객 -> 5번 고객 없음..

delete from tblUser where seq = 1; -- 홍길동 회원탈퇴

update tblUser set name = ' ', address = ' ' where seq = 1; -- 실제 회원탈퇴하면 보통 delete가 아닌 update를 한다.(개인정보들을 null값으로)

select * from tblOrder;
select * from tblUser where seq = 1;


-- 정리!
/*

관계를 맺고 있는 2개의 테이블을 조작하면 발생하는 일
  - 이 규칙이 깨지면 데이터 무결성(유효성)이 깨진다 -> 데이터의 가치가 상실된다.

1. 부모 테이블 조작
  a. 행 추가(insert) : 아무 영향 없음
  b. 행 수정(update) : 아무 영향 없음
  c. 행 삭제(delete) : 자식 테이블에 자신을 참조하는 행이 존재하는지 반드시 사전 체크 > FK

2. 자식 테이블 조작
  a. 행 추가(insert) : 자신이 참조하는 대상이 실제로 존재하는 값인지 사전 체크 > FK
  b. 행 수정(update) : 수정할 칼럼이 FK가 아니면 아무 영향 없음. 수정할 컬럼이 FK면 a와 동일
  c. 행 삭제(delete) : 아무 영향 없음

http://www.exerd.com

*/

-- table 만들기

-- 고객 테이블
create table tblCustomer
(
    seq number primary key,             -- 고객번호(PK)
    name varchar2(30) not null,         -- 고객명
    tel varchar2(15) not null,          -- 전화번호
    address varchar2(100) not null      -- 주소
);

-- 판매 테이블
create table tblSales
(
    seq number primary key,                             -- 판매번호(PK)
    item varchar2(50) not null,                         -- 제품명
    qty number not null,                                -- 수량
    regdate date default sysdate not null,              -- 판매날짜
    cseq number not null references tblCustomer(seq)    -- 고객번호(FK)
);

-- 장르
create table tblGenre
(
    seq number primary key,             -- 장르번호(PK)
    name varchar2(30) not null,         -- 장르명
    price number not null,              -- 대여가격(원)
    period number not null              -- 대여기간(일)
);

create sequence seqGenre;

-- 비디오
create table tblVideo
(
    seq number primary key,                             -- 비디오번호(PK)
    name varchar2(100) not null,                        -- 제목
    qty number not null,                                -- 수량
    company varchar2(50) null,                          -- 제작사
    director varchar2(50) null,                         -- 감독
    major varchar2(50) null,                            -- 주연배우
    genre number not null references tblGenre(seq)      -- 장르번호(FK)
);

create sequence seqVideo;

-- 회원
create table tblMember
(
    seq number primary key,             -- 회원번호(PK)
    name varchar2(30) not null,         -- 이름
    grade number(1) not null,           -- 등급(1, 2, 3)
    byear number(4) not null,           -- 생년
    tel varchar2(15) not null,          -- 연락처
    address varchar2(300) null,         -- 주소
    money number not null               -- 예치금
);

create sequence seqMember;

-- 대여
create table tblRent
(
    seq number primary key,                                 -- 대여번호(PK)
    member number not null references tblMember(seq),       -- 회원번호(FK)
    video number not null references tblVideo(seq),         -- 비디오번호(FK)
    rentdate date default sysdate not null,                 -- 대여날짜
    retdate date null,                                      -- 반납날짜
    remart varchar2(500) null                               -- 비고
);

create sequence seqRent;


commit;

select * from tblCustomer;
select * from tblSales;

select * from tblGenre;
select * from tblVideo;
select * from tblMember;
select * from tblRent;

/*

테이블(결과셋)을 합치는 기술
1. union : 세로 병합
2. join : 가로 병합

조인(join)
  - 서로 관계를 맺고 있는 2개(1개) 이상의 테이블의 내용을 가져와서 1개의 결과셋으로 만드는 작업
  - select 결과셋 + select 결과셋 = 결과셋

조인의 종류
1. 단순 조인(cross join) - 카티션 곱(데카르트 곱)
2. 내부 조인(inner join)
3. 외부 조인(outer join)
4. 셀프 조인(self join)
5. 전체 외부 조인(full outer join)

*/

-- 1. 단순 조인(cross join) - 카티션 곱(데카르트 곱)
-- 유효하지 않은 데이터가 있다.
-- 더미 생성용
select * from tblCustomer; -- 3명
select * from tblSales; -- 9건

select * from tblCustomer cross join tblSales; -- 27개
select * from tblSales cross join tblCustomer;

-- ORA-00918: column ambiguously defined
select name, item, seq from tblSales cross join tblCustomer;

select name, item, tblSales.seq, tblCustomer.seq from tblSales cross join tblCustomer;

-- 컬럼의 별칭, 테이블의 별칭 -> 개명
select name, item, tblSales.seq, tblCustomer.seq from tblSales s cross join tblCustomer c; -- 테이블명 별칭 후에는 별칭을 사용해야만 한다.
select name, item, c.seq, s.seq from tblSales s cross join tblCustomer c;
select name, salary from (select name, basicpay as salary from tblInsa);


/*

2. 내부 조인(inner join) ***************************************
  - 단순 조인에서 유효한 레코드만을 추출하는 조인 > 조인 결과셋을 유효하게 만든다.

select 컬럼리스트
    from 테이블A
        inner join 테이블B
            on 테이블A.컬럼 = 테이블B.컬럼; -- 유효한 레코드를 찾기 위한 조건

*/

-- 주문내역과 함께 고객 정보를 가져오시오.
select * from tblCustomer a
    inner join tblSales b
        on a.seq = b.cseq;

-- 직원 정보와 함께 그 직원이 담당하고 있는 프로젝트 정보를 함께 가져오시오.
-- 직원명(tblStaff)과 담당 프로젝트명(tblProject)을 가져오시오.
select * from tblStaff;
select * from tblProject;

select s.name, p.project
    from tblStaff s
        inner join tblProject p
            on s.seq = p.staff;

-- 서브쿼리 활용
select project, (select name from tblStaff where seq = tblProject.staff) as name from tblProject;



-- 비디오 제목(tblVideo)과 대여가격(tblGenre)을 알고 싶습니다.
select * from tblGenre; -- 부모
select * from tblVideo; -- 자식

select v.name as vname, g.name as gname, g.price from tblGenre g
    inner join tblVideo v
        on g.seq = v.genre; -- 부모테이블.PK = 자식테이블.FK

-- 연관없는 테이블끼리 조인을 해도 조인이 된다. > 아무거나 조인하지 말 것!!! > 논리적으로 연관이 있는지 판단 후 조인..
select * from tblInsa;
select * from tblMen;

select * from tblInsa i
    inner join tblMen m
        on i.name = m.name;


-- 회원 + 대여
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

/*

3. 외부 조인(outer join) ***********************************
  - 내부 조인 + 부모 테이블
  - 내부 조인의 결과셋 + 결과셋에 들어가지 않은 부모 테이블의 나머지 레코드도 포함

select 컬럼리스트
    from 테이블A
        left|right outer join 테이블B
            on 테이블A.컬럼 = 테이블B.컬럼;

*/

insert into tblStaff (seq, name, salary, address) values (5, '유재석', 400, '서울시');
insert into tblStaff (seq, name, salary, address) values (6, '강호동', 450, '마산시');

select * from tblStaff; -- 5명
select * from tblProject; -- 6건

-- inner join : 두 테이블에 공통으로 있는 데이터만 가져온다.
-- 현재 프로젝트를 담당하고 있는 직원 명단과 프로젝트 정보를 가져와라.
select * from tblStaff s
    inner join tblProject p
        on s.seq = p.staff;

-- outer join : inner join + 조인되지 못한 부모 테이블의 나머지 행
-- 프로젝트를 담당O, 담당X -> 모든 직원을 다 가져와라. 단, 프로젝트를 담당중이면 프로젝트 정보도 가져와라.
select * from tblStaff s
    left outer join tblProject p
        on s.seq = p.staff;


select * from tblMember;
select * from tblRent;

-- 회원들 중 대여 기록이 있는 회원 정보 + 대여 정보
select * from tblMember m
    inner join tblRent r
        on m.seq = r.member;

-- 모든 회원 정보 가져와라. 대여기록이 있던 없던...
select * from tblMember m
    left outer join tblRent r
        on m.seq = r.member;

/*

4. 셀프 조인(self join)
  - 1개의 테이블을 사용해서 조인
  - 단순 조인 + 셀프 조인
  - 내부 조인 + 셀프 조인
  - 외부 조인 + 셀프 조인
  - 자기가 자기를 참조하는 외래키를 가진 테이블을 대상으로 한다.
  - 자주 없음

*/

-- 직원 테이블
create table tblSelf
(
    seq number primary key,                         -- 직원번호(PK)
    name varchar2(30) not null,                     -- 이름
    department varchar2(50) null,                   -- 부서
    super number null references tblSelf(seq)       -- 상사번호(FK), 자기 참조
);

insert into tblSelf values (1, '홍사장', null, null);
insert into tblSelf values (2, '김부장', '영업부', 1);
insert into tblSelf values (3, '이과장', '영업부', 2);
insert into tblSelf values (4, '정대리', '영업부', 3);
insert into tblSelf values (5, '최사원', '영업부', 4);

insert into tblSelf values (6, '박부장', '개발부', 1);
insert into tblSelf values (7, '하과장', '개발부', 6);

select * from tblSelf;

-- 직원 명단을 가져오시오.
select
    s1.name as "직원명",
    s1.department as "부서명",
    s2.name as "상사명"
from tblSelf s1 -- 직원 테이블 역할
    inner join tblSelf s2 -- 상사 테이블 역할
        on s1.super = s2.seq;
        
select
    s1.name as "직원명",
    s1.department as "부서명",
    s2.name as "상사명"
from tblSelf s1 -- 직원 테이블 역할
    left outer join tblSelf s2 -- 상사 테이블 역할
        on s1.super = s2.seq;







