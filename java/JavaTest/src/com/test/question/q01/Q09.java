package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws IOException {
		
		//9번 문제 풀이
		//영문자 1개 입력받아 그 문자가 대문자인지 소문자인지 구분
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("영문자 입력 : "); //입력 안내문
		
		String data = reader.readLine(); //입력한 영문자 저장
		
		char alphabet = data.charAt(0); //문자열 -> 문자형 변환
		
		int alphabetCheck = (int)alphabet; //입력받은 문자의 문자코드값 저장
		
		String alphabetForm = alphabetCheck >= 65 && alphabetCheck <= 90 ? "대문자" : "소문자"; //A(65)~Z(90), a(97)~z(122) 문자코드 범위 확인
		
		System.out.printf("입력한 문자 \'%c\'는 %s입니다.\n", alphabet, alphabetForm); //결과 출력
		

	}
	
}
