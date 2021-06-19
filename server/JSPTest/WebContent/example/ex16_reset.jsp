<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%



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
	<!-- ex16_reset.jsp -->
	<div class="container">
		<h1 class="page-header">세션 객체 초기화</h1>
		
		<%
			//세션 객체 초기화 -> 기존의 세션 정보를 모두 삭제
			session.invalidate(); //객체를 새것으로 교환 - 신중하게
		%>
		
		<a href="ex16_session.jsp">시작 페이지</a>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>