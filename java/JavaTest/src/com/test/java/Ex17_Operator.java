package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17_Operator {

	public static void main(String[] args) throws IOException {
		
		// Ex17_Operator.java
		
		// 연산자
		// 1. 산술 연산자 : +, -, *, /, %
		//	- 연산의 결과는 두 피연산자 중 더 큰 자료형으로 반환된다.(***)
		//	- 위의 상황을 컨트롤 하지 못하면 -> 오버플로우 발생
		
		// 2. 비교 연산자 : >, >=, <, <=, ==, !=(not equal)
		//	- 2항 연산자
		//	- 피연산자들의 비교 우위를 반환하는 역할
		//	- 피연산자는 숫자를 가진다.
		//	- 연산의 결과를 항상 boolean으로 반환한다.
		
		int a = 10;
		int b = 3;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		//나이 입력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이 입력 : ");
		
		//String data = reader.readLine(); // 입력하기 귀찮아서 주석처리함(아래 다른 예제를 위해)
		String data = "25";
		
		int age = Integer.parseInt(data);
		
		// 성인 확인?
		System.out.println(age >= 19); // 좋은 코드
		System.out.println(19 <= age); // 나쁜 코드(되도록 사용하지 말 것)
		
		
		// 유효성 검사(Validation Check) - (사용자 입력)데이터가 프로그램 상에서 쓸모가 있는 값인지 아닌지 판단하는 작업
		
		// 사용자 입력 문자 -> 소문자 입력 확인
		
		System.out.print("문자 입력(readLine()) : ");
		
		data = reader.readLine();
		
		// 문자 -> 영소문자?
		// 문자 코드 검사
		// a(97) ~ z(122)
		
		// String <-> int (x)
		// 참조형 <-> 값형 (x)
		// System.out.println((int)data);
		
		char c1 = data.charAt(0); // "a" -> 'a'
		
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println();
		
		System.out.print("문자 입력(read()) : ");
		
		int code = reader.read(); // 입력 문자의 문자 코드 반환
		
		System.out.println(code);
		
		// a(97) <= 입력문자 <= z(122)
		System.out.println(code >= 97);
		System.out.println(code <= 122);
		
		System.out.println(code >= (int)'a');
		System.out.println(code <= (int)'z');
		
		System.out.println(code >= 'a');
		System.out.println(code <= 'z');
		
		System.out.println("한글 검사");
		System.out.println(code >= '가');
		System.out.println(code <= '힣');
		
		System.out.println("숫자 검사");
		System.out.println(code >= '0');
		System.out.println(code <= '9');

		// System.out.println('홍' > '김'); // 값형끼리는 비교 연산이 가능
		// System.out.println("홍" > "김"); // 참조형끼리는 비교 연산이 불가능 
		
		
	}
	
}
