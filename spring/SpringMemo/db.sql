--SpringMemo > db.sql

create table tblMemo(
    seq number primary key,                         --메모번호(PK)
    name varchar2(30) not null,                     --작성자
    memo varchar2(1000) not null,                   --메모내용
    regdate date default sysdate not null           --작성 시간
);

create sequence seqMemo;

insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모장 테스트입니다.', default);

commit;

select * from tblMemo;