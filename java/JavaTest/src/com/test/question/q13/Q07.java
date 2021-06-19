package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws IOException {
		
		//Q07
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수 : ");
		int korScore = Integer.parseInt(reader.readLine());
		
		System.out.print("영어 점수 : ");
		int engScore = Integer.parseInt(reader.readLine());
		
		System.out.print("수학 점수 : ");
		int mathScore = Integer.parseInt(reader.readLine());
		
		String[][] score = new String[10][3];
		
		String mark = "■";
		String space = " ";
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[0].length; j++) {
				if (j == 0) {
					if (i < score.length - (korScore / 10)) {
						score[i][j] = space;
					} else {
						score[i][j] = mark;
					}
					
				} else if (j == 1) {
					if (i < score.length - (engScore / 10)) {
						score[i][j] = space;
					} else {
						score[i][j] = mark;
					}
				} else {
					if (i < score.length - (mathScore / 10)) {
						score[i][j] = space;
					} else {
						score[i][j] = mark;
					}
				}
			}
		}
		
		output(score);

		
	}
	
	private static void output(String[][] score) {

		for (int i = 0; i < score.length; i++) { // 행
			for (int j = 0; j < score[0].length; j++) { // 열

				System.out.printf("%2s\t", score[i][j]);

			}
			System.out.println();
		}
		System.out.println("--------------------");
		System.out.println("국어\t영어\t수학");

	} //output
	
}
