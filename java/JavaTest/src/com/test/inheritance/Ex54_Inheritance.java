package com.test.inheritance;

public class Ex54_Inheritance {

	public static void main(String[] args) {
		
		/*
		
		상속(Inheritance)
		- 클래스와 클래스간에 재산을 물려주는 행위
		- 재산 : 클래스가 소유하고 있는 코드(멤버 변수, 멤버 메소드)
		- 부모 클래스가 가지고 있는 코드를 자식 클래스에게 물려준다.
		
		상속을 왜 하는지?
		- 코드 재사용
		
		
		*/
		
		Parent p = new Parent();
		
		p.a = 100;
		p.b = 200;
		
		p.ccc();
		
		//자식 클래스에서 추가로 만든 멤버는 부모 클래스에서 알 수 없다.
		//p.d
		//p.e
		//p.fff()
		
		Child c = new Child();
		
		c.a = 100;
		c.b = 200;
		
		c.ccc();
		
		c.d = 300;
		c.e = 400;
		
		c.fff();
		
		DDD d = new DDD();
		
		d.a = 100; //AAA
		d.b = 200; //BBB
		d.c = 300; //CCC
		d.d = 400; //DDD
		
		
		
		
	} //main
	
} //Ex54

//부모 클래스
class Parent {
	
	public int a;
	public int b;
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}

//자식 클래스
//상속 > 부모 클래스를 extends 라는 키워드로 가리킨다(참조한다).
//클래스 상속
class Child extends Parent {
	
	//자식 클래스만의 멤버
	public int d;
	public int e;
	
	public void fff() {
		System.out.println("fff");
	}
	
}


class AAA {
	public int a;
}

class BBB extends AAA {
	public int b;
}

class CCC extends BBB {
	public int c;
}

class DDD extends CCC {
	public int d;
}











