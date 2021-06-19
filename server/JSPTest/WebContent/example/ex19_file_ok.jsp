<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//1. 데이터 가져오기
	//	1.a 문자열 -> request.getParameter()
	//	1.b 파일 -> ??? -> 외부 라이브러리 사용 -> cos.jar -> MultipartRequest 사용
	
	//<form enctype="multipart/form-data">
	// - request.getParameter() 동작 불가능;;
	
	//MultipartRequest 클래스(객체)
	// - request의 기능을 그대로 구현
	// - 파일 업로드 기능 추가 구현
	
	request.setCharacterEncoding("UTF-8");
	
	//String txt = request.getParameter("txt");
	//System.out.println(txt);
	
	//업로드된 파일이 저장될 폴더의 위치를 지정(로컬 + 절대 경로로 지정)
	// - WebContent > example > files
	// - D:\class\server\JSPTest\WebContent\example\files -> XXX
	String path = application.getRealPath("/example/files");
	
	//D:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\files
	//System.out.println(path);
	
	//업로드 파일의 최대 크기 지정(제한)
	// - 바이트
	int size = 1024 * 1024 * 100; //100MB
	
	//변수 선언
	String txt = ""; //텍스트 입력값
	String filename = ""; //첨부 파일명
	String orgfilename = ""; //첨부 파일명
	
	try {
		
		//MultipartRequest 객체 생성
		// - 객체 생성 순간 파일 업로드도 동시에 처리된다.(******)
		MultipartRequest multi = new MultipartRequest(
									request, //원래 request
									path, //업로드 위치
									size, //최대 크기
									"UTF-8", //인코딩 지정
									new DefaultFileRenamePolicy() //파일명 관리 객체
								);
		
		//데이터 가져오기
		txt = multi.getParameter("txt");
		
		//업로드O -> 파일 정보(이름) 가져오기
		filename = multi.getFilesystemName("attach");
		orgfilename = multi.getOriginalFileName("attach");
		
	} catch (Exception e) {
		System.out.println(e);
	}

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
	<!-- ex19_file_ok.jsp -->
	<div class="container">
		<h1 class="page-header">결과</h1>
		
		<div class="well">
			<strong>문자열 : </strong>
			<%= txt %>
		</div>
		
		<div class="well">
			<strong>파일명 : </strong>
			<%= filename %>
		</div>
		
		<div class="well">
			<strong>파일명 : </strong>
			<%= orgfilename %>
		</div>
		
		<hr>
		
		
		<h2>파일 다운로드</h2>
		
		<div>
			<a href="/jsp/example/files/<%= filename %>"><%= filename %></a>
		</div>
		
		<div>
			<a href="download.jsp?filename=<%= filename %>&orgfilename=<%= orgfilename %>"><%= orgfilename %></a>
		</div>
		
		<div>
			<a href="/jsp/example/files/<%= filename %>" download><%= filename %></a>
		</div>
		
	</div>
	
	<script>
	
	</script>
	
</body>
</html>