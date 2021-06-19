package com.test.inheritance;

import java.util.Calendar;

public class Ex61_final {

	public static void main(String[] args) {
		
		//final 키워드
		// - 한번 만든건 고칠 수 없다.
		// - 왜 쓰는지? -> 프로그램 안정성을 위해서!!
		//1. 변수에 적용
		//2. 메서드에 적용
		//3. 클래스에 적용
		
		//지역 변수에 final 키워드 적용 > final 변수, 상수
		// - (이름이 있는) 상수
		
		int a = 10; //일반 변수
		final int b = 20; //final 변수
		
		System.out.println(a);
		System.out.println(b);
		
		a = 30;
		
		//The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		//값을 변경할 수 없다. -> final 변수
		//b = 40;
		
		//상수명 표기법
		// - 일반 변수명과 구분
		// - 대문자 표시
		//파이값
		final double PI = 3.14;
		
		//곤란한 표기법...
		//int NUM = 10;
		//final int age = 20;
		
		System.out.println(Calendar.YEAR);
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(1)); //A. 가독성 낮음 -> 탈락
		System.out.println(now.get(Calendar.YEAR)); //B. 가장 좋은 방법
		
//		MyCalendar my = new MyCalendar();
//		System.out.println(now.get(my.year)); //C. 불편해서 탈락
		
		System.out.println(now.get(MyCalendar.YEAR)); //D. 
		
		
	}
	
}

class MyCalendar {
	
	public static final int YEAR = 1;
	
}


class FinalParent {
	
	//final 메서드
	// - 상속시 발생하는 안정성 문제때문에 한다.
	// - 잘 모르겠다 -> final로 만들기
	public final void hello() {
		System.out.println("안녕하세요.");
	}
	
}


class FinalChild extends FinalParent {
	
	//Cannot override the final method from FinalParent
//	@Override
//	public void hello() {
//		System.out.println("Hello~");
//	}
	
}


//클래스 상속
// - 부모 클래스, 슈퍼 클래스(Super), 기본 클래스
// - 자식 클래스, 서브 클래스(Sub), 확장 클래스, 파생 클래스


//final 클래스
final class Mouse {
	
}


//The type OpticalMouse cannot subclass the final class Mouse

//class OpticalMouse extends Mouse {
//	
//	
//}





