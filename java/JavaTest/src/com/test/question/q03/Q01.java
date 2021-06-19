package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//지하철 탑승 소요 시간 구하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수 : "); //입력 안내문
		
		int station = Integer.parseInt(reader.readLine()); //역 개수 입력값 저장
		
		System.out.print("환승역의 개수 : "); //입력 안내문
		
		int changeStation = Integer.parseInt(reader.readLine()); //환승역 개수 입력값 저장
		
		System.out.print("탑승 시간대 입력(평상시 1, 출근시 2, 퇴근시 3 입력) : "); //입력 안내문
		
		int timeState = Integer.parseInt(reader.readLine()) + 2; //시간대 입력값 저장
				
		System.out.printf("총 소요 시간은 %d분입니다.\n", getTime(station, changeStation, timeState)); //getTime 메서드 호출 후 반환값 출력
		
		
	} //main
	
	public static int getTime(int station, int changeStation, int timeState) {
		
		return (station * 2) + (changeStation * timeState);
		
	} //getTime
	
	
	
}
