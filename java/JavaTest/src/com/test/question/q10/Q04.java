package com.test.question.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		//Q04
		//파일명 입력받아 각 확장자별 총 개수 출력
		
		m1();
		
	} //main

	private static void m1() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int gif = 0;
		int jpg = 0;
		int png = 0;
		int hwp = 0;
		int doc = 0;
		
		System.out.println("파일명 입력(단, 확장자는 gif, jpg, png, hwp, doc으로 제한");
		for (int i=1; i<=10; i++) {	
			System.out.print("파일명 : ");
			String fileName = reader.readLine();
			
			String ext = fileName.substring(fileName.lastIndexOf(".")+1);
			
			if (ext.equals("gif")) {
				gif++;
			} else if (ext.equals("jpg")) {
				jpg++;
			} else if (ext.equals("png")) {
				png++;
			} else if (ext.equals("hwp")) {
				hwp++;
			} else {
				doc++;
			}
		}
		System.out.println();
		
		System.out.printf("gif : %d개\n", gif);
		System.out.printf("jpg : %d개\n", jpg);
		System.out.printf("png : %d개\n", png);
		System.out.printf("hwp : %d개\n", hwp);
		System.out.printf("doc : %d개\n", doc);
		
		
		
	} //m1
	
}
