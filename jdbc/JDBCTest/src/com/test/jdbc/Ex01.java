package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		
		JDBC(Java Database Connectivity)
		- 자바 응용 프로그램(콘솔, 웹, 모바일 등)과 데이터베이스 관리 시스템(오라클, MySQL 등)을 연결시켜주는 중간 계층
		- 자바 프로그램 <-> 오라클 : 너무 어려움, 비용 많이 발생
		- 자바 프로그램 <-> JDBC <-> 오라클 : 이방법 선택
		
		- 중간 계층 : JDBC, ODBC, OLEDB, ADO, ADO.NET, JPA(ORM), Spring-JDBC, MyBatis
				수업 -> JDBC, Spring-JDBC, MyBatis
		
		[사람 + SQL Developer <-> Oracle Server]
		- 지난 3주간 환경
		1. 클라이언트 툴 실행
		2. DB 서버 접속
			2.1 호스트명 : 서버 IP or 도메인 주소 -> localhost
			2.2 포트번호 : 1521
			2.3 SID : "xe"
			2.4 드라이버 : "thin(oci)"
			2.5 사용자명 : "hr"
			2.6 비밀번호 : "java1234"
		3. 질의(업무)
			3.1 SQL 사용
			3.2 반환값이 없는 쿼리
				- select를 제외한 모든 쿼리
			3.3 반환값이 있는 쿼리
				- select
				- 결과셋을 반환하는 쿼리
				- 결과셋을 업무에 사용(*****)
		4. 접속 종료
			4.1 commit/rollback
			4.2 접속 종료
		
		[자바프로그램 + JDBC <-> Oracle Server]
		- 이시간 이후 환경
		1. 자바 응용 프로그램 실행
		2. DB 서버 접속
			- JDBC(Connection 클래스) 사용
			2.1 호스트명 : 서버 IP or 도메인 주소 -> localhost
			2.2 포트번호 : 1521
			2.3 SID : "xe"
			2.4 드라이버 : "thin(oci)"
			2.5 사용자명 : "hr"
			2.6 비밀번호 : "java1234" 
		3. 질의(업무)
			- Statement 클래스 사용
			3.1 SQL 사용
			3.2 반환값이 없는 쿼리
				- select를 제외한 모든 쿼리
			3.3 반환값이 있는 쿼리
				- select
				- 결과셋을 ResultSet 클래스를 사용해서 반환(제어)
				- 결과셋을 반환하는 쿼리
				- 결과셋을 업무에 사용(*****)
		4. 접속 종료
			- Connection 클래스 사용
			4.1 commit/rollback
			4.2 접속 종료
		
		
		JDBC 관련 클래스 라이브러리
		- Connection
		- Statement
		- ResultSet
		
		JDBC 사용 환경 설정
		- 현재 프로젝트에서 JDBC를 사용하기 위한 설정
		- JDBC 드라이버 파일이 필요(***)
		- 오라클 사이트 -> 다운로드
		- 구글링
		- 오라클 설치 폴더에 이미 들어있음(권장)
		- C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
		
		*/
		
		
		//1. DB 접속 - Connection 클래스 사용
		Connection conn = null;
		
		//2. DB 서버 접속
		//- JDBC(Connection 클래스) 사용
		//2.1 호스트명 : 서버 IP or 도메인 주소 -> localhost
		//2.2 포트번호 : 1521
		//2.3 SID : "xe"
		//2.4 드라이버 : "thin(oci)"
		//2.5 사용자명 : "hr"
		//2.6 비밀번호 : "java1234"
		
		//연결 문자열(Connection String)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "java1234";
		
		//JDBC 작업 > 외부 입출력 > 예외 처리 필수
		try {
			
			//3. JDBC 관련 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//4. Connection 객체 생성 + 오라클 접속
			conn = DriverManager.getConnection(url, id, pw);
			
			//5. 업무...
			System.out.println(conn.isClosed()); //접속중이면 false
			
			//6. 접속 종료
			conn.close();
			System.out.println(conn.isClosed()); //접속중이지 않으면 true
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
	} //main
	
} //Ex01
