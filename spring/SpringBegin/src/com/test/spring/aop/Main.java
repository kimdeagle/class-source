package com.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\test\\spring\\aop\\memo.xml");
		
		IMemo memo = (IMemo)context.getBean("memo");
		
		memo.add("메모를 작성합니다");
		System.out.println();
		
		memo.edit("메모를 수정합니다.");
		System.out.println();
		
		memo.del(1);
		System.out.println();
		
		try {			
			memo.read(3);
			memo.read(5); //에러 발생
		} catch (Exception e) {
			//e.printStackTrace();
		}
		System.out.println();
		
		int seq = memo.search("메모");
		System.out.printf("%d번 메모에서 검색됨.\n", seq);
		
		memo.search("길동");
		
	}
	
}
