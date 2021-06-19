<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex03_scriptlet.jsp -->
	
	<%
	
		//자바 코드 영역
		int a = 10;
		int b = 20;
		int c = a + b;
	
	%>
	결과: <%= c %>
	
	<hr>
	
	<%
	
		String txt = "<input type='text'>";
	
	%>
	
	<%= txt %>
	
	<hr>
	
	<h1>구구단</h1>
	
	<%
		String temp = "";
		for (int i=1; i<=9; i++) {
			temp += String.format("<div>5 x %d = %d</div>", i, 5*i);
		}
	%>
	
	<%= temp %>
	
	
	<h1>구구단</h1>
	
	<%
		//스파게티 코드
		for (int i=1; i<=9; i++) {
	%>
		<div>5 x <%= i %> = <%= 5 * i %></div>
	<%
		}
	%>
	
	JSP 주석
	<%-- <%= sum(a, b) %> --%>
	
	
</body>
</html>