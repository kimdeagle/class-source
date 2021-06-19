package com.test.question.q09;

public class Q04 {

	public static void main(String[] args) {
		
		//Q04
		
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
		
		int num = 1;
		
		for (int i=1; i<=10; i++) {
			for (int j=num; j<=10*i; j++) {
				sum += j;
				if (j % 101 == 10*i) {
					System.out.printf("%2d ~ %3d : %3d\n", num, 10 * i, sum);
					num = j+1;
					sum = 0;
				}
			}
		}
		
	}

	private static void m1() {
		
		int sum = 0;
		
		int num = 1;
		
		for (int i=1; i<=100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("%2d ~ %3d = %3d\n", num, i, sum);
				num = i+1;
				sum = 0;
			}
		}
		
		
	}
	
}
