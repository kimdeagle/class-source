package com.test.jdbc;

import java.sql.Connection;

public class Ex02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DBUtil.open();
			
			System.out.println(conn.isClosed() ? "연결안됨" : "연결됨");
			
			conn.close();
			
			System.out.println(conn.isClosed() ? "연결안됨" : "연결됨");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	} //main
	
}
