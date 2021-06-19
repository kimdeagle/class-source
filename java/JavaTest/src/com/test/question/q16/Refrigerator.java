package com.test.question.q16;

public class Refrigerator {

	private Item[] list = new Item[100];
	
	private int count = 0; //냉장고에 들어있는 식품 개수
	
	public void add(Item item) {

		list[count] = item; //item 넣기
	
		System.out.printf("\'%s\'을(를) 냉장고에 넣었습니다.\n", item.getName());
		count++; //식품 개수 증가

	} //add
	
	public Item get(String name) {
		Item getList = null; //초기화
		int index = 0;
		for (int i=0; i<count; i++) {
			if (list[i].getName().equals(name)) { //꺼내려는 item 찾기
				getList = list[i]; //찾은 제품을 getList에 넣기
				count--; //식품 개수 감소
				index = i; //찾은 위치
				break;
			}
		}
		
		for (int i=index; i<count; i++) {
			list[i] = list[i+1]; //찾은위치에 그 다음위치의 item을 옮겨준다.
		}
		
		return getList; //찾은 제품 리턴
		
	} //get
	
	public int count() {
		return count; //item 개수 = this.count
		
	}
	
	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for (int i=0; i<count; i++) { //item 개수만큼 출력
			System.out.printf("%s(%s)\n", list[i].getName(), list[i].getExpiration());
		}
		
	}
	
	
} //Refrigerator
