package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		//Q02
		//이메일 주소 아이디, 도메인 나누기
		
		m1();
		
		
	}

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이메일 : ");
		String email = reader.readLine();
		
		System.out.printf("아이디 : %s\n", email.substring(0, email.lastIndexOf('@')));
		System.out.printf("도메인 : %s\n", email.substring(email.lastIndexOf('@')+1));
		
		
	} //m1
	
	
	
}
