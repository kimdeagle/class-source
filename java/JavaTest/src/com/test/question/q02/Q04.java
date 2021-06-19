package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
	
		//이름 전달하면 뒤에 '님' 붙여서 반환하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : "); //이름 입력 안내문
		
		String name = reader.readLine(); //입력값 저장
		
		System.out.printf("고객 : %s\n", getName(name)); //getName 호출 후 반환값 출력
		
	}
	
	public static String getName(String name) {
		
		return name + "님";
		
	} //getName

	
}
