package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		//Q03
		//숫자 입력받아 각 자리수의 수의 합
		
		m1();
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		String num = reader.readLine();
		
		System.out.print("결과 : ");
		
		int sum = 0;
		
		for (int i=0; i<num.length(); i++) {			
			System.out.print((int)num.charAt(i) - '0'); //i번째 문자의 문자코드값 - '0'의 문자코드값 = i번째 문자의 실 정수값
			sum += (int)num.charAt(i) - '0';
			
			if (i < num.length()-1) {
				System.out.print(" + ");
			}
			
		}
		System.out.printf(" = %d\n", sum);
		
		
	} //m1
	
}
