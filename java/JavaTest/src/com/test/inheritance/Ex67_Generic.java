package com.test.inheritance;

public class Ex67_Generic {

	public static void main(String[] args) {
		
		//Ex67_Generic.java
		
		//제네릭(Generic)
		// - 제네릭 클래스
		// - 제네릭 메서드
		
		//요구사항] 클래스 설계
		// - 원칙 > 멤버 변수 1개 > 클래스의 모든 행동이 그 멤버 변수를 중심으로 구현
		//int
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		WrapperObject n2 = new WrapperObject(200); //업캐스팅
		System.out.println(n2);
		System.out.println((int)n2.getData() * 2); //다운캐스팅 -> Object * int
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3);
		System.out.println(n3.getData() * 2);
		System.out.println();
		
		
		//String
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("하하하");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		//boolean
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		
		
		//WrapperInt + WrapperString + WrapperBoolean + ... + WrapperXXX
		//WrapperObject 하나로 해결할 수 있다.
		
		//Object 장점
		// - 모든 자료형을 넣을 수 있다. > 코드 비용 감소
		//Object 단점
		// - 데이터를 꺼내서 활용할 때 어떤 자료형의 데이터가 들어있었는지 알기 힘들다.
		// - 잘못된 형변환을 할 수 있다 > 예외 발생 > 프로그램 안정성 감소
		
		//(원래자료형..뭐였지?)n2.getData() -> 소스를 찾아봐야 한다.

		//Generic 방식을 사용하면 해결된다. -> 상세 내용 : Ex68_Generic
		
		
	} //main
	
} //Ex67_Generic


//Wrapper Class
//1. int를 중심으로 하는 클래스 구현
//2. String을 중심으로 하는 클래스 구현
//3. boolean을 중심으로 하는 클래스 구현
//4. short
//5. byte
//6. long
//7. float
//8. double
//9. char
//10. Random
//11. Calendar
//12. Student
//... 결론 : 무제한


//1. int
class WrapperInt {
	
	private int data; //주인공. 클래스의 중심 요소
	
	public WrapperInt(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		return this.data + "";
	}
	
} //WrapperInt

//2. String
class WrapperString {
	
	private String data; //주인공. 클래스의 중심 요소
	
	public WrapperString(String data) {
		this.data = data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		return this.data + "";
	}
	
} //WrapperString

//3. boolean
class WrapperBoolean {
	
	private boolean data; //주인공. 클래스의 중심 요소
	
	public WrapperBoolean(boolean data) {
		this.data = data;
	}
	
	public void setData(boolean data) {
		this.data = data;
	}
	
	public boolean getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		return this.data + "";
	}
	
} //WrapperBoolean


//Object - root class
class WrapperObject {
	
	private Object data; //주인공. 클래스의 중심 요소
	
	public WrapperObject(Object data) {
		this.data = data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		return this.data + "";
	}
	
} //WrapperObject


//Generic
class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		
		return this.data + "";
	}
	
}




