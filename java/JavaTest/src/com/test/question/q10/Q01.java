package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		//Q01
		//문장 입력받아 역순으로 출력
		
		//charAt()
		m1();
		
		System.out.println();
		
		//substring()
		m2();
		
	}

	private static void m2() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String txt = reader.readLine();
		
		System.out.print("역순 결과 : ");
		for (int i=txt.length()-1; i>=0; i--) {
			System.out.print(txt.substring(i, i+1));
			
		}
		
		
	} //m2

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String txt = reader.readLine();
		
		System.out.print("역순 결과 : ");
		for (int i=txt.length()-1; i>=0; i--) {
			System.out.print(txt.charAt(i));
			
		}
		
		
	} //m1
	
	
}
