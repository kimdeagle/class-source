package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//369게임
		
		the369();
		
		
	}

	private static void the369() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대 숫자 : "); //입력 안내
		
		int num = Integer.parseInt(reader.readLine()); //입력값 저장
		
		String printText = "";
		
		for (int i=1; i<=num; i++) {
			
			if ((i / 10 == 3) || (i / 10 == 6) || (i / 10 == 9)) {
				printText += " 짝 ";
			} else {
				if ((i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)) {
					
					printText += " 짝 ";
					
				} else {
					
					printText += " " + Integer.toString(i) + " ";
				}
			
			}
					
		}
		
		System.out.println(printText);
		
	}


		
		
}
	
