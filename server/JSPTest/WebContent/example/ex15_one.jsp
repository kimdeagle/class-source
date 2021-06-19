<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//one + 데이터 입력 -> (데이터 전달) -> two + 데이터 처리 -> (결과 통보) -> three + 메시지 출력
	//one -> two -> three :: 이 과정에 데이터를 계속 유지(*****)
	
	//1. 일반 변수 사용
	int a = 10;
	
	//3. pageContext 사용
	pageContext.setAttribute("c", 30);
	
	//4. request 사용
	request.setAttribute("d", 40);
	
	//5. session 사용
	session.setAttribute("e", 50);
	
	//6. application 사용
	application.setAttribute("f", 60);

%>
<%!
	//선언부
	//2. 멤버 변수 사용
	public int b = 20;
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
	<!-- ex15_one.jsp -->
	<div class="container">
		<h1 class="page-header">첫번째 페이지</h1>
		
		<a href="ex15_two.jsp">두번째 페이지로 이동</a>
	</div>
	
	<%
		//response.sendRedirect("ex15_two.jsp");
		//pageContext.forward("ex15_two.jsp");
	%>
	
	<script>
		//location.href="ex15_two.jsp";
	</script>
	
</body>
</html>