package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 1개 입력받아 4자리로 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : "); //입력 안내문
		
		int num = Integer.parseInt(reader.readLine()); //입력값 저장
		
		digit(num); //메서드 호출
				
	}
	
	public static void digit(int num) {
		
		//숫자 -> 문자열
		//1. Integer.toString(100) -> "100"
		//2. String.valueOf(100) -> "100"
		//3. 100 + "" -> "100" >> 많이 쓴다.
		
		System.out.println(num / 10 == 0 ? "000"+num : num / 10 < 10 ? "00"+num : num / 10 < 100 ? "0"+num : num+"");
		
	} //digit
	
}
