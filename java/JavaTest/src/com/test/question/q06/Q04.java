package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//짝수 합과 홀수 합 각각 출력
		
		//sumOddEven 메서드 호출
		sumOddEven();
		
	} //main

	private static void sumOddEven() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력할 숫자 개수 : "); //입력 안내
		
		int count = Integer.parseInt(reader.readLine()); //입력값 저장
		
		int odd = 0;
		int even = 0;
		
		for (int i=1; i<=count; i++) {
			
			System.out.print("숫자 : "); //입력 안내
			
			int num = Integer.parseInt(reader.readLine()); //입력값 저장
			
			//홀수면 odd에, 짝수면 even에 누적
			if (num % 2 == 1) {
				odd += num;
			} else {
				even += num;
			}
			
		}
		
		System.out.printf("짝수의 합 : %,d\n", even);
		System.out.printf("홀수의 합 : %,d\n", odd);
		
		
		
	} //sumOddEven
	
}
