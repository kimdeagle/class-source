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
	<!-- ex16_session.jsp -->
	<div class="container">
		<h1 class="page-header">세션, Session</h1>
		
		<a href="ex16_set.jsp">세션값 저장하기</a>
		<a href="ex16_del.jsp">세션값 삭제하기</a>
		<a href="ex16_reset.jsp">세션 객체 초기화하기</a>
		<a href="ex16_interval.jsp">세션 만료 시간 지정하기</a>
		
		<h2>세션 정보</h2>
		
		<div>Session ID : <%= session.getId() %></div>
		<div>Session Creation Time : <%= session.getCreationTime() %></div>
		<div>Session Max Inactive Interval : <%= session.getMaxInactiveInterval() %></div>
		<div>Session isNew : <%= session.isNew() %></div>
		<div>Session Data : <%= session.getAttribute("data") %></div>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>