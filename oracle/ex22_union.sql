-- ex22_union.sql

/*

유니온(union)
  - 테이블을 합치는 기술
  - union
  - union all
  - intersect
  - minus
  - 수학 집합 개념(교집합, 합집합, 차집합 등...)

*/

select name, age from tblMen;
select name, age from tblWomen;

select name, age from tblMen
union
select name, age from tblWomen;

-- 1. 각 컬럼의 순서에 맞게 자료형이 일치해야 한다.
select name, age from tblMen
union
select age, name from tblWomen;

-- 2. 컬럼의 자료형이 일치하더라도 데이터 성격(의미)까지 일치해야 한다.
select name, age from tblMen
union
select name, height from tblWomen;

-- 3. 모든 select의 컬럼수는 일치해야 한다.
select name, age from tblMen
union
select name, age, height from tblWomen;


create table tblUnionA (
    name varchar2(20) not null
);

create table tblUnionB (
    name varchar2(20) not null
);

drop table tblUnionA;
drop table tblUnionB;

insert into tblUnionA values ('강아지');
insert into tblUnionA values ('고양이');
insert into tblUnionA values ('병아리');
insert into tblUnionA values ('송아지');
insert into tblUnionA values ('거북이');
insert into tblUnionA values ('늑대');
insert into tblUnionA values ('여우');

insert into tblUnionB values ('뱀');
insert into tblUnionB values ('타조');
insert into tblUnionB values ('비둘기');
insert into tblUnionB values ('강아지');
insert into tblUnionB values ('햄스터');
insert into tblUnionB values ('토끼');
insert into tblUnionB values ('고양이');

select * from tblUnionA;
select * from tblUnionB;

-- union : 두 테이블을 합쳤을 때 중복되는 행은 자동으로 제거
select * from tblUnionA
union
select * from tblUnionB;

-- union all : 두 테이블을 합쳤을 때 중복되는 행도 합쳐진다.
select * from tblUnionA
union all
select * from tblUnionB;

-- intersect : 두 테이블을 합쳤을 때 중복되는 행만 가져온다.
select * from tblUnionA
intersect
select * from tblUnionB;

-- minus : 차집합(A - B) -> A에만 있는 것 -> 순서 중요
select * from tblUnionA
minus
select * from tblUnionB;


-- 사례
-- 게시판 운용 > 10년 > 100만건
-- 목록 보기(최신글 ~ 옛날글)

-- 게시판 -> 게시판2020, 게시판2019, 게시판2018...

select * from 게시판 order by 날짜 desc;
















