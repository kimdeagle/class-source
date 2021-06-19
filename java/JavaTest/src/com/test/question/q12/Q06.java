package com.test.question.q12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) {
		
		//Q06
		
		m1();
		
	} //main

	private static void m1() {
		
		int[] nums = new int[5];
		
		for (int i=0; i<nums.length; i++) {
			
			int n = (int)(Math.random() * 9) + 1;
			
			nums[i] = n;
			
			System.out.printf("%d -> %s\n", i, Arrays.toString(nums));
			
			//중복값 검사
			// - 이미 들어있는 방까지 검사
			for (int j=0; j<i; j++) {
				if (n == nums[j]) {
					System.out.println("중복값 발생");
					i--; //마지막 방 삭제(중복값 제거)
					break;
				}
			}
			
		}
		
		//배열 출력
		//output(nums);
		
		//배열 출력(dump 메서드)
		System.out.println(Arrays.toString(nums));
		
		
	} //m1

	private static void output(int[] nums) {
		
		for (int i=0; i<nums.length; i++) {
			System.out.printf("[%d] = %d\n", i, nums[i]);
		}
		
		
	} //output
	
}
