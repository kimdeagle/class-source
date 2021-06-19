package com.test.question.q07;

public class Q07 {

	public static void main(String[] args) {
		
		//수열 계산 (피보나치)
		//1+1+2+3+5+8+13...
		
		sum();
		
		
	} //main

	private static void sum() {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int sum = 1;

		System.out.print("1");

		for (;;) {

			if (num1 > 100) {
				System.out.printf(" = %d\n", sum);
				break;
			} else {
				System.out.print(" + ");
				System.out.print(num1);
				sum += num1;
				num1 = num2;
				num2 = num3;
				num3 = num1 + num2;
				
			}
			
		}
		
		
	}
	
	
	
	
}
