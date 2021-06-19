package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex32_for {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int year = 2020;
		int month = 11;
		
		
		createCalendar(year, month);
				
		
	} //main

	private static void createCalendar(int year, int month) {
		
		int lastDay = 0; //마지막일
		int day_of_week = 0; //요일
		
		
//		lastDay = getLastDay(year, month); //마지막일이 몇일로 끝나는가?
//		day_of_week = getDayOfWeek(year, month); //구하려는 달의 1일 요일
		
		Calendar c1 = Calendar.getInstance();
		c1.set(year, month - 1, 1); // 2020년 10월 1일
		
		lastDay = c1.getActualMaximum(Calendar.DATE); //= getLastDay 메서드 동일 -> getActualMaximum : 최대값
		day_of_week = c1.get(Calendar.DAY_OF_WEEK) - 1; //= getDayOfWeek 메서드 동일

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

	
}
