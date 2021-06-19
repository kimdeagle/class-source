package com.test.java;

public class Ex50_static {

	public static void main(String[] args) {
		
		//Ex50_static.java
		// - 클래스 멤버에게 붙이는 키워드
		// 1. 멤버 변수
		// 2. 멤버 메서드
		
		//상황] 핸드폰 x 3대
		// - 모델명
		// - 색상
		// - 가격
		// - 제조사(무조건 삼성)
		
		// - 같은 틀(클래스)에서 찍어낸 핸드폰들이
		// - 1. 서로 다른 값을 가지는 경우 -> 모델명, 색상, 가격
		// - 2. 공통된 값을 가지는 경우 -> 제조사
		
		Phone p1 = new Phone();
		p1.setModel("s10");
		p1.setColor("black");
		p1.setPrice(100);
		p1.setManu("삼성");
		
		Phone p2 = new Phone();
		p2.setModel("s20");
		p2.setColor("white");
		p2.setPrice(150);
		p2.setManu("삼성");
		
		Phone p3 = new Phone();
		p3.setModel("s30");
		p3.setColor("blue");
		p3.setPrice(200);
		p3.setManu("삼성");
		
		//p1의 색상은?
		System.out.println(p1.getColor());
		
		//p2의 모델명은?
		System.out.println(p2.getModel());
		
		//p3의 가격은?
		System.out.println(p3.getPrice());
		
		//p1의 제조사?
		System.out.println(p1.getManu());
		//p2의 제조사?
		System.out.println(p2.getManu());
		//p3의 제조사?
		System.out.println(p3.getManu());
		
		
		
	} //main
	
} //Ex50

class Phone {
	
	private String model;
	private String color;
	private int price;
	private String manu;
	
	
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
	public String getManu() {
		return manu;
	}
	public void setManu(String manu) {
		this.manu = manu;
	}
	
	
	
	
} //Phone














