package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 1개 입력받아 1부터 입력한 숫자까지 합 출력
		
		//sum 메서드 호출
		sum();
		
		
	}

	private static void sum() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : "); //입력 안내
		
		int num = Integer.parseInt(reader.readLine()); //입력값 저장
		
		int sum = 0;
		
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %,d = %,d\n", 1, num, sum);
		
		
	} //sum
	
}
