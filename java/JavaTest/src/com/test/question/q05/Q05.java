package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//영문자 1개 입력받아 대/소문자 변환 한 뒤 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : "); //입력 안내문
		
		int letterToInt = reader.read(); //입력값 저장
		
		//changeLetter 메서드 호출
		changeLetter(letterToInt);
		
	}

	private static void changeLetter(int letterToInt) {
		
		// A(65) ~ Z(90)
		// a(97) ~ z(122)
		
		if ((letterToInt >= 65 && letterToInt <=90) || (letterToInt >= 97 && letterToInt <= 122)) { //유효성 검사
			
			if (letterToInt >= 65 && letterToInt <=90) { //대문자
				System.out.println((char)(letterToInt + 32));
			} else { //소문자
				System.out.println((char)(letterToInt - 32));
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	} //changeLetter
	
}
