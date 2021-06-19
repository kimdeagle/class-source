package com.test.spring.di5;

public class Ex05 {

	public static void main(String[] args) {
		
		//Ex05 -> (의존) -> SpringDAO -> (의존) -> DBDAO
		//Ex05 -> (의존) -> SpringDAO -> (의존) -> FileDAO //교체
		
		//IData data = new DBDAO();
		IData data = new FileDAO();
		
		SpringDAO dao = new SpringDAO(data); //의존 주입 발생
		
		int num = dao.getNum();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는 %s입니다.\n", num, result);
		
	}
	
}
