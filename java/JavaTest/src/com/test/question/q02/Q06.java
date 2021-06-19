package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자를 입력받아 짝수인지 홀수인지 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : "); //숫자 입력 안내
		
		int num = Integer.parseInt(reader.readLine()); //입력값 저장
		
		System.out.printf("입력하신 숫자 \'%d\'은(는) \'%s\'입니다.\n", num, getNumber(num)); //getNumber 메서드 호출 후 반환값 출력
		
	}
	
	public static String getNumber(int num) {
		String result = num % 2 == 0 ? "짝수" : "홀수";
		return result;
	} //getNumber
	
}
