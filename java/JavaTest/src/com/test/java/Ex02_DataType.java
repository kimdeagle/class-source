// 단일라인주석 : // 주석내용
// 다중라인주석 : /* 주석내용 */

/* 
단축키
1. 단일라인주석 : Ctrl + / (주석설정, 주석해제), 범위지정하면 범위에 해당하는 모든 줄이 주석 처리
2. 다중라인주석 : 주석설정 : 블럭 잡고 Ctrl + Shift + /
 				   주석해제 : Ctrl + Shift + \
   단일라인주석 단축키를 많이 씀
*/

// 주석의 용도
// 1. 프로그램 코드 설명
// 2. 수업 필기용

// 현재 자바파일이 들어있는 패키지를 명시
package com.test.java;

// 클래스(Class) - 코드의 집합
public class Ex02_DataType {

	//메서드(Method) - 코드의 집합
	public static void main(String[] args) {
		
		/*
		자료형(Data Type)
		 - 데이터의 형태, 길이(범위) 등을 미리 정의하고 분류시켜놓은 규칙
		 
		자바 언어의 자료형
		 - 원시형(Primitive Type) 또는 값형(Value Type) vs 참조형(Reference Type) -> 값형 vs 참조형
		 
		 1. 원시형, 값형
		 	a. 숫자형
		 		1) 정수형
		 			a) byte : 1byte(8bit)
		 				- 범위 : -128 ~ +127
		 			b) short : 2byte
		 				- 범위 : -32,768 ~ +32,767
		 			c) int : 4byte -> 주로 사용된다.
		 				- 범위 : -2^31 ~ +2^31-1
		 				- 범위 : 약 -21억 ~ +21억
		 			d) long : 8byte
		 				- 범위 : -2^63 ~ +2^63-1
		 				- 범위 : 약 -922경 ~ +922경
		 		2) 실수형
		 			a) float : 4byte
		 				- 단정도형(정도 -> 정밀도)
		 				- 부호(1bit) + 지수(8bit) + 가수(23bit)
		 			b) double : 8byte
		 				- 배정도형(정밀도가 더 높다 -> 가수 표현할 수 있는 bit 공간이 더 넓어서)
		 				- 부호(1bit) + 지수(11bit) + 가수(52bit)
		 	b. 문자형
		 		1) 문자형
		 			a) char : 2byte -> 유니코드 지원
		 				- 문자를 표현하는 자료형
		 				- 문자 코드표(ASCII)
		 				- Unicode : 문자 1개를 저장하는데 2byte 사용
		 	c. 논리형
		 		1) 논리형
		 			a) boolean : 1byte
		 				- 참(true), 거짓(false)
		 	
		 2. 참조형
		 	a. 나중에 수업
		 
		
		
		 */
		
	}
}