<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CodeStudy::Hello</title>

<%@include file="/WEB-INF/views/inc/asset.jsp"%>

<style>
</style>
</head>

<body>

	<!-- ########## 상단 헤더 시작 -->
	<%
		out.flush();
	    RequestDispatcher dheader = request.getRequestDispatcher("/inc/header.do");
	    dheader.include(request, response);
	%>
	<!-- ########## 상단 헤더 끝 -->


	<!-- ########## 본문 시작 -->
	<div class="main">

		<!-- ########## 좌측 시작 -->
		<div class="menu col-sm-12 col-md-3">
			<!-- ########## 메뉴 시작 -->
			<%
				out.flush();
			    RequestDispatcher dmenu = request.getRequestDispatcher("/inc/menu.do");
				dmenu.include(request, response);
			%>
			<!-- ########## 메뉴 끝 -->

			<!-- ########## 인증 시작 -->
			<%
				out.flush();
			    RequestDispatcher dauth = request.getRequestDispatcher("/inc/auth.do");
			    dauth.include(request, response);
			%>
			<!-- ########## 인증 끝 -->

			<!-- ########## 채팅 시작 -->
			<%
				out.flush();
			    RequestDispatcher dchat = request.getRequestDispatcher("/inc/chat.do");
				dchat.include(request, response);
			%>
			<!-- ########## 채팅 끝 -->
		</div>
		<!-- ########## 좌측 끝 -->



		<!-- ########## 내용 시작 -->
		<div class="content col-sm-12 col-md-9">
			<div>
				<h1>
					Ajax
				</h1>
				<div style="min-height: 747px">
					
					<div class="well" style="width: 300px;">
						<strong>아이디 : </strong>
						<input type="text" name="id" id="id" class="form-control">
						<input type="button" id="btn1" value="확인" class="btn btn-default">
					</div>
					<hr>
					
					<div class="alert alert-success" style="width: 300px;">
						<strong>결과 : </strong>
						<div id="result">${name}</div>
					</div>
					
					<hr>
					
					<div class="well" style="width: 300px;">
						<strong>하고 싶은 말 : </strong>
						<textarea class="form-control"></textarea>
					</div>
					
				</div>
			</div>
		</div>
		<!-- ########## 내용 끝 -->

	</div>
	<!-- ########## 본문 끝 -->

	<!-- ########## 하단 시작 -->
	<%@include file="/WEB-INF/views/inc/footer.jsp"%>
	<!-- ########## 하단 끝 -->

	<script>
	
		$("#btn1").click(function() {
			
			//ex01 : 아이디 -> (form + submit) -> ex02data.do -> 이름 반환 -> 화면 출력
			//ex02 : 아이디 -> (ajax) -> ex02data.do -> 이름 반환 -> 화면 출력
			
			//new XMLHttpRequest() <- 소켓 :: Ajax
			// -> Wrapping -> jQuery Ajax
			
			//$().fn() -> 특정 태그에 종속된 함수
			//$.fn() -> 전역 함수
			
			//<form method="POST" action="/codestudy/ajax/ex02data.do">
			
			$.ajax({
				type: "GET",
				url: "/codestudy/ajax/ex02data.do",
				//data: "num=100",
				data: "id=" + $("#id").val(),
				
				success: function(result) {
					//통신 성공 이벤트
					//alert(result);
					$("#result").text(result);
				},
				error: function(a, b, c) {
					//예외처리 이벤트
					console.log(a, b, c);
				}
			});
			
			
		});
	
    </script>
</body>

</html>