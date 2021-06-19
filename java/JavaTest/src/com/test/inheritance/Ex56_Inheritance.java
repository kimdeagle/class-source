package com.test.inheritance;

public class Ex56_Inheritance {

	public static void main(String[] args) {
		
		//Object 클래스
		// - java.lang 패키지(자바 기본 패키지) => import java.lang.*; => 선언할 필요 없음
		// - 루트 클래스(모든 클래스의 조상)
		// - Class Object is the root of the class hierarchy.
		// - Every class has Object as a superclass.
		// - All objects,including arrays, implement the methods of this class.
		
		Object o = new Object();
		
		Item item = new Item();
		
		item.a = 10;
		item.b = 20;
		
		
	} //main
	
}

//무조건 extends Object 생략되어있음.
class Item extends Object {
	public int a;
	public int b;
}

