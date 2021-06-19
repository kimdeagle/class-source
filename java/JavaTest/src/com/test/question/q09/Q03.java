package com.test.question.q09;

public class Q03 {

	public static void main(String[] args) {
		
		//Q03
		
		//단일 for문
		System.out.println("단일 for문");
		m1();
		
		System.out.println();
		
		//이중 for문
		System.out.println("이중 for문");
		m2();
		
	}

	private static void m2() {
		
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10*i; j++) {
				sum += j;
				if (j % 101 == 10*i) {
					System.out.printf("1 ~ %3d : %4d\n", 10 * i, sum);
					sum = 0;
				}
			}
		}
		
	}

	private static void m1() {
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("1 ~ %3d : %4d\n", i, sum);
			}
		}
		
		
	}
	
}
