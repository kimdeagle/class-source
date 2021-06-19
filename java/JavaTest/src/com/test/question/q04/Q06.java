package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//배달 음식 같은 시간에 받기
		//조건 : 전화걸면 짜장면은 10분 뒤, 치킨은 18분 뒤, 피자는 25분 뒤 도착
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시 : "); //입력 안내문
		int wantHour = Integer.parseInt(reader.readLine()); //시 입력값 저장
		
		System.out.print("분 : "); //입력 안내문
		int wantMinute = Integer.parseInt(reader.readLine()); //분 입력값 저장
		
		int noodleMinute = 10;
		int chickenMinute = 18;
		int pizzaMinute = 25;
		
		//분단위로 통합하여 계산하면 편함
		//ex) 2:30 - 1:10
		//1. 2:30 -> 150분
		//2. 1:10 -> 70분
		//3. 150 - 70 = 80분
		//4. hour = (min/60);
		//5. min = (min%60);
		//6. 2:30 - 1:10 = 1:20
		
		//출력
		System.out.printf("짜장면 : %d시 %d분\n", wantHour + ((60 + wantMinute - noodleMinute) / 60) - 1, (60 + wantMinute - noodleMinute) % 60);
		System.out.printf("치킨 : %d시 %d분\n", wantHour + ((60 + wantMinute - chickenMinute) / 60) - 1, (60 + wantMinute - chickenMinute) % 60);
		System.out.printf("피자 : %d시 %d분\n", wantHour + ((60 + wantMinute - pizzaMinute) / 60) - 1, (60 + wantMinute - pizzaMinute) % 60);
		

	}
	

	
}
