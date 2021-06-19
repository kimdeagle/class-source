<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex05.jsp -->
	<h1>입력폼</h1>
	
	<!-- "/spring" > Root Context -->
	<!-- spring project 생성 시 자동으로 /spring -->
	<form method="POST" action="/spring/ex05ok.action">
		숫자 : <input type="text" name="num">
		<input type="submit" value="전송">
	</form>
</body>
</html>