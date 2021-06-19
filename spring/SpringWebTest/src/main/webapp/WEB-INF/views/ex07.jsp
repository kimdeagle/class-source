<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력</h1>
	
	<form method="POST" action="/spring/ex07ok.action">
	
		<div>
			번호 : <input type="text" name="seq" value="5">
		</div>
		<div>
			이름 : <input type="text" name="name" value="홍길동">
		</div>
		<div>
			포인트 : <input type="text" name="point" value="1000">
		</div>
		<div>
			<input type="submit" value="보내기">
		</div>
	
		<input type="hidden" name="state" value="y">
		
	</form>
	
</body>
</html>