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
	<!-- hello.jsp > MVC - View(출력 업무) -->
	<div class="container">
		<h1 class="page-header">Hello</h1>
		<div>안녕하세요.</div>
		<div>
			<%= request.getAttribute("cup") %>
		</div>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>