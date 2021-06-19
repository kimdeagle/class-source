-- ex03_select.sql

-- 현재 계정 확인
show user;

/*

select문
- DML, DQL
- 사용 빈도가 가장 높다.
- 데이터베이스로부터 원하는 데이터를 가져오는 명령어(읽기)

select 문법

[with <sub query>]
select column_list
from table_name
[where search_condition]
[group by group_by_expression]
[having search_condition]
[order by order_expression [asc|desc]]

select 컬럼리스트
from 테이블
where절
group by절
having절
order by절


select 컬럼리스트
from 테이블

select를 구성하는 모든 절들은 실행 순서가 있다.(***)
1. from절
2. select절

from절 : 데이터를 가져올 테이블을 지정한다.
select절 : 가져올 테이블의 컬럼을 지정한다. -> 지정된 컬럼만 반환한다.

*/

-- 테이블 구조??(스키마 궁금)
-- 1. DDL을 본다.(CREATE TABLE tblCountry)
-- 2. 클라이언트 툴 기능을 사용한다.


select name, capital, population, continent, area
from tblCountry;

select name, capital, population, continent, area, name
from tblCountry;

-- 문자열 더하기 : ||
select name, '국가명 : ' || name, length(name)
from tblcountry;

-- 에러번호 -> 무슨 에러인지 몰라 구글링할 때 유용
-- ORA-00904: "GENDER": invalid identifier
select gender
from tblCountry;

-- ORA-00942: table or view does not exist
select name
from tblCountr;

select name, capital, population, continent, area
from tblCountry; --query

-- select 컬럼리스트는 테이블 원본 컬럼 순서와 무관하다.
select continent, area, population, name, capital
from tblCountry;

-- *(all)
select *
from tblCountry;

-- 테이블 확인
desc tblCountry; -- 표준 SQL(X) -> Sqlplus( + SQL Developer)등 특정한 툴에서만 사용 가능

-- 비용 높음. 가독성 높음
select name, capital, population, continent, area
from tblCountry;

-- 비용 낮음. 가독성 낮음
select *
from tblCountry;



-- 테이블 구조 확인
-- 1. SQL Developer 기능 사용
-- 2. desc 테이블명
-- 3. 스크립트(SQL)

-- 1. 사용자 정보
select * from sys.dba_users;
select * from sys.dba_users where username = 'HR';

-- *** 오라클은 식별자를 DB에 저장할 때 모두 대문자로 변환해서 저장한다.
-- : 계정명, 테이블명, 컬럼명 등... 모두 다!

desc tblType;

-- 2. 스키마(계정)내의 테이블 정보
select * from sys.dba_tables; -- 오라클 내의 모든 테이블
select * from sys.dba_tables where owner = 'HR'; -- 해당 계정이 소유하고 있는 모든 테이블 목록

select * from tabs; --본인이 본인꺼 확인


-- 3. 테이블 컬럼 정보
select * from SYS.dba_tab_columns where owner = 'HR' and table_name = 'TBLCOUNTRY';

desc tblCountry; -- hr 본인이 직접

select name, capital from tblCountry;

select name, capital
from tblCountry;

select name, capital
    from tblCountry;
    
select
    name, capital
from tblCountry;

select
    name, capital
from
    tblCountry;


-- 인텔리센스

-- 컬럼명 모를 때 from절 먼저 쓰고 select 쓰면 컬럼명이 나온다
select * from tblCountry;

select area, name
from tblCountry;


-- 자료형
-- select 컬럼리스트 from 테이블;










