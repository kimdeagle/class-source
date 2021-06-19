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
	#map {
		width: 100%;
		height: 450px;
	}
</style>
</head>
<body>
	<!-- ex01.jsp -->
	<!--
	
		AWS 교재
		- 지난번 프로젝트(JDBC)
		- 신용카드(Master, BC) or 금전적
	
		지도 API
		1. Google Map API(유료 or 무료)
		2. Naver Map API(유료)
		3. Daum(Kakao) Map API(무료)
	
	-->
	<div class="container">
		<h1 class="page-header">Kakao Map <small>기본 지도</small></h1>
		
		<div id="map"></div>
		
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5bb0e4ead8e9e418bd9f6cc7b9d22abf"></script>
	
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(36.990225, 127.937147),
			level: 3
		};
	
		var map = new kakao.maps.Map(container, options);
	</script>
	
</body>
</html>