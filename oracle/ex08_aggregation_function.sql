-- ex08_aggregation_function.sql

/*

집계 함수(Aggregation Function)
  - 처음 쉬움 -> 뒤로 갈수록 어려움
1. count()
2. sum()
3. avg()
4. max()
5. min()

1. count()
  - 결과셋의 레코드 갯수를 반환한다.
  - number count(컬럼명)

*/

select count(name) from tblCountry;

select count(name) from tblInsa;
select count(name) from tblInsa where buseo = '기획부';
select count(name) from tblInsa where ssn like '%-2%'; --여직원수
select count(name) from tblInsa where city = '서울' and jikwi = '부장'; --서울사는 부장님수

-- 트랜잭션
-- insert, update, delete -> 최종 승인(commit, rollback)
-- 커밋 선택(항상)

delete from tblInsa where num = 1001;
select * from tblInsa;

select * from tblCountry;

select name from tblCountry;
select count(name) from tblCountry; --14

select population from tblCountry;
select count(population) from tblCountry; --13

select count(*) from tblCountry;

select count(name, area) from tblCountry; --안해줌

-- completedate
select count(*) from tblTodo where completedate is not null; --한 일 개수
select count(*) from tblTodo where completedate is null; --안한 일 개수

select
    count(*) as 전체개수,
    count(completedate) as 한일개수,
    count(*) - count(completedate) as 안한일개수
from tblTodo;


-- tblInsa. 총인원수? 연락처 있는 사람? 연락처 없는 사람?
select
    count(*) as 총인원수,
    count(tel) as 연락처있는사람,
    count(*) - count(tel) as 연락처없는사람
from tblInsa;


-- tblInsa. 어떤 종류의 부서가 있습니까? > 개수?
select count(distinct buseo) as 부서개수 from tblInsa;

-- tblComedian. 남자 몇명? 여자 몇명?
select count(*) from tblComedian where gender = 'm';
select count(*) from tblComedian where gender = 'f';

-- 위에 질문에 대한 답을 1개의 결과셋으로 얻고 싶음.
select
    --count(*) as 전체인원수
    count(case
        when gender = 'm' then 1
    end) as 남자수,
    count(case
        when gender = 'f' then 1
    end) as 여자수
from tblComedian;


-- 집계함수 사용 시 주의점!!! -> 에러 발생!!!

-- 1. ORA-00937: not a single-group group function
-- 컬럼리스트에서 집계함수와 일반 컬럼이 동시에 올 수 없다.
-- 개인의 값과 집합의 값을 동시에 한 레코드에 담을 수 없다.

select * from tblInsa;
select count(name) from tblInsa; --이름이 있는 사람이 몇 명?
select count(name), name from tblInsa; --error

-- 2. ORA-00934: group function is not allowed here
-- where절에는 절대로 집계 함수를 사용할 수 없다.
-- where절은 레코드 각각에 대한 질문(개인에 대한 질문) -> 집계 함수 사용 불가

-- tblInsa. 평균 급여? -> 평균 급여보다 급여를 더 받는 사람들?
select basicpay from tblInsa;
select avg(basicpay) from tblInsa; -- 155만원

select * from tblInsa where basicpay > 1550000; --27명
select * from tblInsa where basicpay > avg(basicpay); --error

/*

2. sum()
  - number sum(컬럼명)
  - 해당 컬럼값들의 합을 구한다.
  - 숫자형에만 적용 가능하다.(문자형X, 날짜형X)
  - null값 제외

*/

select weight from tblComedian;
select sum(weight) from tblComedian;

select sum(first) from tblComedian;

select
    sum(basicpay),
    sum(sudang),
    sum(basicpay) + sum(sudang),
    sum(basicpay + sudang)
from tblInsa;

/*

3. avg()
  - number avg(컬럼명)
  - 해당 컬럼값들의 평균값을 반환한다.
  - 숫자형만 가능하다.
  - null값은 몫에서 제거

*/

select
    avg(basicpay),
    sum(basicpay) / count(*)
from tblInsa;

-- tblCountry 내의 평균 인구수?
select
    avg(population), --15588
    sum(population) / count(*), --14475
    sum(population) / count(population) --15588
from tblCountry;

select
    count(*), --14
    count(population) --13
from tblCountry;

-- 회사 -> 연말 -> 성과급 지급
-- 14명 -> 1명 프로젝트 참여X
-- 1. 균등 지급 : sum() / count(*)
-- 2. 차등 지급 : sum() / count(참여인원) = avg()

/*

4. max()
5. min()
  - object max(컬럼명)
  - 최대값 반환
  - 숫자형, 문자형, 날짜형 사용 가능
  
  - object min(컬럼명)
  - 최소값 반환
  - 숫자형, 문자형, 날짜형 사용 가능

*/

select * from tblInsa;

select max(basicpay), min(basicpay) from tblInsa;
select max(name), min(name) from tblInsa;
select max(ibsadate), min(ibsadate) from tblInsa;

/*

count()
1. tblCountry. 아시아(AS)와 유럽(EU)에 속한 나라의 개수?? -> 7개
2. 인구수가 7000 ~ 20000 사이인 나라의 개수?? -> 2개
3. hr.employees. job_id > 'IT_PROG' 중에서 급여가 5000불이 넘는 직원이 몇명? -> 2명
4. tblInsa. tel. 010을 안쓰는 사람은 몇명?(연락처가 없는 사람은 제외) -> 42명
5. city. 서울, 경기, 인천 -> 그 외의 지역 인원수? -> 18명
6. 80년대생 + 여자 직원 총 몇명? -> 9명
sum()
1. 유럽과 아프리카에 속한 나라의 인구 수 합? tblCountry > 14,198
2. 매니저(108)이 관리하고 있는 직원들의 급여 총합? hr.employees > 39,600
3. 직업(ST_CLERK, SH_CLERK)을 가지는 직원들의 급여 합? hr.employees > 120,000
4. 서울에 있는 직원들의 급여 합(급여 + 수당)? tblInsa > 33,812,400
5. 장급(부장+과장)들의 급여 합? tblInsa > 36,289,000
avg()
1. 아시아에 속한 국가의 평균 인구수? tblCountry > 39,165
2. 이름(first_name)에 'AN'이 포함된 직원들의 평균 급여?(대소문자 구분없이) hr.employees > 6,270.4
3. 장급(부장+과장)의 평균 급여? tblInsa > 2,419,266.66
4. 사원급(대리+사원)의 평균 급여? tblInsa > 1,268,946.66
5. 장급(부장,과장)의 평균 급여와 사원급(대리,사원)의 평균 급여의 차액? tblInsa > 1,150,320
max(),min()
1. 면적이 가장 넓은 나라의 면적은? tblCountry > 959
2. 급여(급여+수당)가 가장 적은 직원은 총 얼마를 받고 있는가? tblInsa > 988,000

*/

/*
count()
1. tblCountry. 아시아(AS)와 유럽(EU)에 속한 나라의 개수?? -> 7개
2. 인구수가 7000 ~ 20000 사이인 나라의 개수?? -> 2개
3. hr.employees. job_id > 'IT_PROG' 중에서 급여가 5000불이 넘는 직원이 몇명? -> 2명
4. tblInsa. tel. 010을 안쓰는 사람은 몇명?(연락처가 없는 사람은 제외) -> 42명
5. city. 서울, 경기, 인천 -> 그 외의 지역 인원수? -> 18명
6. 80년대생 + 여자 직원 총 몇명? -> 9명
*/
--1
select count(*) from tblCountry where continent in ('AS', 'EU');
--2
select count(*) from tblCountry where population between 7000 and 20000;
--3
select count(*) from employees where job_id = 'IT_PROG' and salary >= 5000;
--4
select count(*) from tblInsa where not tel like '010%' and tel is not null;
--5
select count(*) from tblInsa where city not in ('서울', '경기', '인천');
--6
select count(*) from tblInsa where ssn like '%-2%' and ssn like '8%';
select count(*) from tblInsa where ssn like '%-2%'; -- 위 코드 줄일 수 있다.

/*
sum()
1. 유럽과 아프리카에 속한 나라의 인구 수 합? tblCountry > 14,198
2. 매니저(108)이 관리하고 있는 직원들의 급여 총합? hr.employees > 39,600
3. 직업(ST_CLERK, SH_CLERK)을 가지는 직원들의 급여 합? hr.employees > 120,000
4. 서울에 있는 직원들의 급여 합(급여 + 수당)? tblInsa > 33,812,400
5. 장급(부장+과장)들의 급여 합? tblInsa > 36,289,000
*/
--1
select sum(population) from tblCountry where continent in('EU', 'AF');
--2
select sum(salary) from employees where manager_id = 108;
--3
select sum(salary) from employees where job_id in('ST_CLERK', 'SH_CLERK');
--4
select sum(basicpay + sudang) from tblInsa where city = '서울';
--5
select sum(basicpay) from tblInsa where jikwi in('부장', '과장');

/*
avg()
1. 아시아에 속한 국가의 평균 인구수? tblCountry > 39,165
2. 이름(first_name)에 'AN'이 포함된 직원들의 평균 급여?(대소문자 구분없이) hr.employees > 6,270.4
3. 장급(부장+과장)의 평균 급여? tblInsa > 2,419,266.66
4. 사원급(대리+사원)의 평균 급여? tblInsa > 1,268,946.66
5. 장급(부장,과장)의 평균 급여와 사원급(대리,사원)의 평균 급여의 차액? tblInsa > 1,150,320
*/
--1
select avg(population) from tblCountry where continent = 'AS';
--2
select avg(salary)
    from employees
        where first_name like '%an%' or
            first_name like '%aN%' or
            first_name like '%An%' or
            first_name like '%AN%';
--3
select avg(basicpay) from tblInsa where jikwi in('부장', '과장');
--4
select avg(basicpay) from tblInsa where jikwi in('대리', '사원');
--5
select
    avg(case
        when jikwi in('부장', '과장') then basicpay
    end)
    -
    avg(case
        when jikwi in('대리', '사원') then basicpay
    end) as 급여평균차액
from tblInsa;

/*
max(),min()
1. 면적이 가장 넓은 나라의 면적은? tblCountry > 959
2. 급여(급여+수당)가 가장 적은 직원은 총 얼마를 받고 있는가? tblInsa > 988,000
*/
--1
select max(area) from tblCountry;
--2
select min(basicpay + sudang) as min from tblInsa;





