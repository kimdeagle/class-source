-- ex26_transaction.sql

/*

너무너무너무너무너무너무너무너무너무너무너무너무너무너무너무 중요!!!!!!!!!!!!!!!!!!!!!!!
트랜잭션(transaction) (*****************************************************************************************************************************************************************************************************)
  - 오라클에서 트랜잭션을 처리하는 방법
  - 오라클에서 발생하는 1개 이상의 명령어들을 하나의 논리 집합으로 묶어놓은 단위 > 트랜잭션 -> 제어 -> 트랜잭션 처리
  - 트랜잭션에 포함되는 명령어 -> insert, update, delete

트랜잭션 명령어
  - DCL(TCL)
  - 하나의 트랜잭션으로 묶여 있는 DML을 감시하다가 일부 DML이 문제를 발생하면 이전에 성공했던 DML을 없었던 일로 처리
  - 하나의 트랜잭션으로 묶여 있는 DML을 감시하다가 모든 DML이 성공하면 모든 일을 데이터베이스에 반영
1. commit
2. rollback
3. savepoint

*** 동시간대에 트랜잭션은 유일하게 존재한다. 시간대별로 별도의 트랜잭션이 존재할 수 있다.

새로운 트랜잭션이 시작하는 경우
1. 클라이언트 접속 직후
2. commit 실행 직후
3. rollback 실행 직후


현재 트랜잭션이 끝나는 경우
1. commit 실행 -> 현재 트랜잭션을 DB에 반영함
2. rollback 실행 -> 현재 트랜잭션을 DB에 반영안함
3. 클라이언트가 접속을 종료하는 경우
    a. 정상적인 종료
        -> 대부분의 툴이 질문을 한다 > commit or rollback
    b. 비정상적인 종료
        -> rollback
4. DDL이 실행될 때
    - 자동 커밋(Auto Commit) 된다.
    - DDL은 구조에 변화를 주는 명령어 -> 이전의 데이터 조작을 작업 완료할 수 있도록 자동 commit 처리 발생
*/

commit;

--1. (rollback)
select * from tblInsa; -- A

select * from tblInsa where buseo = '영업부'; -- B

select * from tblInsa where buseo = '영업부' and name ='김정훈'; -- C

delete from tblInsa where num = 1004; -- D

select * from tblInsa; -- E

rollback; -- 트랜잭션이 시작된 시점으로 돌아가라(그 사이에 속한 모든 명령어들을(DML) 없었던 일로 해라) > 신중하게!!!!!!!!!!(지금까지 한일을 날려버릴 수 있다)

--2. (commit)
select * from tblInsa; -- A

update tblInsa set city = '판교' where num = 1001; -- B

delete from tblInsa where num = 1004; -- C

select * from tblInsa; -- D

commit; -- 영구적으로 DB에 적용(되돌릴 방법이 없다 > 신중하게!!!!!!!!!!!!!!)

select * from tblInsa;

rollback;

select * from tblInsa;


delete from tblInsa where num = 1001;
select * from tblInsa;

rollback;

create table tblTest
(
    seq number primary key
);

commit;

select * from tblInsa;

delete from tblInsa where num = 1002;

savepoint a;

delete from tblInsa where num = 1003;

savepoint b;

delete from tblInsa where num = 1005;

rollback to a;
rollback;





