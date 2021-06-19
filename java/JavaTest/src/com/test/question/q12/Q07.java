package com.test.question.q12;

import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		
		//Q07
		
		//시프트(Shift)
		
		//배열에 요소(element)를 삽입 - 우측 시프트 발생(Right Shift)
		
		//배열에 요소를 삭제 - 좌측 시프트 발생(Left Shift)
		
		
		m1();
		
		
	} //main

	private static void m1() {
		
		int[] nums = { 5, 3, 8, 2, 1, 7, 9, 4, 6, 10 };
		
		int index = 3; //삽입 위치
		
		int value = 100;
		
		//1. 옮기는 작업 > 우측 시프트 > 우 -> 좌
		//2. 삽입 위치에 새로운 숫자 삽입
		
		//1.
		for (int i=nums.length-2; i>=index; i--) {
			
			System.out.println(Arrays.toString(nums));
			
			nums[i+1] = nums[i];
			
		}
		
		System.out.println();
		
		//2.
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		
		
	} //m1
	
}
