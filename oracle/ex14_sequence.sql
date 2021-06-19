-- ex14_sequence.sql

/*

시퀀스(sequence)
  - 데이터베이스 객체 중 하나
  - 식별자를 생성하는 역할(도구) -> 주로 PK 칼럼에서 많이 사용한다.

시퀀스 객체 생성하기
  - create sequence 시퀀스명;

시퀀스 객체 삭제하기
  - drop sequence 시퀀스명;

시퀀스 객체 사용하기
  - 시퀀스명.nextVal
  - 시퀀스명.currVal

*/

create sequence seqNum;

select seqNum.nextVal from dual; -- 일련번호 생성 (1, 2, 3, ...)

select name, buseo, jikwi, seqNum.nextVal from tblInsa;

-- 숫자번호
select seqNum.nextVal from dual;

-- 문자 + 숫자 조합 번호
select 'A' || seqNum.nextVal from dual;


create sequence seqProduct;
create sequence seqProduct2;

-- A001, A002, A003...
select 'A' || ltrim(to_char(seqProduct.nextVal, '000')) from dual;

select 'A' || ltrim(to_char(seqProduct.nextVal, '000')) || ltrim(to_char(seqProduct2.nextVal, '000')) from dual;


drop table tblMemo;

create table tblMemo
(
    seq number(3) primary key,
    name varchar2(30) not null,
    memo varchar2(1000) not null,
    regdate date default sysdate
);

create sequence seqMemo;

insert into tblMemo(seq, name, memo, regdate) values(seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

select * from tblMemo;

-- currVal : 마지막으로 생성한 번호를 반환. 상태 확인할 때 사용
select seqNum.currVal from dual;
select seqMemo.currVal from dual;

-- 이빠짐 신경쓰이면 max() + 1 활용
select max(seq) + 1 from tblMemo;


-- 개발 끝 > 런칭..
-- 1. 번호는 중요하지 않다. 그냥 그대로 간다.
-- 2. 기왕이면 1로 다시 시작하게 만들자.
delete from tblMemo;

select * from tblMemo;

insert into tblMemo(seq, name, memo, regdate) values(seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 시퀀스 객체를 리셋하는 방법

-- 1. 삭제 -> 다시 생성
drop sequence seqMemo;
create sequence seqMemo;

-- 2. 수정 (아직 안배움)

-- ORA-08002: sequence SEQMEMO.CURRVAL is not yet defined in this session
select seqMemo.currVal from dual; -- 5


-- test
insert into tblMemo(seq, name, memo, regdate) values(seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

select * from tblMemo; -- 27 > 41

commit;

select seqMemo.currVal from dual;

-- 27 > 41 이유
-- 시퀀스 객체의 캐시 사용 -> cache에 적힌 숫자만큼 가져갔다고 저장함. (보조기억장치에)

/*

시퀀스 객체 생성하기
  - create sequence 시퀀스명;

  - create sequence 시퀀스명
        increment by N
        start with N
        maxvalue N
        minvalue N
        cycle
        cache N;

*/

drop sequence seqTest;

create sequence seqTest
    --increment by 1 -- 시퀀스 증감치 지정(양수, 음수)
    --start with 1 -- 시작값(seed)
    --maxvalue 15 -- 최대값(넘으면 에러)
    --minvalue 1 -- 최소값(넘으면 에러)
    --cycle -- 순환
    cache 20
    ;

select seqTest.nextVal from dual;


-- 프로젝트 > 오라클 비정상 종료 > 다음날 > 질문? 5 -> 21? : cache 때문





