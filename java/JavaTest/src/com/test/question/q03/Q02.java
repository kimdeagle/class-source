package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//사과 개수 구하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은 날 : "); //입력 안내문
		
		int sunny = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.print("흐린 날 : "); //입력 안내문
		
		int cloudy = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.printf("사과가 총 %d개 열렸습니다\n", getApple(sunny, cloudy)); //getApple 메서드 호출 후 반환값 출력
		
	} //main
	
	public static int getApple(int sunny, int cloudy) {
		
		return ((sunny * 5) + (cloudy * 2) - 100) / 10; 
		
	} //getApple
	
}
