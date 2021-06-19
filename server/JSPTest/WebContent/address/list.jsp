<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.address.DBUtil" %>
<%@ page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	//1. DB 작업 > select
	//2. 결과셋 > 화면 출력
	
	Connection conn = DBUtil.open();
	
	String sql = "select * from tblAddress order by seq desc";
	
	Statement stat = conn.createStatement();
	
	ResultSet rs = stat.executeQuery(sql);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address</title>
<%@include file="/address/inc/asset.jsp" %>
<style>
	#tbl th {
		text-align: center;
		vertical-align: middle;
		background-color: #EEE;
	}
	#tbl td {
		text-align: center;
		font-size: 12px;
	}
	
	#tbl td input {
		font-size: 12px;
	}
	
	#tbl th:nth-child(1) { width: 60px; }
	#tbl th:nth-child(2) { width: 70px; }
	#tbl th:nth-child(3) { width: 60px; }
	#tbl th:nth-child(4) { width: 60px; }
	#tbl th:nth-child(5) { width: 130px; }
	#tbl th:nth-child(6) { width: 190px; }
	#tbl th:nth-child(7) { width: 100px; }
	
	#tbl td:nth-child(6) { text-align: left; }
</style>
</head>
<body>
	<!-- template.jsp > list.jsp -->
	<div class="container">

		<%@include file="/address/inc/header.jsp" %>		
		<div class="content">
			
			<h2>주소록 목록보기</h2>
			
			<table class="table table-bordered" id="tbl">
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>나이</th>
					<th>성별</th>
					<th>연락처</th>
					<th>주소</th>
					<th>조작</th>
				</tr>
				<%
					while (rs.next()) {
				%>
				<tr>
					<td><%= rs.getString("seq") %></td>
					<td><%= rs.getString("name") %></td>
					<td><%= rs.getString("age") %></td>
					<%-- <td><%= rs.getString("gender").equals("m") ? "남자" : "여자" %></td> --%>
					<td>
						<%
							//if (rs.getString("gender").equals("m")) {
							//	out.print("<img src='/jsp/address/images/gender_m.png'>");
							//} else {
							//	out.print("<img src='/jsp/address/images/gender_f.png'>");
							//}
						%>
						
						<img src='/jsp/address/images/gender_<%= rs.getString("gender") %>.png' style="width: 55px;">
						
					</td>
					<td><%= rs.getString("tel") %></td>
					<td><%= rs.getString("address") %></td>
					<td>
						<input type="button" value="edit" class="btn btn-default" onclick="edit(<%= rs.getString("seq") %>);">
						<input type="button" value="delete" class="btn btn-default" onclick="del(<%= rs.getString("seq") %>);">
					</td>
				</tr>
				<%
					}
				%>
			</table>
			
			<div class="btns">
				<input type="button" value="작성하기" class="btn btn-success" onclick="location.href='/jsp/address/add.jsp';">
			</div>
			
		</div>
		<%@include file="/address/inc/footer.jsp" %>
		
	</div>
	
	<script>
		function edit(seq) {
			location.href = "/jsp/address/edit.jsp?seq=" + seq;
		}
		
		function del(seq) {
			location.href = "/jsp/address/del.jsp?seq=" + seq;
		}
	</script>
	
</body>
</html>