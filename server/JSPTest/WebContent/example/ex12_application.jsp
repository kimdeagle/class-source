<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/example/inc/asset.jsp" %>
<style>

</style>
</head>
<body>
	<!-- ex12_application.jsp -->
	<div class="container">
	
		<h1 class="page-header">application 객체</h1>
		
		<h2>컨테이너 정보 - Servlet 컨테이너, JSP 컨테이너 -> 톰캣</h2>
		<div><%= application.getServerInfo() %></div>
		
		<div><%= application.getContextPath() %></div>
		<div><%= request.getContextPath() %></div>
		<div><%= application.getServletContextName() %></div>
		
		<!--
			getRealPath()
			- 인자값(상대경로) -> 로컬 물리 경로 변환
			
			D:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\ex12_application.jsp
			
			아파치 톰캣
			- 워크스페이스에 있는 원본 소스를 직접 실행(사용)하지 않고 항상 자신이 지정한 특정 폴더에 원본의 복사본을 만들어서 복사본을 실행한다.
			- 대상 : *.html, *.css, *.js, *.java, *.jsp, 이미지 등 모든 파일..
			
		-->
		<div><%= application.getRealPath("ex12_application.jsp") %></div>
		
		<hr>
		
		<!-- 서블릿과 JSP는 컨테이너 버전에 따라 달라진다. -->
		<h2>서블릿 버전</h2>
		<div><%= application.getMajorVersion() %>.<%= application.getMinorVersion() %></div>
		
		<h2>JSP 버전</h2>
		<div><%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %></div>
		
	</div>
	
	<script>
	
	</script>	
	
</body>
</html>