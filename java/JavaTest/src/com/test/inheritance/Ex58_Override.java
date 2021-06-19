package com.test.inheritance;

public class Ex58_Override {

	public static void main(String[] args) {
		
		//Ex58_Override.java
		
		//메서드 오버라이드(Method Override)
		// - 메서드 재정의(기존의 메서드를 무시하고 새로 구현한다.)
		// - 메서드 헤더(시그너처) + 메서드 바디(구현부)
		// - 메서드 헤더를 그대로 두고 메서드 바디를 재정의
		// - 상속에서 발생 > 자식 클래스에서 발생		
		
		//옆집 아저씨
		NormalParent p = new NormalParent();
		
		p.hello();
		
		//옆집 아저씨 아들 -> 문제
		NormalChild c = new NormalChild();
		
		//누가 선택될지 알 수 없다. -> 혼동 -> 가독성 떨어짐 -> 의도 불분명
		//c.hello();
		//c.hi();
		
		c.hello(); //메서드 재정의
		
	} //main
	
}

class NormalParent {
	
	public void hello() {
		System.out.println("안녕하세요.");
	}
	
}

class NormalChild extends NormalParent {
	
//	public void hi() {
//		System.out.println("Hello~");
//	}
	
	//메서드 오버라이드 발생
	// - 부모가 물려준 메서드를 그대로 명시적 선언을 하면 부모 메서드를 감춘다.
	// - 부모 메서드와 자식 메서드를 동시에 존재하게 해준다.
	// - 자식이 우선순위가 더 높다.
	public void hello() {
		System.out.println("Hello~");
	}
	
}


//메서드 오버로딩 vs 메서드 오버라이드 -> 면접 질문으로 많이 나온다.


abstract class AbstractParent {
	
	public abstract void test(); //추상 메서드
	
}


class AbstractChild extends AbstractParent {
	
	@Override //어노테이션(Annotation) : 컴파일러가 인식하는 주석(명령어)
	public void test() {
		
	}
	
}











