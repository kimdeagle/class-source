<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/example/inc/asset.jsp" %>
<style>

	#tbl1 { width: 600px; }
	#tbl1 th { width: 120px; text-align: center; }
	#tbl1 td { width: 480px; }
	.sm { width: 120px; }
	.md { width: 250px; }
	.right { text-align: right; }
	.inline { display: inline; }
	
	input[type=radio]+span {
		margin-right: 15px;
	}

</style>
</head>
<body>
	<!-- ex07_form.jsp -->
	
	<div class="container">
	
		<h1 class="page-header">버튼 만들기</h1>
		
		<form method="POST" action="ex07_ok.jsp">
		
			<table id="tbl1" class="table table-bordered">
				<tr>
					<th>너비(px)</th>
					<td><input type="number" name="width" min="20" max="300" step="10" value="60" class="form-control sm right"></td>
				</tr>
				<tr>
					<th>높이(px)</th>
					<td><input type="number" name="height" min="10" max="200" step="10" value="30" class="form-control sm right"></td>
				</tr>
				<tr>
					<th>텍스트</th>
					<td><input type="text" name="text" class="form-control md" value="Button"></td>
				</tr>
				<tr>
					<th>배경색</th>
					<td><input type="color" name="backgroundcolor" value="#FFFFFF" class="form-control sm"></td>
				</tr>
				<tr>
					<th>글자색</th>
					<td><input type="color" name="color" value="#000000" class="form-control sm"></td>
				</tr>
				<tr>
					<th>글자 크기(px)</th>
					<td><input type="number" name="fontsize" min="10" max="100" value="16" class="form-control sm right"></td>
				</tr>
				<tr>
					<th>버튼 개수</th>
					<td><input type="number" name="count" min="1" max="30" value="1" class="form-control sm right"></td>
				</tr>
				<tr>
					<th>아이콘</th>
					<td>
						<input type="radio" name="icon" value="none"> 없음
						<input type="radio" name="icon" value="glyphicon glyphicon-heart"> <span class="glyphicon glyphicon-heart"></span>
						<input type="radio" name="icon" value="glyphicon glyphicon-star"> <span class="glyphicon glyphicon-star"></span>
						<input type="radio" name="icon" value="glyphicon glyphicon-cog"> <span class="glyphicon glyphicon-cog"></span>
						<input type="radio" name="icon" value="glyphicon glyphicon-list-alt"> <span class="glyphicon glyphicon-list-alt"></span>
						<input type="radio" name="icon" value="glyphicon glyphicon-comment"> <span class="glyphicon glyphicon-comment"></span>						
					</td>
				</tr>
			</table>
			
			<input type="submit" value="Create" class="btn btn-primary">
		
		</form>
	
	</div>
	
</body>
</html>