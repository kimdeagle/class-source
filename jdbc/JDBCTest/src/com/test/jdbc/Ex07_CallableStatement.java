package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class Ex07_CallableStatement {

	public static void main(String[] args) {
		
		//Ex07_CallableStatement.java
		
		//temp();
		//temp2();
		//temp3();
		
		//m1();
		//m2();
		
		//m3(); //반환값 -> 단일 레코드 -> ResultSet 사용안함
		//m4(); //반환값 -> 단일 레코드 -> ResultSet 사용안함
		
		m5(); //반환값 -> 다중 레코드 -> ResultSet 사용함
		
		
	} //main
	
	private static void m5() {
		
		//프로시저가 반환한 커서를 참조하기
		Connection conn = null;
		CallableStatement cstat = null;
		
		try {
			
			conn = DBUtil.open();
			
			String sql = "{ call procM5(?, ?) }";
			
			cstat = conn.prepareCall(sql);
			
			cstat.setString(1, "개발부");
			cstat.registerOutParameter(2, OracleTypes.CURSOR);
			
			cstat.executeQuery();
			
			//Oracle(cursor) -> JDBC(ResultSet)
			ResultSet rs = (ResultSet)cstat.getObject(2);
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("jikwi"));
				System.out.println(rs.getString("city"));
				System.out.println();
			}
			
			rs.close();
			cstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.m5()");
			e.printStackTrace();
		}
		
	} //m5

	private static void m4() {
		
		Connection conn = null;
		CallableStatement cstat = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			
			conn = DBUtil.open();
			
			String sql = "{ call procM4(?, ?, ?, ?) }";
			
			cstat = conn.prepareCall(sql);
			
			boolean loop = true;
			
			while (loop) {
				System.out.println("[직원 조회]");
				System.out.print("직원 번호 : ");
				String num = scan.nextLine();
				
				if (!num.equals("")) {
					
					cstat.setString(1, num);
					cstat.registerOutParameter(2, OracleTypes.VARCHAR);
					cstat.registerOutParameter(3, OracleTypes.VARCHAR);
					cstat.registerOutParameter(4, OracleTypes.VARCHAR);
					
					cstat.executeQuery();
					
					String name = cstat.getString(2);
					String buseo = cstat.getString(3);
					String jikwi = cstat.getString(4);
					
					System.out.println("이름 : " + name);
					System.out.println("부서 : " + buseo);
					System.out.println("직위 : " + jikwi);
					
					System.out.println();
					
				} else {
					loop = false;
				}
			}
			
			cstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.m4()");
			e.printStackTrace();
		}
		
		
	} //m4

	private static void m3() {
		
		//procM3
		// - 인자값(X), 반환값(O)
		Connection conn = null;
		CallableStatement cstat = null;
		//ResultSet rs;
		
		try {
			
			conn = DBUtil.open();
			
			String sql = "{ call procM3(?) }";
			
			cstat = conn.prepareCall(sql);
			
			//in 매개변수
			//cstat.setXXX(1, 값);
			
			//out 매개변수
			cstat.registerOutParameter(1, OracleTypes.NUMBER);
			
			//java.sql.SQLException: PLSQL 문에서 인출을 수행할 수 없습니다.: next
			//ResultSet rs = cstat.executeQuery();
			//System.out.println(rs.next());
			
			cstat.executeQuery();
			
			int count = cstat.getInt(1);
			System.out.println("주소록 항목 : " + count);
			
			cstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.m3()");
			e.printStackTrace();
		}
		
		
	} //m3

	private static void m2() {
		
		//procM2
		// - 인자값(O), 반환값(X)
		
		Connection conn = null;
		CallableStatement cstat = null;
		
		try {
			
			conn = DBUtil.open();
			
			String sql = "{ call procM2(?, ?, ?, ?, ?) }";
			
			//String sql = String.format("{ call procM2('%s', %s, '%s', '%s', '%s') }", "", 1, "", "", ""); //가능은 한데 비추..
			
			cstat = conn.prepareCall(sql);
			
			cstat.setString(1, "하하하");
			//cstat.setString(2, "25");
			cstat.setInt(2, 25);
			cstat.setString(3, "f");
			cstat.setString(4, "010-2534-2301");
			cstat.setString(5, "서울시 강동구 동동");
			
			System.out.println(cstat.executeUpdate());
			System.out.println("완료");
			
			cstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.m2()");
			e.printStackTrace();
		}
		
	} //m2

	private static void m1() {
		
		//procM1
		// - 인자값(X), 반환값(X)
		// - 고정된 SQL -> 정적 쿼리
		
		Connection conn = null;
		CallableStatement cstat = null;
		
		try {
			
			conn = DBUtil.open();
			
			String sql = "{ call procM1 }";
			
			cstat = conn.prepareCall(sql);
			
			int result = cstat.executeUpdate();
			
			System.out.println(result);
			System.out.println("완료");
			
			cstat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.m1()");
			e.printStackTrace();
		}
		
	} //m1

	private static void temp3() {
		
		Connection conn = null;
		Statement stat = null;
		
		try {
			
			//트랜잭션 업무
			//1. 오라클에서 처리?
			//2. 자바(JDBC)에서 처리?
			//정답은 없다. 단, 잘 모르겠으면 오라클에서 처리하는 것을 권장
			
			conn = DBUtil.open();
			conn.setAutoCommit(false); //이 구문은 stat을 만들기 전에 호출해야 한다.
			
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '홍길동5', 20, 'm', '010-1234-5678', '서울시 강남구 역삼동 한독빌딩', default)";
			
			stat = conn.createStatement();
			
			int result = stat.executeUpdate(sql);
			System.out.println(result);
			
			//conn.commit();
		
			conn.rollback();
			
				
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.temp3()");
			e.printStackTrace();
		}
		
	} //temp3

	private static void temp2() {
		
		//JDBC는 기본적으로 모든 쿼리의 실행은 자동 커밋이 된다.
		// -> executeXXX() : commit 호출
		
		Connection conn = null;
		Statement stat = null;
		
		try {
			
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '홍길동2', 20, 'm', '010-1234-5678', '서울시 강남구 역삼동 한독빌딩', default)";
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			System.out.println(stat.executeUpdate(sql));
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.temp2()");
			e.printStackTrace();
		}
		
	} //temp2

	private static void temp() {
		
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.print("남자(m)? 여자(f)? : ");
			String gender = scan.nextLine();
			
			conn = DBUtil.open();
			
			//java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 1 -> 첫번째 물음표에 안넣어줬다.
			String sql = "select * from tblAddress where gender = ?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, gender);
			
			rs = pstat.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			rs.close();
			pstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex07_CallableStatement.temp()");
			e.printStackTrace();
		}
		
	} //temp
	
	
}







