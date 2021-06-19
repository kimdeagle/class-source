package com.test.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. 서블릿 클래스
public class Hello extends HttpServlet{

	//2. doGet, doPost 메서드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//3. 출력
		// - 요청한 브라우저에게 돌려준 페이지 소스를 작성하기(***)
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Servlet</h1>");
		writer.println("Hello");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
		
	}
	
}
