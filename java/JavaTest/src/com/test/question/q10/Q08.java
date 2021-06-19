package com.test.question.q10;

public class Q08 {

	public static void main(String[] args) {
		
		//Q08
		
		m1();
		
	} //main

	private static void m1() {
		
		String content = "안녕~ 길동아~ 잘가~ 길동아 길동 길동무 길똥이";
		String word = "길동";
		
		int count = 0;
		
		int index = -1;
		
		while (true) {
			
			index = content.indexOf(word, index);
			
			if (index == -1) {
				break;
			}
			
			count++;
			
			index += word.length();
			
		}
		
		System.out.printf("\'%s\'을 총 %d회 발견했습니다.\n", word, count);
		
		
	} //m1
	
}
