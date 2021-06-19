package com.test.java;

public class Ex19_Operator {

	public static void main(String[] args) {
		
		// 참고 : 비트 연산자는 수업 안 함(일반적 자바 개발에서 사용X)
		
		// Ex19_Operator
		
		/*
		
		영문 표기
		~(tild), !, @, #, $, %, ^(carret, xor), &, *, -, ,, ., ?, ', ", |(vertical bar, pipe)
		
		'(quote 인용), `(back quote 백쿼트 - 역인용)
		
		(), {}, [], <>
				
		 */
		
		// 논리 연산자 : &&(and), ||(or), !(not), ^(xor)
		// - 피연산자를 대상으로 특정 규칙에 따라 정해진 결과값을 반환
		// - &&, || : 2항 연산자
		// - ! : 1항 연산자
		// - 피연산자의 자료형은 boolean을 가진다.
		// - 연산의 결과는 boolean을 반환한다.
		// - 논리 연산자는 주로 비교 연산자와 함께 사용한다.
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		System.out.println();
		
		// 요구사항] 나이를 입력 -> 19세 이상 ~ 60세 미만
		
		int age = 25;
		System.out.println(age >= 19 && age < 60);
		
		System.out.println();
		
		// 문자 1개 입력 -> 영어 소문자 검사
		char c1 = 'E';
		
		System.out.println(c1 >= 'a' && c1 <= 'z');
		
		System.out.println();
		
		// 나이가 25살, 사는곳 서울, 성별 남자
		
		age = 19;
		String address = "서울";
		String gender = "남자";
		
		// 나이가 20세 이상이고 주소가 서울인가?
		System.out.println(age >= 20 && address.equals("서울"));
		
		// 나이가 20세 이상이거나 주소가 서울인가?
		System.out.println(age >= 20 || address.equals("서울"));
		
		System.out.println();
		
		System.out.println(age >= 20 && address.equals("서울") && gender.equals("남자"));
		
		System.out.println(age >= 20 && address.equals("서울") || gender.equals("남자"));
		
		System.out.println(age >= 20 || address.equals("서울") && gender.equals("남자"));
		
		System.out.println(age >= 20 || address.equals("서울") || gender.equals("남자"));
		
		System.out.println();
		
		// 논리(부정 연산자)
		// - !(not)
		// - 1항 연산자
		
		b1 = true;
		
		System.out.println(!b1);
		
		b2 = false;
		
		System.out.println(!b2);
		
		System.out.println();
		
		// 19세 이상 60세 미만
		age = 19;
		System.out.println(age >= 19 && age < 60);
		
		System.out.println(!(age < 19 || age >= 60));
		
		System.out.println();
		
		// 대입(할당) 연산자 : =
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		// - LValue(변수) = RValue(상수, 변수)
		// - LValue와 RValue의 자료형은 반드시 동일해야 한다.(다르면 형변환을 통해서라도 맞춘다.)
		// - 대입 연산자는 모든 연산자를 통틀어 연산자 우선순위가 가장 낮다.(문장에서 가장 마지막으로 실행시킨다.)
		
		int n = 10;
		
		// 누적(***)
		n = n + 1;
		System.out.println(n);
		
		n += 1;
		System.out.println(n);
		
		n = n + 5;
		System.out.println(n);
		
		n += 5;
		System.out.println(n);
		
		int m = 10;
		
		n = n + m;
		System.out.println(n);
		
		n += m;
		System.out.println(n);
		
		n = n -3;
		System.out.println(n);
		
		n -= 3;
		System.out.println(n);
		
		n = n * 2;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		n = n / 2;
		System.out.println(n);
		
		n /= 2;
		System.out.println(n);
		
		n = n % 8;
		System.out.println(n);
		
		n %= 3;
		System.out.println(n);
		
		System.out.println();
		
		// 연산자 우선순위
		// 소괄호() > 산술 연산자(*, /, %) > 산술 연산자(+, -) > 비교 연산자 > 논리 연산자 > 대입 연산자
		
		// 증감 연산자 : ++, --
		// - 1항 연산자
		// - 피연산자는 숫자를 가진다.
		// - 피연산자의 값에 1을 더하거나 1을 빼는 작업
		// -----------------------------------------------------
		// ++num, --num (전치 연산자(전위 연산자)) : 연산자 우선 순위가 최상이 된다.(***)
		// num++, num-- (후치 연산자(후위 연산자)) : 연산자 우선 순위가 최하가 된다.(***)
		
		System.out.println();
		
		n = 10;
		++n;
		System.out.println(n);
		
		--n;
		System.out.println(n);
		
		n = 10;
		
		//++n;
		n++;
		
		System.out.println(n);
		
		System.out.println();
		
		n = 10;
		
		int sum = 0;
		
		sum = 20 + ++n;
		System.out.println(sum); // 31
		System.out.println(n); // 11
		
		
		n = 10;
		sum = 0;
		
		sum = 20 + n++;
		System.out.println(sum); // 30
		System.out.println(n); // 11
		
		// 증감 연산자는 전치/후치에 따라 우선 순위가 바뀌기 때문에 사용하기 힘들다.(가독성 낮다) -> 사용하지 말자..! -> 하나의 문장 안에 증감 연산자와 다른 연산자를 같이 쓰지 말자!!
		
		// 전치
		sum = 20 + ++n; // 나쁜 코드
		
		++n;			// 좋은 코드(가독성이 높다)
		sum = 20 + n;	// 좋은 코드(가독성이 높다)
			
		// 후치
		sum = 20 + n++;	// 나쁜 코드
		
		sum = 20 + n;	// 좋은 코드(가독성이 높다)
		n++;			// 좋은 코드(가독성이 높다)
		
		System.out.println();
		
		// 조건 연산자 : 조건 ? 참 : 거짓
		// - 3항 연산자
		// - A ? B : C
		// - A : boolean
		// - B, C : 상수, 변수, 연산식 -> 값
		// - B와 C는 자료형이 동일해야 한다.
		
		int result = true ? 10 : 20;
		
		System.out.println(result);
		
		System.out.println();
		
		
		age = 65;
		
		// 19세 이상 ~ 60세 미만이면 통과, 아니면 거절
		
		System.out.println(age >= 19 && age < 60);
		
		String result3 = (age >= 19 && age < 60) ? "통과" : "실패";
		
		System.out.println(result3);
		
		System.out.printf("입력하신 나이 %d세는 회원가입 %s입니다.\n", age, result3);
		
		
	}
	
}
