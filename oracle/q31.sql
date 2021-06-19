-- q31.sql

--23.
select s.name, s.address, s.salary, p.project from tblStaff s
    left outer join tblProject p
        on s.seq = p.staff;

--24.
select m.name from tblVideo v
    inner join tblRent r
        on v.seq = r.video
            inner join tblMember m
                on r.member = m.seq
                    where v.name = '뽀뽀할까요';

--25.
select s.salary from tblStaff s
    inner join tblProject p
        on s.seq = p.staff
            where p.project = 'TV 광고';

--26.
select m.name from tblVideo v
    inner join tblRent r
        on v.seq = r.video
            inner join tblMember m
                on r.member = m.seq
                    where v.name = '털미네이터';

--27.
select s.name, s.salary, p.project from tblStaff s
    left outer join tblProject p
        on s.seq = p.staff
            where s.address not in ('서울시');

--28.
select c.tel, c.name, s.item, s.qty from tblCustomer c
    inner join tblSales s
        on c.seq = s.cseq
            where s.qty >= 2;

--29.
select v.name, v.qty, g.price from tblVideo v
    inner join tblGenre g
        on v.genre = g.seq;

--30.
select m.name as 회원명, v.name as 비디오명, r.rentdate, g.price from tblVideo v
    inner join tblRent r
        on v.seq = r.member
            inner join tblMember m
                on r.member = m.seq
                    inner join tblGenre g
                        on g.seq = v.genre
                            where to_char(r.rentdate, 'yyyy-mm') = '2007-02';

--31.
select m.name as 회원명, v.name as 비디오명, r.rentdate from tblVideo v
    inner join tblRent r
        on v.seq = r.video
            inner join tblMember m
                on m.seq = r.member
                    where retdate is null;

--32.
select max(basicpay) - min(basicpay) as 차액
from (
select a.*, rownum as rnum
from (
select * from tblInsa
where ssn like '%-1%'
order by basicpay desc) a)
where rnum = 3 or rnum = 9;

--33.
select
    e.last_name || ' ' || e.first_name as name,
    e.department_id,
    d.department_name
from employees e
    left outer join departments d
        on e.department_id = d.department_id;

--34.
select
    e.*,
    j.job_title
from employees e
    left outer join jobs j
        on e.job_id = j.job_id;

--35.
select e.*
from employees e
    inner join jobs j
        on e.job_id = j.job_id
            where e.salary = j.max_salary;

--36.
select d.*, l.city
from departments d
    inner join locations l
        on d.location_id = l.location_id;

--37.
select c.country_name
from locations l
    inner join countries c
        on l.country_id = c.country_id
            where l.location_id = 2900;

--38.
select distinct (e1.last_name || ' ' || e1.first_name) as name, e1.salary, e1.department_id from employees e1
    inner join employees e2
        on e1.department_id = e2.department_id
            where e1.salary >= 12000;

--39.
select e.last_name || ' ' || e.first_name as name, e.job_id, e.department_id, d.department_name from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join locations l
                on d.location_id = l.location_id
                    where l.city = 'Seattle';

-- 40.
select * from employees
where department_id = (select department_id from employees where first_name = 'Jonathon');

-- 41.
select
    e.first_name || ' ' || e.last_name as name,
    d.department_name, e.salary
from employees e
    inner join departments d
        on e.department_id = d.department_id
where e.salary >= 3000;

--42.
select e.department_id, d.department_name, e.last_name || ' ' || e.first_name as name, e.salary from employees e
    inner join departments d
        on e.department_id = d.department_id
where e.department_id = 10;

--43. 부서장이 있는 부서?
select
    *
from employees e
    right outer join departments d
        on e.employee_id = d.manager_id;

--44.
select j.start_date, j.end_date, d.department_name from departments d
    inner join job_history j
        on d.department_id = j.department_id;

--45.
select
e1.employee_id as 사원번호,
e1.last_name || ' ' || e1.first_name as 사원이름,
e2.employee_id as 관리자번호,
e2.last_name || ' ' || e2.first_name as 관리자이름
from employees e1
    inner join employees e2
        on e1.manager_id = e2.employee_id;

--46.
select
    to_char(e.hire_date, 'yyyy') as 입사년도,
    avg(e.salary) as 평균급여
from employees e
    inner join jobs j
        on e.job_id = j.job_id
where j.job_title = 'Sales Manager'
group by to_char(e.hire_date, 'yyyy')
order by to_char(e.hire_date, 'yyyy');

--47.
select l.city, avg(e.salary), count(*)
from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join locations l
                on d.location_id = l.location_id
group by l.city
having count(*) < 10
order by avg(e.salary);

--48.
select
    e.employee_id, e.last_name || ' ' || e.first_name as name
from employees e
    inner join jobs j
        on e.job_id = j.job_id
            inner join job_history h
                on e.employee_id = h.employee_id
where j.job_title <> 'Public Accountant' and h.job_id = j.job_id;

--49.
select
    e.first_name,
    e.last_name,
    d.department_name,
    l.city
from employees e
    left outer join departments d
        on e.department_id = d.department_id
            left outer join locations l
                on d.location_id = l.location_id
where e.commission_pct is not null;

--50.
select
    e1.first_name,
    e1.last_name,
    e1.hire_date
from employees e1
    inner join employees e2
        on e1.manager_id = e2.employee_id
where e1.hire_date < e2.hire_date;

--51.
select
    count(distinct manager_id)
from employees;

--52.
select
    e1.last_name,
    e1.salary
from employees e1
    inner join employees e2
        on e1.manager_id = e2.employee_id
where e1.salary > e2.salary;

--53.
    

--54.
select
    e.employee_id,
    e.first_name,
    e.last_name,
    case
        when e.department_id is not null then d.department_name
        when e.department_id is null then 'Not Assigned'
    end as department_name
from employees e
    left outer join departments d
        on e.department_id = d.department_id
where to_char(hire_date, 'yyyy') = '2007';

--55.
select
    e1.*,
    case
        when e1.job_id = 'AD_PRESS' then 'A'
        when e1.job_id = 'ST_MAN' then 'B'
        when e1.job_id = 'IT_PROG' then 'C'
        when e1.job_id = 'SA_REP' then 'D'
        when e1.job_id = 'ST_CLERK' then 'E'
        else '0'
    end as grade
from employees e1
    inner join employees e2
        on e1.employee_id = e2.employee_id;

--56.
select
    e.first_name,
    e.last_name,
    e.salary
from employees e
    inner join jobs j
        on e.job_id = j.job_id
where j.job_title = 'Sales Representative' and e.salary between 9000 and 10000;

--57.
select
    e.last_name,
    d.department_name,
    e.salary
from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join (select e.department_id, min(e.salary) as 최소급여
                        from employees e
                            inner join departments d
                                on e.department_id = d.department_id
                                    group by e.department_id) m
                                        on e.department_id = m.department_id
                                            where e.salary = m.최소급여
                                                order by d.department_name, e.last_name;

--58.
select
    e.last_name as 사원이름,
    case
        when e.manager_id is not null then e2.last_name
        when e.manager_id is null then '없음'
    end as 매니저이름,
    d.department_name as 부서이름
from employees e
    inner join departments d
        on e.department_id = d.department_id
           inner join locations l
                on d.location_id = l.location_id
                  left outer join employees e2
                    on e.manager_id = e2.employee_id
where l.city = 'Seattle'
order by e.last_name;

--59.
select
    j.job_title,
    sum(e.salary) as 연봉합계
from employees e
    inner join jobs j
        on e.job_id = j.job_id
group by j.job_title
having sum(e.salary) > 30000
order by sum(e.salary) desc;

--60.
select
    e.employee_id,
    e.first_name,
    j.job_title,
    d.department_name
from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join locations l
                on d.location_id = l.location_id
                    inner join jobs j
                        on e.job_id = j.job_id
where l.city = 'Seattle' and l.location_id = d.location_id
order by e.employee_id;

--61.
select
    e1.first_name as 사원이름,
    e1.hire_date as 입사일,
    e2.employee_id as 관리자사번,
    e2.first_name as 관리자이름
from employees e1
    left outer join employees e2
        on e1.manager_id = e2.employee_id
where to_char(e1.hire_date, 'yyyy') between '2001' and '2003';

--62.
select
    e.first_name,
    e.salary,
    d.department_name
from employees e
    inner join departments d
        on e.department_id = d.department_id
where d.department_name = 'Sales' and
        e.salary < (select avg(salary)
                        from employees
                            where department_id = 100);

--63.
select
    e1.employee_id,
    e1.last_name
from employees e1
    inner join(
select
    distinct department_id
from employees
where instr(lower(last_name), 'u') > 0) e2
    on e1.department_id = e2.department_id;

--64.
select
    d.department_name,
    max(e.salary),
    min(e.salary),
    avg(e.salary)
from employees e
    inner join departments d
        on e.department_id = d.department_id
group by d.department_name
having avg(e.salary) between (select avg(e2.salary)
                                from employees e2
                                    inner join departments d2
                                        on e2.department_id = d2.department_id
                                            where d2.department_name = 'IT') and
                             (select avg(e3.salary)
                                from employees e3
                                    inner join departments d3
                                        on e3.department_id = d3.department_id
                                            where d3.department_name = 'Sales');

--65.
select
    d.department_name,
    case
        when count(e.employee_id) = 0 then '신생부서'
        when count(e.employee_id) = 1 then '1인부서'
    end
from employees e
    right outer join departments d
        on e.department_id = d.department_id
group by d.department_name
having count(e.employee_id) <= 1
order by d.department_name desc;

--66.
select
    d3.department_name as 부서,
    to_char(e2.hire_date, 'mm') as 입사월,
    count(*) as 사원수
from employees e2
    inner join (select d.department_id
                from employees e
                    inner join departments d
                        on e.department_id = d.department_id
                            group by d.department_id
                                having count(*) >= 5) d2
        on e2.department_id = d2.department_id
            inner join departments d3
                on d2.department_id = d3.department_id
                    group by d3.department_name, to_char(e2.hire_date, 'mm')
                        order by d3.department_name;            

--67.
select
    case
        when c.country_name is not null then c.country_name
        when c.country_name is null then '부서없음'
    end as 국가명,
    case
        when l.city is not null then l.city
        when l.city is null then '부서없음'
    end as 도시명,
    count(*) as 사원수
from employees e
    left outer join departments d
        on e.department_id = d.department_id
            left outer join locations l
                on d.location_id = l.location_id
                    left outer join countries c
                        on l.country_id = c.country_id
                            group by c.country_name, l.city
                                order by 국가명, count(*);

--68.
select
    d2.department_name,
    e2.employee_id,
    e2.first_name,
    e2.salary
from employees e2
    inner join departments d2
        on e2.department_id = d2.department_id
            inner join (
select
    d.department_id as department_id,
    max(salary) as salary
from employees e
    inner join departments d
        on e.department_id = d.department_id
            group by d.department_id) r
                on d2.department_id = r.department_id
                    where e2.salary = r.salary;

--69.
select
    case
        when trunc(commission_pct, 1) is not null then ltrim(to_char(trunc(commission_pct, 1), '0.0'))
        when trunc(commission_pct, 1) is null then '커미션 없음'
    end as 커미션,
    count(*)
from employees
group by trunc(commission_pct, 1)
order by 커미션;

--70.
select
    d.department_name,
    e.first_name,
    e.salary,
    e.commission_pct
from (select *    
      from(select *
           from employees
                where commission_pct is not null
                    order by commission_pct desc)
      where rownum <= 4) e
            inner join departments d
                on e.department_id = d.department_id
                    order by salary desc;

--71.
select t1.name, t2.buseo, t2.basicpay
from tblInsa t1
    inner join (
select buseo, max(basicpay) as basicpay from tblInsa
group by buseo) t2
    on t1.buseo = t2.buseo
        where t1.basicpay = t2.basicpay;

--72.
select title, rownum as rank
from(
select * from tblTodo
order by completedate - adddate)
where rownum <= 5;










