package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 2개와 연산자 1개를 입력받아 연산 과정 및 결과 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //입력 안내문
		
		int num1 = Integer.parseInt(reader.readLine()); //첫번째 숫자 입력값 저장
		
		System.out.print("두번째 숫자 : "); //입력 안내문
		
		int num2 = Integer.parseInt(reader.readLine()); //두번째 숫자 입력값 저장
		
		System.out.print("연산자(산술 연산자만 입력 (+, -, *, /, %)) : "); //입력 안내문
		
		String operator = reader.readLine(); //연산자 입력값 저장
		
		//calculation 메서드 호출
		calculation(num1, num2, operator);
	
		
	} //main

	private static void calculation(int num1, int num2, String operator) {
		
		if (operator.equals("+")) {
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		} else if (operator.equals("-")) {
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		} else if (operator.equals("*")) {
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		} else if (operator.equals("/")) {
			System.out.printf("%d / %d = %.1f\n", num1, num2, (double)num1 / num2);
		} else if (operator.equals("%")) {
			System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	} //calculation


	
}
