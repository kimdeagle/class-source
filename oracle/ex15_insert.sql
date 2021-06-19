-- ex15_insert.sql

/*

insert문
  - 데이터를 테이블에 추가하는 명령어(행 추가, 레코드 추가)
  - insert into 테이블명 (컬럼리스트) values (값리스트);

*/

drop table tblMemo;

create table tblMemo
(
    seq number primary key,                         -- 메모번호(PK)
    name varchar2(30) default '익명' not null,      -- 작성자
    memo varchar2(1000) not null,                   -- 메모
    regdate date default sysdate null               -- 작성일
);

drop sequence seqMemo;

create sequence seqMemo;


-- 1. 표준 insert 방식 : 원본 테이블에 정의된 컬럼 리스트 순서대로 값리스트를 작성하는 방식
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 2. 컬럼리스트의 순서와 값리스트의 순서는 반드시 일치해야 한다.(**********************)
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, sysdate, '홍길동', '메모입니다.');
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '메모입니다.', '홍길동', sysdate);

-- 3. 원본 테이블에서 선언된 컬럼 순서와 무관하게 insert를 만들 수 있다.
-- 컬럼리스트의 순서와 값리스트의 순서만 맞으면 얼마든지 재구성 할 수 있다.
insert into tblMemo (memo, name, seq, regdate) values ('메모입니다.', '홍길동', seqMemo.nextVal, sysdate);

-- 4. SQL 오류: ORA-00947: not enough values -> 값을 덜 넣음
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '메모입니다.', sysdate);

-- 5. SQL 오류: ORA-00913: too many values -> 컬럼명을 덜 넣음
insert into tblMemo (seq, name, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 응용하기
-- 6. null 컬럼 조작(regdate) -> regdate date null / regdate date default sysdate null
-- 6-1. null 컬럼에 값을 대입O
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 6-2. null 컬럼에 값을 null 대입O -> 명시적으로 null 대입
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', null);

-- 6-3. null 컬럼에 값을 null 대입O -> 암시적으로 null 대입
insert into tblMemo (seq, name, memo) values (seqMemo.nextVal, '홍길동', '메모입니다.');


-- 7. default 제약 처리 방법
-- 7-1. 값은 넣는다. > 넣은 값이 들어간다.
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 7-2. default 적용 (컬럼리스트값 삭제)
insert into tblMemo (seq, memo, regdate) values (seqMemo.nextVal, '메모입니다.', sysdate);

-- 7-3. default 적용 (default 상수 사용)
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, default, '메모입니다.', default);

----------------------------------------------------------------------------------------------------------

-- 컬럼리스트를 생략할 수 있다.
insert into tblMemo values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 컬럼리스트를 생략하려면 반드시 값리스트는 테이블의 컬럼 순서대로만 작성해야 한다.
insert into tblMemo values (seqMemo.nextVal, '메모입니다.', sysdate, '홍길동');

-- 컬럼리스트를 생략하려면 값리스트는 생략이 불가능하다.(모든 값을 명시적으로 작성해야 한다.)
insert into tblMemo values (seqMemo.nextVal, '홍길동', '메모입니다.');

-- default 사용
insert into tblMemo values (seqMemo.nextVal, '홍길동', '메모입니다.', default);

select * from tblMemo;

-----------------------------------------------------------------------------------------------

create table tblMemoCopy
(
    seq number primary key,                         -- 메모번호(PK)
    name varchar2(30) default '익명' not null,      -- 작성자
    memo varchar2(1000) not null,                   -- 메모
    regdate date default sysdate null               -- 작성일
);

-- tblMemo -> tblMemoCopy 복사
insert into tblMemoCopy select * from tblMemo;

select * from tblMemoCopy;


--------------------------------------------------------------------------------

-- 단점 : 제약사항이 복사가 안된다.(******************)
-- 테스트용으로만 사용
create table tblComedianMale
as
    select * from tblComedian where gender = 'm';
    
select * from tblComedianMale;



