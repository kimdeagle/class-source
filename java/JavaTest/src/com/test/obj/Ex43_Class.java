package com.test.obj;

public class Ex43_Class {

	public static void main(String[] args) {
		
		//객체 생성
		//	- 데이터 + 행동 집합
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 15;
		s1.school = "역삼중학교";
		
		Student s2 = new Student();
		s2.name = "아무개";
		s2.age = 14;
		s2.school = "대치중학교";
		
		s1.test();
		s1.hello();
		s1.introduce();
		
		s2.test();
		s2.hello();
		s2.introduce();
		
		
	} //main
	
	
} //Ex43_Class

//학생 클래스
class Student {
	
	//멤버 변수
	public String name;
	public int age;
	public String school;
	
	
	//멤버 메서드
	// - 되도록 자신이 가지고 있는 데이터를 활용해서 행동을 하도록 구현한다.
	public void test() {
		System.out.println("학생이 시험을 봅니다.");
	}
	
	public void hello() {
		System.out.println("안녕하세요.");
	}
	
	public void introduce() {
		//System.out.println("저는 학생입니다.");
		System.out.printf("안녕하세요. 저는 %s입니다. %s에 다니고 있습니다.\n", name, school);
	}
	
	
} //Student











