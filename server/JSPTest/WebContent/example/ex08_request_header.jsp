<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex08_request_header.jsp -->
	
	<h1>HTTP 요청 메시지 헤더 정보</h1>
	
	<table border>
		<tr>
			<th>헤더명</th>
			<th>헤더값</th>
		</tr>
		<%
			//HTTP 요청 메시지 헤더 정보
			// - 브라우저가 서버에게 페이지를 요청할 때 같이 전송되는 정보들..
		
			//localhost:8090
			request.getHeader("host");
			
			//request.getHeader("key -> headerName")
			Enumeration<String> e = request.getHeaderNames();
		
			while (e.hasMoreElements()) {
				String name = e.nextElement();
				System.out.println(name);
		%>
		<tr>
			<td><%= name %></td>
			<td></td>
		</tr>
		<%
			}
		%>
	</table>
	
	<p>서버 도메인명 : <%= request.getServerName() %></p>
	<p>서버 포트번호 : <%= request.getServerPort() %></p>
	<p>요청 URL : <%= request.getRequestURL() %></p>
	<p>요청 쿼리 : <%= request.getQueryString() %></p>
	<p>클라이언트 호스트 : <%= request.getRemoteHost() %></p>
	<p>클라이언트 IP : <%= request.getRemoteAddr() %></p>
	<p>프로토콜 : <%= request.getProtocol() %></p>
	<p>요청 방식 : <%= request.getMethod() %></p>
	<p>컨텍스트 루트 경로 : <%= request.getContextPath() %></p>
	
	<p>/jsp/example/ex08.jsp</p>
	<p><%= request.getContextPath()%>/example/ex08.jsp</p>
	
</body>
</html>