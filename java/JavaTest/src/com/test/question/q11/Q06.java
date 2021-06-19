package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q06
		
		m1();
		
	} //main

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대 범위 : ");
		int maxRange = Integer.parseInt(reader.readLine());
		
		System.out.print("최소 범위 : ");
		int minRange = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[20];
		
		System.out.print("원본 : ");
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
			System.out.print(nums[i]);
			
			if (i < nums.length - 1) {
				System.out.print(", ");
			}
			
		}
		
		System.out.println();
		
		
		System.out.print("결과 : ");
		
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i] >= minRange && nums[i] <= maxRange) {
				System.out.print(nums[i]);
				
				if (i < nums.length - 1) {
					System.out.print(", ");
				}
			}
			
		}
		
		
	} //m1
	
}
