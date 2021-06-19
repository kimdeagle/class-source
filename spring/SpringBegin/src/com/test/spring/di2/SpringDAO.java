package com.test.spring.di2;

import java.util.Random;

public class SpringDAO {
	
	//DI, Dependency Injection
	// - 의존 주입(의존 객체 주입)
	
	//IoC, Inversion of Control
	// - 역제어
	// - 평상 시 객체를 생성하던 순서를 역으로 제어하는 디자인 패턴
	// - DI를 구현하면 나오는 현상
	
	//Ex01 예제
	//1. Ex01 생성 -> SpringDAO 생성 -> Random 생성
	
	//Ex02 예제
	//2. Ex02 생성 -> Random 생성 -> SpringDAO 생성
	
	//DI 구현 방식
	// - 생성자 or Setter
	
	//1. 생성자 + 멤버 변수
	private Random rnd;
	
	public SpringDAO(Random rnd) {
		this.rnd = rnd;
	}
	
	//2. Setter + 멤버 변수
	public SpringDAO() {
		
	}
	
	public void setRnd(Random rnd) {
		this.rnd = rnd;
	}
	

	public int getNum() {

		//SpringDAO -> rnd 의존
		
		//의존 객체를 누가 만드느냐?(******)
		//1. 직접 생성
		//2. 외부로부터 공급
		
		
		return rnd.nextInt(100);
	}

}
