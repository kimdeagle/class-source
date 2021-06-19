package com.test.question.q03;

public class Q05 {

	public static void main(String[] args) {
		
		//양수 갯수 구하기
		
		int num1 = 10;
		int num2 = -20;
		int num3 = 30;
		int num4 = -40;
		int num5 = 50;
		
		//positive 메서드 반환값 출력
		System.out.printf("양수 : %d개\n",positive(num1));
		System.out.printf("양수 : %d개\n",positive(num1, num2));
		System.out.printf("양수 : %d개\n",positive(num1, num2, num3));
		System.out.printf("양수 : %d개\n",positive(num1, num2, num3, num4));
		System.out.printf("양수 : %d개\n",positive(num1, num2, num3, num4, num5));

		
	} //main
	
	public static int positive(int num1) {
		return num1 >= 0 ? 1 : 0; 
	}
	
	public static int positive(int num1, int num2) {
		int result = 0;
		result = num1 >= 0 ? result + 1 : result;
		result = num2 >= 0 ? result + 1 : result;
		return result;
	}
	
	public static int positive(int num1, int num2, int num3) {
		int result = 0;
		result = num1 >= 0 ? result + 1 : result;
		result = num2 >= 0 ? result + 1 : result;
		result = num3 >= 0 ? result + 1 : result;
		return result;
	}

	public static int positive(int num1, int num2, int num3, int num4) {
		int result = 0;
		result = num1 >= 0 ? result + 1 : result;
		result = num2 >= 0 ? result + 1 : result;
		result = num3 >= 0 ? result + 1 : result;
		result = num4 >= 0 ? result + 1 : result;
		return result;
	}
	
	public static int positive(int num1, int num2, int num3, int num4, int num5) {
		int result = 0;
		result = num1 >= 0 ? result + 1 : result;
		result = num2 >= 0 ? result + 1 : result;
		result = num3 >= 0 ? result + 1 : result;
		result = num4 >= 0 ? result + 1 : result;
		result = num5 >= 0 ? result + 1 : result;
		return result;
	}
	
	
}
