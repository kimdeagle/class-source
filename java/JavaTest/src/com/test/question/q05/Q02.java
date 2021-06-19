package com.test.question.q05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//국어 점수 입력받아 성적 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어점수 : "); //입력 안내
		
		int korScore = Integer.parseInt(reader.readLine()); //점수 입력값 저장
		
		if (korScore >= 0 && korScore <= 100) { //유효성 검사
			
			if (korScore >= 90) {
				System.out.printf("입력한 %d점은 성적 A입니다.\n", korScore);
			} else if (korScore >= 80) {
				System.out.printf("입력한 %d점은 성적 B입니다.\n", korScore);
			} else if (korScore >= 70) {
				System.out.printf("입력한 %d점은 성적 C입니다.\n", korScore);
			} else if (korScore >= 60) {
				System.out.printf("입력한 %d점은 성적 D입니다.\n", korScore);
			} else {
				System.out.printf("입력한 %d점은 성적 F입니다.\n", korScore);
			}
		} else {
			System.out.println("입력하신 성적은 허용되지 않습니다.");
		}
		
	} //main
	
}
