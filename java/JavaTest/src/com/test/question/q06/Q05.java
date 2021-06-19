package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws IOException {
		
		//문장 여러줄 입력받기. (단, 아무것도 입력하지 않고 엔터치면 종료)
		
		//printString 메서드 호출
		printString();
		
		
	} //main

	private static void printString() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아래에 입력하세요."); //입력 안내
		
		String printText = ""; //입력값 누적할 변수
		
		for (;;) {
			
			String inputText = reader.readLine(); //입력값 저장
			
			if (inputText.equals("")) { //아무 입력없이 엔터치면 종료
				break;
			}
			
			printText += inputText + "\n"; //출력할 대상 누적
			
		}
		
		System.out.print(printText); //출력
		
		
	} //printString
	
}
