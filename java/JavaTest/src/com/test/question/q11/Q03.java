package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q03
		
		m1();
		
	} //main

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수 입력 : ");
		int count = Integer.parseInt(reader.readLine());
		
		String[] names = new String[count];
		
		for (int i=0; i<count; i++) {
			
			System.out.print("학생명 : ");
			String name = reader.readLine();
			names[i] = name;
			
		}
		
		System.out.println();
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", count);
		
		for (int i=1; i<=count; i++) {
			System.out.printf("%d. %s\n", i, names[count - i]);
		}
		
		
		
	} //m1
	
}
