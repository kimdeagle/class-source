package com.test.question.q15;

import java.util.Calendar;

public class Q01 {

	public static void main(String[] args) {
		
		//Q01
		//Bugles
		
		Bugles snack = new Bugles();
		snack.setSize(500);
		snack.setCreationTime("2020-09-16");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 : " + snack.getExpiration() + "일 남았습니다.");
		snack.eat();
		
		System.out.println();
		
		Bugles snack2 = new Bugles();
		snack2.setSize(300);
		snack2.setCreationTime("2020-09-01");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 : " + snack2.getExpiration() + "일 남았습니다.");
		snack2.eat();

		
	} //main
	
} //Q01


class Bugles {
	
	private int price;
	private int size;
	private Calendar creationTime;
	private int expiration;
	
	
	public int getPrice() {
		if (size == 300) {
			price = 850;
		} else if (size == 500) {
			price = 1200;
		} else {
			price = 1950;
		}
		return price;
	} //getPrice
	
	
	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		
		//용량별 유통기한 계산
		if (size == 300) {
			this.expiration = 7 - (int)(now.getTimeInMillis() - creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24; 
		} else if (size == 500) {
			this.expiration = 10 - (int)(now.getTimeInMillis() - creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24; 
		} else if (size == 850) {
			this.expiration = 15 - (int)(now.getTimeInMillis() - creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24; 
		}
		
		return expiration;
		
	} //getExpiration
	
	
	public void setSize(int size) {
		this.size = size;
	} //setSize
	
	
	public void setCreationTime(String creationTime) {
				
		// 2020-10-20 -> 20201020
		creationTime = creationTime.replace("-", "");
		
		int year = Integer.parseInt(creationTime.substring(0, 4)); //year
		int month = Integer.parseInt(creationTime.substring(4, 6)); //month
		int date = Integer.parseInt(creationTime.substring(6)); //date
		
		this.creationTime = Calendar.getInstance();
		this.creationTime.set(year, month-1, date); //1월 -> 0
		
	} //setCreationTime
	
	
	public void eat() {
		if (expiration >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	} //eat
	
	
} //Bugles
