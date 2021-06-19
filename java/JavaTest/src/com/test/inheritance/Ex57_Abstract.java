package com.test.inheritance;

public class Ex57_Abstract {

	public static void main(String[] args) {
		
		//추상 클래스(Abstract Class)
		//추상 메서드(Abstract Method)
		
		//추상 클래스
		// - 클래스의 일종
		// - 목적이 일반 클래스와 다름
		// - 일반 클래스의 목적 : 객체 생성
		// - 추상 클래스의 목적 : 객체 생성 불가능, 객체의 행동을 표준화(***)
		// - 추상 클래스는 객체 생성은 불가능하지만, 상속 관계에서 클래스의 부모 역할은 가능
		
		//Monitor m1 = new Monitor(); //Cannot instantiate the type Monitor
		
		//홍길동 > LG100 모니터를 10년 사용
		LG100 lg = new LG100();
		
		lg.model = "LG100";
		lg.price = 1000000;
		lg.test();
		
		lg.on();
		lg.off();
		
		//홍길동 > LG100 -> HP200 새로 구매
		HP200 hp = new HP200();
		
		hp.on();
		hp.off();
		
//		hp.powerOn();
//		hp.powerOff();
		
		
		
	} //main
	
	
} //Ex57

//추상 클래스 선언
// - 객체 생성 불가능
// - 상속 시 부모 역할
// - 추상 메서드를 자식들에게 강제로 만들게 하기 위해 -> 추상 클래스의 하위 클래스들은 모두 사용법이 동일해진다.(**************)
abstract class Monitor {
	
	//멤버 구현
	public String model;
	public int price;
	
	public void test() {
		System.out.println("추상 클래스내의 메서드입니다.");
	}
	
	//추상 멤버 선언
	// - 추상 메서드
	// - Abstract methods do not specify a body
	// - 메서드 구현부를 가질 수 없다.
	public abstract void on();
	public abstract void off();
	
	
	
} //Monitor

//The type LG100 must implement the inherited abstract method Monitor.on()
class LG100 extends Monitor {
	
	public void on() {
		System.out.println("전원 On");
	}
	
	public void off() {
		System.out.println("전원 Off");
	}
	
} //LG100


class HP200 extends Monitor {
	
//	public String model;
//	public int price;
//	
//	public void test() {
//		
//	}
	
//	public void powerOn() {
//		System.out.println("모니터가 켜집니다.");
//	}
//	
//	public void powerOff() {
//		System.out.println("모니터가 꺼집니다.");
//	}

	@Override
	public void on() {
		System.out.println("모니터가 켜집니다.");
	}

	@Override
	public void off() {
		System.out.println("모니터가 꺼집니다.");
	}
	
	
	
} //HP200














