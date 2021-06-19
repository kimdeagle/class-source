-- q27.sql

-- Q01
select * from tblCountry;

-- Q02
select name, capital from tblCountry;

-- Q03
select name as "[국가명]"
    , capital as "[수도명]"
    , population as "[인구수]"
    , area as "[면적]"
    , continent as "[대륙]"
from tblCountry;

-- Q04
select '국가명:' || name || ', ' || 
        '수도:' || capital || ', ' || 
        '인구수:' || population as "[국가정보]"
from tblCountry;

-- Q05
select first_name || ' ' || last_name as "[이름]"
    , email || '@GMAIL.COM' as "[이메일]"
    , phone_number as "[연락처]"
    , '$' || salary as "[급여]"
from employees;

-- Q06
select name, area
from tblCountry
where area <= 100;

-- Q07
select name
from tblCountry
where continent in ('AS', 'EU');

-- Q08
select first_name || ' ' || last_name, phone_number
from employees
where job_id = 'IT_PROG';

-- Q09
select first_name || ' ' || last_name, phone_number, hire_date
from employees
where last_name = 'Grant';

-- Q10
select first_name || ' ' || last_name, salary, phone_number
from employees
where manager_id = 120;

-- Q11
--select * from employees;
--desc employees;

select first_name || ' ' || last_name, phone_number, email || 'gmail.com', department_id
from employees
where department_id in (60, 80, 100);

-- Q12
select * from tblInsa where buseo = '기획부';

-- Q13
select name, jikwi, tel
from tblInsa
where city = '서울' and jikwi = '부장';

-- Q14
select * from tblInsa where basicpay + sudang >= 1500000 and city = '서울';

-- Q15
select * from tblInsa where sudang <= 150000 and jikwi in ('사원', '대리');

-- Q16
--select * from tblInsa;
--desc tblInsa;

select *
    from tblInsa
        where basicpay * 12 >= 20000000
            and city = '서울'
            and jikwi in ('과장', '부장');

-- Q17
--select * from tblCountry;
--desc tblCountry;

select * from tblCountry where name like '_국';
select * from tblCountry where name like '%국';

-- Q18
select * from employees where phone_number like '515%';

-- Q19
select * from employees where job_id like 'SA%';

-- Q20
--select * from employees;
--desc employees;

select *
    from employees
        where first_name like '%de%'
            or first_name like '%dE%'
            or first_name like '%De%'
            or first_name like '%DE%';
            
-- Q21
select * from tblInsa where ssn like '%-1%';

-- Q22
select * from tblInsa where ssn like '%-2%';

-- Q23
select *
    from tblInsa
        where ssn like '__07%'
            or ssn like '__08%'
            or ssn like '__09%';
            
-- Q24
select *
    from tblInsa
        where name like '김%' and city in ('서울', '인천');

-- Q25
select *
from tblInsa
where buseo in ('영업부', '총무부', '개발부')
    and jikwi in ('사원', '대리')
    and tel like '010%';

-- Q26
select *
from tblInsa
where city in ('서울', '인천', '경기')
    and ibsadate between '2008-01-01' and '2010-12-31';
    
-- Q27
select *
from employees
where department_id is null;

-- Q28
select distinct job_id from employees;

-- Q29
select distinct department_id from employees
    where hire_date between '2002-01-01' and '2004-12-31';

-- Q30 
select distinct manager_id from employees
    where salary >= 5000;
    
-- Q31
select distinct jikwi from tblInsa
    where ssn like '%-1%'
        and ssn like '8%';
        
-- Q32
select distinct city from tblInsa
    where sudang >= 200000;
    
-- Q33
select distinct buseo from tblInsa
    where tel is null;
