package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		//커플 이름과 만난날 입력받아 기념일 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("남자 이름 : "); //남자 이름 입력 안내
		
		String manName = reader.readLine(); //남자 이름
		
		System.out.print("여자 이름 : "); //여자 이름 입력 안내
		
		String womanName = reader.readLine(); //여자 이름
		
		System.out.print("만난날(년) : "); //년 입력 안내
		
		int meetYear = Integer.parseInt(reader.readLine()); //만난날(년)
		
		System.out.print("만난날(월) : "); //월 입력 안내
		
		int meetMonth = Integer.parseInt(reader.readLine()); //만난날(월)
		
		System.out.print("만난날(일) : "); //일 입력 안내
		
		int meetDate = Integer.parseInt(reader.readLine()); //만난날(일)
		
		System.out.printf("\'%s\'와(과) \'%s\'의 기념일\n", manName, womanName);
		
		//100일
		Calendar day100th = Calendar.getInstance();
		day100th.set(meetYear, meetMonth - 1, meetDate);
		day100th.add(Calendar.DATE, 100);
		
		System.out.printf("100일 : %tF\n", day100th);
		
		//200일
		Calendar day200th = Calendar.getInstance();
		day200th.set(meetYear, meetMonth - 1, meetDate);
		day200th.add(Calendar.DATE, 200);
		
		System.out.printf("200일 : %tF\n", day200th);
		
		//300일
		Calendar day300th = Calendar.getInstance();
		day300th.set(meetYear, meetMonth - 1, meetDate);
		day300th.add(Calendar.DATE, 300);
		
		System.out.printf("300일 : %tF\n", day300th);
		
		//500일
		Calendar day500th = Calendar.getInstance();
		day500th.set(meetYear, meetMonth - 1, meetDate);
		day500th.add(Calendar.DATE, 500);
		
		System.out.printf("500일 : %tF\n", day500th);
		
		//1000일
		Calendar day1000th = Calendar.getInstance();
		day1000th.set(meetYear, meetMonth - 1, meetDate);
		day1000th.add(Calendar.DATE, 1000);
		
		System.out.printf("1000일 : %tF\n", day1000th);
		
		
	}
	
}
