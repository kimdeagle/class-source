package com.test.question.q04;

import java.util.Calendar;

public class Q02 {

	public static void main(String[] args) {
		
		//오늘 태어난 아이의 백일과 첫돌
		
		//백일
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n", now);
		
		//첫돌
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", now);
		
	}
	
	
	
	
}
