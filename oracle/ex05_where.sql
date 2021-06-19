-- ex05_where.sql


/*

select문
- select 컬럼리스트 from 테이블 where 조건;

1. select 컬럼리스트
  - 가져올 컬럼을 지정한다.
  - 가져온 컬럼값을 연산한다.(연산자, 함수처리)
  
2. from 테이블
  - 테이블 선택(select의 데이터 소스를 지정)
  
3. where 조건
  - 가져올 레코드를 지정할 조건을 명시한다.
  - 조건에 만족하는 행은 결과셋에 포함하고, 만족하지 못하는 행은 결과셋에서 제외한다.
  - 행단위로 걸러내는 필터 역할
  - 주로 조건은 비교 연산자 혹은 논리 연산자를 사용해서 구현한다.
  
실행 순서
1. from 테이블
2. where 조건
3. select 컬럼리스트

*/

-- 모든 레코드 + 모든 컬럼
select * from tblCountry;

-- 모든 레코드 + 일부 컬럼
select name from tblCountry;

-- 일부 레코드 + 모든 컬럼
select * from tblCountry where continent = 'AS';

-- 일부 레코드 + 일부 컬럼
-- 아시아에 속한 나라명만..
select name from tblCountry where continent = 'AS';

-- 직원 명단
select * from tblInsa;
select * from employees;


select * from tblInsa;
-- 서울에 사는 직원?
select * from tblInsa where city = '서울';

-- 기획부 직원?
select * from tblInsa where buseo = '기획부';

-- tblComedian
select * from tblComedian;

-- 1. 몸무게가 60kg 이상이고, 키가 170cm 미만인 사람?
select * from tblComedian where weight >= 60 and height < 170;

-- 2. 여자 중 키가 160cm 이상인 사람?
select * from tblComedian where gender = 'f' and height >= 160;

-- tblInsa
select * from tblInsa;

-- 3. 부서가 '개발부'이고 급여(basicpay)가 150만원 이상 받는 직원?
select * from tblInsa where buseo = '개발부' and basicpay >= 1500000;

-- 4. 급여 + 수당 금액이 200만원 이상 받고, 서울에 거주하는 직원?
select * from tblInsa where basicpay + sudang >= 2000000 and city = '서울';


/*

where절에서 주로 사용되는 구문들(연산자 or 함수 or 절)

between
  - where절에서 사용 -> 조건으로 사용
  - 범위 조건
  - 컬럼명 between 최소값 and 최대값
  - 최소값, 최대값 : 포함(include)
  - 가독성
  - 연산자 사용보다 가독성 향상

*/

select * from tblComedian;
-- 몸무게가 60~70 사이?
select * from tblComedian where weight >= 60 and weight <= 70;
select * from tblComedian where weight between 64 and 66;

-- 비교 연산에 사용되는 자료형
-- 1. 숫자형(number)
select * from tblInsa where sudang > 150000;
select * from tblInsa where sudang >= 150000 and sudang <= 200000;
select * from tblInsa where sudang between 150000 and 200000;

-- 2. 문자형 - 문자 코드값 비교
select * from tblInsa;
select * from tblInsa where name > '박';
select * from tblInsa where name >= '박' and name <= '최';
select * from tblInsa where name between '박' and '최';

-- 3. 날짜/시간형
select name, ibsadate from tblInsa;
desc tblInsa; --ibsadate datatype : 날짜/시간형
-- 2010년 1월 1일 이후에 입사한 직원들
select * from tblInsa where ibsadate < '2010-01-01';
select * from tblInsa where ibsadate >= '2010-01-01' and ibsadate <= '2010-12-31';
select * from tblInsa where ibsadate between '2010-01-01' and '2010-12-31';


/*

in
  - where절에서 사용 -> 조건으로 사용
  - 열거형 조건(제시한 값 중 하나라도 만족하면 통과)
  - 컬럼명 in (열거값, 열거값, 열거값, ...)
  - 가독성 향상

*/

-- tblInsa 테이블에서 홍보부 + 개발부 + 총무부 직원을 가져오기
select * from tblInsa
where buseo = '홍보부' or buseo = '개발부' or buseo = '총무부';

select * from tblInsa
where buseo in ('홍보부', '개발부', '총무부');

select * from tblInsa
where jikwi in ('부장', '과장') 
    and city in ('서울', '인천') 
    and basicpay between 2500000 and 2600000;

/*

like
  - where절 사용 -> 조건으로 사용
  - 문자열 패턴 비교(날짜형, 숫자형은 적용 불가)
  - 컬럼명 like '패턴 문자열'
  - 정규 표현식과 유사
  
'패턴 문자열'
  - 임의 문자와 메타 문자를 사용해서 구성
    1. _ : 임의의 1문자
    2. % : 임의의 n문자(n : 0 ~ 무한대)

*/

select name from tblInsa;
select name from tblInsa where name = '홍길동';
select name from tblInsa where name = '홍';

select name from tblInsa where name like '홍__'; -- 홍ㅇㅇ 찾아라
select name from tblInsa where name like '홍%'

select name from tblInsa where name like '__남'; -- ㅇㅇ남 찾아라
select name from tblInsa where name like '_길_'; -- ㅇ길ㅇ 찾아라



select * from tblCountry;
select * from tblCountry where name like '_국';
select * from tblCountry where name like '___국';
select * from tblCountry where name like '%국';

select name from tblInsa;
select * from tblInsa where tel like '011-____-____'; --011-xxxx-xxxx
select * from tblInsa where tel like '011%';

select * from tblInsa where ssn like '______-1______'; --31명
select * from tblInsa where ssn like '%-1%';

-- SQL 구문은 대소문자를 가리지 않는다.
-- 데이터는 대소문자를 가린다.
select * from employees where first_name like 'A%';
select * from employees where first_name like 'a%';
select * from employees where first_name like '%a';
select * from employees where first_name like '%a%';
select * from employees where first_name like '%e%a%';
