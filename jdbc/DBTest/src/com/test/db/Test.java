package com.test.db;

import java.sql.Connection;

import com.test.jdbc.DBUtil;

public class Test {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DBUtil.open();
			System.out.println(conn.isClosed());
			
		} catch (Exception e) {
			System.out.println("Test.main()");
			e.printStackTrace();
		}
		
		
		
	} //main
	
} //Test
