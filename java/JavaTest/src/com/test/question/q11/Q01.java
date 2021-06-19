package com.test.question.q11;

public class Q01 {

	public static void main(String[] args) {
		
		//Q01
		
		m1();
		
	} //main

	private static void m1() {
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
		
		
	} //m1

	private static String dump(int[] list) {
		
		String result = "[ ";
		
		for (int i=0; i<list.length; i++) {
			
			result += list[i];
			
			if (i < list.length - 1) {
				result += ", ";
			}
		}
		
		result += " ]";
		
		return result;
		
	} //dump
	
	
}
