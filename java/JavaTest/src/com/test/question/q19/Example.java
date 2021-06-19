package com.test.question.q19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException 
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //요구사항] 숫자를 2개 입력받아 더하기 연산을 하고 그 연산식과 결과를 출력하시오.
        System.out.print("숫자 1 : ");
        String input1 = reader.readLine();

        System.out.print("숫자 2 : ");
        String input2 = reader.readLine();
        
        int a = 5;
        int b = 10;

        System.out.printf("%d + %d = %d\n", a, b, a + b);



        //요구사항] 숫자를 2개 입력받아 빼기 연산을 하고 그 연산식과 결과를 출력하시오.
        System.out.print("숫자 1 : ");
        String input3 = reader.readLine();
        int num1 = Integer.parseInt(input1);

        System.out.print("숫자 2 : ");
        String input4 = reader.readLine();
        int num2 = Integer.parseInt(input2);

        System.out.printf("%c - %c = %d\n", a, b, a - b);

    } //main
	
}
