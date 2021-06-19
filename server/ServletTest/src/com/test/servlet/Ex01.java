package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. 서블릿 클래스 선언하기
//a. javax.servlet.http.HttpServlet 클래스 상속
public class Ex01 extends HttpServlet {

	//2. doGet/doPost 메서드 선언
	//	a. 매개 변수 작성(2개)
	//	1. javax.servlet.http.HttpServletRequest
	//	2. javax.servlet.http.HttpServletResponse
	//	b. 예외 미루기(2개)
	//	1. java.io.IOException
	//	2. java.servlet.ServletException
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//3. 동적 HTML 문서 작성
		// - PrintWriter를 사용해서 브라우저에게 돌려줄 HTML 소스를 작성한다.
		PrintWriter writer = response.getWriter();
		
		Calendar c = Calendar.getInstance();
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Dynamic Web Page</h1>");
		
		if (c.get(Calendar.HOUR_OF_DAY) < 12) {
			//오전
			writer.printf("%tF AM Hello~", c);			
		} else {
			//오후
			writer.printf("%tF PM Bye~", c);			
		}
		
		writer.println("</body>");
		writer.println("</html>");
		
		//반드시 스트림을 닫는다.(*****) 이 작업이 제대로 실행되지 않으면 브라우저에게 돌려줄 페이지가 완성이 안된다.
		writer.close();
		
		//브라우저가 자바 파일을 요청한 상황
		// - 자바는 웹에서 호출가능한 포맷이 아니다. 불가능하다.
		//http://localhost:8090/ServletTest/servlet/com.test.servlet.Ex01
		
		//4. 가상 주소 매핑
		// - 프로젝트 우클릭 -> 메뉴중 하단쪽에 Java EE Tools > Generate Deployment Descriptor Stub
		// - WEB-INF 폴더에 web.xml 파일 생성
		
	}
	
}
