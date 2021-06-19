package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws IOException {
		
		//Q09
		
		m1();
		
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민등록번호 : ");
		
		String jumin = reader.readLine();
		
		jumin = jumin.replace("-", "");
		
		int sum = 0;
		
		//'0' : 48, '9' : 57 -> -48
		for (int i=0; i<jumin.length()-1; i++) {

			
			char c = jumin.charAt(i);
			
			if (i < 8) {
				sum += ((int)c - 48) * (i + 2);
			} else {
				sum += ((int)c - 48) * (i - 6);
			}
			
		}
		if (11 - (sum % 11) == 0) {
			if ((int)(jumin.charAt(jumin.length()-1)) - 48 == 1) {
				System.out.println("올바른 주민등록번호입니다.");
			} else {
				System.out.println("올바르지 않은 주민등록번호입니다.");
			}
		} else if (11 - (sum % 11) == 1) {
			if ((int)(jumin.charAt(jumin.length()-1)) - 48 == 0) {
				System.out.println("올바른 주민등록번호입니다.");
			} else {
				System.out.println("올바르지 않은 주민등록번호입니다.");
			}
		} else {
			if (11 - (sum % 11) == (int)(jumin.charAt(jumin.length()-1)) - 48) {
				System.out.println("올바른 주민등록번호입니다.");
			} else {
				System.out.println("올바르지 않은 주민등록번호입니다.");
			}
		}

		
	} //m1
	
}
