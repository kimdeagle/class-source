package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30_for {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex30_for.java
		
		//반복문
		
		/*
		
		for문
		- 반복문
		- 일련의 실행코드를 개발자가 원하는 만큼 반복실행하는 제어문
		
		for (초기식; 조건식; 증감식) {
			실행코드;
		}
		
		(예제)
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요.");
		}
		
		실행순서
		1. 초기식 -> int i=1;
		2. 조건식 -> i<=5;
		3. 만족하면 블럭 실행
		4. 증감식 -> i++; -> i=2;
		5. 조건식 -> i<=5;
		6. 만족하면 블럭 실행
		7. 증감식 -> i++; -> i=3;
		..
		9. 증감식 -> i++; -> i=6;
		10. 조건식 -> i<=5; -> 거짓 -> for문 종료
		
		
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
		

		
	} //main

	private static void m8() {
		
		//난수
		// - 임의의 수
		// - 난수 생성기
		// - 자주 쓰게 된다 -> 나중엔 ramdom 클래스
		
		//0.0 ~ 0.999999999 사이의 값 반환
		//0(inclusive) ~ 1(exclusive)
		//System.out.println(Math.random());
		
		//주사위 만들기
		//1~6
		
		double num = Math.random();
		
		System.out.println(num);
		System.out.println((int)(num * 10)); //0~9사이의 정수 랜덤
		
		System.out.println();
		
		for (int i=0; i<10; i++) {
			//System.out.println((int)(Math.random() * 10) + 1); //1~10
			
			System.out.println((int)(Math.random() * 6) + 1); //1~6
		}
		
		
	}

	private static void m7() {
		
		//분기문
		// - break, continue
		
		//1. break
		// - 자신이 속한 제어문을 탈출(종료)한다.
		// - 단, if문은 제외한다.(예외)
		
		//2. continue
		// - 무조건 하던 일을 멈추고 반복문의 시작으로 돌아간다.
		
		for (int i=1; i<=10; i++) {
			
			//break;
			
			if (i == 5) { //break 활용 예
				//break;
				continue; //skip
			}
			
			System.out.println(i); //Unreachable code : 도달할 수 없는 코드
			
			//break;
			
			
		}
		
		//학교 선생님 + 진로 상담(30명)
		for (int i=1; i<=30; i++) {
			
//			if (i == 16) { //15번까지 상담
//				break;
//			}
			
			if (i == 15 || i == 22 || i == 28) { //15번, 22번, 28번 결석
				continue;
			}
			
			System.out.printf("선생님이 %d번 학생을 상담합니다\n", i);
			
		}
		
		
	}

	private static void m6() throws NumberFormatException, IOException {
		
		//요구사항] 사용자에게 10개의 숫자를 입력받아 그 수의 합을 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자 입력 : ");
			
			int num = Integer.parseInt(reader.readLine());
			
			//sum = sum + num;
			sum += num;
			
			
		}
		
		System.out.println(sum);
		
		
		
	}

	private static void m5() {
		
		//루프 -> 누적
		
		//요구사항] 1~10까지의 합을 구하시오.
		
		//무언가의 누적값을 구해라
		//1. 누적 변수 선언
		// - 누적 변수는 반드시 초기화를 해야 한다.
		int sum = 0;
		
		//2. 누적할 데이터를 얻기 위한 수열 만들기 -> for문
		for (int i=1; i<=10; i++) {
			
			//3. 누적한다.
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}

	private static void m4() {
		
		//변수
		//1. 클래스 멤버 변수
		//2. 지역 변수
		// - 메서드 안에서 선언된 변수
		// - 제어문 안에서 선언된 변수
		
		int a = 10; //지역변수(m4())
		
		if (a > 0) {
			System.out.println("a : " + a);
			
			int b = 20;
			System.out.println("b : " + b);
		}
		
		//지역변수는 해당 지역에서만 유효하다.
		System.out.println("a : " + a);
		//System.out.println("b : " + b); //b cannot be resolved to a variable
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i); //i cannot be resolved to a variable
		
		int num = 0;
		
		for (num=0; num<10; num++) {
			System.out.println(num);
		}
		
		System.out.println("num : " + num);
		
		//int i vs int n
		// - int i : 10바퀴 도는 동안 계속 살아있음.
		// - int n : 1바퀴 돌때마다 태어났다 죽었다 반복
		// - 생명주기가 다르다.
		for (int i=1; i<=10; i++) {
			
			int n = 10;
			System.out.println(n);
			n++;
			
		}
		
		
		
		
	}

	private static void m3() {
		
		//구구단 출력
		// - 5단
		// - 출력형태 : 5 x 1 = 5 .. 5 x 9 = 45
		
		int dan = 2;
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
		}

		
	}

	private static void m2() {
		
		//for문 목적
		//1. 반복 횟수 제어 : 쉬움
		//2. 루프 변수값 제어 : 쉬움 ~ 어려움(***) -> 연습 많이!!
		
		for (int i=1; i<=5; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		for (int i=1; i<=10; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		for (int i=6; i<=10; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		for (int i=1; i<=10; i = i + 2) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		for (int i=2; i<=10; i+=2) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		for (int i=11; i<=10; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		for (int i=10; i>0; i--) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		//무한 루프
		//1. 인위적 작성
		//2. 실수로 작성
//		for (int i=10; i>0; i++) {
//			System.out.println(i); //루프 변수 출력
//		}
//		System.out.println();
		
		//무한 루프 생성
//		for (;;) {
//			System.out.println("무한루프");
//		}
		
//		for (int i=1;;) {
//			System.out.println(i);
//		}
		
//		for (int i=1;;i++) {
//			System.out.println(i);
//		}
		
//		for (int i=1; true; i++) {
//			System.out.println(i);
//		}
		
		
		
		
		
		
		
		
		
	}

	private static void m1() {
		
		//요구사항] '안녕하세요' x 5번 출력
		
		//i : 루프 변수(Loop Variable)
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요.");
		}
		
		for (int i=1; i<=100; i++) {
			System.out.println("반갑습니다.");
		}
		
		
		
	} //m1
	
	
	
	
}
