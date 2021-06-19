package com.test.question.q16;

public class Box {

	private Macaron[] list = new Macaron[10]; //객체 선언
	
	//TODO 질문]] list 출력시 "합격", "불합격" 출력하기 위해 멤버 변수 하나를 추가로 생성하여 사용했는데 만들지 않고 출력하는 방법이 있을까요?
	private String[] checkPassFail = new String[list.length]; //합격, 불합격
	
	public void cook() {
		
		for (int i=0; i<list.length; i++) {
			list[i] = new Macaron(); //객체 생성
			list[i].setSize();
			list[i].setColor();
			list[i].setThickness();
		}
		System.out.printf("마카롱을 %d개 만들었습니다.\n", list.length);
		System.out.println();

	} //cook
	
	public void check() {
		
		int pass = 0;
		int fail = 0;
		
		
		for (int i=0; i<list.length; i++) {
			if (list[i].getColor().equals("black")) { //검정이면
				fail++; //불합격
				checkPassFail[i] = "불합격";
			} else { //검정이 아니면
				//크기 : 5~15 이면서 두께 : 3~18 이면 합격
				if ((list[i].getSize() >= 8 && list[i].getSize() <= 14) &&
					(list[i].getThickness() >= 3 && list[i].getThickness() <= 18)) {
					pass++;
					checkPassFail[i] = "합격";
				//둘중 하나라도 아니면 불합격
				} else {
					fail++;
					checkPassFail[i] = "불합격";
				}
			}
			
			
		} //for	
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n", fail);
		System.out.println();

		
	} //check
	
	public void list() {
		
		System.out.println("[마카롱 목록]");
		
		for (int i=0; i<list.length; i++) {
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n"
								, i+1
								, list[i].getSize()
								, list[i].getColor()
								, list[i].getThickness()
								, checkPassFail[i]);

		} //for
		
		
	} //list
	
	
	
	
} //Box
