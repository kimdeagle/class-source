-- ex07_order.sql

/*

정렬(Sort)
  - order by절
  - 데이터베이스에 저장된 원본 테이블 정렬(X) -> select -> 결과 테이블에 대한 정렬(O)
  
select 컬럼리스트
table 테이블
where 조건
order by 정렬

실행순서
1. from 테이블
2. where 조건
3. select 컬럼리스트
4. order by 정렬

order by 대상 컬럼 [asc|desc]

*/

select * from tblCountry order by population;

-- 정렬 대상의 자료형
-- 1. 숫자형
select * from tblInsa order by basicpay desc;

-- 2. 문자형
select * from tblInsa order by name asc;

-- 3. 날짜/시간형
select * from tblInsa order by ibsadate asc;

-- 다중 정렬
-- 1차 정렬
select * from tblInsa order by buseo asc;

-- 2차 정렬
select * from tblInsa order by buseo asc, jikwi desc;

-- 3차 정렬
select * from tblInsa order by buseo asc, jikwi desc, basicpay asc;

-- SQL : 대부분 One-based Index
select name, buseo, basicpay
    from tblInsa
        where jikwi = '사원'
            order by 3 asc, 1 desc, 2 asc;

select * from tblInsa
    order by basicpay + sudang desc;

-- 직위별 정렬 > 부장 - 과장 - 대리 - 사원
select name, jikwi
    from tblInsa
        where buseo = '영업부'
            order by jikwi desc;

select name, jikwi
    from tblInsa
        where buseo = '영업부'
            order by case
                when jikwi = '부장' then 4
                when jikwi = '과장' then 3
                when jikwi = '대리' then 2
                when jikwi = '사원' then 1
                    end desc;
                    
