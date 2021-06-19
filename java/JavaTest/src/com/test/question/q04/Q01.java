package com.test.question.q04;

import java.util.Calendar;

public class Q01 {

	public static void main(String[] args) {
		
		//현재 시간 출력
		
		nowTime(); //nowTime 메서드 호출
		nowTime_AMPM(); //nowTime_AMPM 메서드 호출
		
	} //main

	private static void nowTime_AMPM() { //오전오후 표시
		
		Calendar now = Calendar.getInstance();
		
		//I made
		System.out.printf("현재 시간 : %s %02d시 %02d분 %02d초\n", now.get(Calendar.HOUR_OF_DAY) >= 12 ? "오후" : "오전", now.get(Calendar.HOUR), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
		
		//want to do
		System.out.printf("현재 시간 : %s %02d시 %02d분 %02d초\n", now.get(Calendar.AM_PM) == 0 ? "오전" : "오후", now.get(Calendar.HOUR), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
		
	}

	private static void nowTime() { //24시간 형식
		
		Calendar now = Calendar.getInstance();
		System.out.printf("현재 시간 : %02d시 %02d분 %02d초\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
		
	}
	
	
}
