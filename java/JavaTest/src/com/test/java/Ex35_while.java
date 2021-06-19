package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex35_while {

	public static void main(String[] args) throws IOException {
		
		//for문(X) -> while문(O)
		
		//간단한 프로그램 틀
		
		//콘솔 게시판
		//1. 메뉴 출력
		//2. 선택
		//3. 기능 실행
		//4. 메뉴 출력
		//5. 선택
		//6. 기능 실행
		//...(반복)
		//7. 종료할 때 까지
		
		boolean loop = true;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (loop) {
			
			System.out.println("====================");
			System.out.println(" 콘솔 게시판(메뉴)");
			System.out.println("====================");
			System.out.println(" 1. 글보기");
			System.out.println(" 2. 글쓰기");
			System.out.println(" 3. 글 수정하기");
			System.out.println(" 4. 글 삭제하기");
			System.out.println(" 5. 종료");
			System.out.println("====================");
			System.out.print(" 선택 : ");
			
			String sel = reader.readLine();
			
			if (sel.equals("1")) {
				//글보기
				view();
				
			} else if (sel.equals("2")) {
				//글쓰기
				write();
				
			} else if (sel.equals("3")) {
				//글 수정하기
				edit();
				
			} else if (sel.equals("4")) {
				//글 삭제하기
				delete();
				
			} else {
				//종료
				//break;
				loop = false;
				
			}
			
		} //while
		
		System.out.println("프로그램 종료");
		
		
	} //main

	private static void delete() throws IOException {
		System.out.println("글 삭제하기를 구현합니다.");
		
		pause();
		
	} //delete

	private static void edit() throws IOException {
		System.out.println("글 수정하기를 구현합니다.");
		
		pause();
		
	} //edit

	private static void write() throws IOException {
		System.out.println("글쓰기를 구현합니다.");
		
		pause();
		
	} //write

	private static void view() throws IOException {
		System.out.println("글보기를 구현합니다.");
		
		pause();
		
	} //view
	
	//메서드 만들기 -> 코드 블럭 -> 우클릭 -> Refactor -> Extract Method
	private static void pause() throws IOException {
		System.out.println("계속하시려면 엔터를 입력하세요..");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine();
		
	} //pause
	
	
	
}
