package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//기존의 서블릿(컨트롤러) 역할
//1. 컨트롤러 선언
//	a. Controller 인터페이스 구현
//	b. @Controller 어노테이션 사용
public class Ex02 implements Controller {

	//2. handleRequest
	// - doGet/doPost 역할
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		//3. 비즈니스 코드 구현
		String name = "홍길동";
		int age = 20;
		
		//4. JSP 호출하기
		// - RequestDispatcher 사용 -> ModelAndView 변경
		ModelAndView mv = new ModelAndView();
		
		//스프링 -> ViewResolver
		mv.setViewName("/ex02");
		
		//데이터 넘기기
		//request.setAttribute("name", name); 와 동일
		mv.addObject("name", name);
		mv.addObject("age", age);
		
		return mv; //JSP 이동
	}
	
}
