package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		//Q02
		
		m1();
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String txt = reader.readLine();
		
		int sum = 0;
		
		int index = -1;
		
		int count = 0;
		
		
		for (int i=0; i<10; i++) {

			while (true) {
				
				String findNum = i + "";
				
				index = txt.indexOf(findNum, index);
				
				if (index == -1) {
					break;
				}
				
				count++;
				
				index += findNum.length();
				
			}
			
			sum += (i * count);
			
			count = 0;
			
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n", sum);
		
		
		
		
	} //m1
	
}
