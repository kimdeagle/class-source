package com.test.inheritance;

public class Ex62_Casting {

	public static void main(String[] args) {
		
		//Ex62_Casting.java
		
		/*
		
		형변환(Type Casting)
		
		1. 값형 형변환 : 값형끼리만 가능
		2. 참조형 형변환 : 참조형끼리만 가능
		
		값형 형변환
		- 숫자형끼리 가능(boolean 제외)
		- 작은형 -> 큰형 : 암시적(100% 성공)
		- 큰형 -> 작은형 : 명시적(Overflow 발생 가능)
		
		참조형 형변환
		- 클래스끼리 가능
		- 상속 관계를 맺은 클래스끼리만 가능(***) -> 부모 자식 관계에서만 가능
		- 자식클래스 -> 부모클래스 : 암시적, 업캐스팅(Up Casting), 100% 안전
		- 부모클래스 -> 자식클래스 : 명시적, 다운캐스팅(Down Casting), 100% 불가능
		
		*/
		
		//부모 객체
		CastParent p1 = new CastParent();
		
		p1.a = 10;
		p1.b = 20;
		
		//자식 객체
		CastChild c1 = new CastChild();
		
		c1.a = 10;
		c1.b = 20;
		c1.c = 30;
		c1.c = 40;
		
		CastParent p2; //(복사본)
		CastChild c2 = new CastChild(); //자식 객체(원본)
		
		//형변환
		//CastParent = CastChild
		//부모클래스 = 자식클래스
		//암시적, 업캐스팅
		//p2 = (CastParent)c2; //원형
		p2 = c2; //참조형 변수끼리의 복사 -> 주소값 복사
		
		//p2라는 복사본을 활용하는데는 전혀 문제가 없다.
		// -> 단, 실제 객체가 가지는 멤버 c와 d를 접근할 수 없다는게 장점 
		p2.a = 10;
		p2.b = 20;
		
		//형변환
		//CaseChild = CastParent
		//자식클래스 = 부모클래스
		//명시적, 다운캐스팅
		
		//에러 메시지
		//Exception in thread "main" java.lang.ClassCastException: 
		//CastParent cannot be cast to CastChild
		System.out.println(p2.a);
		System.out.println(p2.b);
		
//		CastParent p3 = new CastParent(); //원본(부모 객체)
//		CastChild c3; //복사본
//		
//		c3 = (CastChild)p3;
//		
//		//복사본 사용
//		c3.a = 10; //가능
//		c3.b = 20; //가능
//		c3.c = 30; //불가능
//		c3.d = 40; //불가능
//		
//		System.out.println(c3.a); //가능
//		System.out.println(c3.b); //가능
//		System.out.println(c3.c); //불가능
//		System.out.println(c3.d); //불가능
		
		
		//다운 캐스팅이 가능한 경우
		CastParent p4;
		CastChild c4 = new CastChild();
		
		//업캐스팅(100% 성공)
		p4 = c4;
		
		
		//... 다른 코딩 ...//
		
		CastChild c5;
		
		//다운 캐스팅(***)
		c5 = (CastChild)p4; // 1) p4 = c4; 2) c5 = (CastChild)p4; => 결국 c5 = c4;
		
		c5.a = 10;
		c5.b = 20;
		c5.c = 30;
		c5.d = 40;
		
		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
		
		
		
	} //main
	
	
}

class CastParent {
	public int a;
	public int b;
}

class CastChild extends CastParent {
	public int c;
	public int d;
}





