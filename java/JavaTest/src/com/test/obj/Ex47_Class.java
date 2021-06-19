package com.test.obj;

import java.util.Calendar;

public class Ex47_Class {

	public static void main(String[] args) {
		
		int weight = 40;
		String size = "A4";
		Calendar c1 = Calendar.getInstance();
		
		Paper p1 = new Paper();
		
		p1.setWeight(weight);
		p1.setSize(size);		
		
		p1.setCreationTime(c1); //*** 참조형 타입이 매개변수로 전달될 때 -> 주소값 복사
		
		//p1.setCreationTime(2020, 10, 30);
		//p1.setCreationTime("2020-10-30);
		
		System.out.println(p1.getWeight());
		System.out.println(p1.getSize());
		System.out.printf("%tF\n", p1.getCreationTime());
		
		System.out.println();
		
		//***
		//값형 vs 참조형 -> 매개 변수로 사용될 때
		//1. 값형 : 값을 복사해서 전달 -> 사이드 이펙트가 없다.
		//2. 참조형 : 주소값을 복사해서 전달 -> 사이드 이펙트가 있다.
		
		weight = 50;
		c1.add(Calendar.DATE, 7); //참조형 사용시 주의!!!!!
		
		System.out.println(p1.getWeight()); //여전히 40
		System.out.println(p1.getSize());
		System.out.printf("%tF\n", p1.getCreationTime()); //7일 더해진 날짜가 출력
		
		
		
	} //main
	
} //Ex47

class Paper {
	
	private int weight;
	private String size;
	private Calendar creationTime;
	
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public Calendar getCreationTime() {
		return creationTime;
	}
	
	public void setCreationTime(Calendar creationTime) {
		this.creationTime = creationTime;
	}
	
	public void setCreationTime(int year, int month, int date) {
		
		Calendar c1 = Calendar.getInstance();
		c1.set(year, month - 1, date);
		
		this.creationTime = c1;
		
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
} //Paper


