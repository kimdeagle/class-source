<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0); //누적 변수 역할
	}
	
	session.setAttribute("count", (int)session.getAttribute("count") + 1);
	
	
	if (application.getAttribute("count") == null) {
		application.setAttribute("count", 0); //누적 변수 역할
	}
	
	application.setAttribute("count", (int)application.getAttribute("count") + 1);

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
	<!-- ex16.jsp -->
	<div class="container">
		<h1 class="page-header">session vs application</h1>
		
		<div>count : <%= session.getAttribute("count") %></div>
		<div>count : <%= application.getAttribute("count") %></div>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>