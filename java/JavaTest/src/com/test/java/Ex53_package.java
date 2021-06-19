package com.test.java;

//다른 패키지의 클래스를 인식하게 만드는 도구
import com.test.aaa.Desk;
//import com.test.aaa.SmartPhone;
import com.test.util.MyUtil;

public class Ex53_package {

	public static void main(String[] args) {
		
		//Ex53_package
		
		//패키지(Package)
		// - 클래스를 관리하는 집합(물리적인 폴더)
		// - 클래스 관리, 클래스 용도 명확하게 알아보기 위함
		// ex) java.io.BufferedReader
		
		//패키지 명명법
		//1. 모든 문자를 소문자로 작성한다.
		//2. 공백 금지, 숫자 금지, 특수문자 금지 > only 영소문자로만
		//3. 전세계의 모든 패키지와 비교해도 중복되지 않도록
		// - 주로 도메인을 사용
		// - ex) com.naver.xxx
		// - ex) com.google.xxx
		// - 최소 3단계 이상을 사용
		// - ex) test : 1단계
		// - ex) com.test : 2단계
		// - ex) com.test.java : 3단계(***)
		
		//com.test.aaa.Desk 사용하기
		Desk d1 = new Desk();
		
		
		//com.test.java.SmartPhone : 현재 파일과 같은 패키지에 있다.
		SmartPhone s1 = new SmartPhone();
		
		//com.test.aaa.SmartPhone
		//서로 다른 패키지에 같은 이름의 클래스가 있는데 사용하고 싶을 때, 다른 패키지를 클래스 앞에 명명. but, 이런 상황을 만들지 않는 것이 좋다.
		com.test.aaa.SmartPhone s2 = new com.test.aaa.SmartPhone();
		
		
		
		
		String path = "D:\\class\\Hello.java";
		
		MyUtil util = new MyUtil();
		
		System.out.println(util.getFileName(path));

		
		
	} //main
	
} //Ex53










