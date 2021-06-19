package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		//Q04
		
		m1();
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("연산식 입력 : ");
		
		String txt = reader.readLine();
		
		txt = txt.replace(" ", "");
		
		String operator = operator(txt);
		
		if (operator == "0") {
			System.out.println("연산자가 올바르지 않습니다.");
		} else {
			
		}

		int index = -1;
		
		int operand1 = 0;
		int operand2 = 0;
		
		index = txt.indexOf(operator);
		
		if (txt.substring(0, index).equals("") || txt.substring(index+1).equals("")) {
			System.out.println("피연산자가 부족합니다.");
		} else {
			operand(txt, operator, operand1, operand2, index);
		}
			
		
	} //m1

	private static void operand(String txt, String operator, int operand1, int operand2, int index) {
		
		operand1 = Integer.parseInt(txt.substring(0, index));
		operand2 = Integer.parseInt(txt.substring(index+1));
		
		if (operator.equals("+")) {
			System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
		} else if (operator.equals("-")) {
			System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
		} else if (operator.equals("*")) {
			System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
		} else if (operator.equals("/")) {
			System.out.printf("%d / %d = %f\n", operand1, operand2, (double)operand1 / operand2);
		} else if (operator.equals("%")) {
			System.out.printf("%d %% %d = %d\n", operand1, operand2, operand1 % operand2);
		}
	} //operand

	private static String operator(String txt) {
		
		String operator = "";
		
		for (int i=0; i<txt.length(); i++) {
			
			if (txt.charAt(i) == '+') {
				operator = "+";
				return operator;
			} else if (txt.charAt(i) == '-') {
				operator = "-";
				return operator;
			} else if (txt.charAt(i) == '*') {
				operator = "*";
				return operator;
			} else if (txt.charAt(i) == '/') {
				operator = "/";
				return operator;
			} else if (txt.charAt(i) == '%') {
				operator = "%";
				return operator;
			} 
			
		}
		return "0";
		
	} //operator
	
}
