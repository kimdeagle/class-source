package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//스프링 -> 서블릿X -> 컨트롤러(이전 서블릿 역할을 대신하는 객체)
public class Ex01 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		//http://localhost:8090/spring/WEB-INF/classes/com/test/spring/Ex01.java
		//이클립스 : 스프링은 가상주소로 변환해주지 않는다. 
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("ex01"); //ex01.jsp의 경로를 대입
		
		return mv;
	}

	
	
}
