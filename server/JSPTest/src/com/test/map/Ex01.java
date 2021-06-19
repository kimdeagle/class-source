package com.test.map;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿
//이름이 [ex01]과 [com.test.map.Ex01]인 두 서블릿들 모두 url-pattern [/ex01.do]에 매핑되어 있는데, 이는 허용되지 않습니다.
//@WebServlet("/ex01.do")
@WebServlet("/map/ex01.do")
public class Ex01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/map/ex01.jsp");
		dispatcher.forward(req, resp);
		
	}
	
}
