<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//pageContext
	//1. 페이지 이동
	//2. 데이터 저장
	
	//response.sendRedirect(URL) vs pageContext.forward(URL)
	// - response > http://localhost:8090/jsp/example/ex09_two.jsp
	// - pageContext > http://localhost:8090/jsp/example/ex10_one.jsp
	
	//pageContext.forward("ex10_two.jsp");
	
	//자원 생성
	int num = 10;
	
	//페이지간의 데이터를 이동(전송)할 때 사용하는 도구
	// - pageContext, request, session, application
	// - setAttribute(), getAttribute()
	
	request.setAttribute("num", num);
	
	//forward 메서드를 통해 페이지를 이동할때 request, response 유지된다.
	pageContext.forward("ex10_two.jsp");
	//response.sendRedirect("ex10_two.jsp");

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
	<!-- ex10_one.jsp -->
	<div class="container">
		<h1 class="page-header">첫번째 페이지</h1>
		
		<a href="ex10_two.jsp">두번째 페이지로 이동하기</a>
	</div>
	
	<script>
	
	</script>	
	
</body>
</html>