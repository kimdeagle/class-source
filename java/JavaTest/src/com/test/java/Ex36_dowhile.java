package com.test.java;

public class Ex36_dowhile {

	public static void main(String[] args) {
		
		//Ex36_dowhile.java
		
		//제어문 중요도(사용성)
		//if(***), switch(*)
		//for(***), while(***), do-while, for(***)
		//break(**), continue(**) <-보조 역할
		
		/*
		
		while (조건) {
			실행코드;
		}
		
		
		do {
			실행코드;
		} while (조건);
		
		*/
		
		int num = 11;
		
		//선조건 후실행
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("종료");
		
		num = 11;
		
		//무조건 1번은 실행 -> 거의 쓰지 않는다.
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
		
		System.out.println("종료");
		
		
	}
	
}
