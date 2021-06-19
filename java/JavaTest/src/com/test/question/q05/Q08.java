package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//평년, 윤년 구하기
		
		//year 메서드 호출
		year();

		
	} //main

	private static void year() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력(ex. 1995) : "); //입력 안내
		
		int year = Integer.parseInt(reader.readLine()); //입력값 저장
		
		if (year % 4 != 0) {
			System.out.printf("%d년은 \'평년\'입니다.\n", year);
		} else if (year % 100 != 0) {
			System.out.printf("%d년은 \'윤년\'입니다.\n", year);
		} else if (year % 400 != 0) {
			System.out.printf("%d년은 \'평년\'입니다.\n", year);
		} else {
			System.out.printf("%d년은 \'윤년\'입니다.\n", year);
		}
		
	} //year
	
	
	
	
}
