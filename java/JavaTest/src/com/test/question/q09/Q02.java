package com.test.question.q09;

public class Q02 {

	public static void main(String[] args) {
		
		//Q02
		
		//2중 for문 x 2개
		System.out.println("2중 for문 x 2개");
		m1();
		
		System.out.println();
		
		//3중 for문 1개
		System.out.println("3중 for문 1개");
		m2();
		
	}

	private static void m2() { //2020-10-23 수정중!!
		
		int dan = 2;
		
		for (int k=1; k<=2; k++) {
			for (int i=1; i<=9; i++) {
				for (int j=dan; j<=(k*4)+1; j++) {
					System.out.printf("%d x %d = %2d ", j, i, j * i);
				}
				System.out.println();
				
			}
			dan = 6;
			System.out.println();
		}
		
	}

	private static void m1() {
		
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=5; j++) {
				System.out.printf("%d x %d = %2d ", j, i, j * i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=1; i<=9; i++) {
			for (int j=6; j<=9; j++) {
				System.out.printf("%d x %d = %2d ", j, i, j * i);
			}
			System.out.println();
		}
		
		
	}
	
}
