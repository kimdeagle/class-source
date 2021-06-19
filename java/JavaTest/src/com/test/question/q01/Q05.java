package com.test.question.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws IOException {
		
		//5번 문제 풀이
		//사용자 한달 수입 세후 계산
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원) : "); //입력 안내문
		
		String data = reader.readLine(); //입력값 저장
		
		int salary = Integer.parseInt(data); //한달 수입 입력값 정수형 형변환
		
		float tax = salary * 0.033F; //세금
		
		System.out.printf("세후 금액(원) : %,.0f원\n세금(원) : %,.0f원\n", salary - tax, tax); //세후 월급, 세금 계산 출력
		
		System.out.println();
		
		//모든 달 수입 동일. 사용자 1년 총 수입(세후) 출력
		//2월, 10월, 12월은 100% 상여금
		//상여금에 대한 세금 : 3.5%
		
		int bonusCount = 3; //상여금 받는 개월수
		
		float bonusTax = salary * 0.035F; //상여금에 대한 세금
		
		System.out.printf("세후 1년 총 수입(원) : %,.0f원\n1년 총 세금(원) : %,.0f원\n", (salary * (12 + bonusCount)) - ((12 * tax) + (bonusCount * bonusTax)), (12 * tax) + (bonusCount * bonusTax)); //세후 1년 총 수입, 1년 총 세금 계산 출력
		

	}
	
}
