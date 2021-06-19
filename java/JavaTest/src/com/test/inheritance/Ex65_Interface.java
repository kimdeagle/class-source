package com.test.inheritance;

public class Ex65_Interface {

	public static void main(String[] args) {
		
		//TODO 클래스 관계 참고자료
		//상속
		// - 상속의 구성원이 될 수 있는 요소
		// - 일반 클래스, 추상 클래스, 인터페이스
		
		//		[자식]			[부모]
		//1. 일반클래스			일반클래스		: O
		//2. 일반클래스			추상클래스		: O
		//3. 일반클래스			인터페이스		: O
		//4. 추상클래스			일반클래스		: O(절대 사용 금지!!) - 논리에 맞지 않는다.
		//5. 인터페이스			일반클래스		: X(절대 불가능) - 구현된 멤버를 상속하기 때문
		//6. 추상클래스			인터페이스		: O - 추상 클래스도 추상 메서드를 가질수 있기 때문
		//7. 인터페이스			추상클래스		: X(5번과 동일)
		//8. 추상클래스			추상클래스		: O
		//9. 인터페이스			인터페이스		: O
		//10. 일반클래스 -> 일반클래스 -> 추상클래스 -> 추상클래스 -> 인터페이스 -> 인터페이스
		
		
	} //main
	
} //Ex65


class AAAA {
	//일반 클래스 -> 구현된 멤버만 가질 수 있다.
	public int a;
	//public abstract void test();
}

abstract class BBBB extends AAAA {
	//추상 클래스 -> 구현된 멤버도 가질 수 있다.
}

//interface CCCC implements AAAA {
//	//인터페이스 -> 추상 멤버만 가질 수 있다.
//}

interface CCCC {
	void test(); //추상 메서드
}

abstract class DDDD implements CCCC {
	//인터페이스에서 상속받은 추상 메서드
	//1. 추상 메서드를 가질 수 있다.
	//2. 오버라이드 할 수도 있다.
	// -> 선택권이 있다.
}

class FFFF extends DDDD {

	@Override
	public void test() {
	}
	
}

class EEEE implements CCCC {

	@Override
	public void test() {
	}
	
}










