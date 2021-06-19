package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 2개 입력받아 산술 연산 하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //첫번째 숫자 입력 안내문
		
		int num1 = Integer.parseInt(reader.readLine()); //첫번째 숫자 입력값 저장
		
		System.out.print("두번째 숫자 : "); //두번째 숫자 입력 안내문
		
		int num2 = Integer.parseInt(reader.readLine()); //두번째 숫자 입력값 저장
		
		add(num1, num2); //add 메서드 호출
		add(num1, num1);
		
		subtract(num1, num2); //subtract 메서드 호출
		
		multiply(num1, num2); //multiply 메서드 호출
		multiply(num1, num1);
		
		divide(num1, num2); //divide 메서드 호출
		
		mod(num1, num2); //mod 메서드 호출
		
		
	} //main
	
	public static void add(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, (long)num1 + num2);
	} //add
	
	public static void subtract(int num1, int num2) {
		System.out.printf("%d - %d = %d\n", num1, num2, (long)num1 - num2);
	} //subtract
	
	public static void multiply(int num1, int num2) {
		System.out.printf("%d * %d = %d\n", num1, num2, (long)num1 * num2);
	} //multiply
	
	public static void divide(int num1, int num2) {
		System.out.printf("%d / %d = %.1f\n", num1, num2, (float)num1 / num2);
	} //divide
	
	public static void mod(int num1, int num2) {
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
	} //mod
	
	
}
