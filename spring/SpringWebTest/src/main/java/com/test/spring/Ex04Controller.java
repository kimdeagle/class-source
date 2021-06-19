package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ex04.action")
public class Ex04Controller {

	//doGet or doPost or handleRequest
	//요청 메서드를 어떻게 만드느냐?? -> 규칙이 있다.
	//1. 접근지정자 : public
	//2. 메서드명 : 자유
	//3. 인자값 : 자유
	//4. 반환값 : 자유(void or String(****))
	//5. @RequestMapping
	
	@RequestMapping
	public String test() {
		
		//ViewResolver 동작
		return "ex04"; //  WEB-INF/views/ex04.jsp -> forward
		
	}
	
	
}
