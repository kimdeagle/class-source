package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 2개 입력받아 산술 결과 반환하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //첫번째 숫자 입력 안내문
		
		int num1 = Integer.parseInt(reader.readLine()); //첫번째 입력값 저장
		
		System.out.print("두번째 숫자 : "); //두번째 숫자 입력 안내문
		
		int num2 = Integer.parseInt(reader.readLine()); //두번째 입력값 저장
		
		System.out.println(add(num1, num2)); //add 메서드 호출 후 반환값 출력
		
		System.out.println(subtract(num1, num2)); //subtract 메서드 호출 후 반환값 출력
		
		System.out.println(multiply(num1, num2)); //multiply 메서드 호출 후 반환값 출력
		
		System.out.println(divide(num1, num2)); //divide 메서드 호출 후 반환값 출력
		
		System.out.println(mod(num1, num2)); //mod 메서드 호출 후 반환값 출력	
		
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	} //add
	
	public static int subtract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	} //subtract
	
	public static int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	} //multiply
	
	public static double divide(int num1, int num2) {
		double result = (double)num1 / num2;
		return result;
	} //divide
	
	public static int mod(int num1, int num2) {
		int result = num1 % num2;
		return result;
	} //mod
	
}
