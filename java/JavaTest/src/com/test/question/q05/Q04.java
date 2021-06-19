package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		//문자 1개 입력받아 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : "); //입력 안내
		
		String letter = reader.readLine(); //입력값 저장
		
		//autoText 메서드 호출
		autoText(letter);
		
		
	}

	private static void autoText(String letter) {
		
		if (letter.equals("f") || letter.equals("F")) {
			System.out.println("Father");
		} else if (letter.equals("m") || letter.equals("M")) {
			System.out.println("Mother");
		} else if (letter.equals("s") || letter.equals("S")) {
			System.out.println("Sister");
		} else if (letter.equals("b") || letter.equals("B")) {
			System.out.println("Brother");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	} //autoText
	
}
