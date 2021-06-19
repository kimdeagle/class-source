package com.test.java;

public class Ex15_Casting {

	public static void main(String[] args) {
		
		// Ex15_Casting.java
		
		/*
			(자료)형변환, (Data)Type Casting(***)
			 - int -> float
			 - double -> byte
			 ..
			 
			 형변환
			  - 값형간의 가능
			  - 참조형간의 가능
			  - 값형과 참조형간의 변환은 불가능 String -> int (X), int -> String (X)
			  
			 암시적인 형변환(자동 타입 변환)
			  - 큰형 = 작은형
			  - 100% 안전
			 
			 명시적인 형변환(강제 타입 변환)
			  - 작은형 = 큰형
			  - 경우에 따라 다름
		
		*/
		
		// '=' 연산자(대입 연산자)
		// 왼쪽에 있는 값 : LValue(변수) = RValue(상수, 변수)
		// (***) LValue의 자료형과 RValue의 자료형은 반드시 같아야 한다. 같지 않으면 에러 발생
				
		// 암시적 형변환 예제
		
		byte b1; // 원본
		short s1; // 복사본
		
		b1 = 10;
		s1 = b1; // 에러 발생.. 해야하는데 왜 정상적으로 출력이 되는가?
				 // 위 코드의 원본 : s1 = (short)b1;
				 // (short) >> 암시적으로 형변환을 해준다. 
				 // () : 형변환 연산자(캐스팅 연산자)
		
		System.out.println(s1);
		
		int n1 = 1000000000; // 원본(10억)
		long l1; // 복사본
		
		// long = int
		// 큰형 = 작은형
		// 암시적 형변환 발생
		l1 = n1; // 복사
		// 원본 : l1 = (long)n1;
		
		System.out.println(l1); // 복사본 확인
		
		// 명시적 형변환 예제
		byte b2;
		short s2; // 원본
		
		s2 = 1000; // *** 명시적 형변환이 발생할만한 복사에서는 원본의 값이 복사본의 자료형의 범위를 벗어나는지 반드시 확인한다!!
		
		// byte = short
		// 작은형 = 큰형
		// 명시적 형변환
		// *** 아주 무서운 일!! -> 에러 메세지가 안 뜸...
		b2 = (byte)s2;
		
		System.out.println(b2);
		
		// 기업은행 계좌
		
		int money = 2100000000; // 21억
		
		// 계좌이체
		short copy;
		
		// 이체
		copy = (short)money; // 명시적 형변환 -> 이 작업은 문제가 발생할 소지가 있기 때문에 개발자 본인이 반드시!! 정신차리고 봐야한다.
		
		// 계좌이체 확인 -> 잔액 출력
		
		System.out.println(copy);
		
		// 실수 <-> 실수
		
		float f1; // 원본
		double d1;
		
		f1 = 3.14F;
		
		// double = float
		// 큰형 = 작은형 -> 안전
		// 암시적 형변환
		d1 = f1;
		
		System.out.println(d1);
		
		float f2;
		double d2; // 원본
		
		d2 = 3.14;
		
		// float = double
		// 작은형 = 큰형
		// 명시적 형변환
		f2 = (float)d2;
		
		System.out.println(f2);
		
		// 정수형 상수는 자료형이 int이다.
		
		// byte = int
		byte m1 = 10; // 형변환 발생
		
		// short = int
		short m2 = 10; // 형변환 발생
		
		// int = int
		int m3 = 10;
		
		// long = int
		long m4 = 10; // 형변환 발생
		
		// 실수형 상수는 자료형이 double이다.
		
		// float = double
		float m5 = 3.14F; // 뒤에 F는 앞에 (float) 붙이는 것과 같다.
		
		// double = double
		double m6 = 3.14;
		
		// 정수 <-> 실수
		
		int n3; // 원본
		double d3;
		
		n3 = 100;
		
		d3 = n3;
		
		System.out.println(d3);
		
		int n4;
		double d4; // 원본
		
		d4 = 3.14;
		
		n4 = (int)d4;
		
		System.out.println(n4); // **** 주의!! -> 결과 : 3 -> 소수점 이하가 버려졌지만 잘못됬다고 할 수 없다. / 일부러 정수화 할 때 많이 쓴다.
		
		
		long l5; // 원본
		float f5;
		
		l5 = 100;
		
		// 명시적 형변환이 일어나야 하는데 빨간줄이 안생긴다? -> 암시적 형변환 : float(4byte) 바이트 수는 long(8byte) 보다 작지만 표현할 수 있는 숫자의 크기가 long보다 float이 훨씬 크기 때문이다.
		f5 = l5;
		
		long l6;
		float f6; // 원본
		
		f6 = 3.14F;
		
		// 암시적 형변환이 일어나는데 빨간줄이 생긴다? -> 명시적 형변환
		l6 = (long)f6;
		
		// 자료형 크기
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//				  char(2) << short와 int 중간쯤에 위치
		// 실수형이 정수형보다 크다.(표현할 수 있는 숫자의 크기)
		// char -> 정수형 취급
		
		
		char c7;
		int n7;
		
		c7 = 'A';
		
		n7 = c7; // 문자를 문자 코드값으로 변환해서 반환한다.

		System.out.println(n7); // > 65
		
		char c8;
		int n8;
		
		n8 = 97;
		
		c8 = (char)n8;
		
		System.out.println(c8); // > a
		
		// 주의할 점
		
		char c9; // 2byte
		int n9; // 4byte
		short s9; // 2byte
		
		c9 = 'A';
		
		// 둘 다 2byte 이지만 표현되는 범위가 다르다.
		// short : -32768 ~ +32767
		// char : 0 ~ 65535
		// short로 변환하게 되면 잘못 변환되는 경우가 있다.
		// 따라서 char를 문자코드로 상호 변환할 때는 반드시 int를 사용해야 한다.
		// 명시적 형변환
		s9 = (short)c9;
		
		System.out.println(s9);
		
		
	}
	
}
