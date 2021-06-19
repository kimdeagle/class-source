package com.test.spring;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex07Controller {

//	//요청 URL 1개당 -> 요청 메서드 1개
//	@RequestMapping(value="/ex07.action")
//	public String m1() {
//		
//		//ViewResolver 동작(servlet-context.xml)
//		return "ex07"; // RequestDispatcher.forward() 동일
//	}
//	
//	//동일한 이름으로 매핑한 경우
//	//Ambiguous mapping. Cannot map 'ex07Controller' method public void com.test.spring.Ex07Controller.m2() to {[/ex07.action]}
//	@RequestMapping(value="/ex07.action")
//	public void m2() {
//		
//		//1. 서블릿 -> JSP
//		//2. 서블릿(XXXOk.java)
//		
////		if (result == 1) {
////			resp.sendRedirect("url");
////		} else {
////			PrintWriter writer = 
////		}
//		
//	}
	
	@RequestMapping(value="/ex07.action", method={RequestMethod.GET}) //doGet
	public String ex07() {
		
		return "ex07";
	}
	
	@RequestMapping(value="/ex07ok.action", method={RequestMethod.POST}) //doPost
	public String ex07ok(
						//HttpServletRequest req,
						//String seq,
						//String name,
						//String point
						
						SpringDTO dto,
						String state
						
						) throws IOException {
		
		//1. 데이터 가져오기
		//2. DTO 포장하기
		//3. DAO 위임 + 전달 + insert
		//4. JSP 호출
		
		
		//스프링에서 서버로 보낸 데이터를 수신하는 방법
		
		//방법1. request 사용
		
		//req.setCharacterEncoding("UTF-8");
		
		/*
		String seq = req.getParameter("seq");
		String name = req.getParameter("name");
		String point = req.getParameter("point");
		
		SpringDTO dto = new SpringDTO();
		dto.setSeq(seq);
		dto.setName(name);
		dto.setPoint(point);
		*/
		
		//방법2. 요청 메서드의 매개변수 사용
		
		/*
		SpringDTO dto = new SpringDTO();
		dto.setSeq(seq);
		dto.setName(name);
		dto.setPoint(point);
		*/
		
		//방법3. 요청 메서드의 매개변수 사용
		
		SpringDAO dao = new SpringDAO();
		dao.add(dto);
		System.out.println(state);
		
		return "ex07ok";
	}	
	
}
