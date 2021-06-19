package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws IOException {
		
		//10번 문제 풀이
		//섭씨 온도 입력받아 화씨 온도로 변환
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("섭씨(℃) : "); //입력 안내문
		
		String data = reader.readLine(); //입력값 저장
		
		int temperatureC = Integer.parseInt(data); //입력값 정수형 형변환
		
		float temperatureF = temperatureC * 1.8F + 32; //섭씨 -> 화씨
		
		System.out.printf("섭씨 %d℃는 화씨 %.1f℉ 입니다.\n", temperatureC, temperatureF); //결과 출력
		
		
	}
	
}
