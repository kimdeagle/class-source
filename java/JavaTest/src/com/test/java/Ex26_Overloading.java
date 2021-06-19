package com.test.java;

public class Ex26_Overloading {

	public static void main(String[] args) {
		
		//Ex26_Overloading.java
		
		//오버로딩을 왜 하는지?
		// - 개발자 편의성(개발자를 위한 기술)
		// - 기억해야 할 메서드의 이름을 줄여준다.(***)
		
		//요구사항] 선을 그리는 메서드를 만드시오.
		
		drawLine();
		System.out.println("메서드 오버로딩, Method Overloading");
		drawLine();
		
		//추가사항] 선 모양이 다양했으면 좋겠습니다.(한줄짜리, 별모양, 샾모양 등등)
		
		drawLine('?');
		drawLine('!');
		drawLine('@');
		drawLine('^');
		
		drawLine('*', 25);
		drawLine('#', 20);
		drawLine('@', 35);
		drawLine('$', 30);
		
		//4종류의 메서드명?
		// - drawLine1~4 -> 메서드 오버로딩을 통해서 하나의 메서드명으로 바꿀 수 있다.
		
		
		
	} //main
	
	public static void drawLine() {
		
		System.out.println("===================================");
		
	} //drawLine
	
	public static void drawLine(char c) {
		for (int i=0; i<35; i++) {
			System.out.print(c);
		}
		System.out.println();
	} //drawLine3
	
	public static void drawLine(char c, int length) {
		for (int i=0; i<length; i++) {
			System.out.print(c);
		}
		System.out.println();
	} //drawLine4
	
	public static void drawLine2() {
		
		System.out.println("***********************************");
		
	} //drawLine
}
