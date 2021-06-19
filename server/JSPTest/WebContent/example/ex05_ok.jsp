<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//데이터 받기
	// - request.getParameter(String key)
	// - key : 태그의 name값
	
	//수신하기 전에 인코딩을 처리하기
	//클라이언트 -> 서버로 전송한 데이터에 대한 인코딩 -> 안하면 한글 깨짐
	request.setCharacterEncoding("UTF-8");
	
	String num = request.getParameter("num");
	String txt = request.getParameter("txt");
	
	String txt2 = request.getParameter("txt2");
	
	//POST
	//http://localhost:8090/JSPTest/example/ex05_ok.jsp
	
	//GET
	//http://localhost:8090/JSPTest/example/ex05_ok.jsp?num=22&txt=%ED%99%8D%EA%B8%B8%EB%8F%99
	// - 대략 4000바이트까지는 전송 가능 > 중요 : 소량의 데이터만
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex05_ok.jsp -->
	
	<h1>데이터 받기</h1>
	
	<div>num : <%= num %></div>
	<div>txt : <%= txt %></div>
	<div>txt2 : <%= txt2 %></div>
	
</body>
</html>