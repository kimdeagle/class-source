package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//게시판
//Servlet/JSP (기존)
//1. 글쓰기(Add.java + add.jsp, AddOk.java + addok.jsp)
//2. 목록보기(List.java + list.jsp)
//3. 상세보기(View.java + view.jsp)

@Controller
public class BoardController {

	private SpringDAO dao = new SpringDAO();
	
	@RequestMapping(value="/add.action")
	public String add() {
		
		return "add"; //add.jsp
	}
	
	@RequestMapping(value="/addok.action")
	public String addok() {
		
		//SpringDAO dao = new SpringDAO();
		
		return "addok"; //addok.jsp
	}
	
	@RequestMapping(value="/list.action")
	public String list() {
		
		//SpringDAO dao = new SpringDAO();
		
		return "list"; //list.jsp
	}
	
	@RequestMapping(value="/view.action")
	public String view() {
		
		//SpringDAO dao = new SpringDAO();
		
		return "view"; //view.jsp
	}
	
}
