package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 10개 입력받아 한글로 변환
		
		
		changeNumToText();
		
		
		
	}

	private static void changeNumToText() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String printText = "";
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("숫자 : "); //입력 안내
			
			int num = Integer.parseInt(reader.readLine()); //입력값 저장
			
			if (num >= 10) {
				break;
			} else {
				switch (num) {
					case 1:
						printText += "일";
						break;
					case 2:
						printText += "이";
						break;
					case 3:
						printText += "삼";
						break;
					case 4:
						printText += "사";
						break;
					case 5:
						printText += "오";
						break;
					case 6:
						printText += "육";
						break;
					case 7:
						printText += "칠";
						break;
					case 8:
						printText += "팔";
						break;
					case 9:
						printText += "구";
						break;
				}
	
			}
		
		}
		
		System.out.printf("결과 : %s\n", printText);
		
	}
	
	
	
	
}
