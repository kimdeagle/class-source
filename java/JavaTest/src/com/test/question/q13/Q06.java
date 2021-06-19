package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q06
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행 개수 : ");
		int row = Integer.parseInt(reader.readLine());

		System.out.print("열 개수 : ");
		int column = Integer.parseInt(reader.readLine());

		int[][] nums = new int[row][column];
		
		int n = 1;
		int m = 0;
		
		int rowSum = 0;
		int columnSum = 0;
		int lastSum = 0;
		
		for (int i=0; i<row; i++) {
			
			m = i+1;
			
			for (int j=0; j<column; j++) {
				if (i == row-1) {
					if (j == column-1) {
						nums[i][j] = lastSum;
						break;
					} else {
						continue;
					}
				}
				
				if (j == column-1) {
					nums[i][j] = rowSum;
					nums[j][i] = columnSum;
					lastSum += rowSum;
				} else {
					nums[i][j] = n;
					rowSum += n;
					columnSum += m;
					n++;
					m += (column-1);
				}
				
			}
			
			rowSum = 0;
			columnSum = 0;
			
		}
		
		output(nums);
		
		
		
	} //main
	
	private static void output(int[][] nums) {

		for (int i = 0; i < nums.length; i++) { // 행
			for (int j = 0; j < nums[0].length; j++) { // 열

				System.out.printf("%4d", nums[i][j]);

			}
			System.out.println();
		}

	} //output
	
}
