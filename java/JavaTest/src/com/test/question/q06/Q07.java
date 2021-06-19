package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//시작, 종료 숫자 입력받아 출력
		
		//printSum 메서드 호출
		printSum();
		
		
	} //main

	private static void printSum() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 : "); //입력 안내
		int startNum = Integer.parseInt(reader.readLine()); //시작 숫자 저장
		
		System.out.print("종료 숫자 : "); //입력 안내
		int endNum = Integer.parseInt(reader.readLine()); //종료 숫자 저장
		
		int sum = 0; //누적값 초기화
		
		int flag = 1; //연산자 변경에 사용
		
		String printText = ""; //출력 텍스트 초기화
		
		for (int i=startNum; i<=endNum; i++) { //시작 숫자 ~ 종료 숫자
			
			if (i == endNum) { //종료 숫자랑 같아진 경우
				
				printText += Integer.toString(i);
				
				if (flag == 1) {
					sum += i;
				} else {
					sum -= i;
				}
				
			} else if (flag == 1) {
				printText += Integer.toString(i) + " - ";
				sum += i; //누적
			} else if (flag == -1) {
				printText += Integer.toString(i) + " + ";
				sum -= i; //누적
			}
			
			flag *= -1; //flag 값 변경
			
		}
		
		System.out.printf("%s = %,d\n", printText, sum);
		
		
		
	} //printSum
	
}
