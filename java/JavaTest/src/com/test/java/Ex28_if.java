package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28_if {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		제어문
		 - 조건문, 반복문, 분기문
		 - 프로그램 코드의 실행 순서나 횟수를 제어
		 - 알고리즘 생산 도구
		 
		조건문
		1. if
		2. switch
		
		반복문
		1. for
		2. while
		3. do while
		4. enhanced for(= foreach) 향상된 for
		
		분기문
		1. break
		2. continue
		
		3. goto(JDK 1.5 폐지)
		
		
		I. if문
		 - 조건을 제시한 후 코드의 흐름을 분기 시키는 제어문
		 - 조건 : boolean
		 
		 1. 기본
		 if (조건) {
		 	실행코드;
		 }
		 
		 if문 실행순서 : 조건 확인 -> 참이면 블럭 진입 후 안에 있는 코드 실행 -> if문 종료
		 
		 2. else 추가
		 if (조건) {
		 	실행코드;
		 } else {
		 	실행코드;
		 }
		 
		 3. else if 추가 (횟수 제한 없음) -> 다중if문
		 if (조건) {
		 	실행코드;
		 } else if (조건) {
		 	실행코드;
		 } else if (조건) {
		 	실행코드;
		 } else if (조건) {
		 	실행코드;
		 }
		 ..
		 } else {
		 	실행코드;
		 }
		

		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
	} //main

	private static void m6() {

		//옷가게 -> 사이즈 -> 90, 95, 100, 105, 110, 115, 120
		// - 90 : S, 95~105 : M, 110~120 : L
		
		int sel = 100;
		
		if (sel == 90) {
			System.out.println("S 사이즈가 맞습니다.");
		} else if (sel >= 95 && sel <= 105) {
			System.out.println("M 사이즈가 맞습니다.");
		} else if (sel >= 110 && sel <= 120) {
			System.out.println("L 사이즈가 맞습니다.");
		} else if (sel < 90 || sel > 120) { //예외 처리 코드 -> 위에 if문과 비교하면 성질이 다르다. 
			System.out.println("맞는 사이즈가 없습니다.");
		}
		
		//예외 처리 방법 -> 관리하기 좋은 코드
		//중첩(nested) if문
		if (sel >= 90 && sel <= 120) { //보유한 사이즈(업무용)
		
			if (sel == 90) {
				System.out.println("S 사이즈가 맞습니다.");
			} else if (sel >= 95 && sel <= 105) {
				System.out.println("M 사이즈가 맞습니다.");
			} else if (sel >= 110 && sel <= 120) {
				System.out.println("L 사이즈가 맞습니다.");
			}
			
		} else { //보유하지 않은 사이즈(예외 처리)
			System.out.println("맞는 사이즈가 없습니다.");
		}
		
	} //m6

	private static void m5() {
		
		String language = "java"; //java, sql, html, spring
		
		if (language.equals("java")) {
			System.out.println("응용 프로그램 개발부서에 배치합니다.");
		} else if (language.equals("sql")) {
			System.out.println("데이터베이스 부서에 배치합니다.");
		} else if (language.equals("html")) {
			System.out.println("클라이언트 부서에 배치합니다.");
		} else if (language.equals("spring")) {
			System.out.println("서버 부서에 배치합니다.");
		} else {
			System.out.println("해당 인력은 자사에 필요없는 인력입니다.");
		}
		
	} //m5

	private static void m4() {

		int num = 10; //사용자 입력
		
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else { // => else if (num == 0)
			System.out.println("0");
		}
		
		System.out.println("프로그램 종료");
		
	} //m4

	private static void m3() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		
		int num = Integer.parseInt(reader.readLine());
		
		if (num > 0) { //if 블럭
			System.out.println("양수입니다.");
		} else { //else 블럭
			System.out.println("양수가 아닙니다.");
		}
		
		System.out.println("프로그램 종료");
		
	} //m3

	private static void m2() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("정각에 일어났습니까?");
		System.out.println("1. 일어났다.");
		System.out.println("2. 늦잠잤다.");
		System.out.print("번호 선택 : ");
		
		String input = reader.readLine();
		
		if (input.equals("1")) {
			System.out.println("아침을 먹는다.");
		}
		
		System.out.println("출근을 한다.");
		
		
	} //m2

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		
		int num = Integer.parseInt(reader.readLine());
		
		//숫자가 양수인지 확인
		if (num > 0) {
			System.out.println("양수입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	} //m1
	
}
