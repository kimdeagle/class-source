package com.test.question.q07;

public class Q08 {

	public static void main(String[] args) {
		
		//2~100사이 소수
		
		
		primeNum();
		
		
	} //main

	private static void primeNum() { //소수 구하는 메서드... 소수 구하는 법이 너무 어렵다ㅠ
		
		int count = 0;
		
		System.out.print(2);
		for (int i=3; i<100; i++) { //3부터 100까지 검사
		
			for (int j=1; j<100; j++) { //1부터 99까지를 제수로 사용
				
				if (i % j == 0) { //나머지가 없으면 count에 +1
					count++;
				}
				
			}
			
			if (count == 2) { //나머지가 없는경우가 2가지(1과 자기자신만 나누어진다)이면 소수다.
				System.out.printf(", %d", i);
			}
			count = 0; //초기화
		}
		
	}
	
	
	
}
