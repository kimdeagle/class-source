-- ex02_datatype.sql

/*

자료형(Data Type)

ANSI-SQL 자료형
- (오라클 자료형)
- 데이터베이스에서 취급하는 데이터 -> 자료형 존재

1. 숫자형
    a. number
    - 정수 + 실수
    - (유효자리)38자리 이하의 숫자를 표현하는 자료형
    - ex) 12345678912345678912345678912345678901
    - 5~22byte
    - 1x10-130 ~ 9.9999x10+125
    - number(precision, scale)
        1. precision : 소수 이하를 포함한 전체 자리수(1~38)
        2. scale : 소수점 이하 자리수(0~127자리)
        - ex) number : 유효자리 38자리까지 표현 가능 모든 숫자(정수, 실수)
        - ex) number(3) : 3자리까지 표현 가능 숫자(정수, -999 ~ 999)
        - ex) number(4,2) : 4자리까지 표현 가능 숫자(실수, -99.99 ~ 99.99)
        - ex) number(10,3) : -9999999.999 ~ 9999999.999
    - 숫자형 상수(리터럴)
        1. 정수 : 10
        2. 실수 : 3.14
    
2. 문자형
    - 문자형 + 문자열
    - 자바의 String과 유사
    a. char
        - 고정 자리수 문자열
        - char(n) : n자리 문자열. n(바이트)
        - 최소 크기 : 1바이트
        - 최대 크기 : 2000바이트
        - ex) char(3) : 최대 3바이트짜리 문자열을 저장
        - ex) char(10) : 최대 10바이트짜리 문자열을 저장
        - ex) char(2000) : 영어(2000자), 한글(666자) -> UTF-8(한글 3바이트)
        - 데이터 길이가 고정 : 사람 이름, 성별
    b. varchar2(***********)
        - variable character
        - 바차2
        - 가변 자리수 문자열
        - varchar2(n) : n자리 문자열. n(바이트)
        - 최소 크기 : 1바이트
        - 최대 크기 : 4000바이트
        - ex) varchar2(3) : 최대 3바이트짜리 문자열을 저장
        - ex) varchar2(10) : 최대 10바이트짜리 문자열을 저장
        - ex) varchar2(2000) : 영어(2000자), 한글(666자) -> UTF-8(한글 3바이트)
        - 데이터 길이가 가변 : 주소, 인삿말, 이메일 등...
    c. nchar
        - n : National > 유니코드 지원 > UTF-16 동작
        - nchar(n) : n자리 문자열, n(문자수)
        - 최소 크기 : 1글자(2바이트)
        - 최대 크기 : 1000글자(2000바이트)
        - ex) nchar(3) : 영어(3글자), 한글(3글자)
    d. nvarchar2
        - varchar2와 동일
        - 바이트(X) -> 문자수(O)
    
    e. clob, nclob (잘 안씀)
        - 롭
        - large Object
        - 대용량 텍스트 저장
        - 128TB
        - 참조형
    
3. 날짜/시간형
    - 자바 Calender, Date
    a. date(***********)
        - 년월일시분초
        - 7byte
        - 기원전 4712년 1월 1일 ~ 기원후 9999년 12월 31일
        
    b. timestamp
        - 년월일시분초 + 밀리초(나노초)
    
    c. interval -> number 사용
        - 시간
        - 틱값
    
4. 이진 데이터형
    - 비텍스트형 데이터
    - 이미지, 영상, 음악 등...
    a. blob
        - 최대 128TB
    -> 해당 파일을 특정 폴더에 저장 + 데이터베이스에는 파일명만 저장

*/

drop table tblType; -- 테이블 삭제는 데이터까지 같이 삭제된다.(주의!!!)

-- scheme 작업
create table tblType (

    -- 컬럼 구성(정의)
    -- 컬럼명 자료형
    --num number
    --num number(3)
    --num number(4,2)
    --txt1 char(10),
    --txt2 varchar2(10)
    txt3 nchar(3)

);

-- 테이블로부터 데이터를 가져와 반환하시오.
select * from tblType;

-- 테이블에 데이터 추가하기
insert into tblType(num) values (100);
insert into tblType(num) values (200);
insert into tblType(num) values (300);
insert into tblType(num) values (3.14);
insert into tblType(num) values (999);
insert into tblType(num) values (-999);
-- ORA-01438: value larger than specified precision allowed for this column
insert into tblType(num) values (1000);
insert into tblType(num) values (12345678901234567890123456789012345678);
insert into tblType(num) values (123456789012345678901234567890123456789);
-- 어느순간 유효숫자가 짤린다(0으로 표현됨)
--                               1234567890123456789012345678901234567890000000
insert into tblType(num) values (1234567890123456789012345678901234567890123456);

insert into tblType(num) values (-99.99);
insert into tblType(num) values (99.99);

select * from tblType;

-- 오라클은 문자형 리터럴 표기할 때 홑따옴표 사용
insert into tblType(txt) values ('abc');
-- ORA-12899: value too large for column "HR"."TBLTYPE"."TXT" (actual: 9, maximum: 3)
insert into tblType(txt) values ('가나다');
insert into tblType(txt) values ('가');

select * from tblType;
-- char : 'abc' -> 'abc       ' : 고정 자리수. 속도 빠름
-- varchar2 : 'abc' -> 'abc' : 가변 자리수. 속도 느림=> 요즘은 빠름 => 요즘은 거의 varchar2 사용
insert into tblType(txt1, txt2) values ('abc', 'abc');

-- txt3 nchar(3)
insert into tblType(txt3) values ('abc');
insert into tblType(txt3) values ('abcd'); --overflow
insert into tblType(txt3) values ('가나다');
insert into tblType(txt3) values ('가나다라'); --overflow


-- sysdate : 함수
select sysdate from dual; --20/11/23

-- hr
-- hr이 소유하고 있는 테이블 목록?
-- REGIONS
-- COUNTRIES
-- LOCATIONS
-- DEPARTMENTS
-- JOBS
-- EMPLOYEES
-- JOB_HISTORY
-- AAA
-- TBLTYPE
select * from tabs;

select * from employees;
