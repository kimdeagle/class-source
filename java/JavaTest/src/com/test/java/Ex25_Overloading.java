package com.test.java;

public class Ex25_Overloading {

	public static void main(String[] args) {
		
		//Ex25_Overloading.java
		
		//메서드 오버로딩(Method Overloading) //*** 면접 질문 잘나옴
		// - 메서드가 인자 리스트를 다양한 형태로 가질 수 있는 기술
		// - 이를 통해 같은 이름의 메서드를 여러개 선언하는 기술
		
		//메서드 시그니쳐(Method Signature)
		// - 메서드 헤더 부분
		
		//메서드 오버로딩 조건 O
		//1. 인자의 개수
		//2. 인자의 타입
		
		//메서드 오버로딩 조건 X
		//1. 인자의 이름
		//2. 반환값의 타입
		
		test(); //1. Method
		test(10); //3. Method
		test("홍길동"); //5. Method
		test(10, 20); //6. Method
		
		
		
	} //main
	
	//1.
	public static void test() {
		System.out.println("1");
	} //test
	
	//2. 실패 : 1번 때문에
//	public static void test() {
//		System.out.println("2");
//	} //test
	
	//3. 성공 : 매개변수(인자)의 개수가 다르기 때문 (1번과 비교)
	public static void test(int n) {
		System.out.println("3");
	} //test
	
	//4. 실패 : 3번 때문에 -> 매개변수(인자)의 이름이 다르다는것으로는 메서드 오버로딩 X
//	public static void test(int m) {
//		System.out.println("4");
//	} //test
	
	//5. 성공 : 매개변수(인자)의 타입이 다르기 때문 (3번과 비교)
	public static void test(String a) {
		System.out.println("5");
	} //test
	
	//6. 성공 : 매개변수(인자)의 개수가 다르기 때문 (3번과 비교)
	public static void test(int a, int b) {
		System.out.println("6");
	} //test
	
	//7. 성공 : 매개변수(인자)의 타입이 다르기 때문 (6번과 비교)
	public static void test(int a, String b) {
		System.out.println("7");
	} //test
	
	//8. 성공 : 매개변수(인자)의 타입이 다르기 때문 (7번과 비교) -> 매개변수 호출할 때 순서도 중요!
	public static void test(String a, int b) {
		System.out.println("8");
	} //test
	
	//9. 실패 : 1번 때문에 -> 반환값 타입이 다르다는것으로는 메서드 오버로딩 X
//	public static int test() {
//		System.out.println("9");
//		return 100;
//	} //test
	
	
	
	
}
