-- ex04_operator.sql

/*

연산자(Operator)

1. 산술 연산자
- +, -, *, /
- %(없음) -> 함수로 제공(mod())

2. 문자열 연산자
- 문자열 + 문자열 -> 문자열 || 문자열

3. 비교 연산자
- >, >=, <, <=, =(equal), <>(not equal)
- 논리값 반환 > ANSI-SQL에는 논리 자료형 없다. > 표현 불가능 > select의 결과로 사용할 수 없다.
- 컬럼리스트에서 사용할 수 없다.
- 조건절에서 사용

4. 논리 연산자
- and, or, not
- 컬럼리스트에서 사용할 수 없다.
- 조건절에서 사용

5. 대입 연산자
- =
- 컬럼 = 값
- update 문에서 사용(수정)
- 복합 대입 연산자 없음(+=, -= 등 없음)

6. 3항 연산자
- 없음
- 제어문 없음 -> SQL은 제어 흐름이 없음 -> 모든 명령은 문장 단위의 독립 실행이라서..

7. 증감 연산자
- 없음
- nun++(X) -> num += 1(X) -> num = num + 1(O)

8. SQL 연산자
- in, between, like, is, any, all 등...

*/

-- 1. 산술 연산자
select * from tblComedian;
select first, last, height, height / 2.54 from tblComedian;

-- 컬럼 리스트에 컬럼값이 아닌 상수가 오는 경우...
select first, last, '테스트', 10, sysdate from tblComedian;


--2. 문자열 연산
select last, first, last || first from tblComedian;


--3. 비교 연산
select last || first, weight from tblcomedian where weight > 80;

-- (null) -> 빈셀
select * from tblcountry;

-- select의 결과 -> 테이블(결과 테이블, 결과셋, ResultSet)

select count(*) from tblcountry; -- 1행 1열 표

-- 결과셋의 컬럼명!!!
-- name, weight, weight+10 -> 자바에서 가져갈 예정!!!
-- 결과셋에서 연산이나 함수 처리가 된 컬럼은 표현식 자체가 컬럼명이 된다. -> 유효한 식별자로 수정 필요 -> 컬럼명의 별칭을 만든다.
-- 컬럼의 별칭 -> Alias
select name, weight, weight + 10 from tblMen;
select name, weight, weight + 10 as 증가된몸무게 from tblMen;

-- 절대 하면 안되는 짓!!!
select name as 이름, weight as 몸무게(kg) from tblMen; --() X -> Alias는 변수명 규칙을 지킬 것!!
select name as 이름, weight as "몸무게(kg)" from tblMen; --멀쩡하던걸 쓸모없게 만든 것 -> Alias는 변수명 규칙을 지킬 것!!
