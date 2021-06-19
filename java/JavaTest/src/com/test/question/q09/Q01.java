package com.test.question.q09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q01
		
		m1();
		
	}

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행 개수 입력 : ");
		
		int row = Integer.parseInt(reader.readLine());
		
		char alphabet = 97; //a
		
		for (int i=1; i<=row; i++) {
			for (int j=row; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i; j++) {
				System.out.print((char)(alphabet+j));
			}
			for (int j=0; j<i; j++) {
				System.out.print((char)(alphabet+i-j-1));
			}
			
			System.out.println();
		}
		
		
	}
	
}
