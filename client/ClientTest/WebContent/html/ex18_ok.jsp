<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String age = request.getParameter("age");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>결과</h1>
	
	<div>이름 : <%= name %></div>
	<div>나이 : <%= age %></div>

</body>
</html>