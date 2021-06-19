package com.test.java;

public class Ex23_Area {

	public static void main(String[] args) {
		
		//Ex23_Area.java
		
		//자바 변수의 종류
		//1. 클래스 멤버 변수
		
		
		//2. 지역 변수(Local Variable)
		// - 해당 변수의 지역(영역, Scope)이 존재한다.
		// - 메서드 내에서 선언된 변수를 말한다.
		// - 지역 변수의 영역은 해당 변수가 선언된 메서드를 말한다.
		
		//변수 생명 주기(Life Cycle)
		// - 변수는 특정 시점에 생성되어 특정 시점에 소멸된다.
		// - 변수는 특정 시점에 메모리에 할당되었다가 특정 시점에 메모리에서 해제된다.

		//지역 변수의 생성 시점
		// - 선언문이 실행될 때
		
		//지역 변수의 소멸 시점
		// - 선언문이 포함된 블럭에서 제어가 빠져나가는 순간
		
		System.out.println("하나");
		
		int a = 10; //a는 main() 메서드 내에서 선언된 지역 변수이다.
		
		System.out.println("a : " + a);
		
		System.out.println("둘");
		
		m1();
		
		
	} //main
	
	public static void m1() {
		
		int b = 20; //b는 m1() 메서드 내에서 선언된 지역 변수이다.
		
		//*** 지역 변수는 지역이 다르면 동일한 이름의 변수를 만들 수 있다.
		//*** m1 메서드의 지역 변수 a와 main 메서드의 지역 변수 a는 아무런 관련이 없다.
		int a = 30;
		
		System.out.println("a : " + a);
		
	} //m1
	
	
}
