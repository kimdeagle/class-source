package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 2개 입력받아 각각 약수와 두 숫자의 공약수
		
		
		divisor();
		
		
	} //main

	private static void divisor() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //입력 안내
		
		int num1 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.print("두번째 숫자 : "); //입력 안내
		
		int num2 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		//num1 약수
		System.out.printf("%d의 약수 : 1", num1);
		
		for (int i = num1-1; i > 0; i--) {
			if (num1 % i == 0) {
				System.out.printf(", %d", num1 / i);
			}
		}
		System.out.println();
		
		//num2 약수
		System.out.printf("%d의 약수 : 1", num2);

		for (int i = num2 - 1; i > 0; i--) {
			if (num2 % i == 0) {
				System.out.printf(", %d", num2 / i);
			}
		}
		System.out.println();

		//num1과 num2의 공약수
		System.out.printf("%d와 %d의 공약수 : 1", num1, num2);
		
		
		for (int i=num1; i>0; i--) {
			
			if (num1 % i == 0 && num2 % i == 0) { //최대공약수
				for (int j=i-1; j>0; j--) { //공약수
					if (i % j == 0) {
						System.out.printf(", %d", i / j);
					}
				}
				break;	
			}
		}
		
		
	} //divisor
	
	
	
}
