package com.test.inheritance;

public class Ex66_enum {

	public static void main(String[] args) {
		
		//Ex66_enum.java
		
		//열거형(Enumeration)
		// - 클래스의 일종
		// - 열거값을 가지는 자료형(= 제시한 값 중에서 선택해서 사용하는 자료형)
		// - 상속의 구성원이 될 수 없다.
		
		//상황] 의류 쇼핑몰 > 고객 > 티셔츠 > 색상 선택
		// - 색상 : 빨강, 파랑, 노랑
		
		//Case 1.
		// - 주관식 > 오타 > 고객 + 개발자 모두 책임
		// - 구현하기 편함
		// - 가독성 좋음
		// - 유효성 검사 필수(***)
		String color = "red";
		System.out.println(color);
		
		
		//Case 2.
		// - 객관식
		// - 구현하기 편함
		// - 가독성 낮음(코드상)
		// - 유효성 검사(*)
		// - 많이 사용
		
		//1. red
		//2. blue
		//3. yellow
		int color2 = 1;
		System.out.println(color2);
		
		
		//Case 3.
		//열거형 사용(추천 방법)
		// - 객관식에 가까운 방식
		// - 가독성 높음(코드상)
		// - 유효성 검사 필요 없음
		Color color3 = Color.RED;
		System.out.println(color3);
		
		
		//Cannot instantiate the type Gender -> 객체를 만들 수 없다.
		//Gender g = new Gender();
		
		//열거형 변수 = 열거형 데이터
		Gender g1 = Gender.MALE;
		Gender g2 = Gender.FEMALE;
		
		//enum에 없는 값을 넣을 경우(차장) 컴파일 오류가 난다. -> 실행 자체가 안 됨 -> 유효성 검사 필요X
		//직급 m = 직급.차장;
		
		
	} //main
	
} //Ex66_enum

class OOO {
	
}

abstract class OOOO {
	
}

interface OOOOO {
	
}

enum OOOOOO {
	
}


//성별 표현(남, 여) -> 내가 만든 자료형으로 객체화가 된다면 딱 2종류밖에 없음
//열거형의 멤버는 대문자로 작성 -> final 변수라서
enum Gender {
	MALE,
	FEMALE
}


enum Color {
	RED,
	BLUE,
	YELLOW
}

enum 직급 {
	부장,
	과장,
	대리,
	사원
}
