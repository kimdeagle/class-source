package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex29_switch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex29_switch.java
		
		//조건문
		//1. if
		//2. switch
		
		
		/*
		
		switch문
		
		1. 형태
		switch (조건값) {
			case 값: //조건값과 일치하는 값을 찾아 실행
				실행코드;
				break; //break문을 만나면 switch 밖으로 탈출
			[case 값:
				실행코드;
				break;] x N //[](대괄호) 생략 가능 -> 도움말에 이렇게 표시 되어 있다.
			[default: //if문의 else 역할
				실행코드;
				break;]
		}
		
		
		
		
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
	} //main

	private static void m5() {
		
		//2020년 10월이 며칠까지?
		int month = 10;
		int lastDate = 0;
		
		switch(month) {
			case 1:
				lastDate = 31;
				break;
			case 2:
				lastDate = 28;
				break;
			case 3:
				lastDate = 31;
				break;
			case 4:
				lastDate = 30;
				break;
			case 5:
				lastDate = 31;
				break;
			case 6:
				lastDate = 30;
				break;
			case 7:
				lastDate = 31;
				break;
			case 8:
				lastDate = 31;
				break;
			case 9:
				lastDate = 30;
				break;
			case 10:
				lastDate = 31;
				break;
			case 11:
				lastDate = 30;
				break;
			case 12:
				lastDate = 31;
				break;
				
		}
		System.out.println(lastDate);
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDate = 31;
				break;
			case 2:
				lastDate = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDate = 30;
				break;
				
		}
		
		System.out.println(lastDate);
		
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 1, 1);
		
		System.out.println(c1.getActualMaximum(Calendar.DATE));
		
		
	}

	private static void m4() throws NumberFormatException, IOException {
		
		//간단한 자판기
		// -> 메뉴 출력 -> 선택 -> 가격 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("====================");
		System.out.println("    음료자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("2. 스프라이트");
		System.out.println("3. 오렌지");
		System.out.println("--------------------");
		System.out.print("번호 선택 : ");
		
		int input = Integer.parseInt(reader.readLine());
		
		switch (input) { //break문이 없으면 다음 문장을 실행한다. -> break문을 사용하지 않는 경우 : Label 그룹화(몸통을 공유한다)
			case 1: 
			case 2:
				System.out.println("1300원입니다.");
				break;
			case 3:
				System.out.println("2000원입니다.");
				break;
		}
		
		
		
	}

	private static void m3() {
		
		String color = "red";
		
		switch (color) {
			case "red":
				System.out.println("빨강");
				break;
			case "blue":
				System.out.println("파랑");
				break;
			case "yellow":
				System.out.println("노랑");
				break;
		}
		
//		int a = 10;
//		int b = 5;
//		
//		//switch의 조건은 정수밖에 사용할 수 없다.
//		// -> 자바에서는 정수와 문자열을 사용할 수 있다.
//		switch (a > b) {
//		
//		}
		
	} //m3

	private static void m2() {
		
		int n = 5;
		
		switch (n) {
			case 1: // 1: - Label
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("기타");
				break;
		}	
		
	} //m2

	private static void m1() {
		
		int n = 1; //1-> "하나", 2-> "둘", 3-> "셋"
		
		switch (n) {
			case 1: // 1: - Label
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		
		System.out.println("프로그램 종료");
		
		
	} //m1
	
	
	
	
	
}
