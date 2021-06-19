<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- header -->
<header>

    <!-- 상단메뉴 -->

    <div id="headerlink">
        <a href="#" class="headerlink-item">마이페이지</a>
        <a href="#" class="headerlink-item">로그인</a>
        <a href="#" class="headerlink-item">회원가입</a>
        <a href="#" class="headerlink-item">장바구니</a>
        <a href="#" class="headerlink-item">주문/배송조회</a>
        <a href="#" class="headerlink-item">고객센터</a>
    </div>

    <!-- 로고, 캐릭터, 검색창 -->

    <div id="searchmenu">

        <!-- 로고 및 캐릭터 -->
        <img src="/bj/image/bookjeok/logo.png" class="logo">
        
        <!-- 통합검색창(검색분류선택창) -->
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">통합검색<span class="caret"></span></a>
        <!-- <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li class="divider"></li>
            <li><a href="#">One more separated link</a></li>
        </ul> -->

        <div class="searchdiv inline">
            <input type="text" id="search" class="form-control noline small inline">
            <input type="button" id="searchbtn" value="검색" class="btn btn-general noline">
        </div>

        <!-- 실시간검색어(현우님이 나중에 수정해주셔야 함! id랑 class는 CSS때문에 주의!) -->
        <div id="realtime" class="inline">실시간검색어</div>

    </div>

    <!-- 도서분류메뉴(navbar) -->
    <nav class="navbar">
        <div class="container-fluid">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="#" class="nav-item">베스트도서</a></li>
                    <li><a href="#" class="nav-item">신간도서</a></li>
                    <li><a href="#" class="nav-item" id="internalbook">국내도서</a></li>
                    <li><a href="#" class="nav-item" id="externalbook">해외도서</a></li>
                    <li><a href="#" class="nav-item">E-Book</a></li>
                    <li><a href="#" class="nav-item">중고게시판</a></li>
                </ul>
            </div>
        </div>
    </nav>
    
    <!-- 국내도서 중분류 -->
	<div id="internalMCategory">
		<a href="/bj/book/in01/list01.do" class="">소설</a>
		<a href="/bj/book/in02/list01.do" class="">시/에세이</a>
		<a href="/bj/book/in03/list01.do" class="">경제/경영</a>
		<a href="/bj/book/in04/list01.do" class="">인문</a>
		<a href="/bj/book/in05/list01.do" class="">역사/문화</a>
		<a href="/bj/book/in06/list01.do" class="">종교</a>
		<a href="/bj/book/in07/list01.do" class="">정치/사회</a>
		<a href="/bj/book/in08/list01.do" class="">예술/대중문화</a>
		<a href="/bj/book/in09/list01.do" class="">과학</a>
		<a href="/bj/book/in10/list01.do" class="">기술/공학</a>
		<a href="/bj/book/in11/list01.do" class="">컴퓨터/IT</a>
		<a href="/bj/book/in12/list01.do" class="">유아/어린이/청소년</a>
		<a href="/bj/book/in13/list01.do" class="">참고서/교재</a>
		<a href="/bj/book/in14/list01.do" class="">취업/수험서</a>
		<a href="/bj/book/in15/list01.do" class="">외국어</a>
	</div>
	
	<!-- 해외도서 중분류 -->
	<div id="externalMCategory">
		<a href="/bj/book/ex01/list01.do" class="">서양도서</a>
		<a href="/bj/book/ex02/list01.do" class="">어린이/청소년</a>
		<a href="/bj/book/ex03/list01.do" class="">일본도서</a>
		<a href="/bj/book/ex04/list01.do" class="">기타언어권</a>
	</div>
    
</header>