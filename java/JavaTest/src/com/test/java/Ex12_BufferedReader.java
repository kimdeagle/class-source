package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader; // BufferedReader 사용 선언
//import java.io.InputStreamReader;

//import java.io.*; // *(wildcard) - 모든(all) 클래스



public class Ex12_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		// 문자 1개 입력 -> 출력
		
//		System.out.print("문자 : ");
		
		// System.in.read() 같은 역할 코드
		// Ctrl + Shift + o -> 패키지(클래스) import 단축키
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// reader.read()
		// - 입력받은 글자를 문자 코드로 돌려준다.(System.in.read() 메서드와 같은 역할 but, 다른점 : 한글 사용 가능)
		// - 입력받은 문자의 문자코드값이 필요할 때 사용
		
		// reader.readLine()
		// 입력받은 글자를 문자열로 돌려준다.(한 라인을 통째로 가져온다.)
		
//		int data = reader.read();
//		System.out.printf("%c\n", data);
		
//		String data = reader.readLine();
//		System.out.println(data);
		
		// 요구사항] 사용자에게 이름을 입력 받아 인사말을 출력하시오.
		
		System.out.print("이름을 입력하세요 :");
		
		String name = reader.readLine();
		
		System.out.printf("%s님. 반갑습니다.\n", name);
		
				
	}
	
}
