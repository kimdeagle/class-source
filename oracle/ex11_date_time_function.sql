-- ex11_date_time_function.sql

-- 날짜 시간 함수

-- sysdate
-- 현재 시각을 반환
-- date sysdate
select sysdate from dual;

/*

날짜 연산
1. 시각 - 시각 = 시간(일)
2. 시각 + 시간 = 시각
3. 시각 - 시간 = 시각

*/

-- 1. 시각 - 시각
-- tblInsa. 입사일 - 현재 -> 근무 경력
select
    name,
    ibsadate,
    round(sysdate - ibsadate),
    round((sysdate - ibsadate) / 365, 1),
    round(sysdate - ibsadate) as 근무일수,
    round(sysdate - ibsadate) / 365 as 근무년수,
    round(sysdate - ibsadate) * 24 as 근무시수,
    round(sysdate - ibsadate) * 24 * 60 as 근무분수
from tblInsa;


-- 2. 시각 + 시간(일) = 시각
-- 2. 시각 - 시간(일) = 시각
select sysdate, sysdate + 10, sysdate - 100 from dual;

-- 지금 시각으로부터 2시간 뒤?
select sysdate, sysdate + 2 / 24 from dual;

--------------------------------------------------------------------------------
-- 일, 시, 분, 초 -> 연산 가능
-- 월, 년 -> 연산 불가능

-- months_between()
-- number months_between(date, date)

-- 입사한 뒤 몇달? 몇년?
select
    name,
    ibsadate,
    sysdate - ibsadate,
    months_between(sysdate, ibsadate),--월
    months_between(sysdate, ibsadate) / 12
from tblInsa;

-- add_months()
-- date add_months(date, number)

-- 2달 뒤?
select
    sysdate,
    add_months(sysdate, 2) as 두달뒤,
    add_months(sysdate, -2) as 두달전
from dual;










