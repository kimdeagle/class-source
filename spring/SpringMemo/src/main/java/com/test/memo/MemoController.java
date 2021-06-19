package com.test.memo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemoController {
	
	private IMemo dao;
	
	public MemoController() {
		this.dao = new MemoDAO();
	}

	@RequestMapping(value="/template.memo", method={RequestMethod.GET})
	public String template(HttpServletRequest request) {

		
		
		return "template";
	}
	
	
	@RequestMapping(value="/add.memo", method={RequestMethod.GET})
	public String add(HttpServletRequest request) {	
		
		return "add";
	}
	
	@RequestMapping(value="/addok.memo", method={RequestMethod.POST})
	public String addok(HttpServletRequest request, MemoDTO dto) { //1.	
		
		//1. 데이터 가져오기
		//2. DAO 위임 > insert
		//3. JSP 호출
		
		int result = dao.add(dto);
		
		request.setAttribute("result", result);
		
		return "addok";
	}
	
	@RequestMapping(value="/index.memo", method={RequestMethod.GET})
	public String index(HttpServletRequest request) {
		
		//1. DB 작업 -> select
		//2. 결과 + JSP 호출
		
		//ArrayList(X) -> List(O)
		//스프링에서 List 반환한다.
		//ArrayList쓰면 다운캐스팅 해줘야한다..(귀찮)
		List<MemoDTO> list = dao.list();
		
		request.setAttribute("list", list);
		
		return "index";
	}
	
}
