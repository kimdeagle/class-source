package com.test.question.q21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example03 {

	public static void main(String[] args) throws Exception
    {

        //요구사항] 입력받은 숫자에서 십의 자리가 홀수인지 짝수인지를 출력하시오.
        //숫자입력]  123 > 십의 자리 > 2 > 짝수
        //숫자입력] 7354 > 십의 자리 > 5 > 홀수
        //숫자입력]   23 > 십의 자리 > 2 > 짝수
        //숫자입력]    8 > 십의 자리 > 0 > 짝수

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("숫자 입력 : ");
        int num = Integer.parseInt(reader.readLine());

        int temp = num % 100 / 10; //입력된 숫자에서 10의 자리를 구하는 중..

        String result = "";  

        if (temp % 2 == 1) {
            result = "홀수";
        } else {
            result = "짝수";
        }

        System.out.printf("입력한 %d에서 십의 자리는 %s입니다.\n", num, result);


    } //main
	
}
