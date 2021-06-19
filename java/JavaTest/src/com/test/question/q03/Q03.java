package com.test.question.q03;

public class Q03 {

	public static void main(String[] args) {
		
		//숫자 합 구하기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		//sum 메서드 호출
		sum(num1);
		sum(num1, num2);
		sum(num1, num2, num3);
		sum(num1, num2, num3, num4);
		sum(num1, num2, num3, num4, num5);
		
	} //main
	
	public static void sum(int num1) {
		System.out.printf("%d = %d\n", num1, num1);
	}
	
	public static void sum(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
	
	public static void sum(int num1, int num2, int num3) {
		System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, num1 + num2 + num3);
	}
	
	public static void sum(int num1, int num2, int num3, int num4) {
		System.out.printf("%d + %d + %d + %d = %d\n", num1, num2, num3, num4, num1 + num2 + num3 + num4);
	}
	
	public static void sum(int num1, int num2, int num3, int num4, int num5) {
		System.out.printf("%d + %d + %d + %d + %d = %d\n", num1, num2, num3, num4, num5, num1 + num2 + num3 + num4 + num5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
