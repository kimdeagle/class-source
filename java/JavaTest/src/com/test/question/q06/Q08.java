package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//누적값이 입력값을 넘어가는 순간 루프 종료
		
		//printSum 메서드 호출
		printSum();
		
		
	} //main

	private static void printSum() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("루프를 종료할 누적값 입력 : "); //입력 안내
		
		int exit = Integer.parseInt(reader.readLine()); //입력값 저장
		
		int sum = 0;
		
		String printText = "";
		
		for (int i=1;;i++) {

			sum += i;
			
			if (sum > exit) {
				printText += Integer.toString(i);
				break;
				
			} else {
				printText += Integer.toString(i) + " + ";
				
			}
			
		}
		
		System.out.printf("%s = %,d\n", printText, sum);

		
	} //printSum
	
	
	
	
	
}
