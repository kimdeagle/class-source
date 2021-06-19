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
		
		<form method="POST" action="/memo/addok.memo">
			<table class="table table-bordered">
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" class="form-control" required></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="memo" class="form-control" required></textarea></td>
				</tr>
			</table>
			
			<div class="btns">
				<input type="submit" value="쓰기" class="btn btn-primary">
				<input type="button" value="취소" class="btn btn-default" onclick="location.href='/memo/index.memo';">
			</div>
		</form>
		
	</div>

	<script>
		
	</script>
</body>
</html>