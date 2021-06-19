<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.jsp.Ex04" %>
    
<%!
	
	//선언부
	// - 선언부에서 정의한 메서드는 재사용이 가능하지만.. 그 영역이 해당 JSP 페이지를 벗어날 수 없다.
	int a = 10;
	
	public int sum(int a, int b) {
		return a + b;
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex04_declaration.jsp -->
	
	<%
		//자바 영역 -> 지역(메서드)
		
		int m1 = 10;
		int m2 = 20;
		
	%>
	
	<%= sum(m1, m2) %>
	<%= Ex04.sum(m1, m2) %>
	
</body>
</html>