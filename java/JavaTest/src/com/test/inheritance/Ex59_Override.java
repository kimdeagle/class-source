package com.test.inheritance;

import java.util.Calendar;
import java.util.Date;

public class Ex59_Override {

	public static void main(String[] args) {
		
		//밥먹듯이 하는 오버라이드
		//흔히 볼 수 있는 오버라이드 사례
		
		Time t1 = new Time();
		Time t2 = new Time(2, 30, 40);
		
		System.out.println(t1.info());
		System.out.println(t2.info());
		
		//com.test.inheritance.Time@4aa298b7
		// - com.test.inheritance.Time -> 자료형
		// - 4aa298b7 -> 객체가 위치한 메모리 주소값
		
		//Object 클래스 상속받음 -> 위와같이 출력됨
		//Object 클래스가 물려준 toString() 재정의 > 오버라이드
		//해야하는 이유 : 전세계 개발자가 이 결과 뭔지 알고 있음
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		
		Date d1 = new Date();
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(d1);
		System.out.println(c1);
		
		System.out.println(d1.toString()); //오버라이드
		System.out.println(c1.toString()); //오버라이드
		
		
		
	}
	
}

class Time {
	
	private int hour;
	private int min;
	private int sec;
	
	//생성자 : 아무것도 안만들면 보이지 않는 기본 생성자가 만들어지지만, 하나라도 만들면 생성자가 만들어지지 않는다. -> 기본적으로 개발자들은 인자를 받지 않는 생성자를 선언한다. 
	//서비스 차원
	public Time() {
//		this.hour = 0;
//		this.min = 0;
//		this.sec = 0;
		
		//해당 클래스 내부에서 호출 가능(보통 생성자끼리 호출)
		this(0, 0, 0); //다른 생성자 호출하기 >> this <<
		
	}
	
	
	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public String info() {
		
		//t1 -> 00:00:00
		//t2 -> 02:30:40
		
		return String.format("%02d:%02d:%02d", this.hour, this.min, this.sec);
	}
	
	//Object 클래스가 물려준 toString() 재정의 > 오버라이드
	// -> Object.toString() -> (재정의) -> 되도록 해당 객체가 가지고 있는 데이터를 문자열로 반환하도록 재정의한다.
	@Override
	public String toString() {
		
		return String.format("%02d:%02d:%02d", this.hour, this.min, this.sec);
	}
	
	
}











