package com.test.java;

public class Ex51_static {

	public static void main(String[] args) {
		
		//Ex51_static.java
		
		//프로그램 실행
		//1. 클래스 로드 : 클래스 선언 코드를 미리 읽고 내용을 파악하는 작업
		// - static 키워드 가진 멤버를 만나면 > static 영역에 할당
		//2. main() 메서드 실행
		
		
		SmartPhone.setManu("삼성"); //핸드폰은 3대인데, 제조사를 넣는 행동을 한번만..
		
		//바꾸기
		// - Ctrl + H : 일반 툴
		// - Ctrl + F : 이클립스
		
		
		SmartPhone p1 = new SmartPhone();
		p1.setModel("s10");
		p1.setColor("black");
		p1.setPrice(100);
		//The static method setManu(String) from the type SmartPhone should be accessed in a static way
		//p1.setManu("삼성"); //절대 사용 금지!
		
		SmartPhone p2 = new SmartPhone();
		p2.setModel("s20");
		p2.setColor("white");
		p2.setPrice(150);
		//p2.setManu("삼성");
		
		SmartPhone p3 = new SmartPhone();
		p3.setModel("s30");
		p3.setColor("blue");
		p3.setPrice(200);
		//p3.setManu("삼성");
		
		//아래 질문들의 분위기?!
		
		//p1의 색상은?
		System.out.println(p1.getColor());
		
		//p2의 모델명은?
		System.out.println(p2.getModel());
		
		//p3의 가격은?
		System.out.println(p3.getPrice());
		
		//p1의 제조사?
		//System.out.println(p1.getManu());
		System.out.println(SmartPhone.getManu());
		//p2의 제조사?
		//System.out.println(p2.getManu());
		System.out.println(SmartPhone.getManu());
		//p3의 제조사?
		//System.out.println(p3.getManu());
		System.out.println(SmartPhone.getManu());
		
		
		
	} //main
	
} //Ex51

class SmartPhone {
	
	//개개인이 가지는 데이터(본인만의 개성)
	//객체 멤버 변수 역할
	private String model;
	private String color;
	private int price;
	
	//모든 객체가 가지는 공통된 데이터(그룹 성질)
	// - 정적 멤버 변수(static)
	private static String manu;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//static 변수의 getter, setter는 static 메서드로 만든다.
	// - 정적 멤버 메서드(static)
	public static String getManu() {
		return manu;
	}
	public static void setManu(String manu) {
		SmartPhone.manu = manu;
	}
	
	
	
	
} //SmartPhone














