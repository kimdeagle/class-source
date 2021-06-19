-- ex17_delete.sql

/*

delete문
  - DML
  - 데이터(레코드, 행)를 삭제하는 명령어
  - delete [from] 테이블명 [where절]
  - 주의!!!!!!!!!!!!!!!!!!!!! -> where절!!!!!!!!!!!!!!

*/

rollback;

select * from tblCountry;

delete from tblCountry;

delete from tblCountry where continent = 'AS'; -- 그룹 삭제

delete from tblCountry where name = '대한민국'; -- 특정행 삭제

/*

특정 테이블의 데이터를 모두 삭제해야 하는 경우 -> 테이블 초기화
1. drop > create
    - 잘 사용
    - 상황에 따라 더 힘들어지는 경우가 발생(테이블 관계 형성시)
    - 독립적인 테이블에 적용
2. delete
    - where절 없는 delete
    - DML
    - 트랜잭션 로그가 남는다.
3. truncate
    - 데이터 전부 삭제
    - DDL
    - 트랜잭션 로그가 안남는다.

*/

create table tblTemp
(
    seq number primary key,
    name varchar2(30) not null,
    age number(3) not null
);

insert into tblTemp values (1, '홍길동', 20);
insert into tblTemp values (2, '아무개', 22);
insert into tblTemp values (3, '호호호', 24);

select * from tblTemp;

commit;
rollback;

-- tblTemp 초기화
delete from tblTemp;

truncate table tblTemp;


















