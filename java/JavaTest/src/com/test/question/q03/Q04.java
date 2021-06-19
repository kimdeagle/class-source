package com.test.question.q03;

public class Q04 {

	public static void main(String[] args) {
		
		//이름을 직급순으로 출력
		
		String name1 = "홍길동";
		String name2 = "유재석";
		String name3 = "박명수";
		String name4 = "정형돈";
		
		//position 메서드 호출
		position(name1);
		position(name1, name2);
		position(name1, name2, name3);
		position(name1, name2, name3, name4);
		
		
	} //main
	
	public static void position(String name1) {
		System.out.printf("사원 : %s\n", name1);
	}
	
	public static void position(String name1, String name2) {
		System.out.printf("사원 : %s\n대리 : %s\n", name1, name2);
	}
	
	public static void position(String name1, String name2, String name3) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n", name1, name2, name3);
	}
	
	public static void position(String name1, String name2, String name3, String name4) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n", name1, name2, name3, name4);
	}
	
	
}
