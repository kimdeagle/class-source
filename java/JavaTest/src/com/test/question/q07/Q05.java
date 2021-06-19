package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//최대 9자리 정수 받아서 각 자리의 홀수합, 짝수합 구하기
		
		
		
		addOddEven();
				
		
	} //main

	private static void addOddEven() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("9자리 숫자 입력 : "); //입력 안내
		
		long num = Long.parseLong(reader.readLine()); //입력값 저장
		
		int odd = 0;
		int even = 0;
		
		for (int i = 8; i >= 0; i--) {
			
			if (num / 1000000000 <= 0) {
				
				if ((num / (int)Math.pow(10, i)) % 2 == 0) { //짝수
					even += num / (int)Math.pow(10, i);
				} else { //홀수
					odd += num / (int)Math.pow(10, i);
				}
				
				num -= num / (int)Math.pow(10, i) * (int)Math.pow(10, i);	
				
			} else {
				System.out.println("9자리 초과입니다.");
				break;
			}
				
		}
		
		System.out.printf("짝수의 합 : %d\n", even);
		System.out.printf("홀수의 합 : %d\n", odd);
		
		
		
		
	}
	
	
	
}
