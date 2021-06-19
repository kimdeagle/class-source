package com.test.question.q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws NumberFormatException, IOException 
    {

        //요구사항] 고객의 이름과 나이를 입력 받아 성인인지 미성년자인지 출력하시오.
        //요구조건] 성인 기준 : 19세 이상
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("고객명 : ");
        String name = reader.readLine();

        System.out.print("나이 : ");
        int age = Integer.parseInt(reader.readLine());

        String result = age > 19 ? "성인" : "미성년자";
        System.out.printf("'%s'님은 '%s'입니다.\n", name, result);

    } //main
	
}
