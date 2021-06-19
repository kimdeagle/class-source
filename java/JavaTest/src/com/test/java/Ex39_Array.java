package com.test.java;

import java.util.Arrays;

public class Ex39_Array {

	public static void main(String[] args) {
		
		//배열의 차원
		// - 1차원 배열
		// - 2차원 배열
		// - 3차원 배열
		// ..
		// - n차원 배열
		
		//m1();
		//m2();
		m3();
		
		
	} //main

	private static void m3() {
		
		//5x5
		int[][] nums = new int[5][5];
		
		//배열의 각 방에 데이터 입력
		//1, 2, 3, .. ,25
		
		int n = 1;
		
		for (int i=nums.length-1; i>=0; i--) {
			for (int j=nums.length-1; j>=0; j--) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//Arrays.toString() : 1차원 배열만 출력
		//System.out.println(Arrays.toString(nums));
		
		//System.out.println(Arrays.deepToString(nums));
		
		output(nums);
		
		
	} //m3

	private static void output(int[][] nums) {
		
		for (int i=0; i<nums.length; i++) { //행
			for (int j=0; j<nums[0].length; j++) { //열
				
				System.out.printf("%3d", nums[i][j]);
				
			}
			System.out.println();
		}

	} //output

	private static void m2() {
		
		//배열 초기화 리스트
		//int[] nums1 = new int[] { 10, 20, 30};
		int[] nums1 = { 10, 20, 30 };
		
		//int[][] nums2 = new int[][] { { 10, 20, 30}, { 10, 20, 30} };
		int[][] nums2 = { { 10, 20, 30 }, { 10, 20, 30 } };
		
		int[][][] nums3 = new int[][][]
				{
					{
						{ 10, 20, 30, 40 },
						{ 50, 60, 70, 80 }
					}, 
					{
						{ 90, 100, 110, 120 },
						{ 130, 140, 150, 160 }
					}, 
					{
						{ 170, 180, 190, 200 },
						{ 210, 220, 230, 240 }
					}
				};
		
		
	} //m2

	private static void m1() {
		
		//1차원 배열
		int[] nums1 = new int[3];
		
		//1차원 배열 초기화
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		//2차원 배열
		int[][] nums2 = new int[2][3];
		
		//2차원 배열 초기화
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;
		
		
		//3차원 배열
		int[][][] nums3 = new int [2][3][4];
		
		//3차원 배열 초기화
		nums3[0][0][0] = 100;
		nums3[0][2][1] = 200;
		nums3[1][0][3] = 300;
		nums3[1][2][3] = 400;
		nums3[1][1][2] = 500;
		
		//배열 탐색
		
		//1차원 배열 탐색 -> 첨자 1개 -> 단일 for문
		for (int i=0; i<nums1.length; i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();
		
		//2차원 배열 탐색 -> 첨자 2개 -> 2중 for문
		for (int i=0; i<nums2.length; i++) {
			for (int j=0; j<nums2[0].length; j++) {
				System.out.printf("nums2[%d][%d] = %d\n", i, j, nums2[i][j]);
			}
		}
		System.out.println();
		
		
		//nums2[2][3] -> 1차원 배열 2칸 안에 각각 1차원 배열 3칸이 있는 모습
		//  ㅡㅡㅡ  ㅡㅡㅡ
		//ㅣㅁㅁㅁㅣㅁㅁㅁㅣ
		//  ㅡㅡㅡ  ㅡㅡㅡ
		
		System.out.println(nums2.length);
		System.out.println(nums2[0].length);
		
		//*************** 이걸 알아야 프로그램을 쓸 수 있다!!
		//int num;
		//int[] nums1 = new int[3];
		//int[][] nums2 = new int[2][3];
		
		//1. num의 자료형이 뭡니까? > int > int입니다.
		//2. nums1의 자료형이 뭡니까? > int[] > int 1차원 배열입니다.
		//3. nums2의 자료형이 뭡니까? > int[][] > int 2차원 배열입니다.
		
		//4. nums1[0]의 자료형이 뭡니까? int > int입니다.
		//5. nums2[0][0]의 자료형이 뭡니까? int > int입니다.
		//6. nums2[0]의 자료형이 뭡니까? int[] > int 1차원 배열입니다.

		
		//3차원 배열 탐색 -> 첨자 3개 -> 3중 for문
		
		for (int i=0; i<nums3.length; i++) {
			for (int j=0; j<nums3[0].length; j++) {
				for (int k=0; k<nums3[0][0].length; k++) {
					System.out.printf("nums3[%d][%d][%d] = %d\n",i, j, k, nums3[i][j][k]);
				}
			}
		}	
		
		
	} //m1
	
}
