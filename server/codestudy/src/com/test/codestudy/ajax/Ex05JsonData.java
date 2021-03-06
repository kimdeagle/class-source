package com.test.codestudy.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/ex05jsondata.do")
public class Ex05JsonData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. 단일값
		//2. 다중값
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json"); //***** JSON
		
		//JSON -> JavaScript Object Notation
		// - XML 처럼 네트워크 상에서 데이터를 주고 받을 때 많이 사용
		
		//프로퍼티명 쌍따옴표는 선택(보통 적는다), 값 쌍따옴표는 필수!(홑따옴표 안됨)
//		{
//			"name": "홍길동",
//			"age": 20
//		}
		
//		[
//		{
//		"name": "홍길동",
//		"age": 20
//		}
//		,
//		{
//		"name": "홍길동",
//		"age": 20
//		}
//		]
		
		PrintWriter writer = resp.getWriter();
		
//		writer.print("{");
//		writer.print("\"name\": \"홍길동\",");
//		writer.print("\"age\": \"20\",");
//		writer.print("\"address\": \"서울시 강남구 역삼동\"");
//		
//		writer.print("}");
		
//		MemberDAO dao = new MemberDAO();
//		ArrayList<MemberDTO> list = dao.list();
//		
//		String temp = "";
//
//		temp += "[";
//		
//		for (MemberDTO dto : list) {
//			temp += "{";
//			temp += String.format("\"seq\":\"%s\",", dto.getSeq());
//			temp += String.format("\"name\":\"%s\",", dto.getName());
//			temp += String.format("\"id\":\"%s\",", dto.getId());
//			temp += String.format("\"email\":\"%s\"", dto.getEmail());
//			temp += "}";
//			temp += ",";
//		}
//		
//		//마지막 , 지우기
//		temp = temp.substring(0, temp.length() - 1);
//		
//		temp += "]";
//
//		writer.print(temp);
//
		
		
		
		String buseo = req.getParameter("buseo");
		
		MemberDAO dao = new MemberDAO();
		ArrayList<InsaDTO> list = dao.listInsa(buseo);
		
		String temp = "";
		
		temp += "[";
			for (InsaDTO dto : list) {
				temp += "{";
				temp += String.format("\"num\":\"%s\",", dto.getNum());
				temp += String.format("\"name\":\"%s\",", dto.getName());
				temp += String.format("\"buseo\":\"%s\",", dto.getBuseo());
				temp += String.format("\"jikwi\":\"%s\",", dto.getJikwi());
				temp += String.format("\"basicpay\":\"%s\"", dto.getBasicpay());
				temp += "}";
				temp += ",";
			}
		
		temp = temp.substring(0, temp.length() - 1);
		temp += "]";
		
		writer.print(temp);
		
		
		writer.close();
		
	}

}