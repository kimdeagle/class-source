package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//아빠와 딸 생일 입력받아 아빠가 며칠 더 살았는지 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아빠 생일(년) : "); //입력 안내
		
		int dadYear = Integer.parseInt(reader.readLine()); //아빠 생일(년)
		
		System.out.print("아빠 생일(월) : "); //입력 안내
		
		int dadMonth = Integer.parseInt(reader.readLine()); //아빠 생일(월)
		
		System.out.print("아빠 생일(일) : "); //입력 안내
		
		int dadDate = Integer.parseInt(reader.readLine()); //아빠 생일(일)
		
		System.out.print("딸 생일(년) : "); //입력 안내
		
		int daughterYear = Integer.parseInt(reader.readLine()); //딸 생일(년)
		
		System.out.print("딸 생일(월) : "); //입력 안내
		
		int daughterMonth = Integer.parseInt(reader.readLine()); //딸 생일(월)
		
		System.out.print("딸 생일(일) : "); //입력 안내
		
		int daughterdDate = Integer.parseInt(reader.readLine()); //딸 생일(일)
		
		//아빠 생년월일 -> 밀리초
		Calendar dad = Calendar.getInstance();
		dad.set(dadYear, dadMonth - 1, dadDate, 0, 0, 0);
		long dadTick = dad.getTimeInMillis();
		
		//딸 생년월일 -> 밀리초
		Calendar daughter = Calendar.getInstance();
		daughter.set(daughterYear, daughterMonth - 1, daughterdDate, 0, 0, 0);
		long daughterTick = daughter.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n",(daughterTick - dadTick) / 1000 / 60 / 60 / 24); //결과 출력

		
	}
	
}
