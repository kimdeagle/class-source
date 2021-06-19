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
	
</style>
</head>
<body>

	<div class="container">
	
		<h1 class="page-header">Spring Memo <small>목록</small></h1>
		
		<table class="table table-bordered">
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>메모</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.seq}</td>
				<td>${dto.name}</td>
				<td>${dto.memo}</td>
				<td>${dto.regdate}</td>
			</tr>
			</c:forEach>
		</table>
		
		<div class="btns">
			<input type="button" value="쓰기" class="btn btn-primary" onclick="location.href='/memo/add.memo';">
		</div>
		
	</div>

	<script>
		
	</script>
</body>
</html>