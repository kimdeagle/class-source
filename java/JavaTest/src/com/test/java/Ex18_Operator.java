package com.test.java;

public class Ex18_Operator {

	public static void main(String[] args) {
		
		// Ex18_Operator.java
		
		// 메모리 영역(구역)
		// 1. Stack 영역
		//	- 개발자가 만든 모든 변수는 이 영역에 생성된다.
		// 2. Heap 영역
		
		// 비교 연산자
		// ==, != (equal, not equal)
		// 1. 숫자 == 숫자
		// 2. 문자열 == 문자열 (==, != 연산자에 한하여 다음 조건 성립)
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "아무개";
		
		// 참조형 변수는 주소값을 저장한다.
		// 참조형 변수끼리의 비교는 값의 비교가 아니고 주소값을 비교한다(***)
		System.out.println(s1 == s2); // ***절대로 사용하면 안된다.
		System.out.println(s1 == s3); // ***절대로 사용하면 안된다.
		
		// 절대로 사용하면 안되는 이유(예제)
		String s4 = "홍길동";
		String s5 = "홍";
		s5 = s5 + "길동";
		
		System.out.println(s4); // 홍길동 출력
		System.out.println(s5); // 홍길동 출력
		System.out.println(s4 == s5); // false -> 주소값이 달라서 false 출력. but, 주소를 찾아가보면 같은 "홍길동" 이 들어있기 때문에 사람 입장에서는 헷갈릴 수 있다. (주소값을 비교하기 때문에 사용X)
		
		// 문자열의 비교는 ==을 사용하지 않고 equals() 메서드를 사용한다.(***)
		System.out.println(s4.equals(s5)); // true -> 변수에 저장된 주소값으로 직접 찾아가 데이터를 확인 비교한다.
		
		// 참조형 == 참조형 : 주소값 비교
		// 참조형.equals(참조형) : 값(데이터) 비교
		
		
	}
	
}
