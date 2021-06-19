-- D:\class\server\JSPTest\db.sql

create table tblAddress(
    seq number primary key,
    name varchar2(30) not null,
    age number(3) not null,
    address varchar2(200) not null,
    gender char(1) not null,
    tel varchar2(15) not null
);

create sequence seqAddress;

insert into tblAddress values(seqAddress.nextVal, '홍길동', 20, '서울시 강남구 역삼동 11-1', 'm', '010-1234-5678');
insert into tblAddress values(seqAddress.nextVal, '아무개', 22, '서울시 강동구 천호동 21-2', 'm', '010-2222-1111');
insert into tblAddress values(seqAddress.nextVal, '하하하', 24, '서울시 동대문구 휘경동 33-3', 'f', '010-3351-2345');

select * from tblAddress;

commit;