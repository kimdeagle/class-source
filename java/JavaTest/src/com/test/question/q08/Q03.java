package com.test.question.q08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q03
		
		m1();
		
	}

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행 개수 : ");
		
		int row = Integer.parseInt(reader.readLine());
		
		for (int i=1; i<=row; i++) {
			
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			
			for (int j=i; j<=row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
}
