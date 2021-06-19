-- ex21_rownum.sql

/*

의사 컬럼(Pseudo Column)
  - 실제 컬럼이 아닌데 컬럼처러 행동하는 객체
  - 오라클 전용
  - MS-SQL(top), MySQL(limit)
  - rownum
  - 서브쿼리를 많이 의존해서 사용한다.
  - 사용자가 정의하지 않아도 이미 테이블에 포함이 되어 있는 컬럼
  - rownum은 실행되는 시점 > from절 실행 시(**********************************************)

*/

select num, name, buseo as department, basicpay as salary from tblInsa;

select num, name, buseo as department, basicpay as salary from hr.tblInsa;

select hr.tblInsa.num, tblInsa.name, buseo as department, basicpay as salary from hr.tblInsa;

-- 테이블명 별칭 -> 오라클은 as 안붙인다. -> 타이핑 줄이기 위한 목적
select tblInsa.* from tblInsa;

select a.* from tblInsa a;

-- rownum -> 결과 레코드에 번호를 붙이는 컬럼
select name, buseo, rownum from tblInsa;

select name, buseo, rownum from tblInsa where rownum = 1;
select name, buseo, rownum from tblInsa where rownum <= 10;

select name, buseo, rownum from tblInsa where rownum = 3; -- null
select name, buseo, rownum from tblInsa where rownum >=5 and rownum <= 10; -- null

select name, basicpay, rownum from tblInsa order by basicpay desc;

-- order by를 했더니 번호가 뒤죽박죽 되는 이유
select name, rownum --2.
from tblInsa; --1. 이 때 rownum이 레코드에게 할당(적용)

select name, rownum --2.
from tblInsa --1.
order by basicpay desc; --3. rownum은 order by 전에 이미 실행된다. order by에 의한 순서는 rownum에 반영이 안된다!!!!!!!!


-- 내가 원하는대로 정렬하고, 그 상태에서 rownum을 할당하는 방법? -> 서브쿼리 사용!!

select name, basicpay, rownum, rnum from (select name, basicpay, rownum as rnum from tblInsa
                                      order by basicpay desc);
                                      
select name, basicpay, rownum, rnum --6.
from --4. 서브쿼리에 대한 from + rownum 실행
      (select name, basicpay, rownum as rnum --2.
      from tblInsa --1. from + rownum 실행
      order by basicpay desc) --3.
      where rownum <= 3; --5.


select job, cnt, rownum
from(select job, count(*) as cnt
     from tblAddressBook
     group by job
     order by count(*) desc)
where rownum = 1;


select * from tblComedian;


-- rownum을 조건으로 사용 시 > 반드시 조건에 1이 포함되어야 한다.

select c.*, rownum from tblComedian c order by weight desc;

select c2.*, rownum from (select c.* from tblComedian c order by weight desc) c2 where rownum = 1;

select c2.*, rownum from (select c.* from tblComedian c order by weight desc) c2 where rownum = 2; -- null


-- 급여를 3번째로 많이 받는 사람?
select name, basicpay from tblInsa;

select name, basicpay from tblInsa order by basicpay desc;

select name, basicpay, rownum from (select name, basicpay from tblInsa order by basicpay desc) where rownum = 3; --불가능한 조건

select name, basicpay, rnum, rownum from (select name, basicpay, rownum as rnum from (select name, basicpay from tblInsa order by basicpay desc)) where rnum = 3;


-- tblInsa -> 거주지 인원수 2번째로 많은 지역?
select * from (select a.*, rownum as rnum from(select city, count(*)
                from tblInsa
                    group by city
                        order by count(*) desc) a)
                            where rnum = 2;


--q01
select name, buseo, jikwi, basicpay+sudang as salary, rownum as rank
from (select * from tblInsa where ssn like '%-1%' order by (basicpay + sudang) desc);

--q02
select name, buseo, jikwi, basicpay+sudang as salary, rownum as rank
from (select * from tblInsa where ssn like '%-2%' order by (basicpay + sudang) desc);

--q03
select buseo, 인원수
from (select buseo, count(*) as 인원수
      from tblInsa
      where ssn like '%-2%'
      group by buseo
      order by count(*) desc)
where rownum = 1;

--q04
select city, 인원수, rownum as rank
from (select city, count(*) as 인원수
      from tblInsa
      group by city
      order by count(*) desc);

--q05
select buseo, 인원수
from (select buseo, count(*) as 인원수
      from tblInsa
      group by buseo
      order by count(*) desc)
where rownum = 1;

--q06
select name, buseo, jikwi, salary, rank
from (select name, buseo, jikwi, (basicpay + sudang) as salary, rownum as rank
      from (select *
            from tblInsa
            where ssn like '%-1%'
            order by (basicpay + sudang) desc))
where rank between 3 and 5;

--q07
select a.*, rownum as rank
from (select *
      from tblInsa
      order by ibsadate) a
where rownum <= 5;

--q08
select *
from (select *
      from tblhousekeeping
      order by price * qty desc)
where rownum <= 3;

--q09
select *
from tblInsa
where buseo = (select buseo
               from (select buseo, rownum as rnum
                     from (select buseo, avg(basicpay), count(*)
                           from tblInsa
                           group by buseo
                           order by avg(basicpay) desc))
               where rnum = 2);

--q10
select *
from (select *
      from tbltodo
      order by (completedate - adddate) asc)
where rownum <= 5;

--q11
select
    max(basicpay) - min(basicpay) as 차액
from (
select a.*, rownum as rank
from (select *
      from tblInsa
      where ssn like '%-1%'
      order by basicpay desc) a)
where rank = 3 or rank = 9;





