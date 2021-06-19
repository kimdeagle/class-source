package com.test.question.q11;

public class Q05 {

	public static void main(String[] args) {
		
		//Q05
		
		m1();
		
		
	} //main

	private static void m1() {
		
		int[] nums = new int[20];
		
		int maxNum = 0;
		int minNum = nums.length;
		
		
		System.out.print("원본 : ");
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
			
			System.out.print(nums[i]);
			
			if (i < nums.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] < minNum) {
				minNum = nums[i];
			} else if (nums[i] > maxNum) {
				maxNum = nums[i];
			} 
		}
		System.out.printf("최대값 : %d\n", maxNum);
		System.out.printf("최소값 : %d\n", minNum);
		
		
	} //m1
	
}
