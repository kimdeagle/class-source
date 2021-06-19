package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 5개 입력받아 짝수 홀수 개수 구하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : "); //입력 안내
		
		int num1 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.print("숫자 입력 : "); //입력 안내
		
		int num2 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.print("숫자 입력 : "); //입력 안내
		
		int num3 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.print("숫자 입력 : "); //입력 안내
		
		int num4 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.print("숫자 입력 : "); //입력 안내
		
		int num5 = Integer.parseInt(reader.readLine()); //입력값 저장
		
		//countOddEven 메서드 호출
		countOddEven(num1, num2, num3, num4, num5);
		
		
	}

	private static void countOddEven(int num1, int num2, int num3, int num4, int num5) {
		
		int odd = 0;
		int even = 0;
		
		if((num1 >= 1 && num1 <= 10) && (num2 >= 1 && num2 <= 10) && (num3 >= 1 && num3 <= 10) && (num4 >= 1 && num4 <= 10) && (num5 >= 1 && num5 <= 10)) { //유효성 검사
			
			if (num1 % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			
			if (num2 % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			
			if (num3 % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			
			if (num4 % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			
			if (num5 % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			
			System.out.printf("짝수는 %d개 홀수는 %d개 입력하셨습니다.\n", even, odd);
			
			if (odd > even) { //홀수가 더 많은경우
				System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", odd - even);
			} else { //짝수가 더 많은경우
				System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", even - odd);
			} //같은 경우는 나올 수 없다.
			

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	} //countOddEven
	
}
