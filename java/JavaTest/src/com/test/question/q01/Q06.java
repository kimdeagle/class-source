package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws IOException {
		
		//6번 문제 풀이
		//영문 소문자 1개 입력받은 후 대문자로 변환
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("영문 소문자 1개 입력 : "); //입력 안내문
		
		int data = reader.read(); //입력값 저장(입력한 문자의 문자코드 저장됨)
		
		char alphabet = (char)data; //문자코드 -> 문자
		
		char alphabet2 = (char)(data-32); //a(97) A(65) -> 32차이가 나기 때문에 32를 빼준다. //문자코드 -> 문자
		
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\' 입니다.\n", alphabet, alphabet2); //결과 출력
		
		
		//문자열로 받아 변환하는 과정
		
//		String data = reader.readLine(); //입력값 저장
//		
//		char alphabet = data.charAt(0); //문자열을 문자형으로 변환
//		
//		int alphabetChange = (int)alphabet - 32; //a(97) A(65) -> 소문자를 대문자로 바꾸기 위한 작업(1)
//		
//		char alphabet2 = (char)alphabetChange; //소문자를 대문자로 바꾸기 위한 작업(2)
//		
//		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\' 입니다.\n", alphabet, alphabet2); //결과 출력	
		
		
	}
	
}
