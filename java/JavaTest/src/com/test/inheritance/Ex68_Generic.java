package com.test.inheritance;

import java.util.Random;

public class Ex68_Generic {

	public static void main(String[] args) {
		
		//Ex68_Generic.java
		
		Bag<String> b1 = new Bag<String>();
		
		b1.a = 10;
		b1.b = "홍길동";
		b1.c = "문자열";
		
		//제네릭의 타입변수 -> 무조건 참조형만 넣을 수 있다.
		//int(X) -> Integer(O)
		//double -> Double
		//boolean -> Boolean
		Bag<Integer> b2 = new Bag<Integer>();
		b2.a = 20;
		b2.b = "문자열";
		b2.c = 30;
		
		Bag<Random> b3 = new Bag<Random>();
		b3.c = new Random();
		
		//제네릭의 타입 변수 -> Object 변수와 마찬가지로 일종의 만능주머니 역할
		
		Shirts<Boolean> s1 = new Shirts<Boolean>();
		
		s1.a = true;
		s1.b = false;
		s1.c = true;
		
		Board<Double> d1 = new Board<Double>();
		
		d1.a = 3.14;
		
		d1.test(5.43);
		
		System.out.println(d1.get());
		
		
		Camera<Integer, String> c1 = new Camera<Integer, String>();
		
		c1.a = 10;
		c1.b = "문자열";
		
		Camera<Boolean, Double> c2 = new Camera<Boolean, Double>();
		
		c2.a = true;
		c2.b = 3.14;
		
		
	} //main
	
} //Ex68

//int a = 10; > 데이터를 담는 변수

//제네릭 클래스 > 클래스명 옆 <T>
// - T : 타입 변수 (T말고 다른 이름으로 써도되는데 T가 관례임)
//T = int; > 자료형을 담는 변수

//Bag<자료형> b1 = new Bag<자료형>();
//참조형만 넣을 수 있다.
//값형 넣는 방법 -> Integer, Boolean, ...
class Bag<T> {
	
	//멤버 구현
	public int a;
	public String b;
	public T c;
	
}


class Shirts<T> {
	public T a;
	public T b;
	public T c;
}


class Board<T> {
	public T a;
	
	public void test(T a) {
		
		//메서드 내의 지역변수용으로는 지양
		//T b;
	}
	
	public T get() {
		return a;
	}
	
}


class Camera<T, U> {
	public T a;
	public U b;
}







