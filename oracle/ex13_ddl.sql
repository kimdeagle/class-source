-- ex13_ddl.sql

/*

DDL(Data Definition Language, 데이터 정의어)
  - 데이터베이스 객체를 생성/수정/삭제한다.
  - 데이터베이스 객체 : 테이블, 뷰, 인덱스, 트리거, 프로시저, 제약사항, 유저 등..
  - create, alter, drop

1. 테이블 생성하기
  - 테이블을 구성하는 컬럼들을 정의!!

create table 테이블명
(
    컬럼 정의,
    컬럼 정의,
    컬럼 정의
);
  - 컬럼 정의 : 컬럼명 자료형(길이) 제약사항

- 제약사항(Constraint) ***************************************
- 해당 컬럼에 들어갈 데이터(값)에 대한 조건(규제)
- 조건을 만족하지 못하면 -> 데이터 거부 -> 테이블에 넣지 못한다.(에러 발생)
- 유효성 검사 도구(***)
1. not null
  - 해당 컬럼은 반드시 값을 가져야 한다.
  - 셀에 데이터가 없으면 에러
  - 필수값(***)

2. primary key
  - 기본키
  - 유일하다. + not null
  - 테이블의 모든 행들 중에 같은 컬럼값을 가지는 행이 있으면 안된다.
  - 테이블의 모든 행들을 유일하게 구분하는 역할을 가지는 컬럼(키)
  - 모든 테이블은 반드시 primary key를 가져야 한다. primary key가 없는 테이블을 생성할 수 있지만 사용 시 문제가 많음.
  - 기본키의 형태
      a. 단일 기본키(기본키) -> 1개의 컬럼이 PK 역할
      b. 복합 기본키(복합키) -> 2개 이상의 컬럼이 모여서 PK 역할

3. foreign key
  - 나중에 수업(join)

4. unique
  - 해당 컬럼이 유일해야 한다.
  - null값을 가질 수 있다.
  - 식별자로는 사용할 수 없다.(null 때문에)

5. check
  - where절에서 사용했던 조건
  - 사용자 정의 제약 조건

6. default
  - 기본값 설정
  - 해당 컬럼에 값을 대입하지 않으면 미리 준비한 값을 넣는다.

*/

drop table tblMemo;

-- 메모 테이블(제약사항 X)
create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq number(3),              -- 메모번호
    name varchar2(30),          -- 작성자
    memo varchar2(1000),        -- 메모
    regdate date                -- 작성날짜
);

-- 데이터 추가하기
-- insert into 테이블 (컬럼리스트) values (값리스트)
insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동입니다. 하하하하하', '메모입니다.', sysdate);
insert into tblMemo (seq, name, memo, regdate) values (3, '홍길동', , sysdate);
insert into tblMemo (seq, name, memo, regdate) values (3, '홍길동', null, sysdate);
insert into tblMemo (seq, name, memo, regdate) values (4, null, null, null);
insert into tblMemo (seq, name, memo, regdate) values (null, null, null, null); --하지 말 것!!!

select * from tblMemo;

drop table tblMemo;


-- 메모 테이블(제약사항 : not null)
-- 생략하면 null로 자동
create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq number(3) not null,          -- 메모번호
    name varchar2(30) null,          -- 작성자
    memo varchar2(1000) not null,    -- 메모
    regdate date null                -- 작성날짜
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);

-- ORA-01400: cannot insert NULL into ("HR"."TBLMEMO"."MEMO")
insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동', null, sysdate);

insert into tblMemo (seq, name, memo, regdate) values (3, null, '메모입니다.', null);

insert into tblMemo (seq, name, memo, regdate) values (null, '홍길동', '메모입니다.', sysdate);

select * from tblMemo;


drop table tblMemo;

-- 메모 테이블(제약사항 : not null, primary key)
-- primary key 적으면 자동으로 not null
create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq number(3) primary key,
    name varchar2(30) null,
    memo varchar2(1000) not null,
    regdate date null
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);

-- ORA-01400: cannot insert NULL into ("HR"."TBLMEMO"."SEQ") -> null 입력
insert into tblMemo (seq, name, memo, regdate) values (null, '홍길동', '메모입니다.', sysdate);

-- ORA-00001: unique constraint (HR.SYS_C007081) violated -> 중복값
insert into tblMemo (seq, name, memo, regdate) values (1, '아무개', '메모입니다.ㅎㅎㅎㅎ', sysdate);


select * from tblMemo;

/*

단일 기본키
[번호**]    [이름]    [메모]
1           홍길동    메모입니다.
2           아무개    하하하하
3           호호호    메모에요~~

복합 키(Composite Key)
[이름**]  [과목**]    [성적]
홍길동    국어      100
홍길동    영어      90
홍길동    수학      80
아무개    영어      95
아무개    수학      88
호호호    국어      77

임의로 추가
[번호**]    [이름]    [과목]    [성적]
1           홍길동    국어      100
2           홍길동    영어      90
3           홍길동    수학      80
4           아무개    영어      95
5           아무개    수학      88
6           호호호    국어      77

*/


drop table tblMemo;

-- 메모 테이블(제약사항 : not null, primary key, unique)
create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq number(3) primary key,
    name varchar2(30) unique,
    memo varchar2(1000) not null,
    regdate date null
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);

-- ORA-00001: unique constraint (HR.SYS_C007084) violated -> 이름 중복
insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동', '메모입니다.', sysdate);

-- primary key와 unique 차이점 : null값 허용 -> 생각보다 쓸일이 많이 없다..
insert into tblMemo (seq, name, memo, regdate) values (3, null, '메모입니다.', sysdate);


select * from tblMemo;


-- 설문조사 or 투표
-- 일련번호 : Primary Key
-- 선택 : not null
-- 이름 : not null > 중복 투표 가능. 익명 투표 불가능
-- 이름 : unique > 중복 투표 불가능. 익명 투표 가능
-- 이름 : unique + not null > 중복 투표 불가능. 익명 투표 불가능 > Primary Key

--[일련번호]        [이름]        [선택]
--1                 홍길동         3
--2                 아무개         2
--3                 호호호         2


drop table tblMemo;

-- 메모 테이블(제약사항 : not null, primary key, unique, check)
create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq number(3) primary key,
    name varchar2(30) unique,
    memo varchar2(1000) not null,
    regdate date null,
--    color varchar2(30) not null check (color = 'red' or color = 'yellow' or color = 'blue') --메모 색상에 따라 중요도 표시(red, yellow, blue)
    color varchar2(30) not null check (color in ('red', 'yellow', 'blue')),
    page number check (page between 10 and 100) not null
);

insert into tblMemo (seq, name, memo, regdate, color) values (1, '홍길동', '메모입니다.', sysdate, 'red');

-- ORA-02290: check constraint (HR.SYS_C007087) violated
insert into tblMemo (seq, name, memo, regdate, color) values (2, '홍길동', '메모입니다.', sysdate, 'white');

insert into tblMemo (seq, name, memo, regdate, color, page) values (1, '홍길동', '메모입니다.', sysdate, 'red', 50);

-- ORA-02290: check constraint (HR.SYS_C007094) violated
insert into tblMemo (seq, name, memo, regdate, color, page) values (2, '홍길동', '메모입니다.', sysdate, 'red', 150);

select * from tblMemo;


drop table tblMemo;

-- 메모 테이블(제약사항 : not null, primary key, default)
create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq number(3) primary key,
    name varchar2(30) default '익명',
    memo varchar2(1000) not null,
    regdate date default sysdate
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);

insert into tblMemo (seq, name, memo, regdate) values (2, null, '메모입니다.', null);

insert into tblMemo (seq, memo) values (3, '테스트입니다.'); --default 사용


select * from tblMemo;

/*

제약 사항을 만드는 방법
1. 컬럼 수준에서 만드는 방법
  - 지금까지 수업한 방법(위의 내용)
  - ex) seq number(3) primary key
  - 컬럼을 정의할 때 제약사항도 같이 정의하는 방법

2. 테이블 수준에서 만드는 방법
  - 컬럼 정의와 제약사항 정의를 분리하는 방법

*/


drop table tblMemo;

create table tblMemo
(
    -- 컬럼 정의
    seq number(3),
    name varchar2(30) not null,
    memo varchar2(1000) not null,
    regdate date not null,
    
    -- 제약사항 정의
    -- constraint 제약사항명 제약사항
    -- not null은 컬럼 정의할 때만 정의할 수 있다!!
    constraint tblmemo_seq_pk primary key(seq),
    constraint tblmemo_memo_check check(length(memo) >= 20),
    constraint tblmemo_name_uq unique(name)
);

-- ORA-02290: check constraint (HR.TBLMEMO_MEMO_CHECK) violated
insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.추가합니다.추가합니다.추가합니다.', sysdate);

-- ORA-00001: unique constraint (HR.TBLMEMO_SEQ_PK) violated
insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.추가합니다.추가합니다.추가합니다.', sysdate);

-- ORA-00001: unique constraint (HR.TBLMEMO_NAME_UQ) violated
insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동', '메모입니다.추가합니다.추가합니다.추가합니다.', sysdate);

select * from tblmemo;
