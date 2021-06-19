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
	<!-- ex03.jsp -->
	<div class="container">
		<h1 class="page-header">Kakao Map <small>클릭 이벤트 + 마커 표시</small></h1>
		
		<div id="map"></div>
		
		<hr>
		
		<div id="msg" class="well"></div>
		
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5bb0e4ead8e9e418bd9f6cc7b9d22abf"></script>
	<script src="/jsp/js/data.js"></script>
	
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(36.990225, 127.937147),
			level: 3
		};
	
		var map = new kakao.maps.Map(container, options);
		
		//-------------------------------------------------------------
		
		let marker1;
		
		daum.maps.event.addListener(map, "click", function(evt) {
			//alert();
			
			//지도 클릭 > 좌표?
			//$("#msg").text(evt.latLng);
			$("#msg").text("클릭한 위치 : 위도 "+ evt.latLng.getLat() +", 경도 "+ evt.latLng.getLng());
			
			
			//마커 생성 전 -> 기존에 마커가 있으면 제거
			if (marker1 != null) {
				//alert("마커 있음");
				marker1.setMap(null); //맵에서 마커 제거
			}
			
			//좌표 -> 마커 생성 + 표시
			marker1 = new daum.maps.Marker({
				position: new daum.maps.LatLng(evt.latLng.getLat(), evt.latLng.getLng())
			});
			
			marker1.setMap(map); //맵에 마커 등록
			
			
		});
		
		//-----------------------------------------------------------------
		
		list.forEach(function(item, index) {
			//console.log(item.name, item.position.lat, item.position.lng);
			
			var m = new daum.maps.Marker({
				position: new daum.maps.LatLng(item.position.lat, item.position.lng)
			});
			
			m.setMap(map);
			
		});
		
		</script>
	
</body>
</html>