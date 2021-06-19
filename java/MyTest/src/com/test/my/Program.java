package com.test.my;

import com.test.util.MyUtil;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\aaa\\bbb\\ccc.txt";
		
		//import : 반드시 같은 프로젝트 내에 있는 패키지(클래스)만 인식 가능!
		//컴파일된 자르파일을 가져와서 사용
		MyUtil util = new MyUtil();
		
		System.out.println(util.getFileName(path));
		
	}
	
}
