package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex31_for {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex31_for
		
		//달력 만들기
		//1. 년, 월
		//2. 해당월의 마지막 일?
		// - 윤년 계산
		//3. 해당월의 1일의 요일?
		// - 윤년 계산
		// - 누적일 계산
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("달력 만들기");
//		
//		System.out.print("년 : ");
//		int year = Integer.parseInt(reader.readLine());
//		
//		System.out.print("월 : ");
//		int month = Integer.parseInt(reader.readLine());
		
		
//		createCalendar(year, month);	
		
		
		//2020년 달력
		for (int i=1; i<=12; i++) {
			createCalendar(2020, i);
			System.out.println();
			System.out.println();
		}
		
		
	} //main

	private static void createCalendar(int year, int month) {
		
		int lastDay = 0; //마지막일
		int day_of_week = 0; //요일
		
		//메서드 접두어
		// - setXXX() : 값 대입
		// - getXXX() : 값 반환
		// - isXXX() : 확인 -> true or false 반환
		
		lastDay = getLastDay(year, month); //마지막일이 몇일로 끝나는가?
		day_of_week = getDayOfWeek(year, month); //구하려는 달의 1일 요일
		
//		System.out.println(lastDay);
//		System.out.println(day_of_week);
		
		//출력하기
		System.out.println();
		System.out.println("====================================================");
		System.out.printf("                   %d년 %d월\n", year, month);
		System.out.println("====================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		//1일을 요일 위치와 맞추기 위해 탭 추가
		for (int i=0; i<day_of_week; i++) { //day_of_week : 구하려는 달의 1일의 요일(월요일이 1) -> 요일만큼 탭을 쳐주면 된다.
			System.out.print("\t");
		}
		
		//날짜 출력
		for (int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			
			//현재 출력하는 날짜(i)가 토요일인지 확인
			if((i + day_of_week) % 7 == 0) { //i : 현재 출력하는 날짜, day_of_week : 구하려는 달의 1일의 요일(월요일이 1 일요일이 7) -> 1.1.1 월
				System.out.println();
			}
		}
		
		
	}

	private static int getDayOfWeek(int year, int month) {
		
		int totalDays = 0;
		
		for (int i=1; i<year; i++) {
			
			if (isLeafYear(i)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}
		
		for (int i=1; i<month; i++) {
			totalDays += getLastDay(year, i);
			
		}
		
		//달력 구하려는 달의 1일 구하기
		totalDays++;
		
		return totalDays % 7; //요일 반환
		
	}

	private static int getLastDay(int year, int month) {
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31; //+break
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28; //윤년 구해서 2월달 일수
		}
		
		return month;
		
	}

	private static boolean isLeafYear(int year) {
		
		//4로 떨어지면 2단계, 안떨어지면 평년
		//100으로 떨어지면 윤년, 안떨어지면 3단계
		//400으로 떨어지면 윤년, 안떨어지면 평년
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) { //윤년
					return true;
				} else { //평년
					return false;
				}
			} else { //윤년
				return true;
			}
		} else { //평년
			return false;
		}
		
		
	}
	
	
	
	
	
}
