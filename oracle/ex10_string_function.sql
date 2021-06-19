-- ex10_string_function.sql



-- 문자열 함수

-- length()
-- 문자열 길이
-- number length(컬럼명)

select first_name, length(first_name) from employees; -- 컬럼 리스트에서 사용

select first_name, length(first_name) from employees
    where length(first_name) > 8; -- where절에서 사용

select first_name, length(first_name) from employees
    order by length(first_name) desc; -- order by 절에서 사용


-- upper(), lower(), initcap()
-- varchar2 upper(컬럼명) -> lower(), initcap() 동일

select
    first_name,
    upper(first_name),
    lower(first_name)
from employees;

select
    initcap('abc')
from dual;

-- 검색율 향상
select
    first_name
from employees
where lower(first_name) like '%de%';


-- substr()
-- 문자열 추출 함수
-- varchar2 substr(컬럼명, 시작위치, 가져올 문자개수) -- 자바의 substring()과 비슷하지만 끝위치가 아닌 가져올 문자개수임
-- varchar2 substr(컬럼명, 시작위치)
-- *** 서수를 1부터 시작(One Based Index)

select
    '가나다라마바사아자차카타파하',
    substr('가나다라마바사아자차카타파하', 3, 6),
    substr('가나다라마바사아자차카타파하', 3)
from dual;

-- tblInsa
-- 남자직원 몇명?
select count(*) from tblInsa where ssn like '%-1%';
select count(*) from tblInsa where substr(ssn, 8, 1) = '1' or substr(ssn, 8, 1) = '3';
select count(*) from tblInsa where substr(ssn, 8, 1) in ('1', '3');

-- 직원들의 생년?
select name, '19' || substr(ssn, 1, 2) from tblInsa;

-- 장급(과장, 부장)들은 어떤 성(family name)을 가지고 있는지? -> 중복 제거, 내림차순
select
    distinct substr(name, 1, 1)
from tblInsa
where jikwi in ('과장', '부장')
order by substr(name, 1, 1);

-- 직원 60명 성씨별 몇명?
select
    distinct substr(name, 1, 1) --26가지의 성씨가 있다.
from tblInsa;

select
    count(case
        when substr(name, 1, 1) = '김' then 1
    end) as 김씨,
    count(case
        when substr(name, 1, 1) = '이' then 1
    end) as 이씨,
    count(case
        when substr(name, 1, 1) = '박' then 1
    end) as 박씨,
    count(case
        when substr(name, 1, 1) = '정' then 1
    end) as 정씨,
    count(case
        when substr(name, 1, 1) = '최' then 1
    end) as 최씨,
    count(case
        when substr(name, 1, 1) in ('김', '이', '박', '최', '정') then 1
    end) as 김이박최정,
    count(case
        when substr(name, 1, 1) not in ('김', '이', '박', '최', '정') then 1
    end) as 나머지
from tblInsa;


-- instr()
-- 검색 함수(자바의 indexOf())
-- number instr(컬럼명, 검색어)
-- number instr(컬럼명, 검색어, 시작위치)

select
    '안녕하세요. 홍길동님' as c1,
    instr('안녕하세요. 홍길동님', '홍길동') as c2,
    instr('안녕하세요. 홍길동님. 잘가세요. 홍길동님', '홍길동') as c3,
    instr('안녕하세요. 홍길동님. 잘가세요. 홍길동님', '홍길동', 11) as c4,
    instr('안녕하세요. 홍길동님. 잘가세요. 홍길동님', '홍길동', instr('안녕하세요. 홍길동님. 잘가세요. 홍길동님', '홍길동') + length('홍길동')) as c5 --실용적이지 않다.
from dual;

-- trim(), ltrim(), rtrim()
-- varchar2 trim(컬럼명)

select
    '        홍      길동        ',
    trim('        홍      길동        '),
    ltrim('        홍      길동        '),
    rtrim('        홍      길동        ')
from dual;

-- lpad(), rpad()
-- left padding
-- right padding
-- varchar2 lpad(컬럼명, 개수, 문자)
-- varchar2 rpad(컬럼명, 개수, 문자)

select
    '1',
    lpad('1', 3, '0'),
    rpad('1', 3, '0'),
    lpad('홍길동', 10, '*'),
    lpad('abc', 10, '*'),
    lpad('1234', 3, '*')
from dual;

select
    name,
    lpad(name, 20, '@'),
    lpad(name, length(name) + 10, '@')
from tblCountry;

-- replace()
-- 문자열 치환
-- varchar2 replace(컬럼명, 찾을 문자열, 바꿀 문자열)

select
    replace('홍길동', '홍', '김'),
    replace('홍길동', '이', '김')
from dual;

-- 직원명, 주민번호, 성별
select name, ssn, substr(ssn, 8, 1) from tblInsa;

select name, ssn,
    case
        when substr(ssn, 8, 1) = '1' then '남자'
        when substr(ssn, 8, 1) = '2' then '여자'
    end as gender,
    replace(replace(substr(ssn, 8, 1), '1', '남자'), '2', '여자')
from tblInsa;

-- 한두개 바꿀땐 replace 괜찮지만, 여러개를 바꿀땐 case end가 더 가독성이 좋다. -> decode 사용
select
    name,
    continent,
    case
        when continent = 'AS' then '아시아'
        when continent = 'AF' then '아프리카'
        when continent = 'EU' then '유럽'
        when continent = 'SA' then '아메리카'
        when continent = 'AU' then '호주'
    end as continent2,
    replace(replace(replace(replace(replace(continent, 'AS', '아시아'), 'AF', '아프리카'), 'EU', '유럽'), 'SA', '아메리카'), 'AU', '호주') as continent3
from tblCountry;


-- decode()
-- 문자열 치환
-- replace, case 유사
-- varchar2 decode(컬럼명, 찾을 문자열, 바꿀 문자열 [, 찾을 문자열, 바꿀 문자열] * N) -- , 찾을 문자열, 바꿀 문자열 계속 반복

select
    name,
    ssn,
    decode(substr(ssn, 8, 1), '1', '남자'), -- 1을 못찾으면 null값 반환
    decode(substr(ssn, 8, 1), '1', '남자', '2', '여자') as gender
from tblInsa;

select
    name,
    continent,
    decode(continent, 'AS', '아시아', 'AF', '아프리카', 'EU', '유럽', 'SA', '아메리카', 'AU', '호주')
from tblCountry;


-- decode를 유용하게 사용하는 경우
-- : decode는 검색 대상을 못찾으면 null을 반환한다.(*****)

-- tblInsa. 남자 몇명? 여자 몇명?
select
    count(case
        when substr(ssn, 8, 1) = '1' then 1
    end),
    count(case
        when substr(ssn, 8, 1) = '2' then 1
    end)
from tblInsa;

select
    count(decode(substr(ssn, 8, 1), '1' , 1)),
    count(decode(substr(ssn, 8, 1), '2' , 1))
from tblInsa;


-- tblInsa. 부장 몇명? 과장 몇명? 대리 몇명? 사원 몇명?
select
    count(decode(jikwi, '부장', 1)) as 부장,
    count(decode(jikwi, '과장', 1)) as 과장,
    count(decode(jikwi, '대리', 1)) as 대리,
    count(decode(jikwi, '사원', 1)) as 사원
from tblInsa;

-- tblInsa. 간부(부장+과장) 몇명? 사원(대리+사원) 몇명?
select
    count(decode(jikwi, '부장', 1)) +
    count(decode(jikwi, '과장', 1)) as 간부,
    count(decode(jikwi, '대리', 1)) +
    count(decode(jikwi, '사원', 1)) as 사원
from tblInsa;

select
    count(decode(jikwi, '부장', 1, '과장', 1)) as 간부,
    count(decode(jikwi, '대리', 1, '사원', 1)) as 사원
from tblInsa;

select * from tblAddressBook;
select count(*) from tbladdressbook;

-- 직업 몇명(학생?, 건물주?)
select
    count(decode(job, '학생', 1)) as 학생수,
    count(decode(job, '건물주', 1)) as 건물주수
from tblAddressBook;

-- 강동구 몇명? 마포구 몇명?
select
    count(case
        when instr(address, '강동구') > 0 then 1
    end) as 강동구,
    count(case
        when instr(address, '마포구') > 0 then 1
    end) as 마포구
from tblAddressBook;

select
    count(*) - count(decode(instr(address, '강동구'), 0, 1)) as 강동구,
    count(*) - count(decode(instr(address, '마포구'), 0, 1)) as 마포구
from tblAddressBook;




