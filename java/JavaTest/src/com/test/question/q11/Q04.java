package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q04
		
		m1();
		
	} //main

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열의 길이 : ");
		int length = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[length];
		int[] result = new int[length/2];
		
		System.out.println();
		
		
		System.out.print("nums = [ ");
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
			System.out.print(nums[i]);
			
			if (i < nums.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
		
		
		System.out.print("result = [ ");
		
		for (int i=0; i<result.length; i++) {
			result[i] = nums[i * 2] + nums[i * 2 + 1];
			System.out.print(result[i]);
			
			if (i < result.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
		
		
	} //m1
	
}
