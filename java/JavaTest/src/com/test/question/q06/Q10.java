package com.test.question.q06;

public class Q10 {

	public static void main(String[] args) {
		
		//서기 1년 1월 1일부터 오늘까지 며칠째인가?
		
		
		todayDate();
		
		
	} //main

	private static void todayDate() {
		
		int year = 2020;
		int month = 10;
		int date = 22;
		
		int monthToDate = 0;
		
		int totalDate = 0;
	
		for (int i=1; i<=month-1; i++) { //전월 더하기
			switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					monthToDate += 31;
					break;
				case 2:
					monthToDate += 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					monthToDate += 30;
					break;
			}
		}
		
		totalDate = ((year - 1) * 365 + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400)) + monthToDate + date; //1.1.1부터 일수
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날입니다.\n", year, month, date, totalDate);

		
	} //todayDate
	
}
