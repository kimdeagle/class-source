package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		//1번 문제 풀이
		//태어난 연도 입력받아 나이 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도(ex.1990) : "); //입력 안내문 출력
				
		String data = reader.readLine(); //입력값 저장
		
		int birthYear = Integer.parseInt(data); //입력받은 값을 정수형으로 변환
		
		int age = 2020 - birthYear + 1; //한국 나이 계산
		
		System.out.printf("나이 : %d세\n", age); //나이 출력
		
		
	}
	
}
