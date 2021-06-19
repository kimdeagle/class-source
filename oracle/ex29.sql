-- ex29.sql

-- 근태 관리 > 기록/조회

-- 학생 1명의 12월 근태 상황 -> 표 출력 -> 12월 1일 ~ 12월 31일 + 날짜별 근태 상황
-- 1. 모든 날짜 출력
-- 2. 날짜별 상황 출력

-- 근태 테이블
create table tblDate
(
    seq number primary key,
    regdate date not null,      -- 출결 날짜
    state varchar2(30) not null -- 근태 상태
);

insert into tblDate (seq, regdate, state) values (1, '2020-12-01', '정상');
insert into tblDate (seq, regdate, state) values (2, '2020-12-02', '정상');
insert into tblDate (seq, regdate, state) values (3, '2020-12-03', '지각');
insert into tblDate (seq, regdate, state) values (4, '2020-12-04', '정상');
insert into tblDate (seq, regdate, state) values (5, '2020-12-07', '정상');
insert into tblDate (seq, regdate, state) values (6, '2020-12-08', '조퇴');
                                                                        -- 12-09 : 결석
insert into tblDate (seq, regdate, state) values (7, '2020-12-10', '지각');
insert into tblDate (seq, regdate, state) values (8, '2020-12-11', '정상');
insert into tblDate (seq, regdate, state) values (9, '2020-12-14', '정상');
insert into tblDate (seq, regdate, state) values (10, '2020-12-15', '지각');

-- 12월 1일 ~ 12월 15일까지 근태 기록 출력!!!
select * from tblDate order by regdate asc; -- 9일 근태가 빠짐

-- *** 날짜 출력(12월 1일 ~ 12월 15일 모두 출력) + 날짜별 상황

-- 1. 계층형 쿼리
-- 2. 외부 조인

create table tblTemp
(
    seq number primary key,
    regdate date not null
);

insert into tblTemp (seq, regdate) values (1, '2020-12-01');
insert into tblTemp (seq, regdate) values (2, '2020-12-02');
insert into tblTemp (seq, regdate) values (3, '2020-12-03');
insert into tblTemp (seq, regdate) values (4, '2020-12-04');
insert into tblTemp (seq, regdate) values (5, '2020-12-05');
insert into tblTemp (seq, regdate) values (6, '2020-12-06');
insert into tblTemp (seq, regdate) values (7, '2020-12-07');
insert into tblTemp (seq, regdate) values (8, '2020-12-08');
insert into tblTemp (seq, regdate) values (9, '2020-12-09');
insert into tblTemp (seq, regdate) values (10, '2020-12-10');
insert into tblTemp (seq, regdate) values (11, '2020-12-11');
insert into tblTemp (seq, regdate) values (12, '2020-12-12');
insert into tblTemp (seq, regdate) values (13, '2020-12-13');
insert into tblTemp (seq, regdate) values (14, '2020-12-14');
insert into tblTemp (seq, regdate) values (15, '2020-12-15');


select * from tblDate; -- 10개(학생이 출결한 날짜만)
select * from tblTemp; -- 15개(출결과 상관없이 모든 날짜)

select t.regdate as 출결날짜, d.state as 출결상태 from tblTemp t
    left outer join tblDate d
        on t.regdate = d.regdate
            order by t.regdate asc;


-- 날짜용 테이블 데이터를 만드는 방법
-- 1. PL/SQL -> 반복 처리
-- 2. JDBC -> 프로그램 처리
-- 3. 계층형 쿼리 사용 : 가장 추천

select * from tblComputer;

select * from tblComputer
    start with pseq is null
        connect by prior seq = pseq;

select level, sysdate + level from dual
    connect by level <= 50;

-- 12월 1일 ~ 15일
create or replace view vwDate
as
select to_date('2020-12-01', 'yyyy-mm-dd') + level-1 as regdate from dual
    connect by level <= (to_date('2020-12-31', 'yyyy-mm-dd') - to_date('2020-12-01', 'yyyy-mm-dd') + 1);

select vd.regdate as 출결날짜, td.state as 출결상태 from vwDate vd
    left outer join tblDate td
        on vd.regdate = td.regdate
            order by vd.regdate;


select
    vd.regdate as 출결날짜,
    --td.state as 출결상태,
    case
        when to_char(vd.regdate, 'd') in ('1', '7') then '휴일'
        when td.regdate is null then '결석'
        else td.state
    end as 출결상태
from vwDate vd
    left outer join tblDate td
        on vd.regdate = td.regdate
            order by vd.regdate;

-- 공휴일 테이블
create table tblHoliday
(
    seq number primary key,
    regdate date not null,
    name varchar2(30) not null
);

insert into tblHoliday values (1, '2020-12-25', '성탄절');

select * from tblHoliday;

select
    vd.regdate as 출결날짜,
    --td.state as 출결상태,
    case
        when to_char(vd.regdate, 'd') in ('1', '7') then '휴일'
        when h.name is not null then h.name
        when td.regdate is null then '결석'
        else td.state
    end as 출결상태
from vwDate vd
    left outer join tblDate td
        on vd.regdate = td.regdate
            left outer join tblHoliday h
                on vd.regdate = h.regdate
                    order by vd.regdate;






