package com.test.inheritance;

public class Ex64_Interface {

	public static void main(String[] args) {
		
		//Ex64_Interface.java
		
		// - 클래스 -> 추상 클래스 -> 인터페이스 -> 열거형 -> 제네릭 >> 모두 클래스의 일종 >> 정확히는 자료형
		
		//인터페이스(Interface)
		// - 추상 클래스와 유사
		//   - 객체 생성 불가능
		//   - 변수 생성 가능
		//   - 추상 메서드 소유 가능
		// - 추상 클래스와 차이
		//   - 구현 멤버를 가질 수 없다.
		//   - 일반 변수, 일반 메서드 가질 수 없다. -> 구현부 가질 수 없다.
		// - 추상 메서드의 집합 -> 규칙
		
		//일반 클래스 = 변수 + 메서드
		//추상 클래스 = 변수 + 메서드 + 추상 메서드
		//인터페이스 = 추상 메서드
		
		//추상 클래스와 인터페이스의 역할 -> 클래스의 부모 역할 : 상속
		
		//Cannot instantiate the type Keyboard
		//Keyboard k1 = new Keyboard();
		
		//아이폰 64GB - 2D Stereo(공통되지만 다른 기능) - 지문 인식(고유 기능)
		//아이폰 128GB - 3D 입체 음향(공통되지만 다른 기능) - 얼굴 인식(고유 기능)
		
		MK100 k2 = new MK100();
		
		k2.serialNumber = 10;
		k2.keyDown("A"); //일반 멤버 -> 공통 기능
		k2.light(); //추상 멤버 구현 -> 특수 기능
		k2.sound(); //MK100 고유 기능
		
		PT200 k3 = new PT200();
		
		k3.serialNumber = 20;
		k3.keyDown("A"); //공통 기능
		k3.light(); //특수 기능
		k3.wireless(); //PT200 고유 기능
		
		//인터페이스
		//Cannot instantiate the type IMember
		//IMember m1 = new IMember(); //객체 생성 불가능
		
		Member m1 = new Member();
		
		if (m1.login("hong", "1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		m1.logout(); //공통 기능 -> 내부 구현은 다름 -> 추상 메서드
		m1.point(); //개별 기능 -> 회원만
		
		Administrator a1 = new Administrator();
		System.out.println(a1.login("admin", "1111"));
		a1.logout();
		a1.log(); //개별 기능 -> 관리자만
		
		
	} //main
	
} //Ex64_Interface

//추상 클래스
abstract class Keyboard {
	public int serialNumber; //구현 멤버
	
	//구현 멤버 - 자식들이 종류에 상관없이 항상 이 기능을 동일한 결과를 냈으면 한다.
	public void keyDown(String key) {
		System.out.println(key + "를 눌렀습니다.");
	}
	
	//추상 멤버 - 자식들이 종류가 다르면 각자 하고 싶은 걸 구현했으면 한다.
	//			- 기능이 달라도 사용법은 동일하게 만들었으면 한다. -> 최종 사용자 때문에
	public abstract void light();
}

class MK100 extends Keyboard {

	@Override
	public void light() {
		System.out.println("빨간색"); //구현부가 달라짐 -> 개성(특징)
	}
	
	//자신만의 멤버 구현
	public void sound() {
		System.out.println("뽁뽁");
	}
	
}

class PT200 extends Keyboard {

	@Override
	public void light() {
		System.out.println("노란색"); //구현부가 달라짐 -> 개성(특징)
	}
	
	//자신만의 멤버 구현
	public void wireless() {
		System.out.println("무선 키보드");
	}
	
	
}



//회원이 가져야할 (행동)규칙 - 메서드
interface IMember { //'I' > 자료형을 유추할 수 있는 표현
	
	//추상 메서드만 올 수 있다.
	//인터페이스의 멤버는 무조건 공개를 원칙으로 한다. -> 접근지정자 : public
	
	//Illegal modifier for the interface method aaa; only public, abstract, default, static and strictfp are permitted
	//접근지정자 private은 쓸 수 없다.
	//private abstract void aaa();
	
	//일반 멤버 변수는 못만든다.
	//public int num;
	
	//일반 멤버 메서드는 못 만든다.
//	public void test() {
//		
//	}
	
	//public abstract void aaa();
	
	//public abstract void bbb();
	//거의 같은 표현
	//void bbb();
	
	boolean login(String id, String pw);
	void logout();
	
	
}


//일반 클래스 extends 일반 클래스
//일반 클래스 extends 추상 클래스
//일반 클래스 implements 인터페이스

//The type IMember cannot be the superclass of Member; a superclass must be a class
//class Member extends IMember {
	
class Member implements IMember { //인터페이스 상속 : implements

	@Override
	public boolean login(String id, String pw) {
		
		if(id.equals("hong") && pw.equals("1111")) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public void logout() {
		System.out.println("로그아웃");
	}
	
	public void point() {
		System.out.println("일반 회원 -> 출근 도장 -> 100pt 적립");
	}
	
}


class Administrator implements IMember {

	@Override
	public boolean login(String id, String pw) {
		
		return false;
	}

	@Override
	public void logout() {
	}
	
	public void log() {
		System.out.println("로그 확인");
	}
	
}









