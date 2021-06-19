<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.address.DBUtil" %>
<%@ page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	//del.jsp?seq=1
	//1. 데이터 가져오기(seq)
	//2. 질문?
	
	//1.
	String seq = request.getParameter("seq"); //삭제할 레코드의 PK

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address</title>
<%@include file="/address/inc/asset.jsp" %>
<style>

	#tbl th {
		width: 120px;
		text-align: center;
		vertical-align: middle;
		background-color: #EEE;
	}
	
	#tbl td {
		width: 550px;
	}
	
</style>
</head>
<body>
	<!-- template.jsp > add.jsp > edit.jsp > del.jsp -->
	<div class="container">

		<%@include file="/address/inc/header.jsp" %>		
		<div class="content">
			
			<h2>주소록 삭제하기</h2>
			
			<form method="POST" action="/jsp/address/delok.jsp">
				
				<div class="btns">
					<input type="button" value="돌아가기" class="btn btn-default" onclick="location.href='/jsp/address/list.jsp';">
					<input type="submit" value="삭제하기" class="btn btn-success">
				</div>
				
				<input type="hidden" name="seq" value="<%= seq %>">
				
			</form>
			
		</div>
		<%@include file="/address/inc/footer.jsp" %>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>