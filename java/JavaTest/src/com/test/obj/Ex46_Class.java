package com.test.obj;

public class Ex46_Class {

	public static void main(String[] args) {
		
		//Ex46_Class.java
		
		//물리적 파일 & 클래스
		// - 파일 1개당 클래스 1개를 정의한다.(권장 -> 대부분)
		// - 반드시(100%) 클래스명과 파일명이 동일해야 한다.(다르면 컴파일X)
		// - 파일내에서 여러개의 클래스를 선언하는 경우 반드시 1개의 클래스만을 public으로 선언하고 그 클래스명이 파일명이 된다.
		
		//왜 파일 1개당 클래스 1개 정의??
		//1. 코드 관리 + 가독성 > 목적이 같은 코드를 물리적으로 분리
		//2. 재사용 편의
		
		//Quick Search
		//Ctrl + Shift + L
		
		//TODO -> Tasks 창에서 확인 가능(봐야할 것들)
		
		Cup c1 = new Cup();
		
		c1.setColor("black");
		c1.setSize("big");
		
		
		System.out.println(c1.getColor());
		System.out.println(c1.getSize());
		
		
		
		
		
	} //main
	
	
} //Ex46














