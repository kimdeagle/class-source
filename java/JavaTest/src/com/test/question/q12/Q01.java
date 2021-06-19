package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		//Q01
		
		m1();
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("텍스트 입력 : ");
		String txt = reader.readLine();
		
		int indexB = -1; //바보 index
		int indexM = -1; //멍청이 index
		
		int countB = 0; //바보 횟수
		int countM = 0; //멍청이 횟수
		
		while (true) {
		
			indexB = txt.indexOf("바보", indexB);
			indexM = txt.indexOf("멍청이", indexM);
			
			if (indexB == -1 && indexM == -1) {
				txt = txt.replace("바보", "**");
				txt = txt.replace("멍청이", "***");
				System.out.println(txt);
				System.out.printf("금지어를 %d회 마스킹했습니다.\n", countB + countM);
				break;
			}
			
			countB++;
			countM++;
			
			indexB += "바보".length();
			indexM += "멍청이".length();
			
			
		}
		
		
	} //m1
	
}
