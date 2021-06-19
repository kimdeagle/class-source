package com.test.java;

public class Ex34_while {

	public static void main(String[] args) {
		
		//Ex34_while.java
		
		//반복문
		//1. for
		//2. while
		//3. do while
		//4. for(X) - 나중에(다음주)
		
		//m1();
		//m2();
		//m3();
		
		
	} //main

	private static void m3() {
		
		//구구단
		
		int dan = 2;
		
		while (dan < 10) {
			
			int num = 1;
			
			while (num < 10) {
				
				System.out.printf("%d x %d = %2d\n", dan, num, dan * num);
				
				num++;
			}
			
			System.out.println();
			
			dan++;
		}
		
		
		
	}

	private static void m2() {
		
		//기존의 for문 예제 + 문제 -> while문으로 바꿔서 해보기
		
		//누적
		//1~100 합
		
		int sum = 0; //누적 변수
		int num = 1; //루프 변수
		
		while (num <= 100) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		//누적합이 1000이면 탈출
		
		sum = 0;
		num = 1;
		
//		while (true) {
//			sum += num;
//			
//			if (sum > 1000) {
//				break;
//			}
//			num++;
//			
//		}
		
//		while (sum <= 1000) {
//			sum += num;
//			num++;
//			
//		}
		
		for (num=1; sum<=1000 ; num++) {
			sum += sum;
			
//			if (sum > 1000) {
//				break;
//			}
		}
		
		System.out.println("sum : " + sum);
		System.out.println("num : " + (num - 1));
		
	}

	private static void m1() {
		
		/*
		
		while문
		- for문 유사
		- 조건에 따라 반복 제어하는 제어문
		
		- 반복 실행 : 반복되는 if문 느낌
		while (조건) {
			실행코드;
		}
		
		
		
		*/
		
		//요구사항] 1~10까지 출력하시오.
		
		//for문 사용
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//while문 사용
		int num = 1; //초기식 역할
		
		while (num <= 10) { //조건식
			System.out.println(num);
			num++; //증감식 역할
		}
		System.out.println();
		
		
	} //m1
	
}
