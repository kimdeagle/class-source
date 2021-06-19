package com.test.java;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		// 8종류의 자료형을 각각 변수 + 데이터 + 사용
		// 1. 정수형
		// a. byte
		byte b1;
		b1 = 100;
		System.out.println("byte : "+b1);
		
		byte b2;
		b2 = 127; // 이클립스는 실시간으로 javac.exe와 연동하여 문법을 검사한다.
		System.out.println("byte : "+b2);
		
		byte b3;
		b3 = Byte.MAX_VALUE; // Byte.MAX_VALUE => byte형의 최대값
		System.out.println("byte : "+b3);
		
		byte b4;
		b4 = Byte.MIN_VALUE; // Byte.MIN_VALUE => byte형의 최소값
		System.out.println("byte : "+b4);
		
		// b. short
		short s1;
		s1 = 128;
		System.out.println("short : "+s1);
		
		s1 = 32000;
		System.out.println("short : "+s1);
		
		// c. int
		int n1;
		n1 = 100;
		System.out.println("int : "+n1);
		
		n1 = 2000000000;
		System.out.println("int : "+n1);
		
		// d. long
		long l1;
		l1 = 100;
		System.out.println("long : "+l1);
				
		l1 = 10000000000L; // 정수형 상수는 int로 취급 => long 자료형 변수에 int 범위 이외의 값을 넣고 싶을 땐, 값 뒤에 "L"을 붙인다.
		System.out.println("long : "+l1);
		
		// 2. 실수형
		// a. float
		float f1;
		f1 = 3.14F; // 실수형 상수는 double로 취급 => float 자료형 변수에 소수점이 있는 실수형 상수를 넣을 땐, 값 뒤에 "F"를 붙인다.
		System.out.println("float : "+f1);
		
		// b. double
		double d1;
		d1 = 3.14;
		System.out.println("double : "+d1);
		
		// 단정도, 배정도 확인
		f1 = 1.2345678901234567890123456789F;
		d1 = 1.2345678901234567890123456789D;
		System.out.println("float : "+f1); // 출력 결과 : 1.2345679 -> 소수 이하 7자리까지 유효
		System.out.println("double : "+d1); // 출력 결과 : 1.2345678901234567 -> 소수 이하 16자리까지 유효
		
		// 문자형
		// - char(2byte) -> 유니코드(Unicode)
		char c1;
		c1 = 'A'; //문자형 상수(문자형 리터럴) -> '문자' : 문자형 상수 표기법
		System.out.println(c1);
		
		c1 = 'B';
		System.out.println(c1);
		
		c1 = '김';
		System.out.println(c1);
		
		c1 = '1';
		System.out.println(c1);		
		
		// 논리형
		// - boolean(1byte) -> 참 or 거짓
		boolean flag;
		flag = true;
		System.out.println(flag);
		
		flag = false;
		System.out.println(flag);
				
		// 문자열
		// - 참조형
		// - 문자의 집합
		// - String
		
		// 학생 정보
		// - 이름 저장 -> 홍길동 출력
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		System.out.println("" + name1 + name2 + name3);
		
		String name;
		name = "아무개"; // 문자열 상수(문자열 리터럴) -> "문자열" : 문자열 리터럴 표기법
		System.out.println(name);
		
		String str;
		str = ""; // 빈 문자열(Empty String) - 프로그램상에서 필요에 따라 초기화하는 용도로 잘 사용	
		System.out.println(str);
		
		int m1 = 10;
		System.out.println(m1);
		
		int m2; // 변수를 생성하고 난 직후 -> NULL 상태(NULL값을 가진다.)
		m2 = 20;
		System.out.println(m2);
		
		//*** 자바에서는 지역 변수를 초기화하지 않은 상태에서는 사용(연산, 출력 등)할 수 없다.
		//int m3;
		//System.out.println(m3); // 출력 불가능
		
	}
	
}
