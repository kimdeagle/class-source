package com.test.codestudy;

import java.sql.Connection;
import java.sql.DriverManager;

//자바의 주석
//1. 단일라인 주석
/*
2. 다중라인 주석
*/
/**
3. 자바 도큐먼트 주석
 */

//javadoc.exe - 도큐먼트 생성 도구


/**
 * DBUtil. 데이터베이스 연결 클래스입니다.
 * @author 홍길동
 *
 */
public class DBUtil {

	private static Connection conn;
	
	/**
	 * 데이터베이스 연결 메서드입니다.
	 * @return 연결된 Connection 객체를 반환합니다.
	 */
	public static Connection open() {
		
		//URL 오타
		//java.sql.SQLException: 부적합한 Oracle URL이 지정되었습니다
		
		//서버, 포트번호 오타
		//java.sql.SQLRecoverableException: IO 오류: The Network Adapter could not establish the connection
		
		//오라클 죽인경우, SID 오타
		//java.sql.SQLException: Listener refused the connection with the following error:
		//ORA-12505, TNS:listener does not currently know of SID given in connect descriptor
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//id, pw 오타
		//java.sql.SQLException: ORA-01017: invalid username/password; logon denied
		String id = "hr";
		String pw = "java1234";
		
		try {
			
			//클래스 오타
			//java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleggDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
						
			return conn;
			
		} catch (Exception e) {
			System.out.println("DBUtil.open()");
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	/**
	 * 데이터베이스 연결 메서드입니다.
	 * @param server 접속할 서버 주소입니다.
	 * @param id 접속할 계정명입니다.
	 * @param pw 접속할 비밀번호입니다.
	 * @return 연결된 Connection 객체를 반환합니다.
	 */
	public static Connection open(String server, String id, String pw) {
		
		String url = "jdbc:oracle:thin:@" + server + ":1521:xe";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
		
	}
	
	
} //DBUtil
