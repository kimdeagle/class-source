package com.test.servlet;

import java.io.FileWriter;

public class Gugudan {

	public static void main(String[] args) {
		
		try {
			
			//사람 대신 gugudan2.html 파일을 만들기 위한 프로그램 > 파일 입출력
			FileWriter writer = new FileWriter("WebContent\\gugudan2.html");
			
			writer.write("<!DOCTYPE html>");
			writer.write("<html>");
			writer.write("<head>");
			writer.write("<meta charset=\"UTF-8\">");
			writer.write("<title>Insert title here</title>");
			writer.write("</head>");
			writer.write("<body>");
			
			int dan = 2;
			writer.write(String.format("<h1>%d단</h1>", dan));
			
			for (int i=1; i<=9; i++) {
				writer.write(String.format("<div>%d x %d = %d</div>", dan, i, dan * i));
			}
			
			writer.write("</body>");
			writer.write("</html>");
			
			writer.close();
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
	
}
