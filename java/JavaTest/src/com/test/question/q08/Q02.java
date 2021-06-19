package com.test.question.q08;

public class Q02 {

	public static void main(String[] args) {
		
		//Q02
		
		m1();
		
	}

	private static void m1() {
		
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.printf("i : %d, j : %d\n", i, j);
			}
		}
		
	}
	
	
	
	
}
