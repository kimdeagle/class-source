package com.test.java;

import java.util.Scanner;

public class Ex08_Output {

	public static void main(String[] args) {
		
		// 콘솔 입출력, Console Input Output (Console I/O)
		// 콘솔 입력 - 키보드 사용 : 사용자가 입력한 키 입력을 자바에서 어떻게 가져오는지?
		// 콘솔 출력 - 모니터 사용 : 자바에서 사용자에게 전달할 내용을 어떻게 출력하는지?
		
		// 콘솔 출력 명령어
		// 1. System.out.println() 메서드
		//	 - System : 클래스, out : 필드, println() : 메서드
		// 2. System.out.print() 메서드
		// 3. System.out.printf() 메서드(***)
		
		int num = 100;
		String name = "홍길동";
		
		// 1. println (print line) - 내용물을 출력한 뒤에 개행을 한다.
		System.out.println(num); // 변수 출력
		System.out.println(name);
		
		System.out.println(200); // 상수 출력
		System.out.println("아무개");
		
		System.out.println(10 + 20); // 연산 결과 출력
		
		// 2. print - 내용물을 출력한 뒤에 개행을 하지 않는다.
		System.out.print(num);
		System.out.print(name);
		
		System.out.println();
		System.out.println();
		
		name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 70;
		int total = kor + eng + math;
		
		System.out.println("[" + name + " 성적표]");
		System.out.println("[국어]\t[영어]\t[수학]");
		System.out.print(kor);
		System.out.print("\t");
		System.out.print(eng);
		System.out.print("\t");
		System.out.print(math);
		System.out.print("\n");
		
		System.out.println(kor + "\t" + eng + "\t" + math);
		
		System.out.println("총점 : " + total + "점");
		
		System.out.println();
		System.out.println();
		
		// 3. printf - print format : 형식을 갖춰서 출력하는데 편리한 메서드
		//	 - 형식 문자열 사용
		//	 - 1. %s : String
		//	 - 2. %d : Decimal(byte, short, int, long)
		//	 - 3. %f : Float(float, double)
		//	 - 4. %c : Char
		//	 - 5. %b : Boolean
		
		//	 - 6. %n : New Line = \n => \n을 쓰기 때문에 %n은 잘 안쓰게 됨
		
		//요구사항] 안녕하세요. 홍길동님. -> 출력
		
		name = "홍길동";
		
		System.out.println("안녕하세요. " + name + "님.");
		
		//요구사항 추가] 안녕하세요. 홍길동님. 반갑습니다. 홍길동님. -> 추가 출력
		
		System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name + "님.");
		
		// 개발자는 코드 작성 할 때, 현재만 생각(X) -> 미래도 생각(O) : 추후 유지보수
		
		name = "홍길동";
		System.out.printf("안녕하세요. %s님.\n", name);
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님.\n", name, name);
		
		// Oracle SQL 구문
		// insert into tblMember (seq, name, age, address, tel) values (1, '홍길동', 20, '서울시 강남구', '010-1234-5678')
		
		String seq = "1";
		name = "홍길동";
		String age = "20";
		String address = "서울시 강남구";
		String tel = "010-1234-5678";
		
		String sql = "insert into tblMember (seq, name, age, address, tel) values (" + seq + ", '" + name + "', " + age + ", '" + address + "', '" + tel + "')";
		
		System.out.println(sql);
		
		System.out.printf("insert into tblMember (seq, name, age, address, tel) values (%s, '%s', %s, '%s', '%s')", seq, name, age, address, tel);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("문자열 : %s\n", "홍길동");
		System.out.printf("정수 : %d\n", 100);
		System.out.printf("실수 : %f\n", 3.14);
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("논리 : %b\n", true);

		// Tip!
		// Ctrl + Alt + 방향키(위, 아래) - 복사(블럭지정도 가능)
		// Alt + 방향키(위, 아래) - 이동(블럭지정도 가능)
		
		// 형식 문자 추가 기능
		// 1. %숫자d - 출력 자리수 지정 : +(우측 정렬), -(좌측 정렬)
		// %d, %s, %f, %c, %b 모두 사용 가능
		
		// 2. %,d - 천단위 표기(3자리마다 , 찍기)
		// ex) %,5d => 5자리 확보하여 우측정렬하고 3자리마다 , 찍기
		// %d, %f 만 사용 가능		
		
		// 3. %.숫자f - 소숫점 이하 자리수 지정
		// %f 만 사용 가능
		
		System.out.printf("가나다%d라마바\n", 10);
		System.out.printf("가나다%10d라마바\n", 10);
		System.out.printf("가나다%5d라마바\n", 10);
		System.out.printf("가나다%-10d라마바\n", 10);
		
		System.out.println();
		
		//*** 숫자를 표기할때는 반드시 단위 명시!!
		System.out.println("======================");
		System.out.println("음료 가격  (단위 : 원)");
		System.out.println("======================");
		System.out.printf("1. 콜라 :\t %,5d\n", 2500);
		System.out.printf("2. 스무디 :\t %,5d\n", 4500);
		System.out.printf("3. 박카스 :\t %,5d\n", 500);
		System.out.printf("4. 아메리카노 :\t %,5d\n", 2000);
		
		System.out.println();
		
		double pi = 3.14159265;
		System.out.printf("파이 : %f\n", pi);
		System.out.printf("파이 : %.1f\n", pi);
		System.out.printf("파이 : %.2f\n", pi);
		System.out.printf("파이 : %.3f\n", pi); // 반올림O
		System.out.printf("파이 : %.0f\n", pi);
		
		
		
		
	}
}
