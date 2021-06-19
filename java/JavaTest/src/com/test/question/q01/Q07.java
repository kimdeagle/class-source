package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws IOException {
		
		//7번 문제 풀이
		//숫자 2개 입력받아 둘 중 더 큰 숫자 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //입력 안내문
		
		String data1 = reader.readLine(); //첫번째 숫자 입력값 저장
		
		System.out.print("두번째 숫자 : "); //입력 안내문
		
		String data2 = reader.readLine(); //두번째 숫자 입력값 저장
		
		int num1 = Integer.parseInt(data1); //첫번째 숫자 입력값 정수형 형변환
		
		int num2 = Integer.parseInt(data2); //두번째 숫자 입력값 정수형 형변환
		
		System.out.printf("%d와(과) %d 중에 더 큰 숫자는 %d 입니다.\n", num1, num2, num1 > num2 ? num1 : num2); // 결과 출력
		

	}
	
}
