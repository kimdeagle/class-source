package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//시작숫자, 종료숫자, 증가치 입력받아 출력
		
		//printAddNum 메서드 호출
		printAddNum();
		
		
	} //main

	private static void printAddNum() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 : "); //입력 안내
		
		int startNum = Integer.parseInt(reader.readLine()); //시작 숫자 입력값 저장
		
		System.out.print("종료 숫자 : "); //입력 안내
		
		int endNum = Integer.parseInt(reader.readLine()); //종료 숫자 입력값 저장
		
		System.out.print("증가치 입력 : "); //입력 안내
		
		int addNum = Integer.parseInt(reader.readLine()); //증가치 입력값 저장
		
		for (int i = startNum; i <= endNum; i += addNum) {
			System.out.println(i);
		}

		
	} //printAddNum
	
}
