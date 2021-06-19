-- ex09_numerical_funtion.sql

-- 수학 함수
-- 자바의 Math 클래스

-- round()
-- 반올림 함수
-- number round(컬럼명) > 정수 반환
-- number round(컬럼명, 소수이하자릿수) > 실수 반환

select 100 / 3 from dual;
select sysdate from dual;


select
    10 / 3,
    round(10 / 3)
from dual;

select
    12345.6789,
    round(12345.6789),
    round(12345.6789, 1),
    round(12345.6789, 2),
    round(12345.6789, 3)
from dual;

select
    round(avg(basicpay)),
    round(avg(basicpay)) as 평균급여,
    round(avg(basicpay)) as "평균 급여",
    round(avg(basicpay)) as "select" --가능해도 절대 하면 안 됨
from tblInsa;

/*

floor(), trunc()
  - 절삭 함수
  - 무조건 내림 함수
  - 현재 숫자와 근접한 정수 중 가장 큰 정수를 반환하는 함수
  - number floor(컬럼명) -> 정수
  - number trunc(컬럼명 [, 소수이하자릿수]) -> 정수 or 실수

*/

select
    5.678,
    floor(5.678),
    floor(5.999999999999),
    trunc(5.678),
    trunc(5.678, 2)
from dual;

/*

ceil()
  - 무조건 올림 함수
  - number ceil(컬럼명)
  - 현재 숫자와 인접한 정수 중 가장 작은 정수를 반환
  
*/

select
    3.1,
    ceil(3.1)
from dual;

/*

mod()
  - 나머지 함수
  - number mod(피제수, 제수)

*/

select mod(10, 3) from dual;

-- abs : 절대값
-- power : 제곱
-- sqrt : 제곱근
select abs(-10), power(2, 8), sqrt(4) from dual;



