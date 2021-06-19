package com.test.question.q10;

public class Q06 {

	public static void main(String[] args) {
		
		//Q06
		//문자열 사이의 공백을 제거O. 좌우 공백은 제거X
		
		m1();
		
	} //main

	private static void m1() {
		
		String txt = "    하나    둘    셋    ";
		
		int leftSpaceCount = 0;
		int RightSpaceCount = 0;
		
		System.out.printf("원본 문자열 : \"%s\"\n", txt);
		
		for (int i=0; i<txt.length(); i++) {
			
			char space = txt.charAt(i);
			leftSpaceCount++;
			if (space != ' ') {
				break;
			}
			
		}
		
		for (int i=txt.length()-1; i>0; i--) {

			char space = txt.charAt(i);
			RightSpaceCount++;
			if (space != ' ') {
				break;
			}

		}
		
		System.out.print("결과 문자열 : \"");
		
		for (int i=0; i<leftSpaceCount; i++) {
			System.out.print(" ");
		}
		
		System.out.print(txt.replace(" ", ""));
		
		for (int i=0; i<RightSpaceCount; i++) {
			System.out.print(" ");
		}
		
		System.out.println("\"");
		
		
	} //m1
	
}
