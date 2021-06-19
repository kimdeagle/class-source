package com.test.obj;

public class Ex49_Class {

	public static void main(String[] args) {
		
		//생성자(Constructor)
		// - 특수한 목적을 가지는 메서드
		// - 객체의 멤버를 초기화하는 목적을 가지는 메서드
		// - 사용법이 일반 메서드와는 상이하게 다름
		
		//클래스 > 객체 생성
		// - 클래스명 객체명 = new 클래스명();
		// - 자료형 변수 = 객체생성연산자 생성자();
		
		//생성자 : 객체 생성 직후 객체의 초기 상태를 설정하는 담당
		// -> 객체 생성할 당시 딱 1번만 호출 가능한 메서드
		Person p1 = new Person();
		
		//setter : 객체를 초기화하는 역할 or 수정하는 역할
		//setter : 필요할 때마다 마음대로 호출 가능 -> 수정하고 싶을 때마다 수정 가능
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		//요구사항] Person 객체를 만들자마자 이름(익명), 나이(20)를 초기화
		// - 생성자로 초기화 하는 경우
		Person p2 = new Person(); //제품으로 따지면 완제품
		
		
		//요구사항] Person 객체를 만들자마자 이름(익명), 나이(20)를 초기화
		// - setter로 초기화 하는 경우
		Person p3 = new Person(); //null, 0 -> 제품으로 따지면 반조립 제품
		
		p3.setName("익명"); //나머지 조립
		p3.setAge(20); //나머지 조립
		
		//요구사항] 홍길동, 25
		// - 생성자 오버로딩 : 객체 생성을 사용자(개발자) 편의에 맞게 다양하게 하기 위해서
		
		Person p4 = new Person(); //익명, 20
		
		p4.setName("홍길동");
		p4.setAge(20);
		
		
		Person p5 = new Person("홍길동", 25);
		
		//객체 생성 -> 초기화 -> 방법이 다양해짐 -> 개발자 위해서
		Person p6 = new Person();
		Person p7 = new Person("하하");
		Person p8 = new Person(15);
		Person p9 = new Person("호호", 30);
		
		System.out.println(p6.info());
		System.out.println(p7.info());
		System.out.println(p8.info());
		System.out.println(p9.info());
		
		
		
	} //main
	
	
} //Ex49


class Person {
	
	//멤버 변수
	private String name;
	private int age;
	
	//생성자
	// - 메서드처럼 생김
	// - 반환 타입이 없음 -> 반환값이 없는 메서드(무조건)
	// - 이름이 클래스명과 동일
	
	//기본 생성자
	// - 개발자가 명시적으로 선언하지 않아도 컴파일러가 만들어주는 생성자
	// - 멤버변수 초기화하는 역할
	
	// - 멤버변수
	//	a. 정수 -> 0
	//	b. 실수 -> 0.0
	//	c. 문자 -> '\0'
	//	d. 논리 -> false
	//	e. 참조 -> null
	
//	public Person() {
//		this.name = null;
//		this.age = 0;
//	}
	
	public Person() {
		this.name = "익명";
		this.age = 20;
	}
	
	//생성자 -> 메서드 -> 메서드 오버로딩 -> 생성자 오버로딩
	public Person(String name, int age) { //setter 역할과 유사
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		this.name = name;
		this.age = 20;
	}
	
	public Person(int age) {
		this.name = "익명";
		this.age = age;
	}
	
	
	//getter, setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		
		return String.format("이름(%s), 나이(%d)", this.name, this.age);
	}
	
	
} //Person








