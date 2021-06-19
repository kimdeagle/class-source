package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//사용자 이름과 인사 횟수 입력받아 출력
		
		//hello 메서드 호출
		hello();
		
		
	} //main

	private static void hello() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : "); //입력 안내
		
		String name = reader.readLine(); //이름 입력값 저장
		
		System.out.print("횟수 : "); //입력 안내
		
		int count = Integer.parseInt(reader.readLine()); //횟수 입력값 저장
		
		for (int i=1; i<=count; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}

		
	} //hello
	
}
