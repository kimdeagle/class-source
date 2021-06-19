package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//나이 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도(ex. 1995) : "); //입력 안내문
		
		int birthYear = Integer.parseInt(reader.readLine()); //생년 입력값 저장
		
		Calendar now = Calendar.getInstance(); //현재
		
		int age = now.get(Calendar.YEAR) - birthYear + 1; //나이
		
		System.out.printf("나이 : %d세\n", age); //나이 출력
		
	}
	
}
