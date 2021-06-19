package com.test.question.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//국영수 점수 입력받아 합격, 불합격, 과락 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 : "); //국어 점수 입력 안내
		
		int korScore = Integer.parseInt(reader.readLine()); //국어 점수 입력값 저장
		
		System.out.print("영어 : "); //영어 점수 입력 안내
		
		int engScore = Integer.parseInt(reader.readLine()); //영어 점수 입력값 저장
		
		System.out.print("수학 : "); //수학 점수 입력 안내
		
		int mathScore = Integer.parseInt(reader.readLine()); //수학 점수 입력값 저장
		
		System.out.printf("%s입니다\n", test(korScore, engScore, mathScore)); //test 메서드 호출 후 반환값 출력
		
	}
	
	public static String test(int kor, int eng, int math) {
		String result = kor < 40 ? "과락" : eng < 40 ? "과락" : math < 40 ? "과락" : (kor + eng + math) / 3 >= 60 ? "합격" : "불합격";
		return result;
	} //test
	
	
}
