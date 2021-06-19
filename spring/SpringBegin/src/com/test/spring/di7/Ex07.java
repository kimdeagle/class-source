package com.test.spring.di7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex07 {

	public static void main(String[] args) {
		
		//m1();
		
		m2();
		
	}

	private static void m2() {
		
		//Spring DI
		
		//의존 관계의 형성(설정) : 자바에서 XML(스프링)로 넘어감. -> 코드 분리(담당자), 유지보수성 향상, 컴파일 반복X
		//가독성 향상
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config07.xml");
		
		//이 예제에는 DBDAO 또는 FileDAO가 보이지 않는다.
		SpringDAO dao = (SpringDAO)context.getBean("dao2");
		
		int num = dao.getNum();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는 %s입니다.\n", num, result);
		
	}

	private static void m1() {
		//DBDAO db = new DBDAO();
		//SpringDAO dao = new SpringDAO(db);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config07.xml"); 
	
		//IData db = (DBDAO)context.getBean("db"); //스프링을 사용해 객체 생성
		//IData db = (FileDAO)context.getBean("file");
		IData db = (IData)context.getBean("file");
		
		SpringDAO dao = (SpringDAO)context.getBean("dao"); //스프링을 사용해 객체 생성
		
		dao.setData(db); //의존 객체 주입
		
		int num = dao.getNum();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는 %s입니다.\n", num, result);
	}
	
}
