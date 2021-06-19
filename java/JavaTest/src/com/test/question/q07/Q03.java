package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//랜덤 맞추기
		
		random();
		
		
	} //main

	private static void random() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		int random = (int)(Math.random() * 10) + 1; //난수 생성 -> 0.0 이상 0.1 미만 -> 1~10
		
		int count = 0; //시도한 횟수
				
		
		for (;;) {
			
			System.out.print("숫자 : "); //입력 안내
			
			int num = Integer.parseInt(reader.readLine());
			
			count++;
			
			if (num == random) { //맞추면
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", count);
		
		System.out.println("프로그램을 종료합니다.");

		
	} //random
	
	
}
