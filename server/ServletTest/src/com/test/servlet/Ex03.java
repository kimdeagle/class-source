package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex03 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int dan = Integer.parseInt(req.getParameter("dan"));
		
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = resp.getWriter();
		
		//몇단? -> 사용자 선택!!
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<meta charset='utf-8'>");
		writer.println("</head>");
		writer.println("<body>");
		writer.printf("<h1>%d단</h1>", dan);
		for (int i=1; i<=9; i++) {
			writer.printf("<div>%d x %d = %d</div>", dan, i, dan * i);			
		}
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
		
	}
	
}
