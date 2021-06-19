package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		
		//Ex20_Method.java
		
		//Method 메서드
		// - 메서드(Method), 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine) 등으로 불림
		// - 코드의 집합
		// - 특정 목적을 가지고 행동하는 코드의 집합(***)
		// - 메서드는 재사용이 가능한 단위 요소(***)
		
		
		/*
		
		메서드 사용법
		1. 메서드 선언하기(정의하기)
		
		접근지정자 정적키워드 반환자료형 메서드명(인자리스트) { //메서드 헤더, 메서드 시그니처(Signature)
			실행코드; //메서드 바디, 구현부
		}
		
		public static void test() {
			System.out.println("test");
		}
		
		
		2. 메서드 호출하기(사용하기)
		
		
		*/
		
		//요구사항] "안녕하세요" * 5번 출력
		//수정사항] "안녕하세요" -> "반갑습니다"
		
		//1. 하드 코딩, 막코딩
		// - 코드 재사용 낮음 -> 비효율적
		// - 유지 보수성 낮음 -> 수정하기 힘듬
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		
		//2. 메서드 사용
		//2.2 메서드 호출
		// - 코드 재사용 높음 -> 효율적
		// - 유지 보수성 높음 -> 수정 용이
		hello();
		hello();
		hello();
		hello();
		hello();
		
		System.out.println();
		
		//요구사항] "하나~열"까지 출력
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		
		System.out.println();
		
		countNumber();
		
		//수정사항] 위 요구사항 * 10번 + 영어로 바꿔주세요
		// - 메서드 호출하여 사용하는 것이 재사용성, 유지보수 측면에서 더 좋다.
		
		
		
		
	} //main
	
	//*** 이 위치(클래스 내부)에서만 메서드 선언이 가능하다.
	//*** 선언된 메서드들끼리의 순서는 상관없다.
	
	//2.1 메서드 선언
	// - 메서드명 : 캐멀 표기법(소문자 시작 + 각 단어의 첫문자를 대문자) + 의미있게
		
	public static void hello() {
		
		System.out.println("안녕하세요.");
		
	}
	
	public static void countNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		
	}
	
	
	
	
} //Ex20_Method
