package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		// 에러(Error) - 오류, 버그(Bug), 예외(Exception) 등
		// 1. 컴파일 오류
		//	 - 컴파일할 때 발생하는 오류 : 소스 코드를 기계어(Machine Code), 이진코드(Binary Code)로 번역하다 생기는 오류
		//	 - 컴파일러가 번역을 할 때 문법이 올바른지 확인하는 과정에서 발견
		//	 - 오류가 발생하면 컴파일 작업을 중단(번역 중지)
		//	 - 난이도 가장 낮음 -> 발견하기 쉽다 => 고치기 쉽다
		//	 - 컴파일러가 어떤 오류인지 알려준다.
		//	 - 오타		
		
		// 2. 런타임 오류
		//	 - 컴파일 작업때는 발견이 안됐는데 실행 중에 발견되는 오류
		//	 - 예외(Exception)
		//	 - 발견 난이도 중간 정도, 발견 확률 복불복
		//	 - ex) int형 num 변수에 0을 입력하여 100 / num 연산을 하게 되면 런타임 오류 발생
		//	 - 모든 경우의 수를 미리 예측해서 테스트 해야 한다 -> 어떻게든 미리 발견!
		//	 - 테스트 방법
		//		 1) 사람을 동원(ex. alpha test, beta test)
		//		 2) 테스트용 프로그램 이용	
		
		// 3. 논리 오류
		//	 - 문법도 틀린 곳이 없고, 실행도 잘 되는데...? 결과가 이상함??
		//	 - 발견 힘듦. 수정 난이도 높음
		//	 - 논리 오류는 자기 눈에는 안보임 -> 남의 눈에는 보임 -> 본인이 시도하다 안 되면 타인에게 도움 요청
		
		
		// 요구사항] 사용자의 년도를 입력받아 나이를 출력하시오.
		
		System.out.print("생년 입력 (ex. 1995) : "); // 입력 안내문
		
		
		// Code Template 관리(조각 코드)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// readLine() 메서드는 모든 입력 데이터가 문자열(String)로 반환된다.
		String data = reader.readLine(); // 입력 받기
		
		// "1995"(문자열)를 1995(정수형)으로 변경
		int year = Integer.parseInt(data); // 자료형 변환
		
		
		// error] The operator - is undefined for the argument type(s) int, String
		int age = 2020 - year + 1; // 나이 계산하기
		
		System.out.printf("%d년생은 현재 %d세 입니다.\n", year, age);
		
		// 입력된 문자열(String)을 다른 자료형으로 바꾸는 기능		
		// "문자열" -> byte : Byte.parseByte("10");
		// "문자열" -> short : Short.parseShort("10");
		// "문자열" -> int : Integer.parseInt("10"); -> 가장 많이 쓰임
		// "문자열" -> long : Long.parseLong("10");
		
		// "문자열" -> float : Float.parseFloat("3.14");
		// "문자열" -> double : Double.parseDouble("3.14");
		
		// "문자열" -> boolean : Boolean.parseBoolean("true");
		
		// (문자열)"A" -> (문자형)'A' : "A".charAt(0);
		
		
	}
	
}
