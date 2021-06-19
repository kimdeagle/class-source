package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		//4번 문제 풀이
		//자전거 바퀴 지름 26인치. 페달 밟은 횟수에 따른 달린 거리 계산
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수 : "); //입력 안내문
		
		String data = reader.readLine(); //입력값 저장
		
		int cycle = Integer.parseInt(data); //입력값 정수형 형변환
		
		int wheelSize = 26; //바퀴 사이즈(inch)
		
		float inchToMeter = 0.0254F; //1인치=0.0254m
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.4fm를 달렸습니다.\n", cycle, cycle * wheelSize * inchToMeter); //달린 거리 계산 출력(inch -> m)
		
		//기어비 추가로 입력받아 계산하기
		
		System.out.print("자전거 단수 입력(숫자만 입력) : "); //입력 안내문
		
		String data2 = reader.readLine(); //입력값 저장
		
		int gear = Integer.parseInt(data2); //입력값 정수형 형변환
		
		int gearRatio = gear * wheelSize; //기어비
		
		System.out.printf("사용자가 %d단으로 %,d회 페달을 밟아 자전거가 총 %,.4fm를 달렸습니다.\n", gear, cycle, cycle * gearRatio * inchToMeter); //기어비에 따른 달린 거리 계산 출력(inch -> m)
		
		
	}
	
}
