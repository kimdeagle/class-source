<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//response 객체 : 페이지 이동하기
	
	//1. HTML
	// - <a href="URL">
	// - 사용자 클릭을 통해서
	
	//2. JavaScript
	// - location.href = "URL"
	// - 자유롭게 프로그램 제어 가능
	// - 클라이언트측 제어
	
	//3. Servlet/JSP
	// - response.sendRedirect("URL")
	// - 자유롭게 프로그램 제어 가능
	// - 서버측 제어
	
	response.sendRedirect("ex09_two.jsp");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/example/inc/asset.jsp" %>
<style>

</style>
</head>
<body>
	<!-- ex09_one.jsp -->
	<div class="container">
		<h1 class="page-header">첫번째 페이지</h1>
		
	</div>
	
	<script>
		//location.href="ex09_two.jsp";
	</script>	
	
</body>
</html>