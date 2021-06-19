package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		//Q03
		
		m1();
		
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("금액(원) : ");
		
		String txt = reader.readLine();
		
		String[] number = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		
		String[] unit = { "만", "천", "백", "십", "" };
		
		System.out.print("일금 ");
		
		for (int i=0; i<txt.length(); i++) {
			String findNum = "";
			
			findNum = txt.substring(i, i+1);
			
			if (findNum.equals("0")) {
				continue;
			} else  if (findNum.equals("1")) {
				System.out.print(unit[i]);
			} else {
				System.out.print(number[Integer.parseInt(findNum)] + unit[i]);
			}
			
		}
		
		System.out.println("원");
		
		
	} //m1
	
}
