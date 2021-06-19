--회원 테이블

select * from tblMember;

create table tblMember(
    seq number primary key,                 --번호(PK)
    id varchar2(30) not null unique,        --ID
    name varchar2(30) not null,             --이름
    email varchar2(100) not null,           --이메일
    pw varchar2(30) not null,               --PW
    pic varchar2(50) not null,              --프로필 사진
    regdate date default sysdate not null   --가입일
);

create sequence seqMember;

select * from tblMember;


--게시판 테이블
create table tblBoard(
    seq number primary key,                             --글번호(PK)
    subject varchar2(1000) not null,                    --제목
    content varchar2(2000) not null,                    --내용
    regdate date default sysdate not null,              --작성일
    readcount number default 0 not null,                --조회수
    mseq number not null references tblMember(seq)      --회원번호(FK)
);

create sequence seqBoard;

insert into tblBoard (seq, subject, content, regdate, readcount, mseq) values (seqBoard.nextVal, '게시판 테스트입니다.', '내용입니다', default, default, 1);

select * from tblBoard;



-- 게시판 뷰

create or replace view vwBoard
as
select
    seq,
    subject,
    (select name from tblMember where seq = tblBoard.mseq) as name,
    regdate,
    readcount,
    mseq,
    (sysdate - regdate) * 24 as gap,
    content, --검색 때문
    filename,
    (select count(*) from tblComment where bseq = tblBoard.seq) as ccount,
    thread,
    depth
from tblBoard;

select * from vwBoard where name like '%검색어%' or subject like '%검색어' or content like '%검색어%';

commit;


drop table tblBoard cascade constraints;
drop sequence seqBoard;

--게시판 테이블
create table tblBoard(
    seq number primary key,                             --글번호(PK)
    subject varchar2(1000) not null,                    --제목
    content varchar2(2000) not null,                    --내용
    regdate date default sysdate not null,              --작성일
    readcount number default 0 not null,                --조회수
    mseq number not null references tblMember(seq),     --회원번호(FK)
    filename varchar2(100) null,                        --물리적 파일명
    orgfilename varchar2(100) null,                     --원본 파일명
    downloadcount number default 0                      --다운로드 횟수
);

create sequence seqBoard;

select * from tblBoard;



--페이징, Paging
--한페이지 : 10개씩
select * from vwBoard order by seq desc;

select rownum from vwBoard b order by seq desc;

select * from (select a.*, rownum as rnum from (select * from vwBoard order by seq desc) a) where rnum between 1 and 10;

select count(*) from tblBoard;


--댓글 테이블
create table tblComment(
    seq number primary key,                             --댓글번호(PK)
    ccontent varchar2(1000) not null,                   --댓글내용
    regdate date default sysdate not null,              --작성시간
    mseq number not null references tblMember(seq),     --회원번호(FK)
    bseq number not null references tblBoard(seq)       --게시판번호(FK)
);

create sequence seqComment;

select * from tblComment;

select c.*, (select name from tblMember where seq = c.mseq) as name, (select id from tblMember where seq = c.mseq) as id from tblComment c;



drop table tblComment;
drop sequence seqComment;

drop table tblBoard;
drop sequence seqBoard;



--게시판 테이블(21.02.19 ver)
create table tblBoard(
    seq number primary key,                             --글번호(PK)
    subject varchar2(1000) not null,                    --제목
    content varchar2(2000) not null,                    --내용
    regdate date default sysdate not null,              --작성일
    readcount number default 0 not null,                --조회수
    mseq number not null references tblMember(seq),     --회원번호(FK)
    filename varchar2(100) null,                        --물리적 파일명
    orgfilename varchar2(100) null,                     --원본 파일명
    downloadcount number default 0,                     --다운로드 횟수
    thread number not null,                             --답변
    depth number not null                               --답변
);

create sequence seqBoard;

select nvl(max(thread), 0) + 1000 as thread from tblBoard;


select * from tblBoard;



--쪽지 테이블
create table tblMessage(
    seq number primary key,                                 --번호(PK)
    smseq number not null references tblMember(seq),        --보낸 회원번호(FK)
    rmseq number not null references tblMember(seq),        --받는 회원번호(FK)
    content varchar2(1000) not null,                        --쪽지 내용
    regdate date default sysdate not null,                  --보낸 시간
    state number(1) default 0                               --상태(0:확인안함 + 읽지않음, 1:확인함 + 읽지않음, 2:확인함 + 읽음)
);

create sequence seqMessage;


select * from tblMessage;

select * from tblMember;
select * from tblBoard;
select * from tblComment;


--차트 데이터
--회원별 게시물 수, 댓글 수

--회원별 게시물 수
select count(*) as cnt, mseq, (select name from tblMember where seq = tblBoard.mseq) as name from tblBoard group by mseq;


--회원별 댓글 수
select count(*) as cnt, mseq, (select name from tblMember where seq = tblComment.mseq) as name from tblComment group by mseq;

select * from tblBoard order by seq desc;


select * from tblInsa;

--2021.02.26 이후 insa.sql 실행하기 > 해당 주석 삭제하기


commit;


