package com.test.question.q21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example01 {

	public static void main(String[] args) throws Exception
    {

        //요구사항] 학생의 국어 점수를 입력받아 성적을 출력하시오.
        //90 ~ 100 : A
        //80 ~  89 : B
        //70 ~  79 : C
        //60 ~  69 : D
        // 0 ~  59 : F

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("성적 입력 : ");
        int score = Integer.parseInt(reader.readLine());

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("F");
        } else {
            System.out.println("0~100 사이의 값을 입력하세요.");
        }

    } //main
	
}
