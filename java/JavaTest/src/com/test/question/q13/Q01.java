package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q01
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행 개수 : ");
		int row = Integer.parseInt(reader.readLine());
		
		System.out.print("열 개수 : ");
		int column = Integer.parseInt(reader.readLine());
		
		int[][] nums = new int[row][column];
		
		int n = 1;
		
		for (int i=0; i<nums.length; i++) {
			if (i % 2 == 0) {
				for (int j=0; j<nums[0].length; j++) {
					nums[i][j] = n;
					n++;
				}
			} else {
				for (int j=nums[0].length-1; j>=0; j--) {
					nums[i][j] = n;
					n++;
				}
			}
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
