<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//1. 데이터 가져오기
	//2. 업무 처리
	//3. 버튼 출력
	
	//1.
	request.setCharacterEncoding("UTF-8");
	
	String width = request.getParameter("width");
	String height = request.getParameter("height");
	
	String text = request.getParameter("text");
	
	String backgroundcolor = request.getParameter("backgroundcolor");
	String color = request.getParameter("color");
	
	String fontsize = request.getParameter("fontsize");
	
	int count = Integer.parseInt(request.getParameter("count"));
	
	String icon = request.getParameter("icon");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/example/inc/asset.jsp" %>
<style>
	.mybtn {
		width: <%= width %>px;
		height: <%= height %>px;
		background-color: <%= backgroundcolor %>;
		color: <%= color %>;
		font-size: <%= fontsize %>px;
	}
</style>
</head>
<body>
	<!-- ex07_ok.jsp -->
	
	<div class="container">
		
		<h1 class="page-header">결과</h1>
		<%-- <button class="mybtn" style="width: <%= width %>px; height: <%= height %>px;">Button</button> --%>
		<% for (int i=0; i<count; i++) { %>
			<button class="mybtn">
			
			<% if(!icon.equals("none")) { %>
			<span class="<%= icon %>"></span>
			<% } %>
			<%= text %>
			
			</button>		
		<% } %>
		
	</div>
	
</body>
</html>