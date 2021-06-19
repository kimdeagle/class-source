package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		//3번 문제 풀이
		//사각형 너비와 높이 입력받아 넓이와 둘레 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비(cm) : "); //너비 입력 안내문
		
		String data1 = reader.readLine(); //너비 입력값 저장
		
		System.out.print("높이(cm) : "); //높이 입력 안내문
		
		String data2 = reader.readLine(); //높이 입력값 저장
		
		int weight = Integer.parseInt(data1); //너비 입력값 정수형 형변환
		
		int height = Integer.parseInt(data2); //높이 입력값 정수형 형변환
		
		System.out.printf("사각형의 넓이는 %d㎠ 입니다.\n", weight * height); //넓이 출력
		
		System.out.printf("사각형의 둘레는 %dcm 입니다.\n", 2 * (weight + height)); //둘레 출력
		
		
	}
	
}
