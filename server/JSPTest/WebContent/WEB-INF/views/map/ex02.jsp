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
	<!-- ex02.jsp -->
	<div class="container">
		<h1 class="page-header">Kakao Map <small>지도 좌표 이동하기 + 레벨 바꾸기</small></h1>
		
		<div id="map"></div>
		
		<hr>
		
		<div>
			<div class="btn-group">
				<input type="button" value="경복궁으로 이동하기" class="btn btn-default" id="btn1">
				<input type="button" value="역삼역으로 이동하기" class="btn btn-default" id="btn2">
				<input type="button" value="강남역으로 이동하기" class="btn btn-default" id="btn3">
			</div>
			
			<div class="btn-group">
				<input type="button" value="확대하기" class="btn btn-default" id="btn4">
				<input type="button" value="축소하기" class="btn btn-default" id="btn5">
			</div>
		</div>
		
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5bb0e4ead8e9e418bd9f6cc7b9d22abf"></script>
	
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(36.990225, 127.937147),
			level: 3
		};
	
		var map = new kakao.maps.Map(container, options);
		
		//지도 드래그 금지
		map.setDraggable(false);
		
		//지도 확대/축소 금지
		map.setZoomable(false);
		
		
		//지도 좌표(중심점) 이동하기
		$("#btn1").click(function() {
			//좌표 객체 생성
			var p1 = new kakao.maps.LatLng(37.578007, 126.976957);
			
			//map.setCenter(p1);
			map.panTo(p1);
		});
		
		$("#btn2").click(function() {
			//좌표 객체 생성
			var p1 = new kakao.maps.LatLng(37.500620, 127.036395);
			
			//map.setCenter(p1);
			map.panTo(p1);
		});
		
		$("#btn3").click(function() {
			//좌표 객체 생성
			var p1 = new kakao.maps.LatLng(37.497927, 127.027647);
			
			//map.setCenter(p1);
			map.panTo(p1);
		});
		
		$("#btn4").click(function() {
			//확대하기(1~14)
			map.setLevel(map.getLevel() - 1);
		});
		
		$("#btn5").click(function() {
			//축소하기(1~14)
			map.setLevel(map.getLevel() + 1);
		});
		
	</script>
	
</body>
</html>