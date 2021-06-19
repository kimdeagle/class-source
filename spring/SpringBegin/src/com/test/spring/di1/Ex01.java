package com.test.spring.di1;

public class Ex01 {

	public static void main(String[] args) {
		
		//객체간의 의존 관계
		//*** 의존 객체를 생성하는 방법에 대해서...
		
		//Ex01 -> 데이터베이스에서 데이터를 가져와서 가공 후 출력하는 업무를 담당
		
		
		//1. 업무를 다른 객체에게 위임
		//2. Ex01은 SpringDAO를 의존한다.
		/// - SpringDAO(dao)는 Ex01의 의존 객체다.
		
		//dao: Ex01의 의존 객체(Dependency Object)
		SpringDAO dao = new SpringDAO();
		
		int num = dao.getNum();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는 %s입니다.\n", num, result);
		
	}
	
}
