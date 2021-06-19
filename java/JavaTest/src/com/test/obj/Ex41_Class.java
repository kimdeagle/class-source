package com.test.obj;

public class Ex41_Class {

	public static void main(String[] args) {
		
		//클래스 목적
		//1. 코드의 집합 > 클래스 결과
		//2. 객체 생성(***)
		//	a. 데이터 집합(******) 가끔
		//	b. 행동 집합(*) 거의 없음
		//	c. 데이터 + 행동 집합(********) 거의 대부분
		
		//1. 클래스 선언
		//2. 클래스 > 객체 생성
		
		
		//요구사항] 지도 -> 쌍용 좌표 표시 -> 좌표 저장 + 관리
		
		//Case 1.
		// - 가장 흔하게 사용
		// - 별로 안좋은 방법
		// - 관리하기 힘들다. > 좌표가 늘어날수록 더 힘들어 진다.
		// - 가독성 떨어진다.
		
		//쌍용 좌표
		int x = 100;
		int y = 200;
		
		//편의점 좌표
		int x2 = 300;
		int y2 = 400;
		
		System.out.printf("쌍용 교육센터의 위치는 (%d, %d)입니다.\n", x, y);
		
		
		//Case 2.
		// - 집합 -> 배열
		// - x좌표와 y좌표가 확실하게 한 그룹이 되었다.
		// - 좌표 2개를 1개의 변수(배열)로 관리할 수 있다.
		// - 데이터의 구분을 첨자(index)를 사용하기 때문에 의미를 알 수 없다.		
		
		//쌍용
		int[] a1 = new int[] { 100, 200 };
		
		//편의점
		int[] a2 = new int[] { 300, 400 };
		
		System.out.printf("쌍용 교육센터의 위치는 (%d, %d)입니다.\n", a1[0], a1[1]);
		
		
		//Case 3.
		// - 좌표 객체 생성 <- 좌표 클래스 선언
		// - x좌표와 y좌표를 집합으로써 관리한다.
		// - 멤버 가독성 높다.(배열에 비해)

		
		//쌍용 좌표(Point 클래스)
		//자료형 객체명 = new 생성자();
		Point p1 = new Point(); //객체 생성
		

		//p1.x > 점(.) : 멤버 접근 연산자
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("쌍용 교육센터의 위치는 (%d, %d)입니다.\n", p1.x, p1.y);
		
		//편의점
		Point p2 = new Point();
		
		p2.x = 300;
		p2.y = 400;
		
		//멤버 변수에 들어있는 데이터 -> 객체의 상태(State)
		//같은 클래스(틀)로부터 만들어진 서로 다른 객체가 존재
		
		System.out.printf("편의점의 위치는 (%d, %d)입니다.\n", p2.x, p2.y);
		
		
		//배열 vs 클래스
		//공통점
		//	- 데이터의 집합(***)
		//차이점
		//	- 배열 : 첨자 사용 > 순환 용이
		//	- 클래스 : 멤버변수명 사용 > 가독성 높음
		//	- 배열 : 모든 멤버가 같은 자료형
		//	- 클래스 : 멤버가 서로 다른 자료형
		
		//데이터 집합이 필요하다!! > 선택
		//1. 배열
		//	- 같은 자료형 + 모든 멤버가 동일한 성격의 데이터
		//2. 클래스
		//	- 다른 자료형 + 각각의 멤버가 서로 다른 성격의 데이터
		
		
		//요구사항] 사무용품의 사이즈를 저장하시오.
		
		//키보드 사이즈(Size 클래스)
		Size s1 = new Size();
		
		s1.name = "풀사이즈 키보드";
		s1.width = 300;
		s1.height = 100;
		
		System.out.printf("%s는 너비가 %dcm이고 높이가 %dcm입니다.\n", s1.name, s1.width, s1.height);
		
		
		//키보드
		Size s2 = new Size();
		
		s2.name = "텐키리스 키보드";
		s2.width = 200;
		s2.height = 80;
		
		System.out.printf("%s는 너비가 %dcm이고 높이가 %dcm입니다.\n", s2.name, s2.width, s2.height);
		
		
		//홍길동, 아무개 성적 관리(Score 클래스)
		
		Score score1 = new Score();
		
		score1.name = "홍길동";
		
		score1.kor = 100;
		score1.eng = 90;
		score1.math = 80;
		
		score1.total = score1.kor + score1.eng + score1.math;
		
		score1.avg = score1.total / 3.0;
		
		
		Score score2 = new Score();
		
		score2.name = "아무개";
		
		score2.kor = 90;
		score2.eng = 80;
		score2.math = 70;
		
		score2.total = score2.kor + score2.eng + score2.math;
		
		score2.avg = score2.total / 3.0;

		
	} //main
	
} //Ex41_Class


//클래스 선언 > 목적 : 데이터의 집합 용도
class Point {
	
	//멤버 선언(변수, 메서드)
	public int x;
	public int y;
	
} //Point


class Size {
	
	public String name;
	public int width;
	public int height;	
	
} //Size


class Score {
	
	public String name;
	
	public int kor;
	public int eng;
	public int math;
	
	public int total;
	public double avg;
	
} //Score


