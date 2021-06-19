package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자 2개 입력받아 큰수 작은수 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : "); //입력 안내문
		
		int num1 = Integer.parseInt(reader.readLine()); //첫번째 숫자 입력값 저장
		
		System.out.print("두번째 숫자 : "); //입력 안내문
		
		int num2 = Integer.parseInt(reader.readLine()); //두번째 숫자 입력값 저장
		
		if (num1 != num2) {
		
			if (num1 > num2) {
				System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다.\n", num1, num2);
				System.out.printf("입력한 두 숫자는 %d가 차이납니다.\n", num1 - num2);
			} else if (num1 < num2) {
				System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다.\n", num2, num1);
				System.out.printf("입력한 두 숫자는 %d가 차이납니다.\n", num2 - num1);
			}
		
		} else {
			System.out.println("두 숫자는 같습니다.");
		}
		
		
	} //main
	
}
