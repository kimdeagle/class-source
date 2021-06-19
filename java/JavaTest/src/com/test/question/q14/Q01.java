package com.test.question.q14;

public class Q01 {

	public static void main(String[] args) {
		
		
		Book b1 = new Book();
		
		b1.setTitle("2020 시나공 정보처리기사 실기");
		b1.setPrice(29700);
		b1.setAuthor("강윤석, 길벗알앤디");
		b1.setPublisher("길벗");
		b1.setIsbn("1165210568");
		b1.setPage(908);
		
		System.out.println(b1.info());
		
		Book b2 = new Book();
		
		b2.setTitle("2020 시나공 정보처리기사 실기#!@");
		b2.setPrice(11111111);
		b2.setAuthor("강윤석, 길벗알앤디");
		b2.setPublisher("길벗");
		b2.setIsbn("1165210568");
		b2.setPage(908);
		
		System.out.println(b2.info());
		
		
		
	} //main
	
	
} //Q01

class Book {
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2020년";
	private String isbn;
	private int page;
	
	
	public void setTitle (String title) {
		if (title.length() <= 50) { //50자 이하
			for (int i=0; i<title.length(); i++) { //한글, 영어, 숫자, 공백 검사	
				if ((title.charAt(i) >= '가' && title.charAt(i) <= '힣') ||
					(title.charAt(i) >= 'a' && title.charAt(i) <= 'z') ||
					(title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') ||
					(title.charAt(i) >= '0' && title.charAt(i) <= '9') ||
					(title.charAt(i) == ' ')) {
					this.title = title; //this.title에 한글자씩 입력됨
				} else { //특수문자 등
					System.out.println("올바르지 않은 제목입니다.");
					this.title = "";
					break;
				}
			}
		} else { //50자 이상
			System.out.println("올바르지 않은 제목입니다.");
		}
	} //setTitle
	
	
	public String getTitle () {
		return title;
	} //getTitle
	
	
	public void setPrice (int price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("올바르지 않은 가격입니다.");
		}
	} //setPrice
	
	
	public int getPrice () {
		return price;
	} //getPrice
	

	public String getAuthor() {
		return author;
	} //getAuthor
	

	public void setAuthor(String author) {
		this.author = author;
	} //setAuthor
	
	
	public int getPage() {
		return page;
	} //getPage
	

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		} else {
			System.out.println("올바르지 않은 페이지수 입니다.");
		}
	} //setPage
	

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	} //setPublisher
	

	public String getPubYear() {
		return pubYear;
	} //getPubYear
	
	
	public String getIsbn() {
		return isbn;
	} //getIsbn
	

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	} //setIsbn
	
	
	public String info() {
		
		String info = String.format("제목 : %s\n"
							+ "가격 : %,d원\n"
							+ "저자 : %s\n"
							+ "페이지수 : %d\n"
							+ "출판사 : %s\n"
							+ "발행년도 : %s\n"
							+ "ISBN : %s\n"
									, title
									, price
									, author
									, page
									, publisher
									, pubYear
									, isbn);
		
		return info;
		
	} //info
	
	
} //Book


















