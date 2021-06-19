-- jdbc.sql

-- 주소록 테이블
create table tblAddress
(
    seq number primary key,                                     -- PK
    name varchar2(10) not null,                                 -- 이름
    age number(3) not null,                                     -- 나이
    gender char(1) not null,                                    -- 성별(m|f)
    tel varchar2(15) not null,                                  -- 전화번호
    address varchar2(300) not null,                             -- 주소
    regdate date default sysdate not null                       -- 등록일
);

create sequence seqAddress;

insert into tblAddress (seq, name, age, gender, tel, address, regdate)
    values (seqAddress.nextVal, '홍길동', 20, 'm', '010-1234-5678', '서울시 강남구 역삼동 한독빌딩', default);
    
select * from tblAddress order by seq;

commit;

select * from tblInsa;
select * from tblBonus;

select (select name from tblInsa where num = tblBonus.num) as name, bonus from tblBonus order by seq desc


select * from tblMen m inner join tblWomen w on m.couple = w.name;

select m.name, v.name from tblMember m inner join tblRent r on m.seq = r.member inner join tblVideo v on v.seq = r.video;


delete from tblAddress;
commit;
rollback;


-- Ex07_CallableStatement.java
-- m1()
create or replace procedure procM1
is
begin

    insert into tblAddress (seq, name, age, gender, tel, address, regdate)
        values (seqAddress.nextVal, '홍길동', 20, 'm', '010-1234-5678', '서울시 강남구 역삼동 한독빌딩', default);

end procM1;

begin
    procM1;
end;

select * from tblAddress order by seq desc;


-- m2()
-- 인자값(O), 반환값(X)

create or replace procedure procM2(
    pname tblAddress.name%type,
    page tblAddress.name%type,
    pgender tblAddress.gender%type,
    ptel tblAddress.tel%type,
    paddress tblAddress.address%type
)
is
begin
    insert into tblAddress (seq, name, age, gender, tel, address, regdate)
        values (seqAddress.nextVal, pname, page, pgender, ptel, paddress, default);
end procM2;


begin
    procM2('이름', 20, 'm', '010-2662-5223', '주소');
end;


select * from tblAddress order by seq desc;


-- procM3
-- 인자값(X), 반환값(O)

create or replace procedure procM3(
    pcount out number
)
is
begin

    select count(*) into pcount from tblAddress;

end procM3;


select * from tblAddress order by seq desc;


-- m4
create or replace procedure procM4(
    pnum in number,
    pname out varchar2,
    pbuseo out varchar2,
    pjikwi out varchar2
)
is
begin
    select name, buseo, jikwi into pname, pbuseo, pjikwi from tblInsa where num = pnum;
end procM4;


-- m5
create or replace procedure procM5(
    pbuseo in varchar2,
    pcursor out sys_refcursor
)
is
begin
    open pcursor for
        select name, buseo, jikwi, city from tblInsa
            where buseo = pbuseo;
end procM5;





select * from tblAddress;

delete from tblAddress;
commit;


update tblAddress set 수정할 내용 where seq = 1;


















