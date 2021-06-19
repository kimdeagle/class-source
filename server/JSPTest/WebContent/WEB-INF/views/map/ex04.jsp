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
	
	#plist > div {
		margin: 7px 10px;
		cursor: pointer;
		border-bottom: 1px dashed #CCC;
	}
</style>
</head>
<body>
	<!-- ex04.jsp -->
	<div class="container">
		<h1 class="page-header">Kakao Map <small>기본 지도</small></h1>
		
		<table class="table table-bordered">
			<tr>
				<td style="width: 80%;"><div id="map"></div></td>
				<td style="width: 20%;" id="plist"></td>
			</tr>
		</table>
		
		
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5bb0e4ead8e9e418bd9f6cc7b9d22abf"></script>
	
	<script src="/jsp/js/data.js"></script>
	
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(37.499355, 127.033217),
			level: 3
		};
	
		var map = new kakao.maps.Map(container, options);
		
		//------------------------------
		
		list.forEach(function(item, index) {
			$("#plist").append("<div data-index='"+ index +"'><span class='glyphicon glyphicon-pushpin'>"+ item.name +"</div>");
		});
		
		var selMarker;
		
		$("#plist > div").click(function() {
			//alert($(this).text());
			//alert($(this).data("index"));
			//alert(list[$(this).data("index")].name);
			//alert(list[$(this).data("index")].position.lat);
			//alert(list[$(this).data("index")].position.lng);
			
			if (selMarker != null) {
				selMarker.setMap(null);
			}
			
			let m = new daum.maps.LatLng(list[$(this).data("index")].position.lat, list[$(this).data("index")].position.lng)
			
			selMarker = new daum.maps.Marker({
				position: m
			});
			
			selMarker.setMap(map);
			map.panTo(m);
			
		});
		
	</script>
	
</body>
</html>