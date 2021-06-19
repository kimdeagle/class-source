-- ex18_groupby.sql

/*

group by절
  - 레코드들을 특정 컬럼값(1개 or 그이상)을 기준으로 그룹을 나누는 역할
  - 그룹을 왜 나누는지?
    - 나눠진 그룹을 대상 > 각각의 그룹 > 집계 함수를 적용하기 위해서(count, sum, avg, max, min)


select 컬럼리스트
from 테이블
where 조건
group by 그룹조건
order by 정렬조건
    
실행순서
from -> where -> group by -> select -> order by

*/

-- tblInsa. 부서별로 평균 급여가 얼마나?
select * from tblInsa;

select floor(avg(basicpay)) from tblInsa; --1,556,526

select distinct buseo from tblInsa;

select floor(avg(basicpay)) from tblInsa where buseo = '총무부'; --1714857
select floor(avg(basicpay)) from tblInsa where buseo = '개발부'; --1387857
select floor(avg(basicpay)) from tblInsa where buseo = '영업부'; --1601512
select floor(avg(basicpay)) from tblInsa where buseo = '기획부'; --1855714
select floor(avg(basicpay)) from tblInsa where buseo = '인사부'; --1533000
select floor(avg(basicpay)) from tblInsa where buseo = '자재부'; --1416733
select floor(avg(basicpay)) from tblInsa where buseo = '홍보부'; --1451833


-- group by
-- group by 사용 시 컬럼리스트에는 집계함수만 올 수 있다.(********)
-- ORA-00979: not a GROUP BY expression
select buseo, floor(avg(basicpay))
    from tblInsa
        group by buseo;


-- 부서별 인원수?
select buseo, count(*) from tblInsa group by buseo;

-- 직위별 인원수?
select jikwi, count(*) from tblInsa group by jikwi;

select jikwi, count(*) from tblInsa group by jikwi order by jikwi asc;
select jikwi, count(*) from tblInsa group by jikwi order by count(*) asc;

-- 남자 직원수? 여자 직원수?
select
    count(
    case
        when substr(ssn, 8, 1) = '1' then 1
    end) as 남자직원수,
    count(
    case
        when substr(ssn, 8, 1) = '2' then 1
    end) as 여자직원수
from tblInsa;

select
    count(decode(substr(ssn, 8, 1), '1', 1)) as 남자직원수,
    count(decode(substr(ssn, 8, 1), '2', 1)) as 여자직원수
from tblInsa;

select
    substr(ssn, 8, 1),
    count(*)
from tblInsa
    group by substr(ssn, 8, 1); -- 그룹의 기준은 컬럼 자체가 아니어도 된다. > 연산, 함수의 결과도 가능

-- 년도별 입사인원수?
select
    to_char(ibsadate, 'yyyy'),
    count(*)
from tblInsa
    group by to_char(ibsadate, 'yyyy')
        order by to_char(ibsadate, 'yyyy');
        
--tblInsa. 급여별 그룹 > 인원수?
-- 100만원 미만, 100~200만원 미만, 200만원 이상
select
--    basicpay,
--    ceil(basicpay / 1000000)
    ceil(basicpay / 1000000),
    count(*)
from tblInsa
    group by ceil(basicpay / 1000000);


select
    jikwi,
    count(*)
from tblInsa
where buseo = '기획부'
group by jikwi
order by jikwi;

/*

having절
  - 조건절

select 컬럼리스트
from 테이블
where 조건
group by 그룹조건
having 조건
order by 정렬조건
    
실행순서
from -> where -> group by -> having -> select -> order by

*** 기억
1. from절 -> where절 : 개인에 대한 조건(주로 컬럼값에 대한 조건)
2. group by절 -> having절 : 그룹에 대한 조건(주로 집계함수 결과값에 대한 조건)

*/

-- 부서별 인원수?
select
    buseo,
    count(*) as 인원수
from tblInsa
--where city = '서울' -- 개인에 대한 질문(레코드 하나 하나에 대한 개별적인 질문)
group by buseo
having count(*) > 10
order by buseo; -- 그룹에 대한 질문(그룹을 통해 산출된 값에 대한 질문. 집계 함수값에 대한 질문)


-- tblCountry. 대륙별 최대 인구수, 최소 인구수, 평균 인구수?
select
    continent,
    max(population),
    min(population),
    avg(population),
    sum(population),
    count(*)
from tblCountry
group by continent;

-- 직업별 인원수
select job_id, count(*) from employees group by job_id;


select * from tblAddressBook;

-- 성별 인원수
select
    case
        when gender = 'm' then '남자'
        when gender = 'f' then '여자'
    end as gender,
    count(*)
from tblAddressBook group by gender;

-- 몸무게별(10kg 단위) 인원수
select
    floor(weight / 10) * 10 || 'kg',
    count(*)
from tbladdressbook
group by floor(weight / 10)
order by floor(weight / 10);

-- 부서별 인원수
select
    buseo,
    count(*),
    count(decode(jikwi, '부장', 1)) as 부장,
    count(decode(jikwi, '과장', 1)) as 과장,
    count(decode(jikwi, '대리', 1)) as 대리,
    count(decode(jikwi, '사원', 1)) as 사원
from tblInsa
group by buseo;


-- rollup() - 나중에
-- cube() - 나중에

-- 1차 그룹, 2차 그룹, ...
select
    buseo,
    jikwi,
    city,
    count(*) as 인원
from tblInsa
group by buseo, jikwi, city
order by buseo, jikwi;

-- listagg
-- 오라클에서만 지원

select
    buseo,
--    listagg(name, ',') within group(order by name asc) as name,
    listagg(jikwi, ',') within group(order by jikwi asc) as jikwi
from tblInsa
group by buseo;



