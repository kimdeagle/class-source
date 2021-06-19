package com.test.java;

public class Ex03_Variable {

	// 코드 조각(Code Template)
	// - 내장
	// - 사용자 정의
	// - public static void main(String[] args) {} 입력하기 -> main입력 후 Ctrl + Space
	
	public static void main(String[] args) {
		
//		// Code Assist, 인텔리센스(VS) - 자동완성기능 비슷한 기능(도움말 포함)
//		System.out.println("Test");
//		
//		// Tab키를 이용하여 녹색선(Guide Line)으로 이동할 수 있다.
//		System.out.println("abcd");
//		
//		// syso, sout 입력 후 Ctrl + Space -> System.out.println(); 자동 완성 입력(코드 조각)
//		System.out.println();
//		System.out.println();
		
		// 자료형 -> 코드에 적용하는 사례
		
		// 상수(Constant) - 데이터 자체, 프로그래밍에서는 리터럴(Literal)이라고 한다.
		
		// 변수(Variable) - 개발자가 필요해서 요청을 통해 메모리에 얻어놓은 공간
		
		// 한 학생의 국어 점수 관리
		
		// 1. 변수 선언(생성)
		//		- 형식 : "자료형 변수명;"
		//		- 변수명 = 메모리 번지 주소를 대표(대신)한다.
		byte kor; // 비어있는 메모리 공간 중 1byte를 할당받아 kor라는 변수를 선언(생성) 
		
		// 2. 변수 초기화
		kor = 80;
		
		// 3. 변수 호출
		System.out.println(100);
		System.out.println(kor); // 변수를 데이터처럼 취급(***)
		
		// 4. 변수 치환
		kor = 90;
		System.out.println(kor);
		
		// kor의 값이 변했다. -> 표기법은 'kor'로 동일한데 그 안의 값이 사용하는 시점에 따라 다른 값을 취급한다 => 변수
		
		// 영어 점수
		float eng; // 변수 생성
		eng = 92.5F; // 변수 초기화
		System.out.println(eng); // 변수 호출
		
		// 변수 선언 방법
		byte b1;
		b1 = 100;
		
		byte b2 = 100; // 변수 선언 + 초기화
		
		byte b3;
		byte b4;
		
		// 변수 그룹 선언 (개수 제한 X)
		byte b5, b6;
		
		// 혼합
		byte b7=10, b8=20, b9=30;
		byte b10=40, b11, b12, b13=50;
		
		// 변수 이름 만드는 방법
		// 1. 영문자, 숫자, _, $ 사용 가능(그외의 문자는 사용 불가능) 단, $ 사용 권장X(안쓴다고 보면 됨)
		// 2. 숫자로 시작하면 안 된다.
		// 3. 예약어 사용X(문법에서 사용하는 특정 단어들)
		// 4. 의미있게 만든다.(***) -> 풀네임 권장
		
		// int num = 10;
		// int num = 20; // Duplicate local variable num -> 지역 변수 "num" 중복 -> 변수명 변경
		
		// Java는 대소문자 구분 -> 변수를 아래와 같이 만들면 안된다(구분하기 힘듦)
		// int english, English, eNglish, ENGlish; 등등
		
		// 변수명 생성 패턴 -> 관습이지만 거의 필수 규칙(지키지 않으면 타인이 알아보기 힘들다.)
		// 1. 헝가리언 표기법 - 식별자를 만들 때, 식별자의 접두어로 해당 자료형을 표시하는 방법
		//		- int number; => int inumber; or int i_number; or int int_number; 형식으로 변수 선언
		//		- 변수명 위에 마우스를 올리면 자료형을 알려주기 때문에 요즘은 잘 쓰지 않는다.
		//		- 주로 인터페이스명에 사용
		// 2. 파스칼 표기법
		//		- 식별자의 첫문자를 항상 대문자 표기 + 나머지 문자는 소문자 표기
		// 		- 식별자가 2개 이상의 단어로 만들어지면 각 단어의 첫문자도 항상 대문자 표기
		//		- ex) int Serial, SerialNumber;
		//		- 주로 클래스명에 사용
		// 3. 카멜 표기법
		//		- 식별자의 첫문자를 항상 소문자 표기 + 나머지 문자는 소문자 표기
		// 		- 식별자가 2개 이상의 단어로 만들어지면 첫문자는 항상 소문자 표기 + 합성된 다음 단어의 첫문자 대문자 표기
		//		- ex) int serialNumber;
		//		- 주로 변수명, 메서드명에 사용
		// 4. 스네이크 표기법
		//		- 모든 문자를 소문자로 표기
		//		- 식별자가 2개 이상의 단어로 만들어지면 각 단어를 _(Under Bar)로 연결
		//		- ex) int note_size, student_weight;
		//		- 필요한 상황에 맞게(개인 취향)
		// 5. 케밥 표기법
		//		- 모든 문자를 소문자로 표기
		//		- 식별자가 2개 이상의 단어로 만들어지면 각 단어를 -(Hyphen)로 연결
		//		- 자바에서는 사용 불가(-를 연산자로 인식)
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
