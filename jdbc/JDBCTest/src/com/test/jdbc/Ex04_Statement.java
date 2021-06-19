package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Ex04_Statement {

	public static void main(String[] args) {
		
		//Ex04_Statement.java
		
		//add(); //주소록 추가하기
		del(); //주소록 삭제하기
		
	} //main

	private static void add() {
		
		//사용자 입력 -> DB 추가
		Connection conn = null;
		Statement stat = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			//자바 자료형 <-> 관계X <-> 오라클 자료형
			//언어가 다르면 모든 것들이 호환이 안된다.(자료형 포함)
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			System.out.print("나이 : ");
			String age = scan.nextLine();
			
			System.out.print("성별(m|f) : ");
			String gender = scan.nextLine();
			
			System.out.print("전화번호 : ");
			String tel = scan.nextLine();
			
			System.out.print("주소 : ");
			String address = scan.nextLine();
			
			conn = DBUtil.open();
			
			String sql = String.format("insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '%s', %s, '%s', '%s', '%s', default)", name, age, gender, tel, address);
			
			stat = conn.createStatement();
			
			int result = stat.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("추가 성공!");
			} else {
				System.out.println("추가 실패!");
			}
			
			stat.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			System.out.println("Ex04_Statement.add()");
			e.printStackTrace();
		}
		
		
	} //add
	
	private static void del() {
		
		Connection conn = null;
		Statement stat = null;
		String seq = "";
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.print("삭제할 번호 : ");
			seq = scan.nextLine();
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "delete from tblAddress where seq = " + seq;
			
			int result = stat.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패!");
			}
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex04_Statement.del()");
			e.printStackTrace();
		}
		
		
		
	} //del

	
	
}
