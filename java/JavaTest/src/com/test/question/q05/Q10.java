package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//근무 년수 입력받아 출력
		
		//workYear 메서드 호출
		workYear();
		
	} //main

	private static void workYear() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("근무 년수 : "); //입력값 안내
		
		int year = Integer.parseInt(reader.readLine()); //입력값 저장
		
		String developGrade = "";
		
		if (year >= 10) {
			
			developGrade = "고급";
			System.out.printf("%d년차 %s 개발자입니다.\n", year, developGrade);
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - year); //마이너스 값
		
		} else if (year >= 5) {
			
			developGrade = "중급";
			System.out.printf("%d년차 %s 개발자입니다.\n", year, developGrade);
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - year);
			
		} else {
			
			developGrade = "초급";
			System.out.printf("%d년차 %s 개발자입니다.\n", year, developGrade);
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4); //마이너스 값
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - year);
			
		}
		
		
	} //workYear
	
}
