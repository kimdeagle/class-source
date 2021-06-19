package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		//2번 문제 풀이
		//숫자 2개 입력받아 연산과정과 연산 결과 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //첫번째 숫자 입력 안내문 출력
		
		String data1 = reader.readLine(); //첫번째 숫자 입력값 저장
		
		System.out.print("두번째 숫자 : "); //두번째 숫자 입력 안내문 출력
		
		String data2 = reader.readLine(); //두번째 숫자 입력값 저장
		
		int num1 = Integer.parseInt(data1); //첫번째 숫자 입력값 정수형으로 형변환
		
		int num2 = Integer.parseInt(data2); //두번째 숫자 입력값 정수형으로 형변환
		
		System.out.printf("%,d + %,d = %,d\n", num1, num2, num1 + num2); //더하기 결과 출력(천단위 표기)
		
		System.out.printf("%,d - %,d = %,d\n", num1, num2, num1 - num2); //빼기 결과 출력(천단위 표기)
		
		System.out.printf("%,d * %,d = %,d\n", num1, num2, num1 * num2); //곱하기 결과 출력(천단위 표기)
		
		System.out.printf("%,d / %,d = %,.1f\n", num1, num2, (float)num1 / num2); //나누기 결과 출력(천단위 표기, 소수 이하 1자리까지 표기)
		
		System.out.printf("%,d %% %,d = %,d\n", num1, num2, num1 % num2); //나머지 결과 출력(천단위 표기)
		
		
	}
	
}
