package com.test.util;

public class MyUtil {

	public String getFileName(String path) {
		
		//파일 경로 -> 파일명 추출
		//D:\class\java\JavaTest\Hello.java
		
		int index = path.lastIndexOf("\\");
		
		return path.substring(index + 1);
		
	}
	
}
