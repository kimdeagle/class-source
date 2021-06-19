package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//주차 요금 계산
		
		//주차 요금 계산(Calendar 사용)
		parkingFeeAtCalendar();
		
		//주차 요금 계산(Calendar 미사용)
		parkingFeeAtInt();
		
		
	}

	private static void parkingFeeAtInt() throws NumberFormatException, IOException {
		
		//무료 주차 : 30분
		//초과 10분당 2,000원
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int inHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int inMinute = Integer.parseInt(reader.readLine());

		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int outHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int outMinute = Integer.parseInt(reader.readLine());

		int parkingMinute = (outHour * 60 + outMinute) - (inHour * 60 + inMinute); //주차한 시간(분)
		int parkingFee = (parkingMinute - 30) / 10 * 2000; //주차 요금

		if (parkingMinute <= 30) {
			System.out.println("무료입니다.");
		} else if (parkingMinute > 30) {
			System.out.printf("주차 요금은 %,d입니다.\n", parkingFee);
		}
		
	} //parkingFeeAtInt

	private static void parkingFeeAtCalendar() throws NumberFormatException, IOException {
		
		//무료 주차 : 30분
		//초과 10분당 2,000원
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int inHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int inMinute = Integer.parseInt(reader.readLine());

		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int outHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int outMinute = Integer.parseInt(reader.readLine()); 
		
		int parkingHour = ((outHour * 60 + outMinute) - (inHour * 60 + inMinute)) / 60; //주차한 시간(시간)
		int parkingMinute = ((outHour * 60 + outMinute) - (inHour * 60 + inMinute)) % 60; //주차한 시간(분)
		int parkingFee = (parkingHour * 60 + parkingMinute - 30) / 10 * 2000; //주차요금
		
		Calendar parkingTime = Calendar.getInstance(); //현재 시각
		parkingTime.set(0, 0, 0, parkingHour, parkingMinute); //주차한 시간으로 변경
		
		if ((parkingHour * 60 + parkingMinute) <= 30) {
			System.out.println("무료입니다.");
		} else {
		System.out.printf("주차한 시간 : %tR, 요금 : %,d원\n", parkingTime, parkingFee);
		}
		
		
	} //parkingFeeAtCalendar
	
}
