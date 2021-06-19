<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex05_form.jsp -->
	
	<h1>데이터 전송하기</h1>
	
	<h2>POST 방식으로 전송하기</h2>
	<form method="POST" action="ex05_ok.jsp">
		숫자 : <input type="text" name="num">
		<hr>
		문자 : <input type="text" name="txt">
		<hr>
		<textarea name="txt2"></textarea>
		<hr>
		<input type="submit" value="전송">
	</form>
	
	<h2>GET 방식으로 전송하기</h2>
	<form method="GET" action="ex05_ok.jsp">
		숫자 : <input type="text" name="num">
		<hr>
		문자 : <input type="text" name="txt">
		<hr>
		<textarea name="txt2"></textarea>
		<hr>
		<input type="submit" value="전송">
	</form>
	
	<hr>
	
	<h2>링크 사용하기 + 데이터 전달 = GET 방식 전송</h2>
	<a href="ex05_ok.jsp?num=123&txt=hong&txt2=java">ex05_ok.jsp 페이지로 이동하기</a>
	
	<hr>
	
	<h2>JavaScript 사용하기</h2>
	
	<button type="button" id="btn1">클릭하세요.</button>
	
	<script>
	
		document.getElementById("btn1").onclick = function() {
			
			//절대 공백 문자 사용 금지
			//?데이터 -> QueryString
			//url?key=value
			//url?key=value&key=value	
			location.href = "ex05_ok.jsp?num=111&txt=버튼&txt2=클릭했습니다.";
		};
	
	</script>
	
	
	
	
</body>
</html>








