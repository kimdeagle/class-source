package com.test.question.q12;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {
		
		//Q08
		//배열에 요소를 삭제 - 좌측 시프트 발생(Left Shift)
		//좌 -> 우
		
		m1();
		
	} //main

	private static void m1() {
		
		int[] nums = { 5, 3, 8, 2, 1, 7, 9, 4, 6, 10 };
		
		int index = 3;
		
		for (int i=index+1; i<nums.length; i++) {
			
			System.out.println(Arrays.toString(nums));
			
			nums[i-1] = nums[i];
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		nums[nums.length-1] = 0;
		
		System.out.println();
		
		System.out.println(Arrays.toString(nums));
		
		
	} //m1
	
}
