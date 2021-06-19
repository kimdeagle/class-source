package com.test.java;

public class Ex16_Operator {

	public static void main(String[] args) {
		
		// Ex16_Operator.java
		
		// 연산자(Operator) - 피연산자(Operand)를 대상으로 미리 정해진 연산(계산, 특정 행동)을 한 후에 결과값을 반환하는 요소
		// - 주로 기호를 사용해서 표현
		
		// 1. 문장(Statement) : 표현식의 집합
		// 2. 표현식(Expression)
		// 3. 연산자
		// 4. 피연산자
		// 5. 연산자 우선순위
		// 6. 연산 방향
		
		// 연산자의 종류
		// 1. 산술 연산자 : +, -, *, /, %
		//	 - 2항 연산자
		//	 - 피연산자를 숫자로 가진다.(정수, 실수)
		
		// int result = 1 + 2 * 3 + 4; // 문장(Statement)
		
		// 1 + 2 * 3 + 4
		// 1 + 6 + 4 >> Step1
		// 7 + 4 >> Step2
		// 11 >> Step3
		
		int a = 10;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println();
		
		// 주의할 점!!
		// *** 모든 산술 연산의 결과 자료형은 두 피연산자의 자료형 중 더 큰 자료형으로 반환된다.
		// *** + 연산할 때 넘치는 것 신경쓸 것
		// *** * 연산할 때 넘치는 것 더욱 신경쓸 것
		// *** - 연산할 때 넘치는 것 신경 쓸 것(마이너스 쪽으로 넘칠 수 있다.)
		// *** / 연산할 때 신경 쓸 필요 없음
		// *** % 연산할 때 신경 쓸 필요 없음
		
		System.out.println(10 / 3); // int / int = int >> 3
		System.out.println(10.0 / 3); // double / int = double >> 3.333333..
		System.out.println(10 / 3.0); // int / double = double >> 3.333333..
		System.out.println(10.0 / 3.0); // double / double = double >> 3.333333..
		System.out.println();
		
		// 주의할 점!!!
		int n1 = 2000000000;
		int n2 = 2000000000;
		int n3;
		
		n3 = n1 + n2;
		
		System.out.println(n3);

		System.out.println(2000000000L + 2000000000); // int형으로 20억 + 20억을 하면 잘못된 값이 나온다. -> 둘 중 한가지 이상은 더 큰 long형으로 사용
		
		
		// 오버플로우(Overflow)
		// 언더플로우(Underflow)
		
		// byte b1;
		// int n1 = 200;
		// b1 = (byte)n1;
		
		
	}
	
}
