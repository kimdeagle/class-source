package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 입력하면 숫자 자료형 중 어느것에 속하는지 출력
		
		//typeCheck 메서드 호출
		typeCheck();
		
	} //main

	private static void typeCheck() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : "); //입력 안내
		
		long num = Long.parseLong(reader.readLine()); //입력값 저장
		
		
		if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
			System.out.println("byte");
			System.out.println("short");
			System.out.println("int");
			System.out.println("long");
		} else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
			System.out.println("short");
			System.out.println("int");
			System.out.println("long");
		} else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
			System.out.println("int");
			System.out.println("long");
		} else {
			System.out.println("long");
		}
		
	} //typeCheck
	

	
	
	
}
