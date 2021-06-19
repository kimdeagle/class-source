-- ex25_hierarchicalQuery.sql

/*

계층형 쿼리(Hierarchical Query)
  - 레코드 간의 관계가 서로 상하 수직 구조의 관계를 이루는 경우 -> 적당한 구조의 결과셋을 만들어 주는 역할
  - 부모와 자식 역할이 있는 레코드로 구성된 테이블에 사용
  - 오라클 전용

Tree 구조(= 계층형 구조)

컴퓨터
  - 본체
    - 메인보드
    - 그래픽카드
    - 랜카드
    - CPU
    - 메모리
  - 모니터
    - 보호필름
  - 프린터
    - 잉크카트리지
    - A4 용지

*/

create table tblComputer
(
    seq number primary key,                                         -- 식별자(PK)
    name varchar2(50) not null,                                     -- 부품명
    qty number not null,                                            -- 수량
    pseq number null references tblComputer(seq)                    -- 부모부품(FK) 셀프 참조
);

select * from tblSelf;

insert into tblComputer values (1, '컴퓨터', 1, null); -- 루트

insert into tblComputer values (2, '본체', 1, 1);
insert into tblComputer values (3, '모니터', 1, 1);
insert into tblComputer values (4, '프린터', 1, 1);

insert into tblComputer values (5, '메인보드', 1, 2);
insert into tblComputer values (6, '그래픽카드', 1, 2);
insert into tblComputer values (7, '랜카드', 1, 2);
insert into tblComputer values (8, 'CPU', 1, 2);
insert into tblComputer values (9, '메모리', 2, 2);

insert into tblComputer values (10, '보호필름', 1, 3);

insert into tblComputer values (11, '잉크카트리지', 1, 4);
insert into tblComputer values (12, 'A4용지', 100, 4);

select * from tblComputer;

select c1.name as 부품명, c2.name as 부모부품명 from tblComputer c1 -- 자식 부품
    inner join tblComputer c2 -- 부모 부품
        on c1.pseq = c2.seq -- 자식부품.부모번호 = 부모부품.자기번호
            order by c1.seq asc;


/*

계층형 쿼리
  - start with절 connect by절
  - 계층형 쿼리를 사용할 때만 사용 가능한 의사 컬럼
    a. prior : 부모 레코드
    b. level : 계층 깊이(depth)

*/

select lpad(' ', (level-1) * 3) || name, level, seq from tblComputer c
--    start with seq = 1 -- 루트 지정(번호를 알고 있을 때)
--    start with seq = (select seq from tblComputer where name = '컴퓨터') -- 루트 지정(이름을 알고 있을 때)
    start with pseq is null -- 부모가 없는 부품을 루트로 해라
        connect by prior seq = pseq;


select * from tblSelf;

select department, lpad(' ', (level-1) * 3) || name as 직원명, prior name as 상사명 from tblSelf
    start with super is null
        connect by prior seq = super;


select
    lpad(' ', (level-1)*3) || name as "부품명",
    prior name as "부모부품명",
    level as "단계",
    
    CONNECT_BY_ROOT name as "루트부품명",
    connect_by_isleaf as "리프노드",
    sys_connect_by_path(name, '▷')
from tblComputer
    start with pseq is null
        connect by pseq = prior seq
            --order by name asc; -- 족보 꼬임
            order siblings by name asc; -- 같은 레벨을 가진 그룹내에서만 정렬이 실행






