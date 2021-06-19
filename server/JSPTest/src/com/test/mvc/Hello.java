package com.test.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. 서블릿
public class Hello extends HttpServlet {

	//2. doGet/doPost 구현
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//3. PrintWriter 페이지 만들기 -> X
		
		//3. JSP 페이지 호출하기 -> O

		//페이지 이동하기
		//a. <form> + 데이터 전달
		//b. <a> + 데이터 전달(?seq=1&name=홍길동)
		//c. location.href = url + 데이터 전달(?seq=1&name=홍길동)
		//-----------------------------------------
		//d. response.sendRedirect() + 데이터 전달X
		//e. pageContext.forward() + 데이터 전달O
		
		
		//"/jsp" -> Context Root Path
		// - 직접 지정 or 프로젝트명
		
		//"http://localhost:8090/jsp/" -> WebContent와 동일한 표현
		
		//http://localhost:8090/jsp/hello.jsp
		//resp.sendRedirect("hello.jsp");
		
		//http://localhost:8090/hello.jsp
		resp.sendRedirect("/jsp/hello.jsp");
		
		//"/"
		// - http://localhost:8090/
		// - WebContent -> "/jsp"
		
		
		//모두 호출 가능
		//서블릿 -> 서블릿
		//JSP -> JSP
		//서블릿 -> JSP
		//JSP -> 서블릿
		
		
	}
	
}
