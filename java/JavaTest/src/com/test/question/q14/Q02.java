package com.test.question.q14;

public class Q02 {

	public static void main(String[] args) {
		
		//Q02
		
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		System.out.println(note.info());
		
		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		System.out.println(note2.info());
		
		
	} //main
	
} //Q02

class Note {
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	
	private String pageThickness;
	private boolean noteOwner;
	
	public void setSize(String size) {
		if (size.equals("A3") ||
			size.equals("A4") ||
			size.equals("A5") ||
			size.equals("B3") ||
			size.equals("B4") ||
			size.equals("B5")) {
			this.size = size;
		} else {
			this.size = "";
		}
		
	} //setSize
	

	public void setColor(String color) {
		if (color.equals("검정색") ||
			color.equals("흰색") ||
			color.equals("노란색") ||
			color.equals("파란색")) {
			this.color = color;
		} else {
			this.color = "";
		}
		
	} //setColor
	
	
	
	public void setPage(int page) {
		
		if (page >= 10 && page <= 50) {
			this.page = page;
			pageThickness = "얇은";
		} else if (page > 50 && page <= 100) {
			this.page = page;
			pageThickness = "보통";
		} else if (page > 100 && page <= 200) {
			this.page = page;
			pageThickness = "두꺼운";
		} else {
			this.page = 0;
		}
		
	} //setPage
	
	
	public void setOwner(String owner) {
		
		if (owner.length() >= 2 && owner.length() <= 5) { //2~5자
			for (int i=0; i<owner.length(); i++) {
				if ((owner.charAt(i) >= '가' && owner.charAt(i) <= '힣')) { //한글
					this.owner = owner;
					noteOwner = true; //주인있음
				} else {
					noteOwner = false; //한글X -> 주인없음
					break;
				}
				
			} //for
			
		} else {
			noteOwner = false; //2~5자 이외 -> 주인없음
		}
		
	} //setOwner	
	
	public String info () {
		
		//price set
		price = 500;
		
		//size -> price
		if (size.equals("A3")) {
			price += 400;
		} else if (size.equals("A4")) {
			price += 200;
		} else if (size.equals("B3")) {
			price += 500;
		} else if (size.equals("B4")) {
			price += 300;
		} else if (size.equals("B5")) {
			price += 100;
		}
		
		//color -> price
		if (color.equals("검정색")) {
			price += 100;
		} else if (color.equals("노란색")) {
			price += 200;
		} else if (color.equals("파란색")) {
			price += 200;
		}
		
		//page -> price
		if (page > 10) {
			price += ((page - 10) * 10);
		}
		
		
		String info = String.format("%s\n", "■■■■■■■ 노트 정보 ■■■■■■■");
		
		if (noteOwner == true) {
			info += String.format("소유자 : %s\n"
								+ "특성 : %s %s %s노트\n"
								+ "가격 : %,d원\n"
								, owner
								, color, pageThickness, size
								, price);
			
		} else {
			info += String.format("%s\n", "주인 없는 노트");
		}

		info += String.format("%s\n", "■■■■■■■■■■■■■■■■■■■■■■■■■");

		return info;
		
	} //info
	

	
} //Note




