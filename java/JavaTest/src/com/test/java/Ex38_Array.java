package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;

public class Ex38_Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex38_Array.java
		
		//배열(Array)
		// - 배열 + 제어문(조건문, 반복문, 분기문) + 자료형
		// - 같은 성격(***) + 같은 자료형 -> 데이터들을 모아놓은 집합 자료형
		// - 다른 성격의 데이터를 넣으면 해당 배열이 뭔지 혼동이 온다.
		// - 참조형
		
		//값형 vs 참조형 -> 물리적 구조
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
		
		
	} //main

	private static void m13() {
		
		//dump(주기억 장치의 내용을 그대로 화면이나 프린터, 파일 따위로 출력하는 일)
		//배열 -> 풀어서 -> 일련의 문자열
		
		int[] ns = { 10, 20, 30, 40, 50 };
		
		
		System.out.print("ns = [");
		for (int i=0; i<ns.length; i++) {
			System.out.printf("%3d", ns[i]);
			if (i < ns.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print(" ]");
		
		
	} //13

	private static void m12() {
		
		//프로젝트 적용
		// - 데이터 만들기
		// - 프로젝트 할 때 데이터는 많을수록 좋다.
		// - 진짜 데이터 다량 확보
		//		a. 웹 구글링
		//		b. 크롤링(스크래핑)
		//		c. 데이터 직접 만들기
		// - 프로젝트 구현 > 더미 데이터 > 서비스 오픈 최소 2~3개월이 지났을 때의 데이터 분량
		
		//회원 관리 프로그램
		// - 회원 정보 * 1000명
		// - 회원 정보 구성
		//		a. 이름 : 문자열
		//		b. 나이 : 숫자
		//		c. 성별 : 숫자(1.남자, 2.여자)
		//		d. 주소 : 문자열
		
		//회원 정보 저장소
		int count = 1000; //회원수
		
		String[] name = new String[count];
		int[] age = new int[count];
		int[] gender = new int[count];
		String[] address = new String[count];
		
		//기초 데이터 > 임의의 회원 정보를 만들기 위한 소스
		String[] n1 = { "김", "이", "박", "최", "정", "한", "지", "조", "유", "임" }; //성
		String[] n2 = { "대", "은", "창", "미", "준", "수", "진", "우", "채", "원", "경", "민", "훈", "철", "승", "제" }; //이름
		
		String[] a1 = { "서울시", "인천시", "부산시", "광주시", "대전시" };
		String[] a2 = { "동대문구", "서대문구", "중구", "남구", "북구" };
		String[] a3 = { "역삼동", "대치동", "성내동", "논현동", "염재동", "풍납동" };
		
		
		//나이
		for (int i=0; i<count; i++) {
			
			//나이 (0 ~ 40 -> 19 ~ 59)
			age[i] = (int)(Math.random() * 41) + 19; //19 ~ 59
			
			//성별(0 ~ 1 -> 1 ~ 2)
			gender[i] = (int)(Math.random() * 2) + 1; //1 ~ 2
			
			//이름(n1 + n2 + n2)
			name[i] = n1[(int)(Math.random() * n1.length)] 
					+ n2[(int)(Math.random() * n2.length)] 
					+ n2[(int)(Math.random() * n2.length)];
			
			//주소(a1 + a2 + a3 + 번지수)
			address[i] = a1[(int)(Math.random() * a1.length)]
						+ " "
						+ a2[(int)(Math.random() * a1.length)]
						+ " "
						+ a3[(int)(Math.random() * a1.length)]
						+ " "
						+ ((int)(Math.random() * 200) + 150);
			
		}
		
		System.out.println("[이름]\t[나이]\t[성별]\t[주소]");
		
		for (int i=0; i<count; i++) {
			System.out.printf("%s\t%6d\t%s\t%s\n"
							, name[i]
							, age[i]
							, gender[i] == 1 ? "남자" : "여자"
							, address[i]);
		}
		
		
	} //m12

	private static void m11() {
		
		//배열 초기화
		// -> 배열 초기화 리스트, 초기화(Initializer)
		int[] nums1 = new int[5];
		
		nums1[0] = 100;
		nums1[1] = 65;
		nums1[2] = 23;
		nums1[3] = 97;
		nums1[4] = 81;
		
		int[] nums2 = new int[] { 100, 65, 23, 97, 81 };
		
		for (int num : nums2) {
			System.out.println(num);
		}
		System.out.println();
		
		int[] nums3 = { 100, 65, 23, 97, 81 };
		
		for (int num : nums3) {
			System.out.println(num);
		}
		
		String[] names = { "홍길동", "아무개", "하하하", "허허허", "후후후" };
		boolean[] flags = { true, false, true, true, false };
		char[] clist = { 'a', 'b', 'c', 'D', 'E' };
		
		
	} //m11

	private static void m10() {
		
		//배열 초기화
		
		//int a; //지역 변수
		//Error Message [The local variable a may not have been initialized]
		//System.out.println(a);
		
		//*** 배열의 특징(모든 참조형 특징)
		// - 배열은 생성된 직후에 각 방들이 특정한 값으로 초기화된다. -> 클래스 생성자
		
		//어떤 값으로 초기화?
		//1. 정수 배열 -> 0
		//2. 실수 배열 -> 0.0
		//3. 문자 배열 -> '\0' (null 문자, 문자코드값(0))
		//4. 논리 배열 -> false
		//5. 참조형 배열 -> null
		
		int[] list1 = new int[3];
		System.out.println(list1[0]);
		
		double[] list2 = new double[3];
		System.out.println(list2[0]);
		
		boolean[] list3 = new boolean[3];
		System.out.println(list3[0]);
		
		
	} //m10

	private static void m9() {
		
		//배열(X) -> 제어문(O)
		
		String[] names = new String[5];
		
		names[0] = "홍길동";
		names[1] = "아무개";
		names[2] = "유재석";
		names[3] = "신동엽";
		names[4] = "강호동";
		
		//탐색 -> for문
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		
		//탐색 -> 향상된 for문
		// - 루프 변수가 없다. -> 몇바퀴?
		// - for문이 스스로 배열의 첫번째 방부터 마지막 방까지 순차적(***)으로 탐색하면서 값을 가져온다.
		// - 안정성 높음. 코드 간결함
		// - 무조건 순서대로만 가져온다.(순서 제어 불가능)
		// - 무조건 처음부터 끝까지 다 가져온다.(예외 없음)
		// - 속도 빠름
		
		//for (변수 : 배열) {}
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		
	} //m9

	private static void m8() {
		
		//배열 복사
		
		String[] s1 = new String[3]; //원본
		String[] s2; //복사본
		
		s1[0] = "홍길동";
		
		//참조값 복사(주소값 복사)
		//원본 <- (영향) -> 복사본
		//얕은 복사(Shallow Copy) -> 기본 방식
		s2 = s1;
		
		System.out.println(s2[0]);
		
		s1[0] = "김길동";
		
		System.out.println(s2[0]);
		
		//깊은 복사(Deep Copy) -> 구현
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		//깊은 복사(Deep Copy)
		//배열이 가지는 방끼리 직접 복사한다.
		for (int i=0; i<nums1.length; i++) {
			
			//int = int
			//값형 = 값형
			//데이터 복사
			nums2[i] = nums1[i];
		}
		
		System.out.println(nums2[0]);
		
		nums1[0] = 500;
		
		System.out.println(nums1[0]);
		System.out.println(nums2[0]);
		
		
		//깊은 복사 -> JDK 제공
		double[] d1 = new double[3];
		
		d1[0] = 1.23;
		d1[1] = 2.34;
		d1[2] = 3.45;
		
		double[] d2;
		double[] d3;
		
		d2 = d1.clone(); //깊은 복사
		d3 = Arrays.copyOf(d1, d1.length); //깊은 복사
		
		d1[0] = 3.14;
		
		System.out.println(d2[0]);
		System.out.println(d3[0]);
		
		
	} //m8

	private static void m7() {
		
		//배열 복사(참조형 복사 - 단, 문자열 제외)
		
		//값형 복사
		//1. 모든 값형은 변수안에 값(데이터)을 저장한다.
		//2. 값형 변수끼리의 복사는 값(데이터)을 복사한다.
		int a = 10;
		int b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		//배열 복사(참조형 복사)
		int[] nums1 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		int[] nums2 = new int[3];
		
		//***
		//참조형 변수끼리의 복사는 주소값을 복사한다.
		// - 배열은 복사한 뒤에 배열 한쪽을 수정하면 나머지 배열도 같이 수정된다.
		nums2 = nums1;
		
		System.out.println(nums2[0]);
		
		nums1[0] = 500;
		
		System.out.println(nums2[0]);
		
		
	} //m7

	private static void m6() throws NumberFormatException, IOException {
		
		//*** 배열의 길이는 불변이다. > 한번 만들어진 배열의 방 개수를 변경할 수 없다. > 배열을 만들 때 반드시 들어갈 데이터의 개수를 충분히 예상해서 만들어야 한다.(***)
		
		//학생 국어 점수 -> 학교 방문 + 교장 선생님 -> 학생수 파악 -> 500명 -> 
		int[] kor = new int[600];
		
		//클라이언트 납품 -> 소스 제공(X), 컴파일 결과물 제공(O)
		
		//*** 자바의 배열은 동적할당이 가능하다. -> 자바 배열의 길이는 컴파일 단계에서 정해지지 않고, 런타임 단계에서 결정할 수 있다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수 입력 : ");
		int count = Integer.parseInt(reader.readLine());
		
		int[] eng = new int[count]; //이 이후로는 배열의 길이는 불변
		
		System.out.println(eng.length);
		
		
	} //m6

	private static void m5() {
		
		//배열 생성 + 모든 자료형
		
		//정수 배열(byte, short, int, long)
		short[] list1 = new short[10];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[10];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자 배열(char) == 문자열(String)
		char[] list3 = new char[3];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리 배열
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		//참조형
		String[] list5 = new String[3];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//각각 독립된 변수 -> 날짜 2개 -> 배열
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		Calendar[] cs = new Calendar[2];
		cs[0] = c1;
		cs[1] = c2;
		
		//결론
		// - 자바의 모든 자료형은 배열을 만들 수 있다.
		
		
	} //m5

	private static void m4() {
		
		//배열 생성
		// - 길이가 10인 int 배열을 만드세요.
		int[] nums = new int[10]; //주로 사용
		int nums2[] = new int[10]; //사용 안함
		
		//배열 초기화
		// - 방 순서대로 1 ~ 10 대입
		
		//배열 탐색 -> 루프
		for (int i=0; i<nums.length; i++) {
			nums[i] = i + 1;
		}
		
		//출력 + 배열 사용(호출)
		System.out.println(nums[0]);
		
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		//배열 주의점!!!
		
		//java.lang.ArrayIndexOutOfBoundsException
		// - 존재하지 않는 index(첨자)를 사용
		// - 없는 방번호를 기재
		//System.out.println(nums[10]);

		
	} //m4

	private static void m3() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//추가사항] 학생 500명
		
		int[] kor = new int[50]; //변수 3개 -> 변수 300개 -> 변수 500개
		
		kor[0] = 100;
		kor[1] = 90;
		kor[2] = 80;
		//kor[3] = 75;
		//kor[4] = 67;
		//..
		//kor[299] = 100;
		
		
		int total = kor[0] + kor[1] + kor[2]; //+ kor[3] + kor[4] + .. + kor[299]
		double avg = (double)total / 3; //300
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
		
		
		//학생 점수 대입
		
		for (int i=0; i<kor.length; i++) {
			
			kor[i] = 100; //점수는 나중에 파일(DB)로부터 얻어와서 대입
			
		}
		
		//총점
		total = 0;
		
		for (int i=0; i<kor.length; i++) {
			
			total += kor[i]; //점수는 나중에 파일(DB)로부터 얻어와서 대입
			
		}
		
		//평균
		avg = (double)total / kor.length;
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
		
		
	} //m3

	private static void m2() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		
		//배열 사용
		// - [] : 차원
		// - 자료형[] 변수명 = new 자료형[길이];
		// - 자료형[] 배열명 = new 자료형[길이];
		
		int num = 10; //변수를 만들어서 그 안에 데이터를 넣어라
		
		//kor -> int배열입니다.
		int[] kor = new int[3]; //배열 선언(생성)
		
		int a;
		int b;
		int c;
		
		a = 10;
		b = 20;
		c = 30;
		
		kor[0] = 100;
		kor[1] = 90;
		kor[2] = 80;
		
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		//문자열 -> 문자 배열
		//서수(index)
		// - Zero-based Index
		// - 주로 C계열 언어에서 잘 사용
		
		// - Basic 계열 언어
		// - One-based Index

		
	} //m2

	private static void m1() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//추가사항] 학생 300명
		int kor1;
		int kor2;
		int kor3;
		//+297
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//+297
		
		int total = kor1 + kor2 + kor3; // + kor4 + kor5 + .. + kor300
		double avg = (double)total / 3; // 300
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
		
		
		
	} //m1
	
	
	
	
}
