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
	<!-- ex19_file_form.jsp -->
	<div class="container">
		<h1 class="page-header">파일 업로드</h1>
		
		<!--
			파일 업로드
			1. 반드시 <form> 사용
			2. method="POST"
			3. <form enctype=""> 지정
				- application/x-www-form-urlencoded : 문자열만 전송
				- multipart/form-data : 문자열 + 비문자열 전송
		-->
		<form method="POST" action="ex19_file_ok.jsp" enctype="multipart/form-data">
		
			<div class="well">
				<strong>문자열 : </strong>
				<input type="text" name="txt">
			</div>
			
			<div class="well">
				<strong>파일 : </strong>
				<input type="file" name="attach">
			</div>
			
			<div>
				<input type="submit" value="보내기" class="btn btn-default">
			</div>
		
		</form>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>