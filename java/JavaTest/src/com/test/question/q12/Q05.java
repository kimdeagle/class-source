package com.test.question.q12;

public class Q05 {

	public static void main(String[] args) {
		
		//Q05
		
		String txt = "안녕녕하하하하세요....홍홍홍홍길동입입니다다다다다..";
		
		int count = 1;
		
		for (int i=0; i<txt.length(); i++) {
			
			char find = txt.charAt(i);
			
			if (i != txt.length()-1) {
				if (find == txt.charAt(i+1)) {
					count++;
				} else {
					System.out.printf("\'%c\' : 발견횟수 %d회\n", find, count);
					count = 1;
				}
			} else {
				System.out.printf("\'%c\' : 발견횟수 %d회\n", find, count);
			}
				
		}
		
		
	} //main
	
}
