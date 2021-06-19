package com.test.codestudy.ajax;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/ex01.do")
public class Ex01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/*
		
		Ajax, Asynchronous JavaScript and XML
		- 비동기 자바스크립트 & XML
		- 비동기 자바스크립트 통신
		- 비동기 통신 + 자바스크립트 기반(소켓)
		- 자바스크립트를 사용해서 브라우저와 웹 서버 간의 데이터를 주고 받는 기술(***)
		- 서버와 통신할 때 XML 형식으로 데이터를 주고 받는다.
		- 서버와 통신할 때 JSON 형식으로 데이터를 주고 받는다.
		- JSON > XML
		
		Ajax 특징(************* 또는 장점) - 면접에서 물어볼 수 있다. or WebSocket 특징
		1. 페이지 새로고침 없이 서버와 데이터를 주고 받을 수 있다. -> 50점 짜리 대답
		2. 최소한의 데이터만 서버와 주고 받을 수 있다. -> 100점 짜리 대답
		
		*/
		
		String name = req.getParameter("name");
		
		req.setAttribute("name", name);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/ajax/ex01.jsp");
		dispatcher.forward(req, resp);

	}

}