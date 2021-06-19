package com.test.java;

import java.io.IOException;

public class Ex10_Input {

	public static void main(String[] args) throws IOException {
		
		// Ex10_Input.java
		
		// 프로그램을 잘 만드는 방법(개발을 잘하려면..)
		// - 스토리 -> 흐름 파악 + 설계
		
		// 요구사항] 영문자 1개를 입력받아서 화면에 출력하시오.
		
		// 1. 사용자에게 문자를 입력해달라는 안내 메세지 출력
		System.out.println("문자를 입력하세요.");
		
		// 2. 사용자 키 입력 준비 및 입력
		// 3. 사용자가 입력한 값 가져오기
		int data = System.in.read();
		
		// 4. 화면 출력
		// - 형식 문자 %c는 숫자를 전달받으면 해당 숫자의 문자를 출력한다.
		System.out.printf("사용자가 입력한 문자는 '%c'입니다.\n", data);
		
	}
	
}
