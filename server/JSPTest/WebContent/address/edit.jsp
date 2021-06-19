<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.address.DBUtil" %>
<%@ page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	//edit.jsp?seq=1
	//1. 데이터 가져오기(seq)
	//2. DB 작업 > select
	//3. 결과를 페이지의 입력 컨트롤 기본값으로 적용하기
	
	//1.
	String seq = request.getParameter("seq"); //수정할 레코드의 PK
	
	//2.
	Connection conn = DBUtil.open();
	
	String sql = "select * from tblAddress where seq = ?";
	
	PreparedStatement stat = conn.prepareStatement(sql);
	stat.setString(1, seq);
	
	ResultSet rs = stat.executeQuery();
	
	String name = "";
	String age = "";
	String address = "";
	String gender = "";
	String tel = "";
	
	if (rs.next()) {
		name = rs.getString("name");
		age = rs.getString("age");
		address = rs.getString("address");
		gender = rs.getString("gender");
		tel = rs.getString("tel");		
	}
	
	rs.close();
	stat.close();
	conn.close();

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
	<!-- template.jsp > add.jsp > edit.jsp -->
	<div class="container">

		<%@include file="/address/inc/header.jsp" %>		
		<div class="content">
			
			<h2>주소록 수정하기</h2>
			
			<form method="POST" action="/jsp/address/editok.jsp">
				<table class="table table-bordered" id="tbl">
					<tr>
						<th>이름</th>
						<td><input type="text" name="name" id="name" required class="form-control short"></td>
					</tr>
					<tr>
						<th>나이</th>
						<td><input type="number" name="age" id="age" required class="form-control short" min="10" max="100"></td>
					</tr>
					<tr>
						<th>주소</th>
						<td><input type="text" name="address" id="address" required class="form-control"></td>
					</tr>
					<tr>
						<th>성별</th>
						<td>
						<select name="gender" id="gender" class="form-control short">
							<option value="m">남자</option>
							<option value="f">여자</option>
						</select>
						</td>
					</tr>
					<tr>
						<th>연락처</th>
						<td><input type="text" name="tel" id="tel" required class="form-control medium"></td>
					</tr>
				</table>
				
				<div class="btns">
					<input type="button" value="돌아가기" class="btn btn-default" onclick="location.href='/jsp/address/list.jsp';">
					<input type="submit" value="수정하기" class="btn btn-success">
				</div>
				
				<input type="hidden" name="seq" value="<%= seq %>">
				
			</form>
			
		</div>
		<%@include file="/address/inc/footer.jsp" %>
		
	</div>
	
	<script>
	
		$("#name").val("<%= name %>");
		$("#age").val("<%= age %>");
		$("#address").val("<%= address %>");
		$("#gender").val("<%= gender %>");
		$("#tel").val("<%= tel %>");
	
	</script>
	
</body>
</html>