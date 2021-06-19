package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws IOException {
		
		//8번 문제 풀이
		//2020년 10월 중 한 날짜를 입력받아 무슨 요일인지 출력 (10월1일 목요일)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("날짜 입력 : "); //입력 안내문
		
		String data = reader.readLine(); //입력값 저장
		
		int date = Integer.parseInt(data); //날짜 입력값 정수형 형변환
		
		String day = date % 7 == 0 ? "수요일" : date % 7 == 1 ? "목요일" : date % 7 == 2 ? "금요일" : date % 7 == 3 ? "토요일" : date % 7 == 4 ? "일요일" : date % 7 == 5 ? "월요일" : "화요일"; //% 연산자 이용 요일 구하기
		
		System.out.printf("입력하신 2020년 10월 %d일은 \'%s\'입니다.\n", date, day); //결과 출력
		
		
	}
	
}
