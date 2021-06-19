package com.test.inheritance;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex63_Casting {

	public static void main(String[] args) {
		
		//Ex63_Casting.java
		
		AA a = new AA(); //자기 타입
		AA b = new BB(); //부모 = 자식 -> 업캐스팅
		AA c = new CC(); //할아버지 = 손자 -> 업캐스팅
		AA d = new DD(); //증조할아버지 = 증손자 -> 업캐스팅
		
		Object o1 = new Object();
		Object o2 = new AA(); //업캐스팅
		Object o3 = new BB();
		Object o4 = new CC();
		Object o5 = new DD();
		
		Object o6 = new Random();
		Object o7 = Calendar.getInstance();
		Object o8 = new Date();
		Object o9 = new int[5];
		Object o10 = "홍길동";
		
		//현존하는 모든 클래스의 최상위에는 Object 클래스가 있다.
		// -> 업캐스팅은 세대수와 상관없이 가능하기 때문에 결국 자바에 존재하는 모든 클래스는 Object 참조변수에 넣을 수 있다.(*****)
		
		//Object 변수 -> 만능 주머니(장점 + 단점)
		
		//Object 변수는 값형 데이터도 담을 수 있다.(나중에 보충)
		Object o11 = 10;
		Object o12 = true;
		Object o13 = 3.14;
		Object o14 = 'A';
		
		
	} //main
	
} //Ex63_Casting


class AA { //extends Object {
	
}

class BB extends AA {
	
}

class CC extends BB {
	
}

class DD extends CC {
	
}

