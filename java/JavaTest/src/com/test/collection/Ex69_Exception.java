package com.test.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex69_Exception {

	public static void main(String[] args) {
		
		//예외(Exception)
		// - 컴파일 발견X(문법 오류X) -> 실행중 발견O(런타임 오류)
		// - 외부 입출력 작업시 많이 발생(파일 입출력, 네트워크 입출력, DB 입출력 등)
		
		//m1();
		//m2();
		
		//C:\test.txt
		//file.open("C:\test.txt"); -> 파일을 삭제
		
		//예외 처리(Exception Handling)
		// - 프로그램 안정성을 높이는 작업
		//1. 전통적인 방식
		// - 제어문 사용(조건문)
		
		//2. 예외 처리 구문
		// - try catch finally
		
		//m1();
		//m2();
		
		//m3();
		//m4();
		//m5();
		
//		try {
//			
//			m6();
//			m7();
//			
//		} catch (Exception e) {
//			System.out.println("오류 처리");
//		}
		
		//m8();
		
		m9();
		
		
		
	} //main

	private static void m9() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input : ");
		
		//Finds and returns the next complete token from this scanner. //token == 단어
		//String data = scan.next(); //토큰 하나
		//String data = scan.nextLine(); //문장 전체
		
		//System.out.println(data);
		
		//패턴 코드 - 암기
//		
//		String data = "";
//		
//		while (scan.hasNext()) {
//			data = scan.next();
//			System.out.println("출력 : " + data);
//		}
		
		String data = scan.nextLine();
		
		//문자열 자르기
		// - 구분자(delimiter)를 기준으로 문자열을 조각내어 반환
		String[] result = data.split(" ");
		
		for (String str : result) {
			System.out.println(str);
		}
		
		
	}

	private static void m8() {
		
		//콘솔 입력 도구
		//1. System.in.read() - 메서드
		//2. BufferedReader
		//3. Scanner
		
//		try {
//			System.in.read();
//		} catch (Exception e) {
//			
//		}
		
		//Wrapper Class or Util Class
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			reader.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = scan.nextLine();
		
		System.out.println(name);
		
		
		System.out.print("숫자 : ");
		int num = Integer.parseInt(scan.nextLine());
		System.out.println(num);
		
		System.out.print("숫자 : ");
		int num2 = scan.nextInt();
		System.out.println(num2);
		
//		자주 쓰는 것
//		scan.nextLine(); //문자열 입력
//		scan.nextInt(); //정수 입력
//		scan.nextDouble(); //실수 입력
		
	}

	private static void m7() throws Exception {
		
		//try {
			
			int n = 0;
			System.out.println(100 / n);
			
		//} catch (Exception e) {
		//	System.out.println("부산에서 일어난 일은 부산에서 처리합니다.");
		//}
		
	}

	private static void m6() throws Exception { //예외 미루기
		
		//예외 던지기(throw Exception)
		//예외 미루기(throws Exception)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine(); //throws Exception
		
		int n = 0;
		System.out.println(100 / n);
		
		
	} //m6

	private static void m5() {
		
		//예외 처리 도구의 통일 -> 팀 작업을 위한 정책
		// - A씨 : if문
		// - B씨 : try catch
		// - C씨 : if or try catch
		//if문으로 예외 처리를 할 경우, 예외 처리 목적으로 사용하지 않은 if문과 비교하면 헷갈린다.
		//팀 작업을 할 때는 try catch를 사용하는 것이 좋음
		
		//업무] 숫자 입력 > 3의 배수 > 출력
		//*** 3의 배수가 아니면 예외 > 예외 처리
		
		int num = 2;
		
		if (num % 3 == 0) {
			//비즈니스 코드
			System.out.println("업무 진행 : " + num);
		} else {
			//예외 처리
			System.out.println("예외 처리");
		}
		
		
		try {
			
			//현재 우리가 처리하고 싶은 예외
			// - 문법으로 인해 발생하는 것이 아니고 업무로 인해 발생(우리가 정한 규칙에 의해) -> 문법 오류X
			
			if (num % 3 != 0) { //예외 발생 조건
				
				//강제 예외 발생 or 예외 던지기
				Exception e = new Exception();
				throw e;
			}
			
			//비즈니스 코드
			System.out.println("업무 진행 : " + num);
			
		} catch (Exception e) {
			
			//예외 처리
			System.out.println("예외 처리");
			
		}
		
		
		
	}

	private static void m4() {
		
		//다중 catch문 사용
		
		
		try {
			
			int[] nums = { 10, 20, 30 };
			nums[5] = 100; //ArrayIndexOutOfBoundsException
			
			//try catch문에서 위에 코드가 예외 발생시 아래 코드가 실행이 된다.(사람 눈엔 보이지 않는다.)
			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			//throw e;
			
			//Exception e = new Exception();
			//throw e;
			
			Random rnd = null;
			System.out.println(rnd.nextInt()); //NullPointerException
			
			Object o1 = "문자열";
			System.out.println((int)o1); //ClassCastException
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("방번호 오류");
		} catch (NullPointerException e) {
			System.out.println("널참조");
		} catch (ClassCastException e) {
			System.out.println("형변환 오류");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		
	}
	
	private static void m3() {
		
		try {
			
			int[] nums = { 10, 20, 30 };
			nums[5] = 100;
			
		} catch (Exception e) {
			System.out.println("방 번호 오류");
		}
		
		try {		
			
			Random rnd = null;
			//널참조 - 객체 변수가 주소값이 없는 경우
			System.out.println(rnd.nextInt());
			
		} catch (Exception e) {
			System.out.println("널참조");
		}
			
		
		try {
			
			Object o1 = "문자열";
			
			System.out.println((int)o1);
			
		} catch (Exception e) {
			//에러메시지 전체를 출력해준다.
			//e.printStackTrace();
			System.out.println("형변환 오류");
		}	

	}

	private static void m2() {
		
		int[] nums = new int[5];
		
		//배열 범위 밖
		//java.lang.ArrayIndexOutOfBoundsException: 5
		
		try {
		
			nums[5] = 100;
			
			System.out.println(nums[5]);
			
		} catch (Exception e) {
			
			System.out.println("방 번호가 범위를 벗어났습니다.");
			
		}
		
		
	} //m2

	private static void m1() {
		
		//사용자 입력
		int num = 0;
		
		//피제수/제수
		//정수/정수 -> 제수는 0이 될 수 없다.
		//에러메시지 -> java.lang.ArithmeticException: / by zero
		//System.out.printf("100 / %d = %d\n", num, 100 / num);
		
		//예외 처리 방식
		
		//1. 전통적인 방식
		
		//if문 두개를 비교했을때 (가독성) 좋은 코드
		if (num != 0) {
			//비즈니스 코드(업무 코드)
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}

		//if문 두개를 비교했을때 (가독성) 나쁜 코드
		if (num == 0) {
			System.out.println("0을 입력하면 안됩니다.");
		} else {
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		}
		
		//2. 예외 처리 구문
		// - try catch
		try {
			
			System.out.println("하나");
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println("둘");
			
		} catch (Exception e) {
			
			//e : 예외 객체 - 예외와 관련된 정보를 제공
			
			System.out.println("0을 입력하면 안됩니다.");
			System.out.println(e);
			
		}
		
		
	} //m1
	
} //Ex69_Exception


class Parent {
	
	
	
}





