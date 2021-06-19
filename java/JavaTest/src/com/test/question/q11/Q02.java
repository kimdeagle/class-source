package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q02
		
		m1();
		
	} //main

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[5];
		
		for (int i=0; i<nums.length; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			nums[i] = num;
			
		}
		
		for (int i=1; i<=nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", nums.length - i
												, nums[nums.length - i]);
		}
		
		
	} //m1
	
}
