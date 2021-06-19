-- q29.sql

--1.
select * from traffic_accident;

select
    trans_type,
    sum(total_acct_num) as 사고발생수,
    sum(death_person_num) as 사망자수,
    sum(death_person_num)/sum(total_acct_num) as 평균사망자수
from traffic_accident
group by trans_type;

--2.
select * from tblZoo;

select
    family,
    avg(leg)
from tblZoo
group by family;

--3.
select
    breath,
    count(*)
from tblZoo
where thermo = 'variable'
group by breath;

--4.
select
    family,
    sizeof,
    count(*)
from tblZoo
group by family, sizeof
order by family, sizeof;

--5.
select * from tblMen;
select * from tblWomen;

select
    name as "[남자]",
    height as "[남자키]",
    weight as "[남자몸무게]",
    (select name from tblWomen where name = tblMen.couple) as "[여자]",
    (select height from tblWomen where name = tblMen.couple) as "[여자키]",
    (select weight from tblWomen where name = tblMen.couple) as "[여자몸무게]"
from tblMen;

--6.
select * from tblTodo;

select
    count(completedate),
    count(*) - count(completedate)
from tblTodo;

--7.
select * from tblAddressBook;

select
    floor(AGE / 10) * 10 || '대' as 연령대,
    count(*)
from tblAddressBook
where instr(address, '서울') > 0
group by floor(AGE / 10)
order by floor(age / 10);

--8.
select
    *
from tbladdressbook
where substr(address, 1, 2) = hometown;

--9.
select
    *
from tbladdressbook
where instr(address, '역삼로') > 0 and instr(email, 'gmail') > 0;

--10.
select distinct hometown from tblAddressBook
where job = (select job
            from tblAddressBook
            group by job
            having count(*) = (select max(count(*))
                                from tblAddressBook
                                group by job));


--11.
select
    *
from tbladdressbook
where instr(tel, '123') > 0 and gender = 'f';

--12.
select
    email
from tbladdressbook
group by email
having count(email) > 1;

--13.
select
    substr(email, instr(email, '@')+1)
from tbladdressbook
where substr(email, 1, instr(email, '@')) = (select max(substr(email, 1, instr(email, '@'))) from tbladdressbook);

--14. (보류)
select
    avg(age)
from tbladdressbook
group by hometown
having avg(age) = 38.6875;



--15.
select
    substr(name, 1, 1)
from tbladdressbook
group by substr(name, 1, 1)
having count(*) > 100;

--16.
select
    *
from tbladdressbook;










