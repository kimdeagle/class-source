package com.test.question.q07;

public class Q06 {

	public static void main(String[] args) {
		
		//수열 계산
		// 1+2+4+7+11+16...
		
		sum();
		
		
		
	}

	private static void sum() {
		
		int num = 1;
		
		int sum = 1;
		
		System.out.print("1");
		
		for (int i=1; ; i++) {
			
			num = num + i;
			
			if (num > 100) {
				System.out.printf(" = %d\n", sum);
				break;
			} else {
				System.out.print(" + ");
				System.out.print(num);
				sum += num;
			}
			
		}
		
		
	}
	
	
	
}
