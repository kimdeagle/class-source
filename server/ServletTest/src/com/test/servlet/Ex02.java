package com.test.servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Ex02.java

//1. 상속
public class Ex02 extends HttpServlet {

	//2. 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//3.
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		
		BufferedReader reader = new BufferedReader(new FileReader(req.getRealPath("gugudan1.html")));
		
		String line = null;
		
		while ((line = reader.readLine()) != null) {
			writer.print(line);
		}
		
		writer.close();
		
	}
	
}
