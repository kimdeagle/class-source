<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex01.jsp -->
	
	<h1>현재 시간</h1>
	
	<%
	
		//자바 코드
		Calendar c = Calendar.getInstance();
		
		String time = String.format("%tT", c);
	
	%>
	
	<div><%= time %></div>
	
	<%@include file="inc/copyright.jsp" %>
	
</body>
</html>