<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//현재 페이지 몇 번 방문 -> 카운트 -> 누적 변수
	
	//jsp 페이지의 모든 자원은 페이지 소멸(브라우저에게 반환)시 전부 같이 소멸된다.
	// -> 웹이라는 환경은 상태 지속 불가능
	// -> 지속 가능 기술 제공(***)
	int num = 0;
	
	num = num + 1;
	
	//session 객체
	// - 상태 유지(지속) 기술
	// - 타이머가 있다. 기본 30분. 설정 가능
	
	if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0); //누적 변수 역할
	}
	
	session.setAttribute("count", (int)session.getAttribute("count") + 1);
	
	
	

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
	<!-- ex14_session.jsp -->
	<div class="container">
		<h1 class="page-header">Count</h1>
		
		<div>num : <%= num %></div>
		<div>count : <%= session.getAttribute("count") %></div>
	</div>
	
	<script>
	
	</script>
	
</body>
</html>