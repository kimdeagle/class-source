package com.test.spring.di2;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		//이 rnd 객체는 Ex02가 필요해서 만든 객체가 아니다.
		//dao가 필요로 해서 rnd를 만들었다. 
		Random rnd = new Random();

		//dao에게 필요한 rnd 객체를 생성자를 통해 전달 -> Dependency Injection(의존 주입)
		//SpringDAO dao = new SpringDAO(rnd); //의존 주입(DI) 발생
		
		
		SpringDAO dao = new SpringDAO();
		dao.setRnd(rnd); //의존 주입(DI) 발생
		
		int num = dao.getNum();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는 %s입니다.\n", num, result);
		
	}
	
}
