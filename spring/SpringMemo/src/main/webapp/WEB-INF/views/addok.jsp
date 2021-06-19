<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Memo</title>
<%@include file="/WEB-INF/views/inc/asset.jsp" %>

<style>
	
	.table th {
		width: 120px;
	}
	
	.table td {
		width: auto;
	}
	
	.table textarea {
		height: 150px;
		resize: none;
	}
	
</style>
</head>
<body>

	<div class="container">
	
		<h1 class="page-header">Spring Memo <small>메모 쓰기</small></h1>
		
		<div class="well">메모를 작성했습니다.</div>
			
		<div class="btns">
			<input type="button" value="목록" class="btn btn-primary" onclick="location.href='/memo/index.memo';">
		</div>
		
	</div>

	<script>
		
	</script>
</body>
</html>