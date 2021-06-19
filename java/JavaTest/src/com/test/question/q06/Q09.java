package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 N개 입력받아 출력
		//조건
		//1. 누적값이 입력값을 넘어가는 순간 루프 종료
		//2. 짝수는 더하고 홀수는 빼기
		
		//printSum 메서드 호출
		printSum();
		
		
	} //main

	private static void printSum() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("루프를 종료할 누적값 입력 : "); //입력 안내
		
		int exit = Integer.parseInt(reader.readLine()); //루프 종료 입력값 저장
		
		int sum = 0; //합계 저장
		
		String printText = ""; //텍스트 저장
		
		for (;;) {
			
			System.out.print("숫자 : "); //입력 안내
			
			int num = Integer.parseInt(reader.readLine()); //입력값 저장
						
			if (num % 2 == 0) { //짝수
				printText += " + " + Integer.toString(num);
				sum += num;
			} else { //홀수
				printText += " - " + Integer.toString(num);
				sum -= num;
			}
			
			if (sum > exit) {
				break;
			}
			
		}
		
		System.out.printf("%s = %,d\n", printText, sum);
		
		
		
	} //printSum
	
}
