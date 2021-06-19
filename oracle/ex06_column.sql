-- ex06_column.sql

/*

distinct
  - 컬럼 리스트에서 사용
  - distinct 컬럼명
  - (레코드)중복값을 제거한다. (단일 컬럼값 비교가 아닌 행 전체를 비교한다.(*****)

*/

-- tblCountry 테이블에 대륙이 어떤 것들이 있습니까?
select distinct continent from tblCountry;

-- tblComedian 테이블에 성별이 어떤 것들이 있습니까?
select distinct gender from tblComedian;

-- tblInsa 테이블에 부서가 어떤 것들이 있습니까?
select distinct buseo from tblInsa;


select name from tblInsa; -- 60명
select distinct name from tblInsa; -- 60명 -> 중복된 이름이 없다.

select buseo, jikwi from tblInsa; -- 60개
select distinct buseo, jikwi from tblInsa; -- 23개(*****)
select distinct buseo, jikwi, city from tblInsa; -- 43개


/*

case
  - 컬럼 리스트에서 사용
  - 조건절에서 사용
  - 자바에서의 if/switch문 역할
  - 조건을 만족하지 못하는 컬럼은 null 반환(*****)

*/

select
    last || first as name,
    case
        when gender = 'm' then '남자'
        when gender = 'f' then '여자'
    end as gender
from tblComedian;


select
    
    last || first as name,
    weight,
    case
        when weight > 100 then '과체중'
        when weight > 50 then '정상체중'
        when weight > 0 then '저체중'
    end as state
    
from tblComedian;


select
    name,
    case
        when continent = 'AS' then '아시아'
        when continent = 'EU' then '유럽'
        when continent = 'AF' then '아프리카'
        --else '기타'
        --else continent
        --else capital -- 절대 하면 안되는 행동(다른 성격의 데이터가 같은 컬럼에 들어간다.) -> 의미가 반드시 같아야 한다!!!(*****)
        --else population -- error : 자료형이 다르다 -> 자료형도 반드시 같아야 한다.
    end as continent
from tblCountry;


select
    title,
    case
        when completedate is not null then '완료된 일'
        when completedate is null then '해야할 일'
    end as state
from tblTodo;


select
    name,
    case
        when tel is not null then '연락 가능'
        when tel is null then '연락 불가능'
    end as state
from tblInsa;


select
    name,
    buseo,
    jikwi,
    case
        when ibsadate > '2017-11-24' then '주니어'
        when ibsadate <= '2017-11-24' and ibsadate > '2013-11-24' then '시니어'
        when ibsadate <= '2013-11-24' then '익스퍼트'
    end as grade
from tblInsa;


-- tblInsa. sudang
-- 1. 직급별 수당 : 기존 수당 * 배율 > 부장(*2), 과장(*1.7), 대리(*1.5), 사원(*1.3)
-- 2. 직급별 수당 : 간부급(부장, 과장) *2, 사원(대리, 사원) *1.5
select
    name,
    buseo,
    jikwi,
    sudang,
    case
--        when jikwi = '부장' then sudang * 2
--        when jikwi = '과장' then sudang * 1.7
--        when jikwi = '대리' then sudang * 1.5
--        when jikwi = '사원' then sudang * 1.3
        when jikwi = '부장' or jikwi = '과장' then sudang * 2
        when jikwi in ('대리', '사원') then sudang * 1.5 -- in 활용
    end as bonus
from tblInsa;

