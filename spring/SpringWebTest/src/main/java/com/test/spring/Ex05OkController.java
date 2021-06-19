package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ex05ok.action")
public class Ex05OkController {

	@RequestMapping
	public String ex05ok(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		String num = request.getParameter("num");
		
		System.out.println(num);
		System.out.println(session.getId());
		
		//request.setAttribute("num", num);
		
		return "ex05ok";
	}
	
}
