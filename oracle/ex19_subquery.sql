-- ex19_subquery.sql

/*

메인 쿼리(Main Query)
  - 하나의 select(insert, update, delete)로만 구성된 쿼리

서브 쿼리(Sub Query)
  - 메인 쿼리 + 1개 이상의 select문이 추가된 쿼리
  - 삽입 위치 : select절, from절, where절, order by절

*/

-- tblCountry. 인구수가 가장 많은 나라의 이름
select * from tblCountry;

select max(population) from tblCountry;

select name from tblCountry where population = 120660;

select name from tblCountry where population = (select max(population) from tblCountry);


-- tblInsa. 급여가 가장 적은 사람의 이름
select min(basicpay) from tblInsa; -- 840000
select name from tblInsa where basicpay = 840000;

select name from tblInsa where basicpay = (select min(basicpay) from tblInsa);

-- tblInsa. 급여가 가장 적은 기획부 사람의 이름
select name from tblInsa where basicpay = (select min(basicpay) from tblInsa where buseo = '기획부');


-- 나이가 28이고, 키가 177cm 여자의 남자친구 키?
select * from tblMen; -- 남자 테이블
select * from tblWomen; -- 여자 테이블

select name from tblWomen where age = 28 and height = 177;

select height from tblMen where couple = (select name from tblWomen where age = 28 and height = 177);


-- tblInsa. 평균 급여보다 더 많이 받는 직원들?
select * from tblInsa where basicpay > (select avg(basicpay) from tblInsa);

-- tblInsa. '홍길동' 직원과 같은 부서에 근무하는 사람들?
select * from tblInsa where buseo = (select buseo from tblInsa where name = '홍길동') and name <> '홍길동'; -- 길동이 제외하고 가져오기


-- 서브쿼리의 용도
-- 1. 조건절에서 비교값으로 사용
--  a. 반환값이 1행 1열 > 스칼라 쿼리 > 단일값 반환 -> 연산자 사용
--  b. 반환값이 n행 1열 > in 연산자 -> 열거형 비교
--  c. 반환값이 1행 n열
--  d. 반환값이 n행 n열

-- 1-a.
select * from tblInsa where basicpay = (select max(basicpay) from tblInsa);

-- 1-b.
-- 급여를 250만원 이상 받는 사람이 근무하는 부서의 모든 직원 명단?
-- ORA-01427: single-row subquery returns more than one row -> 1행 이상 반환했다.
select * from tblInsa where buseo = (select buseo from tblInsa where basicpay >= 2550000);
select * from tblInsa where buseo in (select buseo from tblInsa where basicpay >= 2550000);

-- 1-c.
-- '홍길동'과 같은 지역에 거주 + 같은 부서 사람?
select * from tblInsa where name = '홍길동'; -- 서울, 기획부

select * from tblInsa
    where city = (select city from tblInsa where name = '홍길동')
        and buseo = (select buseo from tblInsa where name = '홍길동');

select * from tblInsa
    where (city, buseo) = (select city, buseo from tblInsa where name = '홍길동');

-- 1-d.
select * from tblInsa
    where (city, buseo) in (select city, buseo from tblInsa where basicpay >= 2550000);


-- 서브쿼리의 용도
-- 2. 컬럼리스트에서 사용
--  a. 반드시 스칼라 쿼리를 사용한다. > 행이 1개, 열이 1개
--  b. 컬럼 리스트에서 사용되는 서브 쿼리의 종류
--      1. 정적 쿼리(모든 행에 동일한 값이 반환)
--      2. 상관 서브쿼리스(서브쿼리의 값과 바깥쪽 메인 쿼리간의 관계를 형성)****************************

select name, buseo, basicpay, (select floor(avg(basicpay)) from tblInsa) from tblInsa;

select name, buseo, (select name from tblInsa where buseo = '기획부') from tblInsa;

select name, buseo, (select name, buseo from tblInsa where num = 1001) from tblInsa;


select first_name, last_name, department_id from employees; -- 직원
select * from departments; -- 부서


select first_name, last_name, department_id, (select department_name from departments where department_id = employees.department_id) from employees;





