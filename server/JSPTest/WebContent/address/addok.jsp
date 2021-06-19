<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.address.DBUtil" %>
<%@ page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	//1. 데이터 가져오기
	//2. DB 작업 > insert
	//3. 결과 출력
	//	3.1 성공 > list.jsp 이동
	//	3.2 실패 > add.jsp 이동
	
	//1.
	request.setCharacterEncoding("UTF-8");
	
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String address = request.getParameter("address");
	String gender = request.getParameter("gender");
	String tel = request.getParameter("tel");
	
	//System.out.println(name);
	//System.out.println(tel);
	
	//2.
	Connection conn = DBUtil.open();
	
	String sql = "insert into tblAddress values(seqAddress.nextVal, ?, ?, ?, ?, ?)";
	
	PreparedStatement stat = conn.prepareStatement(sql);
	
	stat.setString(1, name);
	stat.setString(2, age);
	stat.setString(3, address);
	stat.setString(4, gender);
	stat.setString(5, tel);
	
	int result = stat.executeUpdate();
	
	stat.close();
	conn.close();
	
	//EL, JSTL 사용하기 위해 넣기
	pageContext.setAttribute("result", result);
	
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address</title>
<%@include file="/address/inc/asset.jsp" %>
<style>

</style>
</head>
<body>
	<!-- template.jsp > addok.jsp -->
	<div class="container">

		<%@include file="/address/inc/header.jsp" %>		
		<div class="content">
			
		</div>
		<%@include file="/address/inc/footer.jsp" %>
		
	</div>
	
	<script>
		
		<c:if test="${result == 1}">
		alert("성공");
		location.href = "/jsp/address/list.jsp";
		</c:if>
		
		<c:if test="${result == 0}">
		alert("실패");
		location.href = "/jsp/address/add.jsp";
		</c:if>
	
	</script>
	
</body>
</html>