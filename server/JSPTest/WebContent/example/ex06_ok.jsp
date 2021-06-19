<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//출력과 관계없는 자바코드는 주로 페이지 상단에서 작업 > 코드 분리 > 가독성
	//request.getParameter(String key)
	
	//전송한 데이터의 인코딩 처리
	// - 클라이언트가 전송한 데이터가 항상 깨지는 것이 아니다.
	// - GET 안깨짐, POST 깨짐
	// - 웹서버(Apache Tomcat) -> 7.0 이전까지는 EUC-KR 사용 -> 8.0 이후부터 UTF-8 사용
	
	//POST 전송 + 한글일 때만
	request.setCharacterEncoding("UTF-8");

	//텍스트 박스
	String txt1 = request.getParameter("txt1");
	
	//getParameter(String key)
	// - key값의 컨트롤이 존재하면서 + 값을 입력하면 -> 입력값 반환
	// - key값의 컨트롤이 존재하면서 + 값을 입력안하면 -> 빈문자열 반환
	// - key값의 컨트롤이 존재 안하면 -> null 반환
	
	//System.out.println(txt1 == null);
	//System.out.println(txt1 == "");
	
	//암호 박스
	String txt2 = request.getParameter("txt2");
	
	//다중 텍스트 박스
	String txt3 = request.getParameter("txt3");
	
	//개행문자 -> 화면 출력 -> <br> 치환
	txt3 = txt3.replace("\r\n", "<br>");
	
	
	//체크 박스
	//1. value 없을 때
	// - 체크O : "on" 반환(예약어)
	// - 체크X : null 반환
	
	//2. value 있을 때(권장***)
	// - 체크O : value 반환
	// - 체크X : null 반환
	
	String cb1 = request.getParameter("cb1");
	String cb2 = request.getParameter("cb2");
	
	
	//1. String request.getParameter(key) -> 단일값 반환
	//2. String[] request.getParameterValues(key) -> 다중값 반환
	
	//체크 박스들
	//String cbs = request.getParameter("cbs");
	//System.out.println(cbs);
	
	String[] cbs = request.getParameterValues("cbs");
	
	
	//라디오 버튼 - 단일값만 넘어오기 때문에 getParameter로 받는다.
	String rb = request.getParameter("rb");
	
	
	//셀렉트 박스
	String sel1 = request.getParameter("sel1");
	
	//셀렉트 박스(다중 선택)
	String[] sel2 = request.getParameterValues("sel2");
	
	
	//히든 태그
	String id = request.getParameter("id");
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/example/inc/asset.jsp" %>
</head>
<body>
	<!-- ex06_ok.jsp -->

	<div class="container">
	
		<h1 class="page-header">전송 결과</h1>
		
		<h2>텍스트 박스</h2>
		<div><%= txt1 %></div>
		
		<h2>암호 박스</h2>
		<div><%= txt2 %></div>
		
		<h2>다중 텍스트 박스</h2>
		<div><%= txt3 %></div>
		
		<h2>체크 박스</h2>
		<div><%= cb1 %></div>
		<div><%= cb2 %></div>
		
		<h2>체크 박스들</h2>
		<% for(int i=0; cbs!=null && i<cbs.length; i++) { %>
		<div><%= cbs[i] %></div>
		<% } %>
		
		<h2>라디오 버튼</h2>
		<div><%= rb %></div>
		
		<h2>셀렉트 박스</h2>
		<div><%= sel1 %></div>
		
		<h2>셀렉트 박스(다중 선택)</h2>
		<div><%= Arrays.toString(sel2) %></div>
		
		<h2>히든 태그</h2>
		<div><%= id %></div>
		
	</div>

</body>
</html>