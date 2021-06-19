package com.test.obj;

public class Ex44_Access {

	public static void main(String[] args) {
		
		//접근 지정자(제어자), Access Modifier
		// - public, private, protected, default
		// - 클래스를 경계로 내부의 멤버(변수, 메서드)를 외부에 공개할지를 결정하는 보안 단계
		
		//1. public
		// - 클래스(객체)의 울타리를 경계로 외부에 멤버를 100% 공개
		
		//2. private
		// - 클래스(객체)의 울타리를 경계로 외부에 멤버를 100% 비공개
		
		Item item = new Item();
		
		item.a = 10;
		//item.b = 20; //The field Item.b is not visible
		
		System.out.println(item.a);
		//System.out.println(item.b);
		
		
		//강아지
		Dog dog = new Dog();
		
		//dog.X
		
//		dog.name = "멍멍";
//		dog.age = 2;
//		dog.color = "흰색";
		
//		dog.name = "멍멍이";
//		dog.age = 200000000; //2억
//		dog.color = "안녕하세요";
//		
//		System.out.println(dog.name);
//		System.out.println(dog.age);
//		System.out.println(dog.color);
		
		
		//객체의 상태를 변화
		// - 멤버 변수의 값을 변화
		// - 멤버 변수가 public 지정 -> 자료형에 일치(O), 사용자가 요구하는 유효성 일치(X)
		// - 멤버 변수에 유효한 값을 지정하기 위해 멤버 변수는 private -> 중간에 통제 가능한 public 메서드를 사용
		
		
		dog.setName("멍멍이");
		dog.setAge(2);
		dog.setColor("흰색");
		
		
		dog.setName("멍멍이");
		dog.setAge(2);
		dog.setColor("우당탕");
		
		
		//강아지 정보 확인(출력)
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getColor());
		
		
	} //main
	
	
} //Ex44_Access


class Item {
	public int a;
	private int b;
} //Item

class Dog {
	
	//접근 지정자
	//public vs private
	// -> 멤버 변수의 접근 지정자는 항상 private으로 지정한다. (초보자의 경우 판단 미숙)
	
	private String name;
	private int age;
	private String color;
	
	//잘못된 상황을 발생시킬 수 있는 코드 > 주의를 요함
//	public String name;
//	public int age;
//	public String color;
	
	
	//인터페이스 역할을 하는 메서드
	// - setXXX
	// - setter(세터)
	public void setName(String name) {
		
		//지역변수와 멤버변수가 충돌이 났다.
		// -> ex) 한국(홍길동) vs 강남구 역삼동 한독빌딩 8층(홍길동)
		// -> 같은 식별자가 충돌이 발생하면 항상(100%) 지역이 좁은 식별자가 이긴다.(우선한다.)
		
		//this : 객체 지정 연산자. 객체 자신을 가르키는 연산자
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 0 && age <= 25) {
			this.age = age;
		} else {
			System.out.println("강아지 나이로 올바르지 않습니다.");
		}
	}
	
	public void setColor(String color) {
		
		if (color.equals("검정") || color.equals("갈색") || color.equals("흰색") || color.equals("주황") || color.equals("노랑")) {
			this.color = color;
		} else {
			System.out.println("잘못된 색을 입력했습니다.");
		}
		
	}
	
	
	//private 변수를 외부에서 읽을 수 있도록 도와주는 중간 메서드, 인터페이스 역할
	// - getXXX
	// - getter
	
	public String getName() {
		//유효성 검사 필요 X
		//가공된 데이터 반환
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getColor() {
		return this.color;
	}
	
	
} //Dog




