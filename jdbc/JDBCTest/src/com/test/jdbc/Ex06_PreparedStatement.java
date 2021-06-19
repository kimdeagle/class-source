package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Ex06_PreparedStatement {

	public static void main(String[] args) {
	
		//Ex06_PreparedStatement.java
		
		//1. Statement
		//	- 매개변수가 없는 SQL -> 정적 쿼리
		//2. PreparedStatement
		//	- 매개변수가 있는 SQL -> 동적 쿼리
		//3. CallableStatement
		//	- 프로시저 호출 전용
		
		
		//PreparedStatement
		// - 매개변수가 있는 SQL 실행 용도
		
		//insert + 사용자 입력
		String name = "하하하";
		String age = "20";
		String gender = "m"	;
		String tel = "010-1512-1243";
		String address = "서울시 동대문구 이문'동";
		//address = address.replace("'", "''");
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		try {
			
			conn = DBUtil.open();
			
			//1. Statement 사용
			// - SQL을 문자열 취급 + 매개변수 문자열 취급
			// - String.format()을 사용
			String sql = String.format("insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '%s', %s, '%s', '%s', '%s', default)", name, age, gender, tel, address);
			
			stat = conn.createStatement();
			
			//System.out.println(stat.executeUpdate(sql));
			
			
			//2. PreparedStatement 사용
			// - ? : 오라클 매개변수
			// - String.format() 불필요
			// - 매개변수를 손쉽게 전달 가능
			// - 매개변수값으로 부적절한 값이 있어도 자동으로 이스케이프를 해준다.(***)
			sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, ?, ?, ?, ?, ?, default)";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, name); //매개변수에 값을 전달
			pstat.setString(2, age); //두번째 물음표에 age를 넣어주세요.
			pstat.setString(3, gender);
			pstat.setString(4, tel);
			pstat.setString(5, address);
			
			System.out.println(pstat.executeUpdate());
			
			
			
			
		} catch (Exception e) {
			System.out.println("Ex06_PreparedStatement.main()");
			e.printStackTrace();
		}
		
		
	} //main
	
}
