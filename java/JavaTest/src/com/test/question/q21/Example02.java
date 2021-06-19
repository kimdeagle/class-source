package com.test.question.q21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example02 {

	public static void main(String[] args) throws Exception
    {

        //요구사항] 숫자의 제곱값을 구하는 메소드를 선언하고 호출하시오.
        //입력 위임.
        int num = input();

        //계산 위임.
        int result = square(num);

        //출력 위임.
        //4 * 4 = 16
        output(num, result);

    } //main

    public static int input() throws NumberFormatException, IOException {
    	
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자 입력 : ");
        int num = Integer.parseInt(reader.readLine());
        return num;
    }

    public static int square(int num) {
        System.out.printf("%d의 제곱값을 구했습니다.\n", num);
        return num * num;
    }

    public static void output(int num, int result) {
        System.out.printf("%d * %d = %d\n", num, num, result);
    }
	
}
