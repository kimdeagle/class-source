-- q28.sql

-- q50
select
    name,
--    '19' || substr(ssn, 1, 2) as birth_year
    lpad(substr(ssn, 1, 2), 4, 19) as birth_year
from tblInsa
order by ssn;

-- q51
select
    count(*)
from tblInsa
where city = '서울' and ssn like '8%-2%';

-- q52
select
    distinct substr(name, 1, 1) as last_name
from tblInsa
where jikwi in ('과장', '부장');

-- q53
select
    *
from tblInsa
order by substr(ssn, 3, 2), name;

-- q54
select
    *
from tblInsa
order by substr(ssn, 8, 1), name;
    
-- q55
select
    *
from employees
--order by length(last_name) + length(first_name) desc;
order by length(first_name || last_name) desc;

-- q56
select
    max(length(first_name || last_name))
from employees;

-- q57
select
    length(last_name)
from employees
where length(last_name) >= 5;

-- q58
select * from tbldiary;
select
--    to_char(regdate, 'yy-mm-dd hh24:mi:ss'),
    count(decode(weather, '맑음', 1)) as 맑음,
    count(decode(weather, '흐림', 1)) as 흐림,
    count(decode(weather, '비', 1)) as 비
from tbldiary;

-- q59
select
    count(case
        when instr(subject, '오라클') > 0 then 1
        when instr(subject, '자바') > 0 then 1
        when instr(subject, '코딩') > 0 then 1
    end) as study
from tbldiary;

-- q60
select
    count(case
        when pm10 between 0 and 30 then 1
    end) as good,
    count(case
        when pm10 between 31 and 50 then 1
    end) as normal,
    count(case
        when pm10 between 51 and 70 then 1
    end) as bad,
    count(case
        when pm10 > 70 then 1
    end) as verybad
from fine_dust
where instr(gu_name, '강남구') > 0;

-- q61
select
    win_person_no as "1등 당첨자 수",
    round(win_money / win_person_no) as "1등 당첨금",
    win_money as "총 당첨금"
from lotto_detail
where rank_no = 1 and win_person_no > 0
order by win_money / win_person_no desc, win_person_no asc;

-- q62
select
    *
from tblsubway
where boardingdate = '2017-04-02' and gubun = '승차'
order by passengernumber desc;

-- q63
select
    distinct family
from tblzoo
where leg > 0 and fly = 'n';

-- q65
select
--    to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss')
    count
    (case
        when substr(to_char(completedate, 'yyyy-mm-dd hh24:mi:ss'), 12, 2) <= 11 then 1
    end) as 오전,
    count
    (case
        when substr(to_char(completedate, 'yyyy-mm-dd hh24:mi:ss'), 12, 2) >= 12 then 1
    end) as 오후
from tbltodo;

-- q66
select
    count(case
        when instr(email, 'gmail.com') > 0 then 1
    end) as gmail,
    count(case
        when instr(email, 'daum.net') > 0 then 1
    end) as daum,
    count(case
        when instr(email, 'naver.com') > 0 then 1
    end) as naver,
    
    count(*) - count(decode(instr(email, 'gmail.com'), 0, 1)) as gmail2,
    count(*) - count(decode(instr(email, 'daum.net'), 0, 1)) as daum2,
    count(*) - count(decode(instr(email, 'naver.com'), 0, 1)) as naver2
from tbladdressbook;

-- q67
select
    count
    (case
        when instr(address, '서울') = 0 then 1
    end) as not_seoul
from tbladdressbook;




