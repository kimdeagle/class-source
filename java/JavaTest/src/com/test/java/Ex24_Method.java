package com.test.java;

public class Ex24_Method {

	public static void main(String[] args) {
		
		//Ex24_Method.java
		
		/*
							   <이부분>
		접근지정자 정적키워드 반환자료형 메서드명(인자리스트) {
			실행 코드;
		}
		
		메서드 반환값
		 - return문 사용
		 - 메서드가 일을 하고 난 뒤 호출했던 곳으로 돌려주는 값
		 - return문은 단 1개의 데이터만 반환할 수 있다.(2개 이상의 데이터를 반환할 수 없다.)
		 
		 
		 
		 
		
		*/
		
		String result = m1();
		
		System.out.println(result);
		
		int sum = add(10, 20);
		
		System.out.println(sum);
		System.out.println(add(30, 40));
		
		System.out.println(check(18));
		
		
	} //main
	
	public static String m1() {
		
		String num = "하나";
		
		return num; //메서드를 종료하고 호출했던 곳으로 돌아감 + num을 가지고 돌아감		
		
	} //m1
	
	public static int m2() {
		
		return 100;
		
	} //m2
	
	public static String m3() {
		
		return "홍길동";
		
	} //m3
	
	public static boolean m4() {
		
		return true;
		
	} //m4
	
	public static void m5() {
		
		//return X
		//void -> 리턴값 없을 때
		
	} //m5
	
	//문법에 맞지 않는다. 즉 2개 이상의 데이터를 반환할 수 없다.
//	public static int int String m6() {
//		
//		return 10, 20, "홍길동";
//		
//	} //m6
	
	public static int add(int a, int b) {
		
		return a + b;
		
	} //add
	
	public static String check(int age) {
		
		return age >= 19 ? "성년" : "미성년자";
		
	} //check
	
	
	
	
	
	
	
}
