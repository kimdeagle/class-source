package com.test.spring.di3;

public class Ex03 {

	public static void main(String[] args) {
		
		SpringDAO dao = new SpringDAO();
		
		int num = dao.getNum();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는 %s입니다.\n", num, result);
		
	}
	
}
