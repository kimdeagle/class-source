package com.test.java;

public class Ex21_Method {

	//메인 메서드
	// - 특수한 메서드
	// a. 메서드명이 예약어다.(main)
	// b. 메인 메서드는 개발자 호출(X). 자바(JVM)가 호출하는 메서드(자동으로 호출되는 것처럼 보임 -> 시스템 호출하는 메서드 -> 콜백 메서드(Callback Method)
	// - 트리거 역할을 하는 메서드(모든 일의 시발점 역할)
	// - main() 메서드 : 프로그램 시작점 역할(Entry Point) ~ 프로그램 종착점 역할(End Point)
	
	public static void main(String[] args) {
		
		//Ex21_Method.java
		//변수명, 메서드명 등 이름 붙일 수 있는 것들의 이름 수정 : Ctrl + 1
		
		//*** 코드가 어떤 순서(***)대로 실행되는지!! -> 제어의 흐름
		//*** 책읽듯이 읽는다 : 위 -> 아래, 왼쪽 -> 오른쪽
		
		int a = 10;
		int b = 20;
		
		System.out.println("add");
		System.out.println(a + b);
		
		substract(); //제어 이동
		
		multiple();
		
		int g = 10;
		int h = 4;
		
		System.out.println("divide");
		System.out.println(g / h);
		
		
	} //main
	
	public static void substract() {
		
		int c = 10;
		int d = 5;
		
		System.out.println("substract");
		System.out.println(c - d);
		
	} //substract
	
	public static void multiple() {
		
		int e = 3;
		int f = 2;
		
		System.out.println("multiple");
		System.out.println(e * f);
		
	} //multiple
	
	
	
	
} //Ex21_Method
