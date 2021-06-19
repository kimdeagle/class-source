package com.test.obj;

import java.util.Calendar;

public class Ex45_Access {

	public static void main(String[] args) {
		
		Note n1 = new Note();
		
		//읽기/쓰기 필드
		// - setter, getter
		n1.setColor("blue");
		System.out.println(n1.getColor());
		
		//쓰기 전용 필드
		// - setter
		n1.setPage(150);
		//System.out.println(n1.getPage());
		
		//읽기 전용 필드
		// - getter
		//n1.setPrice(1500);
		System.out.println(n1.getPrice());
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 6, 1);
		n1.setDate(c1);
		
		System.out.printf("%tF\n", n1.getDate());
		
		System.out.println(n1.getOld());
		
		
	} //main
	
	
} //Ex45_Access

class Note {
	
	private String color; //표지 색상
	private int page; //페이지수
	private int price = 1000; //가격
	private String owner; //소유주
	private String size; //사이즈
	
	private Calendar date; //노트 제작년월
	
	//setter, getter 구현
	
	public void setColor (String color) {
		//유효성 검사
		this.color = color;
	}
	
	public String getColor () {
		return this.color;
	}


	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
	
	//객체의 멤버 변수(데이터) + setter(getter)
	// -> Property, Attribute
	
	//계산된 프로퍼티
	public String getOld() {
		
		long t1 = this.date.getTimeInMillis(); //Tick
		
		Calendar now = Calendar.getInstance();
		long t2 = now.getTimeInMillis();
		
		return (t2 - t1) > (1000 * 60 * 60 * 24 * 30) ? "오래된 노트" : "새 노트";
		
	}

	
} //Note











