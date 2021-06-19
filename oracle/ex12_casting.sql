-- ex12_casting.sql

/*

형변환 함수 (날짜 관련 함수는 꼭 기억!)

1. to_char()    : 숫자 -> 문자 *****
2. to_char()    : 날짜 -> 문자 ********************
3. to_number()  : 문자 -> 숫자 *
4. to_date()    : 문자 -> 날짜 ********************

1. to_char()
  - varchar2 to_char(컬럼명, 형식문자열)
  
형식 문자열 구성 요소
a. 9 : 숫자 1개를 문자 1개로 바꾸는 역할(빈자리는 버린다.)
b. 0 : 숫자 1개를 문자 1개로 바꾸는 역할(빈자리는 0으로 메꾼다.)
c. $ : 통화 기호 표시
d. L : 통화 기호 표시
e. . : 소수점 표시
f. , : 자릿수 표시

*/

-- SQL은 자바 이상의 암시적 형변환을 지원한다.(많이~)

select
    100,            --number
    '100',          --char
    100 + 100,      --number + number
    '100' || '100', --char + char (|| 연산자가 문자열 연결 지원)
    100 + '100',    --number + char (암시적 형변환 지원)
    '100' + 100,    --char + number (암시적 형변환 지원)
--    100 + '홍길동'  --number + char (+ 연산자는 숫자 연산만 지원)
    200 as aaaaaaaaaaaaaaaaaaaaa,
    '200' as bbbbbbbbbbbbbbbbbbbbbb
from dual;

select
    100,
    '@' || to_char(100) || '#',         -- 숫자 -> 문자
    '@' || to_char(100, '999') || '#',  -- 100을 3자리 문자열로 바꿔라. 맨 앞자리 1자리를 부호자리로 사용한다.(양수는 +를 쓰지 않고 공백, 음수는 -붙여준다.)
    '@' || to_char(10, '999') || '#',
    '@' || to_char(1, '999') || '#',
    '@' || to_char(1000, '999') || '#', -- 원본이 4자리(지정한 자리수 이상의 숫자) -> 불가능
    
    to_char(100) || '점',
    ltrim(to_char(80, '999')) || '점',
    
    '@' || to_char(100, '000') || '#',
    '@' || to_char(10, '000') || '#',
    '@' || to_char(1, '000') || '#',
    '@' || to_char(1000, '000') || '#'  -- 원본이 4자리(지정한 자리수 이상의 숫자) -> 불가능
from dual;

select
    100,
    to_char(100, '$999'),
--    to_char(100, '999원')
    to_char(100, '999') || '원',
    to_char(100, 'L999') --locale(windows 특성에 따라 표시해줌)
from dual;

select
    345.678,
    to_char(345.678),
    to_char(345.678, '999.999'),
    to_char(345.678, '999.99'),
    to_char(345.678, '999.9'),
    to_char(345.678, '999'),
    to_char(345.678, '999.99999'),
    to_char(345.678, '99')
from dual;

select
    123456789,
    to_char(123456789),
    to_char(123456789, '999,999,999')
from dual;

/*

2. to_char() : 날짜 -> 문자
  - char to_char(컬럼명, '형식 문자열')

형식 문자열 구성 요소
a. yyyy
b. yy
c. month
d. mon
e. mm
f. day
g. dy
h. ddd, dd, d
i. hh, hh24
j. mi
k. ss
l. am(pm)

*/

select sysdate from dual;                           -- 20/11/26
select to_char(sysdate, 'yyyy') from dual;          -- 2020 (년, 4자리) ****
select to_char(sysdate, 'yy') from dual;            -- 20   (년, 2자리)

select to_char(sysdate, 'month') from dual;         -- 11월 (월, 풀네임)
select to_char(sysdate, 'mon') from dual;           -- 11월 (월, 약어)
select to_char(sysdate, 'mm') from dual;            -- 11 (월, 2자리 숫자) ****

select to_char(sysdate, 'day') from dual;           -- 목요일 (요일, 풀네임) ****
select to_char(sysdate, 'dy') from dual;            -- 목 (요일, 약자) ****

select to_char(sysdate, 'ddd') from dual;           -- 331 (일, 올해의 몇일?)
select to_char(sysdate, 'dd') from dual;            -- 26 (일, 이번달 몇일?) ****
select to_char(sysdate, 'd') from dual;             -- 5 (일, 이번주 몇일?) ****

select to_char(sysdate, 'hh') from dual;            -- 10 (시, 12시간 표기)
select to_char(sysdate, 'hh24') from dual;          -- 10 (시, 24시간 표기) ****

select to_char(sysdate, 'mi') from dual;            -- 04 (분) ****
select to_char(sysdate, 'ss') from dual;            -- 11 (초) ****

select to_char(sysdate, 'am') from dual;            -- 오전 (am, pm 둘다 오전, 오후 나옴 -> 둘 중 하나 쓰면됨)
select to_char(sysdate, 'pm') from dual;            -- 오전

select
    to_char(sysdate, 'yyyy-mm-dd'),
    to_char(sysdate, 'yyyy.mm.dd'),
    to_char(sysdate, 'yyyy/mm/dd'),
--    to_char(sysdate, 'yyyy년mm월dd일') -- 안됨..
    to_char(sysdate, 'hh24:mi:ss'),
    to_char(sysdate, 'day am hh:mi:ss'),
    to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss')
from dual;

-- to_char() 위치
-- 1. 컬럼 리스트에서 사용
select name, to_char(ibsadate, 'yyyy-mm-dd') from tblInsa;

-- 2. 조건절에서 사용
-- 2010년 입사한 사람??
select name, to_char(ibsadate, 'yyyy-mm-dd') from tblInsa
--    where ibsadate >= '2010-01-01' and ibsadate <= '2010-12-31';
--    where ibsadate between '2010-01-01' and '2010-12-31'; -- 2010-12-31 00:00:00 -> 31일에 입사한 사람은 제외된다.
--    where to_char(ibsadate, 'yyyy') = '2010';
    where to_char(ibsadate, 'd') = 5; -- 목요일에 입사한 사람

-- 암시적 형변환 발생
select '2010-01-01' from dual; -- 문자열O, 날짜X
select * from tblInsa where ibsadate > '2010-01-01'; -- 문자열X, 날짜O

-- 3. 정렬
select name, to_char(ibsadate, 'yyyy-mm-dd day') from tblInsa
--    order by ibsadate desc;
--    order by to_char(ibsadate, 'mm') asc; --월별 정렬
    order by to_char(ibsadate, 'd') asc; --요일별 정렬 (숫자)
--    order by to_char(ibsadate, 'day') asc; --요일 (문자) -> 가나다순 -> XXXXXX


-- 3. to_number() : 문자 -> 숫자
-- number to_number(컬럼명)
-- 잘 사용 안함 -> 암시적 형변환이 일어나서 -> 암시적 형변환이 일어난다는 것을 알고 있어야 한다.

select
    123 as aaaaaaaaaaaaaa,
    '123' as bbbbbbbbbbbbbb,
    to_number('123') as ccccccccccc,
    '123' + 100, --암시적 형변환
    to_number('123') + 100, -- FM
    '123' * 3
    
from dual;

-- 4. to_date() : 문자 -> 날짜
-- date to_date(컬럼명, '형식 문자열')
-- 형식 문자열은 to_char() (날짜 -> 문자)와 동일

select
    sysdate,            -- date
    '2020-11-26',        -- char
    to_date('2020-11-26', 'yyyy-mm-dd'), -- date
    to_char(to_date('2020-11-26', 'yyyy-mm-dd'), 'yyyy-mm-dd hh24:mi:ss'),
    to_char(to_date('2020-11-26 13:30:40', 'yyyy-mm-dd hh24:mi:ss'), 'yyyy-mm-dd hh24:mi:ss')
from dual;

-- 기본 : 문자열 상수 > 년-월-일(암시적 형변환 O)
--                    > 시-분-초(암시적 형변환 X)
--                    > 년-월-일 시-분-초(암시적 형변환 X)
select * from tblInsa
    where ibsadate > to_date('2010-01-01 12:30:00', 'yyyy-mm-dd hh24:mi:ss');





