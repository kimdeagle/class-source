package com.test.obj;

public class Ex40_Class {

	public static void main(String[] args) {
		
		//Ex40_Class.java
		
		/*
		
		1. 절차 지향 프로그래밍
			- 순서를 중요
			- C
		
		2. 객체 지향 프로그래밍
			- 객체를 중심
			- C++, Java, C#
			
		3. 함수형 프로그래밍
			- F#, Kotlin, Java(일부)
			
		
		
		객체(Object)
			- 캡슐화(Encapsulation)
			- 상속(Inheritance)
			- 다형성(Polymorphism)
			
			- 데이터(Data)
			- 행동(Behavior)
			- 상태(State)
			- 은닉화
			- 인터페이스
			- 추상화
			- 독자성
		
		클래스(Class)
		
		인스턴스(Instance)
		
		
		
		클래스 개요
		- 코드의 집합(생김새)
		- 컨테이너 역할(비중 적은)
		- 객체 생성(가장 큰 역할) + 자료형 역할
		
		객체 개요
		- 개체, 객체
		- 인식 가능 + 구별 가능 -> 사물(생물 + 미생물)
		
		프로그램 업무
		-> 사람이 직접 하던 업무를 전산화
		ex) 식당 종업원 -> 키오스크(프로그램)
		
		클래스 + 객체
		-> 붕어빵틀 + 붕어빵
		
		객체
		- 데이터
		- 행동
		
		
		클래스 구문
		
		class 클래스명 {
			설계 내용 -> 클래스 멤버
			1. 멤버 변수 -> 데이터, 상태(State), 성질 역할
			2. 멤버 메서드 -> 기능, 행동(Behavior)
		}
		
		
		*/
		
		
		//클래스를 사용해서 객체를 생성하기
		//붕어빵틀을 사용해서 붕어빵 만들기
		MyClass m1 = new MyClass();
		
		m1.a = 100;
		m1.b = 200;
		
		System.out.println(m1.a);
		System.out.println(m1.b);
		
		
		
	} //main
		
	
} //Ex40

//클래스 선언(붕어빵틀 만들기, 객체 설계도 만들기)
//- 추상적인 요소
class MyClass {
	
	int a;
	int b;
	
	
}




