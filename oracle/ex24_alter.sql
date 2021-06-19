-- ex24_alter.sql

/*

테이블 수정하기(alter table)
  - 테이블 수정하기 -> 컬럼의 정의를 수정하기

테이블 수정할 일이 발생
1. 테이블 수정하기 > 기존에 데이터 있음 > 여러가지 상황 발생 > 대처
2. 테이블 삭제하기 > 테이블 생성하기 > 기존 데이터 추가 : 많이 사용

<결***** 테이블을 수정하는 상황을 만들지 말자!! *****론>

*/

drop table tblEdit;

create table tblEdit
(
    seq number primary key,
    data varchar2(20) not null
);

insert into tblEdit values (1, '마우스');
insert into tblEdit values (2, '키보드');
insert into tblEdit values (3, '모니터');

-- 1. 새로운 컬럼 추가하기(null)
alter table tblEdit
    add (price number(5) null);

-- 1-1. 새로운 컬럼 추가하기(not null)
-- ORA-01758: table must be empty to add mandatory (NOT NULL) column
alter table tblEdit
    add (description varchar2(100) not null);

-- 1-2. not null 컬럼 추가 방법(1)
delete from tblEdit;
alter table tblEdit
    add (description varchar2(100) not null);

-- 1-3. not null 컬럼 추가 방법(2)
alter table tblEdit
    add (description varchar2(100) default '임시' not null);
update ...;


-- 2. 컬럼 삭제하기
alter table tblEdit
    drop column description;

alter table tblEdit
    drop column seq; --> PK 삭제 금지!!!!!!!!!!(오류가 나는게 아니라 지워지기 때문에 조심!)


-- 3. 컬럼 수정하기
insert into tblEdit values (4, '노트북');
insert into tblEdit values (5, '이번에 새로 출시된 가성비 높은 M1 맥북 에어');

-- 3-1. 컬럼 길이 수정
alter table tblEdit
    modify (data varchar2(100));

-- 3-2. 컬럼의 자료형 바꾸기 -> 되도록 사용 금지 -> 설계 미스
-- ORA-01439: column to be modified must be empty to change datatype
alter table tblEdit
    modify (seq varchar2(100));

delete from tblEdit;
alter table tblEdit
    modify (seq varchar2(100));

desc tblEdit;

-- 3-3. 컬럼명 바꾸기 -> 자제
alter table tblEdit
    rename column data to name;

-- 제약 사항
drop table tblEdit;

create table tblEdit
(
    seq number,
    data varchar2(20),
    color varchar2(20)
);

-- PK 추가하기
alter table tblEdit
    add constraint tblEdit_seq_pk primary key(seq);

-- 한번 더 삽입하면 에러 발생 -> ORA-00001: unique constraint (HR.TBLEDIT_SEQ_PK) violated
insert into tblEdit values (1, '홍길동', '노랑');

alter table tblEdit
    add constraint tblEdit_color_ck check (color in ('노랑', '빨강', '파랑'));

insert into tblEdit values (3, '홍길동', '검정');
insert into tblEdit values (2, '홍길동', '파랑');

alter table tblEdit
    drop constraint tblEdit_color_ck;








