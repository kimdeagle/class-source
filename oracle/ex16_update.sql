-- ex16_update.sql

/*

1. select
2. insert
3. update
4. delete

update문
  - DML
  - 원하는 행의 원하는 컬럼값을 수정하는 명령어
  - update 테이블명 set 컬럼명 = 수정할값;
  - update 테이블명 set 컬럼명 = 수정할값 [, 컬럼명 = 수정할값] x N [where절];
  - 일할 때(실무) > 가장 주의할 것!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    - where절 까먹으면 큰일!!! > 확인!!!!!!

*/


commit;
rollback; -- 실행했던 명령을 취소하는 명령어

select * from tblCountry;

-- 대한민국 수도 : 서울 -> 제주
update tblCountry set capital = '제주'; -- 덮어쓰기
update tblCountry set capital = '제주' where name = '대한민국'; -- 조건절에서 찾을 컬럼은 PK 컬럼 -> PK 컬럼 조건(not null, 중복값 허용X) -> name 속성

-- 대한민국 수도 : 땅(+10), 인구수(+20%)
update tblCountry set area = area + 10, population = population * 1.2 where name = '대한민국';

-- 1년 후 > 모든 나라 인구수 증가 > 10% 증가
update tblCountry set population = population * 1.1; -- 모든 나라(조건 없음)

-- 절대 하면 안되는 행동!!!
select * from tblInsa; -- num(PK) : 직원 번호

update tblInsa set
    num = 2000
        where num = 1001; -- 절대 하지 말것!!!(PK는 수정하지 말 것)







