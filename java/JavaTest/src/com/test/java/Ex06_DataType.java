package com.test.java;

public class Ex06_DataType {

	public static void main(String[] args) {
		
		// 숫자 변수 2개 + 더하는 연산과정과 결과를 출력
		// 출력 결과 : 10+20=30
		int a = 10, b = 20;
		System.out.println(a + b); // 산술 연산자
		System.out.println("a" + "b"); // 문자열 연산자
		System.out.println(a + "b"); // 문자열 연산자
		System.out.println(a + "+" + b + "=" + a + b); // 문자열 연산자
		System.out.println(a + "+" + b + "=" + (a + b)); // 우선순위에 따라 (a + b) 먼저 수행
		
		// 숫자 형태의 데이터를 취급할 때 주의할 점!!
		// 1. 주민등록번호 저장
		//	 - ex) 9510201012345
		//	 - 형태 -> 숫자, 길이 -> long
		
		long jumin = 9510201012345L;
		System.out.println("주민등록번호 : "+jumin);
		
		jumin = 0310201012345L; // 8진수 310201012345로 인식 
		System.out.println("주민등록번호 : "+jumin);
		
		String jumin2 = "0310201012345"; // 8진수 310201012345로 인식 
		System.out.println("주민등록번호 : "+jumin2);
		
		// 자바에서 숫자 상수 표기법(정수에 한해서)
		// - 기수법 표기 : 10진수(기본), 8진수(앞에 0을 붙인다.), 16진수(앞에 0x를 붙인다.)
		
		// 2. 상품 번호 저장
		//	 - 0001, 0002, 0003, 0004...
		
		String no = "0001";
		System.out.println(no);
		
		// 숫자로 구성되어 있는 데이터의 자료형을 선정할 때 기준
		// 1. 숫자 : 연상의 대상이 되는 경우
		// 2. 문자열 : 그 외 나머지
		
		
		
		
		
		
		
		
	}
	
}
