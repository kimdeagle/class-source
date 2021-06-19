package com.test.question.q07;

public class Q09 {

	public static void main(String[] args) {
		
		//1~100사이 완전수 구하기
		//완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		
		
		perfectNumber();
		
		
	}

	private static void perfectNumber() {
		
		int sum = 1;
		String printPerfectNumber = "1";
		
		for (int i=2; i<=100; i++) {
			for (int j=i-1; j>1; j--) {
				
				if (i % j == 0) {
					sum += (i / j);
					printPerfectNumber += ", " + Integer.toString((i / j));
				}
			}
			if (sum == i) {
				System.out.printf("%d = [%s]\n", i, printPerfectNumber);
			}
			
			sum = 1;
			printPerfectNumber = "1";

		}
		
		
	}
	
	
	
	
	
}
