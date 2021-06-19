package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q08
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행 개수 : ");
		int row = Integer.parseInt(reader.readLine());

		System.out.print("열 개수 : ");
		int column = Integer.parseInt(reader.readLine());

		int[][] nums = new int[row][column];
		int n = 0;
		
		for (int i=0; i<row+column-1; i++) { //0~8 : 9회전 : 대각선
            for (int j=0; j < row; j++){ //0~4 : 5회전 : 행
               
                int k = i - j; //열
                if (k >= 0 && k < column) { //0 ~ 열 개수
                    n++;
                    nums[j][k] = n;
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
