package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//날짜 입력받아 조건에 맞게 결과 출력
		
		//findSaturdayOfWeek 메서드 호출
		findSaturdayOfWeek();
		
	} //main

	private static void findSaturdayOfWeek() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년 : "); //입력 안내
		int year = Integer.parseInt(reader.readLine()); //년 입력값 저장
		
		System.out.print("월 : "); //입력 안내
		int month = Integer.parseInt(reader.readLine()); //월 입력값 저장
		
		System.out.print("일 : "); //입력 안내
		int date = Integer.parseInt(reader.readLine()); //일 입력값 저장
		
		Calendar inputDay = Calendar.getInstance(); //현재 시각
		inputDay.set(year, month - 1, date); //입력값으로 설정
		
		//일(1) ~ 토(7)
		if (inputDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) { //일요일인 경우
			System.out.println("입력하신 날짜는 휴일입니다.");
			System.out.println("결과가 없습니다.");
		} else {
			inputDay.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY); //토요일로 이동
			System.out.println("입력하신 날짜는 평일입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 %tF입니다.\n", inputDay);
		}
		
		
	} //findSaturdayOfWeek
	
}
