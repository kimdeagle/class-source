package com.test.java;

public class Ex22_Method {

	public static void main(String[] args) {
		
		//Ex22_Method.java
		
		//메소드 인자 리스트
		// - 파라미터(Parameter)
		// - 인자(Argument)
		// - 매개변수
		// - 가인자 / 실인자, Form Parameter / Real Parameter
		
		//요구사항] '홍길동'에게 인사하는 메서드를 작성하시오.
		
		hello();
		
		//변경사항] '아무개'에게 인사하는 메서드를 작성하시오.
		
		//메서드 매개변수 사용
		// - 메서드 쓰임새가 다양해진다. -> 활용도가 높아진다. -> 가용성이 높아진다.
		
		hi("홍길동");
		hi("아무개");
		
		int a = 10;
		
		m1(a);
		m1(10);
		
		String b = "홍길동";
		
		//매개변수의 자료형과 인자값의 자료형은 반드시 동일해야 한다.
		//m1(b); //불가능
		
		short c = 10;
		m1(c); //암시적 형변환
		
		double d = 10;
		m1((int)d); //명시적 형변환
		
		//*** 메서드가 매개변수가 존재하면 반드시 인자값을 전달하면서 호출해야 한다. -> 메서드 호출 불가능
		//m1(); //매게변수가 있기 때문에 불가능
		
		//매개변수 개수 늘린 이유 -> 1개의 메서드를 좀 더 다양하게 사용하기 위해
		m2("홍길동", 20);
		
		//매개변수의 순서를 반드시 지켜야 한다.
		//m2(20, "홍길동");
		
		//매개변수의 갯수를 반드시 지켜야 한다.
		//m2("홍길동");
		//m2("홍길동", 20, "남자");
		
		m3(10, 30);
		m3(5000, 3000);
		
		//*** 메서드를 사용하는 측에서는 메서드 내부에서 어떤 일이 일어나는지 알 필요가 없다.
		// -> 메서드는 일종의 블랙박스이다.
		m4("할아버지", 70);
		m4("꼬맹이", 10);
	
		
	} //main
	
	public static void hello() {
		
		System.out.println("홍길동님. 안녕하세요.");
		
	} //hello
	
	//매개변수는 초기화 할 수 없다.
	public static void hi(String name) {
		
		//String name = "홍길동";
		
		System.out.printf("%s님 반갑습니다.\n", name);
		
	} //hi
	
	public static void m1(int num) {
		
		System.out.println("num : " + num);
		
	} //m1
	
	//매개변수의 개수가 늘었다.
	public static void m2(String name, int age) {
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d세\n", age);
		
	} //m2
	
	public static void m3(int a, int b) {
		
		System.out.printf("%,d + %,d = %,d\n", a, b, (long)a + b); //결과값을 예측하여 자료형 잘 사용할 것! +21억 이상의 값이 입,출력 될 수 있다.
		
	} //m3
	
	public static void m4(String name, int age) {
		
		//중학생 이상 : 안녕하세요. 홍길동.
		//초등학생 : 안녕~ 홍길동.
		
		String result = age >= 14 ? "안녕하세요." : "안녕~";
		
		System.out.printf("%s %s\n", result, name);
		
	} //m4

	
}
