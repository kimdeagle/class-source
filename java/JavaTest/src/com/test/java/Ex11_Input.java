package com.test.java;

import java.io.IOException;

public class Ex11_Input {

	public static void main(String[] args) throws IOException {
		
		// read() 메서드는 사용자가 입력한 문자를 가져오는 메서드가 아니라 입력 버퍼안의 들어있는 문자를 가져오는 메서드
		// 사용자 문자 입력 -> 입력 버퍼에 저장 -> read() 소비
		// 'A'를 입력하고 엔터를 치면 엔터까지 인식 (엔터는 \r\n) => A \r \n 3개의 문자가 입력 버퍼에 저장된다.
		
		System.out.print("입력 : ");
		
		int data = System.in.read();
		System.out.println(data);
		System.out.println(1);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(2);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(3);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(4);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(5);
		
	}
	
}
