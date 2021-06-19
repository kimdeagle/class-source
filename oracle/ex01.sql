/*

오라클(Oracle)
- 회사명, 제품명
- 데이터베이스(Database) -> 데이터베이스 관리 시스템(Database Management System)
- 관계형 데이터베이스(Relational Database) -> RDMBS

<다운로드>
1. 오라클
  - 데이터베이스
  - OracleXE112_Win64.zip
  - 대부분의 데이터베이스 프로그램들은 인터페이스 환경을 제공하지 않거나 CLI(Command Line Interface) 환경만 제공한다.
  - 서비스 프로그램
  - Win+R > "services.msc"
    - 수업과 관계있는 항목
    - OracleServiceXE
	- 데이터베이스
    - OracleXETNSListener
	- 오라클과 클라이언트 프로그램을 연결해주는 서비스

2. 클라이언트 툴
  - sqldeveloper-20.2.0.175.1842-x64.zip

<관계형 데이터베이스 관리 시스템 종류>
1. Oracle
  - Oracle
  - 기업용
2. MS-SQL
  - Microsoft
  - 기업용
3. MySQL
  - Oracle
  - 개인용 + 기업용
4. MariaDB
  - MySQL 기반
  - 무료
  - 개인용 + 기업용
5. PostgreSQL
  - 무료
  - 개인용 + 기업용
6. DB2
  - IBM
  - 메인프레임
7. Access
  - Microsoft
  - 개인용 + 소규모
8. 티베로 - 공공기관에서 많이 보임
  - 티맥스(TMax)
  - 제우스(웹서버)

수업에서는
DBMS -> Oracle
Web Server -> Apache Tomcat

<클라이언트 툴>
1. SQL Developer
  - 무료
  - Oracle
2. Toad(*****)
3. SQLGate
4. DataGrip(JetBrain) - 대학교 이메일 등록(id@*.ac.kr)하면 무료
5. SQL*Plus
  - Oracle 설치 시 같이 설치되는 클라이언트 프로그램
  - CLI Tool -> 불편...

<오라클 버전>
- Oracle 1.0 : 1977년
...
- Oracle 9i : internet 지원
- Oracle 10g : Grid 지원
- Oracle 11g >> 대부분 기업 main
- Oracle 12c : Cloud 지원
- Oracle 18c
- Oracle 19c

<오라클 에디션>
1. Oracle Enterprise Edition
  - 상용
  - CPU 무제한
2. Oracle Standard Edition
  - 상용
  - CPU 최대 4개 지원
3. Oracle Standard Edition One
  - 상용
  - CPU 최대 2개 지원
4. Oracle Personal Edition
  - 상용
5. Oracle Express Edition(수업에서 사용)
  - 무료
  - 개발용, 상용 등..
  - CPU 1개 지원
  - 데이터베이스 크기 최대 11GB
  - 메모리 점유율 최대 1GB (***)
  - 소규모 회사, 학습요요
  - 개발자 입장에서 상용 버전과 별 차이 없음.

<수업에서 11g XE버전 사용하는 이유>
XE버전이 11g와 18c밖에 없다.


****오라클 설치 시 주의사항!!

1. Password 설정 (수업할땐 통일)
java1234

2. <Summary> 복사
Destination Folder: C:\oraclexe\
Oracle Home: C:\oraclexe\app\oracle\product\11.2.0\server\
Oracle Base:C:\oraclexe\
Port for 'Oracle Database Listener': 1521
Port for 'Oracle Services for Microsoft Transaction Server': 2030
Port for 'Oracle HTTP Listener': 8080

127.0.0.1 : Ping Address(예약 주소). 본인 컴퓨터를 가르키는 IP


Name : IP주소.계정명
Name : 도메인.계정명
Name : 127.0.0.1
Name : localhost.system

사용자 이름 : system
비밀번호 : java1234

호스트 이름 : localhost
포트 : 1521
SID : xe
  - 오라클 식별자

테스트 -> 좌측 하단에 "상태 : 성공"
학원 PC에 오라클 설치 시 : McAfee (백신 프로그램) 제거 후 재부팅

*/

-- 워크시트 or 스크립트 파일(*.sql)
-- 오라클 데이터베이스에게 내릴 명령어를 작성하는 파일
-- 실행할 명령어 블럭 -> Ctrl + Enter : 실행
-- 단일 라인 주석
/*
    다중라인 주석
*/

select * from tabs;

/*

관계형 데이터베이스
- 데이터를 표형태로 저장/관리한다.
- 데이터끼리의 관계를 표시한다.

1. 데이터
  - 단편적인 정보
 
2. 테이블
  - 데이터의 입출력을 위한 데이터 구조
  - 표
 
3. 스키마
  - 테이블, 뷰 등이 저장된 데이터의 집합 저장소
  - 오라클(사용자 계정)
  - 사용자 계정을 새로 만들면, 오라클은 사용자가 취급할 자원들이 저장될 공간을 할당한다.(=스키마)

4. 데이터베이스
  - 여러개의 스키마의 집합 저장소
  - Oracle XE는 1개의 데이터베이스만 생성 가능
  
5. 열(Column)
  - 컬럼, 필드(Field), 속성(Attribute), 특성(Property)
  - 테이블의 열로 구성된다.(=구조)
  
6. 행(Row)
  - 행, 로우, 레코드(Record), 튜플(Tuple)
  - 테이블에 저장된 데이터 1건
  - 객체(Object)
  
클라이언트 툴 -> 서버 접속
1. 접속명
  - 자유롭게..
  - 되도록 서버주소.계정명 or 도메인.계정명

2. 사용자 이름
  - 접속할 계정명(ID)
  - 관리자 계정 : sys, system, 우리가 만든 계정을 관리자 계정으로 설정 가능
  - 사용자 계정 : sccot(pw : tiger), hr(human resources), 우리가 만든 계정들..

3. 비밀번호
  - 주기적으로 변경(보안상)

4. 호스트 이름
  - 오라클 서버 IP주소 or 도메인명
  - localhost(127.0.0.1) or 팀 서버 IP

5. 포트번호
  - 1521
  - 네트워크 프로그램이 외부와의 데이터 입출력을 위해 사용하는 통로 번호
  - 65535개
  - 독점

6. SID
  - Service ID
  - 오라클 서버 프로그램의 식별자
  - xe (XE버전)
  - orcl (다른 상용버전의 기본 SID)

system 계정 사용(X) -> hr 계정 사용(O)
설치 직후 -> hr 잠겨있는 상태

권한이 있는 계정으로만 명령 가능(그 중 하나가 system)
1. 활성화
2. 비밀번호 변경

*/

-- 계정 활성화
alter user hr account unlock;

-- 비밀번호 변경
alter user hr identified by java1234;

-- 작성 파일 > 스크립트 파일(명령어)
-- 스크립트 파일은 사용자 계정에 종속적이지 않다.
-- 스크립트 파일을 누가 만들었는지 중요하지 않음. 어떤 계정이 세션을 점유하고 있는지가 중요!!!
select * from tabs; --154 or 7

show user;

/*

오라클 -> 데이터베이스 -> 클라이언트 툴 + 명령어(SQL)

SQL(Structured Query Language)
- 구조화된 질의 언어
- 사용자(클라이언트 툴)가 관계형 데이터베이스와 대화할 때 사용하는 언어
- 자바에 비해 자연어에 가깝다.

1. DMBS 제작사와 독립적이다.
  - SQL은 모든 DBMS 제작사와 독립적으로 개발된다.
  
2. 표준 SQL(ANSI SQL)
  - 표준 SQL 발표 -> 각 DBMS 제작사에서 자기 제품에 적용
  - SQL은 모든 DBMS에 호환된다.
  - SQL Version : SQL-86... SQL-92... SQL2011

3. 대화식 언어다.
  - 질문 > 답변 > 질문 > 답변 ... 반복
  
SQL
1. ANSI SQL
  - 표준 SQL
2. PL/SQL
  - 자체 SQL
  - 오라클에서만 적용되는 명령어

ANSI SQL 종류
1. DDL
  - Data Definition Language
  - 데이터 정의어
  - 테이블, 뷰, 사용자, 인덱스 등의 객체를 생성/수정/삭제하는 명령어
  a. create : 생성
  b. drop : 삭제
  c. alter : 수정
  - 데이터베이스 관리자
  - 데이터베이스 담당자
  - 프로그래머(일부)

2. DML(**********************)
  - Data Manipulation Language
  - 데이터 조작어
  - 데이터베이스의 데이터를 추가/수정/삭제/조회하는 명령어
  - 가장 많이 사용 > CRUD(Create, Read, Update, Delete)
  a. select : 읽기
  b. insert : 추가
  c. update : 수정
  d. delete : 삭제
  - 데이터베이스 관리자
  - 데이터베이스 담당자
  - 프로그래머(**********************)

3. DCL
  - Data Control Language
  - 데이터 제어어
  - 계정, 보안, 트랜잭션 등을 제어
  a. commit
  b. rollback
  c. grant
  d. revoke
  - 데이터베이스 관리자
  - 데이터베이스 담당자
  - 프로그래머(일부)

4. DQL
  - Data Query Language
  - 데이터 질의어
  - DML 중에 select만을 이렇게 부른다.

5. TCL
  - Transaction Control Language
  - DCL 중에 commit, rollback만을 이렇게 부른다.


오라클 기본 인코딩
  - ~8i : EUR-KR 기본
  - 9i ~ : UTF-8 기본

*/

-- SQL 언어는 대소문자를 구분하지 않는다.
--아래 두 명령어는 같은 명령어
select * from tabs;
SELECT * FROM TABS;
--대소문자 자동 변경
--Alt + 홑따옴표

-- 관습화된 패턴 -> 프로젝트 내 결정
-- 1. 키워드 대문자
-- 2. 식별자 소문자
-- 인텔리센스 이용
SELECT * FROM tabs;

-- 수업에서는 다 소문자로만 작성

-- 사용자 식별자 생성 시 주의점
-- -> 최대 30바이트
create table aaa (
    num number
);

-- 식별자 31byte
-- ORA-00972: identifier is too long
create table aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa (
    num number
);
-- 이 특성때문에 약자를 잘 쓴다.



