package com.test.codestudy.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/ex04data.do")
public class Ex04Data extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Random rnd = new Random();
		
		//1. 돌려줄 데이터에 한글이 들어있으면
		resp.setCharacterEncoding("UTF-8");
		
		//2. 돌려줄 데이터가 순수한 텍스트(문자열)라면..
		//resp.setContentType("text/plain"); //MIME
		resp.setContentType("text/plain");
		
		//1. 동기 통신
		//2. 비동기 통신
		
//		try {
//			Thread.sleep(5000); //5초간 멈춰라
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
		PrintWriter writer = resp.getWriter();
		
		//writer.write(rnd.nextInt());
		writer.print(rnd.nextInt());

		writer.close();
		
	}

}