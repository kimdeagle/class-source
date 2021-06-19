package com.test.spring.di6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex06 {

	public static void main(String[] args) {
		
		//스프링을 사용해서 객체 만들기 -> 의존 객체 생성하기
		
		
		//s1. 일반적인 방식
		Student s1 = new Student();
		
		s1.setName("홍길동");
		s1.setAge(25);
		
		System.out.println(s1);
		
		
		//s2. 스프링 방식
		//s2.a 스프링 설정 파일 읽기(config06.xml)
		ApplicationContext context = new ClassPathXmlApplicationContext("config06.xml");
		
		//s2.b 설정 파일에 정의된 <bean> 중 하나를 참고해서 객체를 생성
		// = Student s1 = new Student();
		Student s2 = (Student)context.getBean("s2"); //return new Student();
		
		s2.setName("아무개");
		s2.setAge(22);
		
		System.out.println(s2);
		
		
	}
	
}
