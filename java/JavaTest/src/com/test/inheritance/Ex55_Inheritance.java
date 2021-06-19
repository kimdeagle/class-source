package com.test.inheritance;

import java.util.Random;

public class Ex55_Inheritance {

	public static void main(String[] args) { 
		
		//m1();
		
		//상황] 개발자. 담당업무 > 난수 발생 잦음 > 난수 발생 코드 작성 x N회
		//1. -21억 ~ 21억 정수
		//2. 3 ~ 12 사이의 정수
		//3. 색상 난수 : red, yellow, blue, orange, green
		//업무추가
		//4. 논리 난수 : true, false
		
		//w1();
		
		//w2();
		
		w3();
		
		
	} //main

	private static void w3() {
		
		//직접 구현 + 클래스 추가 + 상속
		
		UtilRandom urnd = new UtilRandom();
		
		System.out.println(urnd.nextInt());
		
		System.out.println(urnd.nextBoolean());
		
		System.out.println(urnd.nextTinyInt());
		
		System.out.println(urnd.nextColor());
		
	}

	private static void w2() {
		
		//직접 구현 + 클래스 추가
		
		//Random rnd = new Random();
		MyRandom mrnd = new MyRandom();
		
		//1.
		System.out.println(mrnd.nextInt());
		
		//2.
		System.out.println(mrnd.nextTinyInt());
		
		//3.
		System.out.println(mrnd.nextColor());
		
		
	}

	private static void w1() {
		
		//직접 구현
		Random rnd = new Random();
		
		//1. Random 클래스 기본 기능
		System.out.println(rnd.nextInt());
		
		//2. Random 클래스 기능 변형
		System.out.println(rnd.nextInt(10) + 3);
		
		//3. Random 클래스 기능 변형
		String[] colors = { "red", "yellow", "blue", "orange", "green" };
		System.out.println(colors[rnd.nextInt(colors.length)]);

		
	}

	private static void m1() {
		
		//난수 생성기
		//1. Math.random() 메서드
		//2. Random 클래스
		
		Random rnd = new Random();
		
		//사용법
		//rnd.nextXXX()
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextDouble()); //Math.random() 동일
		System.out.println(rnd.nextBoolean());
		
		System.out.println(rnd.nextInt(10)); //0~9 (넣은 숫자-1)
		System.out.println((int)(Math.random() * 10)); //0~9
		
		
	} //m1
	
} //Ex55










