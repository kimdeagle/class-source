package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q09
		//달팽이
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행 개수 : ");
		int row = Integer.parseInt(reader.readLine());

		System.out.print("열 개수 : ");
		int column = Integer.parseInt(reader.readLine());

		int[][] nums = new int[row][column];
		
		int n = 1;
		
		int flag = 1;
		
		int j = 0;
		
		int k = -1;
		
		while (true) {
			
			//행 찍기 (row값 변화 : 5 -> 4 -> 3 -> 2 -> 1)
			for (int i=0; i<row; i++) {
				k += flag;
				nums[j][k] = n;
				n++;
			}
			
			//행에 값을 다 입력했으면 해당 행에 다시 찍지 않도록 1씩 감소
			row--;
			
			//이 위치에서 row값 변화 : 4 -> 3 -> 2 -> 1 -> 0
			if (row == 0) {
				break;
			}
			
			//열 찍기 (row값 변화 : 4 -> 3 -> 2 -> 1)
			//row == 0 일때, 위에 if문에서 break 걸려 프로그램 종료
			for (int i=0; i<row; i++) {
				j += flag;
				nums[j][k] = n;
				n++;
			}
			
			//방향 전환, 배열의 열 첨자에 활용
			flag *= -1;
			
		}
		
		output(nums);
		
		
	} //main
	
	private static void output(int[][] nums) {

		for (int i = 0; i < nums.length; i++) { // 행
			for (int j = 0; j < nums[0].length; j++) { // 열

				System.out.printf("%3d", nums[i][j]);

			}
			System.out.println();
		}

	} //output
	
}
