package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Ex03_Statement {

	public static void main(String[] args) {
		
		//Ex03_Statement.java
		
		/*
		
		Statement 클래스
		- SQL 구문을 실행해주는 역할(대리자)
		- 모든 SQL을 실행할 수 있다.
		
		Statement 클래스 종류
		1. Statement
			- 기본 클래스
			
		2. PreparedStatement
			- Statement 개량 클래스 > 매개 변수 처리에 특화
			- 안정성 높음 + 가독성 높음
			- 코드량 많음
			
		3. CallableStatement
			- Statement 개량 클래스 > 프로시저 호출
			- 프로시저 전용
			- PreparedStatement와 유사
		
		*/
		
		Connection conn = null;
		Statement stat = null;
		
		try {
			
			conn = DBUtil.open();
			
			if(!conn.isClosed()) {
				
				System.out.println("연결 성공");
				
				//질의 실행(*****)
				// - 자바는 SQL을 모른다. -> SQL을 일단 문자열로 취급한다.
				//ORA-00911: invalid character
				String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '아무개', 25, 'f', '010-4442-1236', '서울시 강남구 대치동 ㅇㅇ빌딩', default)";
				//String sql = "update tblAddress set name = '김길동' where seq = 1";
				//String sql = "delete from tblAddress where seq = 1";
				//String sql = "drop table tblAddress";
//				String sql = "create table tblAddress"
//						+ "("
//						+ "    seq number primary key,                                     "
//						+ "    name varchar2(10) not null,                                 "
//						+ "    age number(3) not null,                                     "
//						+ "    gender char(1) not null,                                    "
//						+ "    tel varchar2(15) not null,                                  "
//						+ "    address varchar2(300) not null,                             "
//						+ "    regdate date default sysdate not null                       "
//						+ ")";
				
				stat = conn.createStatement();
				
				//*** SQL 종류 -> 반환값O, X
				//1. 반환값 없는 쿼리 실행
				//stat.executeUpdate(sql)
				
				//2. 반환값 있는 쿼리 실행
				//stat.executeQuery(sql)
				
				int result = stat.executeUpdate(sql); //SQL Developer -> Ctrl + Enter 동일
				
				if (result == 1) {
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}
				
				//자원 해제 필수(**********)
				stat.close();
				conn.close();
								
				
			} else {
				System.out.println("연결 실패");
			}
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex03_Statement.main()");
			e.printStackTrace();
		}
		
		
		
	} //main
	
}
