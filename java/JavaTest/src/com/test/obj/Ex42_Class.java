package com.test.obj;

public class Ex42_Class {

	public static void main(String[] args) {
		
		//객체 생성
		//	- 행동 집합
		//		a. 메서드
		
		
		MyMath math = new MyMath();
		
		int result = math.add(100, 200);
		
		System.out.println(result);
		
		result = math.multiply(3, 5);
		
		System.out.println(result);
		
		
		
	} //main
	
	
} //Ex42_Class

//행동 집합을 목적으로 하는 클래스
class MyMath {
	
	public int add(int a, int b) {
		
		return a + b;
		
	} //add
	
	public int multiply(int a, int b) {
		
		return a * b;
		
	} //multiply
	
} //MyMath







