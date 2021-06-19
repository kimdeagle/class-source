-- ex30_plsql.sql

/*

PL/SQL
- Procedural Language Extensions to SQL

ANSI-SQL
- 비 절차성 언어(명령어간의 순서가 없다. 연속적이지 않다.) -> 제어 흐름이 없다. 문장 단위의 독립적인 언어
- ANSI-SQL + 절차적 기능 추가 -> 오라클 -> PL/SQL


프로시저(Procedure)
- 메서드, 함수, 서브루틴 등...
- 순서가 있는 코드의 집합

1. 익명 프로시저
    -> 1회용

2. 실명 프로시저
    -> 반복 사용


PL/SQL 프로시저 블럭 구조(골격)

1. 4개의 키워드로 구성
    - declare
    - begin
    - exception
    - end

2. declare
    - 선언부
    - 프로시저에서 사용할 변수, 객체 등을 선언하는 영역
    - 생략 가능

3. begin
    - 실행부(구현부)
    - begin ~ end : 블럭 역할 ({ })
    - 프로시저의 구현 코드를 작성하는 영역(메서드의 body 역할)
    - 생략 불가능
    - *** ANSI-SQL + 연산, 제어 등을 구현
    - try절 역할

4. exception
    - 예외 처리부
    - catch절 역할
    - 예외 처리 코드를 작성하는 영역
    - 생략 가능

5. end
    - 실행부(구현부)
    - 생략 불가능

PL/SQL 블럭은 중첩이 가능하다.
begin
    ANSI-SQL + 제어
    begin
        begin
        
        end;
    end;
    
    begin
        begin
        
        end;
    end;
end;

PL/SQL -> 변수 생성 가능

1. 자료형
- ANSI-SQL와 동일(확장)

2. 변수 선언하기
- 변수명 자료형 [not null] [default 값]
- 변수는 주로 질의의 결과(***)나 인자값을 저장하는 용도로 사용

3. 대입 연산자
- 컬럼명 = 값(ANSI)
- 변수명 := 값(PL/SQL)


*/


-- 익명 프로시저 -> 익명 (PL/SQL) 블럭
begin

end;



-- ANSI-SQL 비절차 지향 -> 문장을 구분할 필요가 없다. -> 문장 종결자(;) 필수 아님
-- PL/SQL 절차 지향 -> 문장을 구분할 필요가 있다. -> 문장 종결자(;) 필수!!!

-- PL/SQL 프로시저가 성공적으로 완료되었습니다. -> 이름없는 메서드를 잘 호출했습니다.
declare
    num number; -- 숫자형
    name varchar2(30); -- 문자형
    today date; -- 날짜형
begin
    num := 10;
    dbms_output.put_line(num);
    
    name := '홍길동';
    dbms_output.put_line(name);
    
    today := sysdate;
    dbms_output.put_line(today);
    
    today := '2020-12-25'; -- 리터럴 가능?? -> O 암시적인 형변환
    dbms_output.put_line(today);
    
end;

-- 스크립트에 결과 출력 -> 로그아웃하면 자동으로 꺼진다.
set serveroutput on;


declare
    num number;
    num2 number default 100;
    num3 number not null := 300;
    num4 number not null default 400;
begin
    dbms_output.put_line('num : ' || num); -- null 출력
    dbms_output.put_line('num2 : ' || num2); -- default 출력
    dbms_output.put_line('num3 : ' || num3); -- not null 변수를 초기화 없이 사용 -> PLS-00218: a variable declared NOT NULL must have an initialization assignment
    dbms_output.put_line('num4 : ' || num4);
end;

/*

변수의 주 용도 -> select 결과값을 담는 용도
- 질의의 결과?
    1. 1행 1열
        - 1:1 관계 -> 컬럼 1개를 변수 1개에 저장
    2. 1행 n열
        - n:n 관계 -> 컬럼 n개를 변수 n개에 저장
    3. n행 1열
        - 불가능 -> 커서 사용
    4. n행 n열
        - 불가능 -> 커서 사용

select into 절

*/

declare
    vbuseo varchar2(15);
begin
    -- PLS-00428: an INTO clause is expected in this SELECT statement
    -- PL/SQL 블럭 안에서는 select문을 그냥 사용할 수 없다.(**************************************)
    -- select -> select into 사용
    select buseo into vbuseo from tblInsa where name = '이순신';
    
    dbms_output.put_line(vbuseo); -- select의 컬럼값을 출력할 수 없다. 반드시 PL/SQL의 구성요소만 출력할 수 있다.
end;

declare
    vbuseo varchar2(15);
    vname varchar2(15);
begin
    
    vname := '이순신';
    
    select buseo into vbuseo from tblInsa where name = vname;
    
    dbms_output.put_line(vbuseo);
    
end;

declare
    vcount number;
begin
    select count(*) into vcount from tblInsa where buseo = '총무부';
    dbms_output.put_line('총무부 직원수 : ' || vcount || '명');
end;


declare
    vbuseo varchar2(15);
    vbasicpay number;
    vcity varchar2(15);
begin
    select buseo, basicpay, city into vbuseo, vbasicpay, vcity from tblInsa where name = '이순신';
    
    dbms_output.put_line('부서 : ' || vbuseo);
    dbms_output.put_line('급여 : ' || vbasicpay);
    dbms_output.put_line('지역 : ' || vcity);
end;

-- n행 1열 -> 지금 불가능 -> 나중에 커서 사용
declare
    vname varchar2(30);
begin
    
    select name into vname from tblInsa where buseo = '총무부';
    dbms_output.put_line(vname);
    
end;


/*

참조 자료형
- 테이블로부터 직접 자료형을 알아내는 방법
- 생산성 + 유지보수성

1. %type
    - 사용하는 테이블의 특정 컬럼 자료형을 그대로 참조해서 적용
    - 복사되는 정보
    a. 자료형
    b. 길이
    c. not null

*/

-- 변수 선언 -> 자료형과 크기를 편하게 알아보는 방법
declare
    vbuseo varchar2(15);
    vjikwi tblInsa.jikwi%type; -- 자동으로 vjikwi varchar2(15) 된다.
begin
    select buseo, jikwi into vbuseo, vjikwi from tblInsa where name = '이순신';
    
    dbms_output.put_line(vbuseo);
    dbms_output.put_line(vjikwi);
end;


select * from tblAddressBook;

declare
    vname tblAddressBook.name%type;
    vzipcode tblAddressBook.zipcode%type;
    vaddress tblAddressBook.address%type;
begin
    select name, zipcode, address into vname, vzipcode, vaddress from tblAddressBook where seq = 212;
    
    dbms_output.put_line(vname);
    dbms_output.put_line(vzipcode);
    dbms_output.put_line(vaddress);
end;

-- select -> plsql 변수 -> 재사용

-- 이순신 -> 부서? -> 부서 사람 몇명?
-- 1. ANSI-SQL
-- 2. PL/SQL

select count(*) from tblInsa where buseo = (select buseo from tblInsa where name = '이순신');

declare
    vbuseo tblInsa.buseo%type;
    vcount number;
begin
    select buseo into vbuseo from tblInsa where name = '이순신';
    select count(*) into vcount from tblInsa where buseo = vbuseo;
    
    dbms_output.put_line(vcount);
end;


-- 일부 직원에게 보너스 지급 -> 지급 내역 저장
select * from tblInsa;

create table tblBonus
(
    seq number primary key,                             -- PK
    num number not null,                                -- 직원 번호
    bonus number not null                               -- 보너스
);

create sequence seqBonus;

-- 서울 거주, 사원, 근속기간 11년 이상인 직원 -> 김미나(1033)
select * from tblInsa where city = '서울' and jikwi = '사원' and months_between(sysdate, ibsadate) / 12 >= 11;

declare
    vnum tblInsa.num%type;
    vbasicpay number; -- %type 쓰면 오버플로우 될 수 있다.
begin

    select num, basicpay * 2 into vnum, vbasicpay from tblInsa where city = '서울' and jikwi = '사원' and months_between(sysdate, ibsadate) / 12 >= 11;
    
    dbms_output.put_line(vnum);
    dbms_output.put_line(vbasicpay);
    
    insert into tblBonus (seq, num, bonus) values(seqBonus.nextVal, vnum, vbasicpay);

end;

select (select name from tblInsa where num = tblBonus.num) as name, bonus from tblBonus;


/*

참조 자료형
1. %type
    - 컬럼 참조

2. %rowtype
    - 행 참조
    - %type의 집합형

*/

declare
    vname tblInsa.name%type;
    vssn tblInsa.ssn%type;
    vibsadate tblInsa.ibsadate%type;
    vcity tblInsa.city%type;
    vbuseo tblInsa.buseo%type;
    vjikwi tblInsa.jikwi%type;
    vsudang tblInsa.sudang%type;
begin

    select name, ssn, ibsadate, city, buseo, jikwi, sudang into vname, vssn, vibsadate, vcity, vbuseo, vjikwi, vsudang from tblInsa where name = '이순신';

end;


declare
    vrow tblInsa%rowtype; -- 행 전체 참조 변수(레코드 변수)
begin

    select * into vrow from tblInsa where name = '이순신';
    
    dbms_output.put_line(vrow.name);
    dbms_output.put_line(vrow.buseo);
    dbms_output.put_line(vrow.jikwi);
    dbms_output.put_line(vrow.basicpay);

end;



declare
    vrow tblInsa%rowtype; -- 행 전체 참조 변수(레코드 변수)
    vgender varchar2(1);
begin

    -- 보류
    --select tblInsa.*, substr(ssn, 8, 1) into vrow, vgender from tblInsa where name = '이순신';
    
    select * into vrow from tblInsa where name = '이순신';
    select substr(ssn, 8, 1) into vgender from tblInsa where name = '이순신';
    
    dbms_output.put_line(vrow.name);
    dbms_output.put_line(vrow.buseo);
    dbms_output.put_line(vrow.jikwi);
    dbms_output.put_line(vrow.basicpay);
    dbms_output.put_line(vgender);

end;


-- PL/SQL -> 프로시저 -> 익명 / 실명 -> 익명 -> declare + begin + exception + end -> ANSI-SQL + 제어

-- 제어문
-- 조건문

set serveroutput on;

declare
    vnum number := 10; -- 1. 변수생성 + 초기화
begin

    if vnum > 0 then -- 2. 조건
        dbms_output.put_line('양수'); -- 3. 출력
    end if;

end;


declare
    vnum number := -10;
begin

    if vnum > 0 then
        dbms_output.put_line('양수');
    else
        dbms_output.put_line('양수 아님');
    end if;

end;


declare
    vnum number := -10;
begin

    if vnum > 0 then
        dbms_output.put_line('양수');
    elsif vnum < 0 then -- elsif 철자 조심..
        dbms_output.put_line('음수');
    else
        dbms_output.put_line('0');
    end if;

end;


select * from tblBonus;

-- 기획부, 영업부, 총무부 사람이면 보너스(급여 * 0.5)
-- 나머지 부서는 보너스(급여 * 0.3)

declare
    vnum tblInsa.num%type; -- 직원번호
    vbasicpay tblInsa.basicpay%type; -- 급여
    vbuseo tblInsa.buseo%type; -- 부서
begin

    select num, basicpay, buseo into vnum, vbasicpay, vbuseo from tblInsa
        where name = '유관순';
    
    --if vbuseo = '기획부' or vbuseo = '영업부' or vbuseo '총무부' then
    if vbuseo in ('기획부', '영업부', '총무부') then
        insert into tblBonus (seq, num, bonus) values (seqBonus.nextVal, vnum, vbasicpay * 0.5);
        dbms_output.put_line('0.5');
    else
        insert into tblBonus (seq, num, bonus) values (seqBonus.nextVal, vnum, vbasicpay * 0.3);
        dbms_output.put_line('0.3');
    end if;

end;


-- case문
-- 자바(switch + 다중 if문)
-- ANSI-SQL의 case와는 다른 구문

select
    name,
    case
        when substr(ssn, 8, 1) = '1' then '남'
        when substr(ssn, 8, 1) = '2' then '여'
    end as gender
from tblInsa;


select * from tblCountry;

-- AS -> 아시아
-- EU -> 유럽

declare
    vname tblCountry.name%type; -- 국가명
    vcontinent tblCountry.continent%type; -- 대륙
    vresult varchar2(30); -- 결과 저장할 변수
begin

    select name, continent into vname, vcontinent from tblCountry where name = '대한민국';
    
    if vcontinent = 'AS' then
        vresult := '아시아';
    elsif vcontinent = 'EU' then
        vresult := '유럽';
    elsif vcontinent = 'AF' then
        vresult := '아프리카';
    else
        vresult := '기타';
    end if;
    
    dbms_output.put_line(vname || '-' || vresult);
    
    case vcontinent
        when 'AS' then vresult := '아시아';
        when 'EU' then vresult := '유럽';
        when 'AF' then vresult := '아프리카';
        else vresult := '기타';
    end case;
    
    dbms_output.put_line(vname || '-' || vresult);
    
end;


-- 반복문

-- 1. loop
--  - 무한 루프
-- 2. for loop
--  - 지정 횟수 반복(자바 for)
-- 3. while loop
--  - 조건 반복(자바 while)


-- loop

-- 무한 루프
begin

    loop
        dbms_output.put_line(to_char(sysdate, 'hh24:mi:ss'));
    end loop;

end;

-- 무한 루프 + 조건 탈출
declare
    vnum number := 1;
begin

    loop
        dbms_output.put_line(to_char(sysdate, 'hh24:mi:ss'));
        vnum := vnum + 1;
        
        -- if -> break
        exit when vnum > 10;
    end loop;

end;


create table tblLoop
(
    seq number primary key,
    data varchar2(30) not null
);

create sequence seqLoop;


-- 더미 데이터 + 10000개 추가
-- 데이터1, 데이터2, 데이터3...

declare
    vnum number := 1;
begin

    loop
    
        insert into tblLoop(seq, data) values (seqLoop.nextVal, '데이터' || vnum);
        vnum := vnum + 1;
        
        exit when vnum > 10000;
    
    end loop;

end;

select * from tblLoop;


-- for loop

begin

    -- i : 루프 변수
    -- 1 : 초기값
    -- .. : 증가
    -- 10 : 최대값
    
    for i in 1..10 loop
    
        dbms_output.put_line(i);
    
    end loop;

end;


create table tblGugudan
(
    --seq number primary key,
    dan number not null,
    num number not null,
    result number not null,
    
    constraint tblGugudan_dan_num_pk primary key(dan, num) -- 복합키
);

-- 2단 ~ 9단 -> insert x 72번
begin

    for dan in 2..9 loop
        for num in 1..9 loop
            insert into tblGugudan (dan, num, result) values (dan, num, dan * num);
        end loop;
    end loop;

end;

select * from tblGugudan;


begin

    for n in 1..10 loop
        dbms_output.put_line(n);
    end loop;

end;


-- while loop
declare
    vnum number := 1;
begin

    loop
        dbms_output.put_line(vnum);
        vnum := vnum + 1;
        
        exit when vnum > 10;
    end loop;

end;

declare
    vnum number := 1;
begin

    while vnum <= 10 loop
        dbms_output.put_line(vnum);
        vnum := vnum + 1;
    end loop;

end;

/*

PL/SQL
select -> 결과셋 -> PL/SQL 변수에 대입

1. select into절 사용
  - 결과셋의 레코드가 1개일때만 사용 가능한 방법
  - 결과셋의 컬럼은 1개 이상 ~

2. cursor 사용
  - 결과셋의 레코드가 0개 이상일 때 사용 가능한 방법
  - 결과셋의 레코드가 2개 이상일 때 사용 추천

-- select into
declare
    변수 선언
begin
    select 컬럼 into 변수 from 테이블;
end;

-- cursor
declare
    커서 선언; -- 결과셋 참조 객체(자바의 Iterator)
begin
    커서 열기;
        loop
            데이터 접근(레코드 접근) + 커서 참조 -> 데이터 조작
        end loop;
    커서 닫기;
end;

*/


declare
    vname tblInsa.name%type;
begin
    select name into vname from tblInsa; --where num = 1005;
    dbms_output.put_line(vname);
end;


declare
    vname tblInsa.name%type;
    cursor vcursor is select name into vname from tblInsa order by name;
begin
    
    open vcursor; -- 커서 열기(커서가 가지고 있는 select문이 이 때 실행된다. 그리고 결과셋을 참조한다.)
    
        loop -- 커서가 실행한 select의 결과 -> 결과셋의 레코드를 탐색하는 도구
            
            -- select 컬럼 into 변수;
            -- fetch 커서 into 변수;
            fetch vcursor into vname; -- 현재 커서가 가리키고 있는 레코드의 값을 가져와서 vname에 넣어라. + 커서 전진(다음 레코드)
            
            exit when vcursor%notfound;
            
            dbms_output.put_line(vname);
            
        end loop;
    
    close vcursor; -- 커서 닫기
    
end;


select * from tblCountry;

-- 나라이름과 수도 가져오기

declare
    cursor vcursor is select name, capital from tblCountry order by name asc;
    vname tblCountry.name%type;
    vcapital tblCountry.capital%type;
begin

    open vcursor;
    
        loop
        
            fetch vcursor into vname, vcapital;
            
            exit when vcursor%notfound;
            
            dbms_output.put_line(vname || '(' || vcapital || ')');
        
        end loop;
    
    close vcursor;

end;


-- tblBonus
-- 개발부 직원 -> 보너스 지급
select * from tblBonus;

select i.name, i.buseo, b.bonus from tblBonus b inner join tblInsa i on b.num = i.num;

declare
    cursor vcursor is select num, basicpay from tblInsa where buseo = '개발부';
    vnum tblInsa.num%type;
    vbasicpay tblInsa.basicpay%type;
begin

    open vcursor;
    
        loop
        
            fetch vcursor into vnum, vbasicpay;
            
            exit when vcursor%notfound;
            
            insert into tblBonus (seq, num, bonus) values (seqBonus.nextVal, vnum, vbasicpay * 0.7);
        
        end loop;
    
    close vcursor;

end;


-- 커서 탐색
-- 1. 커서 + loop [FM]
-- 2. 커서 + for loop : 1번의 단순화
-- 둘 다 골고루...

-- 1.
declare
    cursor vcursor is select * from tblInsa;
    vrow tblInsa%rowtype; -- 레코드를 담을 수 있는 변수(컬럼 10개 분량)
begin

    open vcursor;
    
        loop
        
            fetch vcursor into vrow;
            
            exit when vcursor%notfound;
            
            dbms_output.put_line(vrow.name);
            dbms_output.put_line(vrow.buseo);
            dbms_output.put_line('--------');
        
        end loop;
    
    close vcursor;

end;

-- 2.
declare
    cursor vcursor is select * from tblInsa;
    --vrow tblInsa%rowtype; -- 생략 -> 아래에서 작성
begin

    --open vcursor;
    
        for vrow in vcursor loop -- loop + fetch + exit
        
            --fetch vcursor into vrow;
            
            --exit when vcursor%notfound;
            
            dbms_output.put_line(vrow.name);
            dbms_output.put_line(vrow.buseo);
            dbms_output.put_line('--------');
        
        end loop;
    
    --close vcursor;

end;

-- 2-1. for loop
declare
    cursor vcursor is select * from tblInsa;
begin
    
        for vrow in vcursor loop
        
            dbms_output.put_line(vrow.name);
            dbms_output.put_line(vrow.buseo);
            dbms_output.put_line('--------');
        
        end loop;

end;

-- 단순 쿼리 용도 O, 복잡한 쿼리 용도 X
begin

        for vrow in (select * from tblInsa) loop
        
            dbms_output.put_line(vrow.name);
            dbms_output.put_line(vrow.buseo);
            dbms_output.put_line('--------');
        
        end loop;

end;


-- 조건문, 반복문, cursor 사용법(결과셋 탐색)


-- PL/SQL
-- declare, begin ~ end, exception

-- 예외 처리부
-- 실행부에서 발생하는 예외를 처리하는 블럭
-- catch절 유사

set serveroutput on;

declare
    -- 선언부
    vdata number;
begin
    -- 구현부(실행부)
    dbms_output.put_line('시작');
    
    -- ORA-06502: PL/SQL: numeric or value error: character to number conversion error
    select basicpay into vdata from tblInsa where num = 1005; -- 이름(varchar2) -> vdata(number)
    
    dbms_output.put_line(vdata);
    
    vdata := 0;
    -- ORA-01476: divisor is equal to zero
    dbms_output.put_line(100 / vdata);
    dbms_output.put_line('끝');

exception
    -- 예외 처리부
    
    when value_error then
        dbms_output.put_line('자료형 불일치!!');
        
    when zero_divide then
        dbms_output.put_line('0으로 나누려고 함!');
    
    when others then -- 자바의 catch(Exception e) 동일 : 모든 예외를 잡는다.
        dbms_output.put_line('예외처리');

end;


/*

프로시저(PL/SQL 블럭)
1. 익명 프로시저
    - 1회용(저장 안함)
2. 실명 프로시저
    - 재사용(저장함)

실명 프로시저
- 저장 프로시저(Stored Procedure)
1. 저장 프로시저(Stored Procedure)
    - 매개변수 구성 or 반환값 구성 -> 자유
2. 저장 함수(Stored Function)
    - 매개변수 필수, 반환값 필수 -> 고정


익명 프로시저 선언
[declare
    변수 선언;
    커서 선언;]
begin
    구현부;
[exception
    예외처리;]
end;


저장 프로시저 선언
create [or replace] procedure 프로시저명
is(as) -- 필수
    [변수 선언;
    커서 선언;]
begin
    구현부;
[exception
    예외처리;]
end [프로시저명];


*/

declare
    vnum number;
begin
    vnum := 100;
    dbms_output.put_line(vnum);
end;


create or replace procedure procTest
is
    vnum number;
begin
    vnum := 100;
    dbms_output.put_line(vnum);
end procTest;


/*

저장한 프로시저 호출 방법
1. 스크립트 환경에서 호출하기(ANSI-SQL 환경)
2. PL/SQL 블럭에서 호출하기(**********)

*/

-- PL/SQL 블럭에서 호출하기(FM)
begin
    procTest; -- 프로시저 호출(실행)
end;

-- 스크립트 환경에서 호출하기
execute procTest;
exec procTest;
call procTest(); -- call 키워드는 기억! -> 나중에 자바에서 call 키워드 씀.


/*

프로젝트 적용
1. 두 방식 모두 사용
2. 비율 알아서 나누기..(업무별, 기능별 등으로 나눠서..)

SQL 처리 순서

1. ANSI-SQL or 익명 프로시저
    : 클라이언트 구문 작성(select) -> 실행(Ctrl+Enter) -> 명령어가 오라클 서버에 전달
        -> 서버에서 명령어를 수신 -> 구문 분석(파싱) -> 컴파일 -> 실행 -> 결과 도출
        -> 결과셋을 클라이언트에게 반환
    : 한번 실행했던 명령어를 다시 실행 -> 위의 과정을 다시 처음부터 끝까지 모든 과정을 재실행
    : 첫번째 실행 비용 = 다시 실행 비용

2. 저장 프로시저
    : 클라이언트 구문 작성(select) -> 실행(Ctrl+Enter) -> 명령어가 오라클 서버에 전달
        -> 서버에서 명령어를 수신 -> 구문 분석(파싱) -> 컴파일 -> 실행 -> 결과 도출
        -> 결과셋을 클라이언트에게 반환
    : 한번 실행했던 명령어를 다시 실행 -> "구문 분석(파싱) -> 컴파일" 과정이 생략된다. : 이부분 비용 감소
    : 첫번째 실행 비용 > 다시 실행 비용

*/


-- 매개변수 + 반환값
-- 1. 매개변수가 있는 프로시저
-- : 매개변수 선언에는 길이와 제약을 표시할 수 없다.

create or replace procedure procTest(pnum number)
is
    vsum number := 0;
begin

    vsum := pnum + 100;
    dbms_output.put_line(vsum);

end procTest;

begin
    procTest(100);
    procTest(200);
    procTest(300);
end;

create or replace procedure procTest(width number, height number)
is
    vresult number;
begin

    vresult := width * height;
    dbms_output.put_line(vresult);

end procTest;


begin
    procTest(10, 20);
end;

create or replace procedure procTest(
    width number,
    height number default 10
)
is
    vresult number;
begin
    vresult := width * height;
    dbms_output.put_line(vresult);
end procTest;

begin
    procTest(10, 20);
    procTest(10);
end;


/*

매개변수 모드(*******************)
- 매개변수의 값을 전달하는 방식
1. in : 기본모드
2. out
3. in out

*/

create or replace procedure procTest(
    vnum1 in number,
    vnum2 in number,
    vresult out number, -- 반환 매개변수(리턴값) -> 여러개 반환할 수 있다.
    vresult2 out number,
    vresult3 out number
)
is
begin

    vresult := vnum1 + vnum2;
    vresult2 := vnum1 * vnum2;
    vresult3 := vnum1 - vnum2;

end;


declare
    vaaa number;
    vbbb number;
    vccc number;
begin
    -- PLS-00306: wrong number or types of arguments in call to 'PROCTEST'
    --procTest(10, 20);
    -- PLS-00363: expression '30' cannot be used as an assignment target
    --procTest(10, 20, 30);
    procTest(10, 20, vaaa, vbbb, vccc);
    dbms_output.put_line(vaaa);
    dbms_output.put_line(vbbb);
    dbms_output.put_line(vccc);
end;


-- 프로시저 2개 생성
-- 1. 부서 지정 -> 해당 부서 직원 중 급여를 가장 많이 받는 사람의 번호 반환
create or replace procedure procInsa1(
    pbuseo in varchar2,
    pnum out number
)
is
begin
    select num into pnum from tblInsa where basicpay = (select max(basicpay) from tblInsa where buseo = pbuseo) and rownum = 1;
end procInsa1;


declare
    vnum number;
begin
    procInsa1('개발부', vnum);
    dbms_output.put_line(vnum);
end;

-- 2. 직원 번호 지정 -> 같은 지역에 사는 직원수, 같은 직위의 직원수, 해당 직원보다 급여를 더 많이 받는 직원수 반환
create or replace procedure procInsa2(
    pnum in number, -- 직원 번호
    pcnt1 out number, -- 같은 지역 직원수
    pcnt2 out number, -- 같은 직위 직원수
    pcnt3 out number -- 급여 더 많이 받는 직원수    
)
is
begin
    select count(*) into pcnt1 from tblInsa where city = (select city from tblInsa where num = pnum);
    select count(*) into pcnt2 from tblInsa where jikwi = (select jikwi from tblInsa where num = pnum);
    select count(*) into pcnt3 from tblInsa where basicpay > (select basicpay from tblInsa where num = pnum);    
    
end procInsa2;

declare
    vcnt1 number;
    vcnt2 number;
    vcnt3 number;
begin
    procInsa2(1003, vcnt1, vcnt2, vcnt3);
    dbms_output.put_line(vcnt1);
    dbms_output.put_line(vcnt2);
    dbms_output.put_line(vcnt3);
end;


declare
    vnum number;
    vcnt1 number;
    vcnt2 number;
    vcnt3 number;
begin
    procInsa1('개발부', vnum);
    procInsa2(vnum, vcnt1, vcnt2, vcnt3);
    dbms_output.put_line(vcnt1);
    dbms_output.put_line(vcnt2);
    dbms_output.put_line(vcnt3);
end;

select * from tblInsa;

-- tblInsa 직원 추가 프로시저
create or replace procedure procAddInsa(
    pname varchar2,
    pssn varchar2,
    pyear varchar2,
    pmonth varchar2,
    pdate varchar2,
    pcity varchar2,
    ptel varchar2,
    pbuseo varchar2,
    pjikwi varchar2,
    pbasicpay number,
    psudang number,
    presult out number -- 1 or 0
)
is
begin
    insert into tblInsa (num, name, ssn, ibsadate, city, tel, buseo, jikwi, basicpay, sudang)
        values ((select max(num) + 1 from tblInsa), pname, pssn, to_date(pyear || pmonth || pdate, 'yyyymmdd'), pcity, ptel, pbuseo, pjikwi, pbasicpay, psudang);
    presult := 1;
exception
    when others then
        presult := 0;
end procAddInsa;


declare
    vresult number;
    
begin
    procAddInsa('홍길동', '951122-1111111', '2020', '12', '09', '서울', '010-1234-5678', '개발부', '부장', 5000000, 1000000, vresult);
    
    if vresult = 1 then
        dbms_output.put_line('등록 성공');
    else
        dbms_output.put_line('등록 실패');
    end if;
end;

set serveroutput on;

-- 저장 프로시저(+매개변수(in, out))
select * from tblStaff;
select * from tblProject;

-- 특정 직원이 퇴사 -> 담당 업무 존재 확인? -> 업무 위임 -> 퇴사

create or replace procedure procDeleteStaff(
    pseq number,            -- 퇴사할 직원번호(PK)
    pstaff number,          -- 위임받을 직원번호
    presult out number      -- 성공(1) or 실패(0)
)
is
    vcnt number;            -- 퇴사 직원의 담당 프로젝트 개수
begin

    --1. 퇴사 직원의 담당 프로젝트가 있는지?
    select count(*) into vcnt from tblProject where staff = pseq;
    dbms_output.put_line('퇴사할 직원이 ' || vcnt || '개의 프로젝트를 담당하고 있습니다.');
    
    --2. 조건부 -> 위임
    if vcnt > 0 then
        --3. 위임
        update tblProject set staff = pstaff where staff = pseq;
        dbms_output.put_line(pseq || '의 프로젝트를 ' || pstaff || '에게 위임합니다.');
    else
        --3. 아무것도 안함
        null; -- 빈 블럭 표시(else절에는 아무것도 하지 마세요... 개발자 의도 표시)
        dbms_output.put_line('위임할 프로젝트가 없습니다.');
    end if;
    
    --4. 퇴사
    delete from tblStaff where seq = pseq;
    dbms_output.put_line(pseq || '가 퇴사합니다.');
    
    presult := 1;
    
exception
    when others then
        presult := 0;

end procDeleteStaff;


select * from tblStaff;
select * from tblProject;


declare
    vresult number; -- 성공 유무
begin
    procDeleteStaff(3, 4, vresult);
    if vresult = 1 then
        dbms_output.put_line('퇴사 성공');
    else
        dbms_output.put_line('퇴사 실패');
    end if;
end;


-- 저장 함수(Stored Function)
-- 함수(Function)라 잘 부른다.
-- : 반환값이 반드시 원자값이어야 한다. -> 값 1개만을 반환하는 프로시저
-- : 함수에서도 in, out 사용할 수 있다. -> but 절대로 out 파라미터를 사용하면 안된다.(함수 개념X)


create or replace function fnSum(
    pnum1 number,
    pnum2 number
) return number -- 타입 명시
is
begin
    return pnum1 + pnum2;
end;


declare
    vresult number;
begin
    vresult := fnSum(100, 200);
    dbms_output.put_line(vresult);
    dbms_output.put_line(fnSum(100, 200));
end;

-- 반환값을 받는 방식의 차이 때문에 프로시저와 함수는 쓰이는 곳이 다르다.
-- ******************** 함수는 ANSI-SQL와 같이 사용이 가능하다.

select height, weight, height + weight, fnSum(height, weight) from tblComedian;


-- 성별(남자|여자)
select name, buseo, jikwi,
    case
        when substr(ssn, 8, 1) = '1' then '남자'
        when substr(ssn, 8, 1) = '2' then '여자'
    end as gender
from tblInsa;


create or replace function fnGender(
    pssn varchar2
) return varchar2
is
begin
    return case
        when substr(pssn, 8, 1) = '1' then '남자'
        when substr(pssn, 8, 1) = '2' then '여자'
    end;
end;

select name, buseo, jikwi, fnGender(ssn) from tblInsa;


/*

트리거(Trigger)
- 프로시저의 한 종류
- 개발자의 호출이 아닌, 미리 지정한 특정 사건이 발생하면 자동으로 실행되는 프로시저(예약+이벤트)
- 특정 테이블 지정 -> 감시 -> insert or update or delete -> 미리 준비해놓은 프로시저 자동 실행
- 트리거가 많아지면 시스템 속도가 느려진다.

트리거 구문
create or replace trigger 트리거명
    - 트리거 옵션
    before|after
    insert|update|delete on 테이블명
    [for each row]
declare
    선언부;
begin
    실행부;
exception
    예외처리부;
end;

*/


-- tblInsa -> 직원 퇴사
-- 특정 요일(목)에는 tblInsa의 레코드를 삭제할 수 없다.
create or replace trigger trgInsa
    before
    delete on tblInsa
begin
    --dbms_output.put_line('트리거가 실행되었습니다.');
    if to_char(sysdate, 'dy') = '목' then
        -- 현재 진행하려던 업무를 없었던 일로 만들기 -> 강제로 예외 발생(에러 발생)
        -- -20000 ~ -29999
        raise_application_error(-20001, '목요일에는 퇴사가 불가능합니다.');
    end if;
    
end;

select * from tblInsa;
delete from tblInsa where num = 1011;

select * from tblMen;

-- 트리거 용도 -> 로그 발생
create table tblLogMen (
    seq number primary key,
    message varchar2(1000) not null,
    regdate date default sysdate not null
);

create sequence seqLogMen;

create or replace trigger trgLogMen
    after
    insert or update or delete on tblMen
declare
    vmessage varchar2(1000);
begin

    if inserting then
        vmessage := '새 남자가 추가되었습니다.';
    elsif updating then
        vmessage := '특정 남자의 정보가 수정되었습니다.';
    elsif deleting then
        vmessage := '특정 남자가 삭제되었습니다.';
    end if;
    
    insert into tblLogMen values (seqLogMen.nextVal, vmessage, default);
        
end;

select * from tblLogMen;

select * from tblMen;
insert into tblMen values('후후후', 25, 180, 80, null);
insert into tblMen values('헤헤헤', 26, 170, 70, null);
delete from tblMen where name = '박명수';
update tblMen set weight = 80 where name = '홍길동';


/*

트리거 옵션
- for each row
1. 사용O
    - 행 단위 트리거
    - 트리거 실행이 반복 -> 사건이 적용되는 레코드 개수만큼 트리거 반복 호출(*****)
    - 적용된 레코드의 정보가 중요한 업무. 한사람 한사람이 누군지 중요한 업무
2. 사용X
    - 문장 단위 트리거
    - 트리거 실행이 1회 -> 사건이 적용되는 레코드 개수와 상관없이 트리거는 1회 호출(*****)
    - 적용된 레코드의 정보가 중요하지 않은 업무. 사건 자체가 중요한 업무

*/


commit;
rollback;


select * from tblMen;

create or replace trigger trgMen
    after
    delete on tblMen
    for each row
begin
    dbms_output.put_line('레코드가 삭제됩니다.');
end;


delete from tblMen;

select * from tblLogMen;

-- tblMen에 걸려있는 트리거들
-- trgLogMen : 로그 기록용 트리거
-- trgMen : 테스트용 트리거


/*

for each row 사용하는 경우
- 상관 관계(:old, :new)를 사용한다. -> 가상 행(prior)

1. insert
    - 트리거내에서 방금 insert된 레코드의 컬럼값들을 참조할 수 있다.
    - :new -> 방금 추가된 행
    - :new.컬럼명 -> 방금 추가된 행의 컬럼
    - 주로 after 트리거에서 사용

2. update
    - 트리거내에서 방금 update된 레코드의 전, 후 컬럼값들을 참조할 수 있다.
    - :new -> 방금 수정된 행
    - :old -> 방금 수정되기 전 행

3. delete
    - 트리거내에서 방금 delete된 레코드의 컬럼값들을 참조할 수 있다.
    - :old -> 방금 삭제된 행
    - 주로 before 트리거에서 사용

*/


create or replace trigger trgComedian
    after
    update on tblComedian
    for each row
begin

    dbms_output.put_line(:old.last || :old.first);
    
    dbms_output.put_line('이전 몸무게 : ' || :old.weight);
    dbms_output.put_line('현재 몸무게 : ' || :new.weight);

end;

select * from tblComedian;

update tblComedian set weight = weight * 1.1 where first = '재석' and last = '유';


select * from tblStaff;
select * from tblProject;

create or replace trigger trgDeleteStaff
    before --2. 직원이 삭제되기 전
    delete on tblStaff --1. 직원의 삭제를 감시
    for each row --3. 해당 직원 정보를 사용
begin
    --4. 무언가를 하겠다..
    update tblProject set
        staff = 4
            where staff = :old.seq; -- :old.seq -> 방금 삭제하려는 직원의 seq

end;

delete from tblStaff where seq = 1;



-- 자식 테이블 찾기!!!
-- 1. 조회
SELECT fk.owner, fk.constraint_name , fk.table_name
FROM all_constraints fk, all_constraints pk
WHERE fk.R_CONSTRAINT_NAME = pk.CONSTRAINT_NAME
AND fk.CONSTRAINT_TYPE = 'R'
AND pk.TABLE_NAME = 'TBLUSER' -- 부모 테이블 이름
ORDER BY fk.TABLE_NAME;

-- 2. ERD 도구 -> 역공학 -> 연결된 테이블들을 확인

-- 3. 강제 삭제 -> FK 걸려있어도 무시하고 삭제 (비추)
drop table tblUser cascade constraints purge;


-- 결론 : 프로젝트 -> 둘 다 사용 -> 면접볼 때 할 얘기가 생김...

-- 회원 테이블 + 게시판 테이블
-- 1. 글 작성 -> 포인트 + 100
-- 2. 글 삭제 -> 포인트 - 50

create table tblBoard
(
    seq number primary key,
    subject varchar2(1000) not null,
    id varchar2(30) not null references tblUser(id) -- FK
);

create sequence seqBoard;

create table tblUser
(
    id varchar2(30) primary key,
    point number default 1000 not null
);

insert into tblUser values('hong', default);
select * from tblUser;

insert into tblBoard values (seqBoard.nextVal, '글을 작성합니다', 'hong');
select * from tblBoard;

delete from tblBoard where seq = 4;


-- 1. 프로시저
create or replace procedure procAddBoard(
    psubject varchar2,
    pid varchar2
)
is
begin

    -- 글쓰기
    insert into tblBoard values (seqBoard.nextVal, psubject, pid);
    
    -- 포인트 적립
    update tblUser set point = point + 100 where id = pid;
    
    commit;

exception
    when others then
        rollback;

end;


create or replace procedure procDeleteBoard(
    pseq number
)
is
    vid varchar2(30);
begin

    -- 삭제글의 유저아이디
    select id into vid from tblBoard where seq = pseq;
    
    -- 글삭제
    delete from tblBoard where seq = pseq;
    
    -- 포인트 차감
    update tblUser set point = point -50 where id = vid;
    
    commit;

exception
    when others then
        rollback;

end;


begin
    --procAddBoard('다시 글을 씁니다.', 'hong');
    procDeleteBoard(3);
end;


select * from tblUser;
select * from tblBoard;



-- 2. 트리거
create or replace trigger trgBoard
    after
    insert or delete on tblBoard
    for each row
declare

begin

    -- insert -> 포인트 +100
    -- delete -> 포인트 -50
    if inserting then
        update tblUser set point = point + 100 where id = :new.id;
    elsif deleting then
        update tblUser set point = point - 50 where id = :old.id;
    end if;

end;


-- 반환값(out) 프로시저(함수X)
-- 단일값
-- 1. number
-- 2. varchar2
-- 3. date
-- 다중값
-- 4. cursor ***
-- cursor 반환하기

-- cursor 사용 복습
select * from tblInsa where buseo = ?;

create or replace procedure procBuseo(
    pbuseo varchar2
)
is
    cursor vcursor is select * from tblInsa where buseo = pbuseo;
    vrow tblInsa%rowtype;
begin

    open vcursor;
    
    loop
    
        fetch vcursor into vrow;
        
        exit when vcursor%notfound;
        
        dbms_output.put_line(vrow.name || ' ' || vrow.buseo);
    
    end loop;
    
    close vcursor;

end;

set serveroutput on;

begin
    procBuseo('영업부');
end;


create or replace procedure procBuseo (
    pbuseo varchar2
)
is
    cursor vcursor is select * from tblInsa where buseo = pbuseo;
begin

    for vrow in vcursor loop
        dbms_output.put_line(vrow.name || ' ' || vrow.buseo);
    end loop;

end;

begin
    procBuseo('개발부');
end;


-- 커서 반환

create or replace procedure procBuseo(
    pbuseo in varchar2,
    pcursor out sys_refcursor -- 커서를 반환값으로 사용할 때 쓰는 자료형
)
is
begin

    open pcursor for select * from tblInsa where buseo = pbuseo; -- open 커서명 for sql;

end;


declare
    vcursor sys_refcursor;
    vrow tblInsa%rowtype;
begin
    procBuseo('홍보부', vcursor); -- open cursor
    
    loop
        
        fetch vcursor into vrow;
        exit when vcursor%notfound;
        
        dbms_output.put_line(vrow.name);
        
    end loop;
end;


















