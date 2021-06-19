package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws IOException {
		
		//Q07
		m1();
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단어 : ");
		
		String txt = reader.readLine();
		
		for (int i=0; i<txt.length(); i++) {
			char alphabet = txt.charAt(i);
			if (i != 0) {
				if (alphabet >= 'A' && alphabet <= 'Z') {
					System.out.print(" ");
				}
			}
			System.out.print(alphabet);
		}
		
		
	} //m1
	
}
