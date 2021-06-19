package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws IOException {
		
		//Q05
		//숫자를 입력받아 3자리마다 , 붙이기
		
		m1();
		
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		
		String txt = reader.readLine();
		
		String temp = "";
		
		int count = 0;
		
		
		for (int i=txt.length()-1; i>=0; i--) {
			
			char c = txt.charAt(i);
			
			temp += c;
			count++;
			
			if(i == 0) {
				break;
			}
			
			if(count == 3) {
				temp += ",";
				count = 0;	
			}
			
		}
		
		for (int i=temp.length()-1; i>=0; i--) {
			char c = temp.charAt(i);
			System.out.print(c);
		}
		

	} //m1
}
