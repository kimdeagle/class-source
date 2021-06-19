package com.test.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex05_select {

	//1. 멤버 변수(모든 메서드 공통 사용)
	//2. 지역 변수(메서드마다 생성)
	//본인이 판단 but, 지역 변수를 사용할 때 예외 상황에서의 파급 효과가 적다.
	
	
	public static void main(String[] args) {
		
		//Ex05_select.java
		//결과셋의 형태
		//1. 1행 1열
		//2. 1행 n열
		//3. n행 1열
		//4. n행 n열
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		//m5();
		//m6();
		//m7();
		//m8();
		m9();
		
	} //main

	private static void m9() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//요구사항] 영업부 직원수와 영업부 직원 명단을 출력하시오.
			//1. select count(*) as cnt from tblInsa where buseo = '영업부'
			//2. select * from tblInsa where buseo = '영업부'
			
			String sql = "select count(*) as cnt from tblInsa where buseo = '영업부'";
			
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				System.out.println("영업부 직원수 : " + rs.getString("cnt"));
			}
			
			rs.close();
			
			sql = "select * from tblInsa where buseo = '영업부'";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m9()");
			e.printStackTrace();
		}
		
	} //m9

	private static void m8() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name, buseo from tblInsa";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getString("name") + ":" + rs.getString("buseo"));
			}

			//이 시점!! -> 2번 사람 정보를 다시 보고 싶음
			//전진 커서 탐색 방법 -> 후진 불가능
			
			rs.close();
			
			rs = stat.executeQuery(sql); //ResultSet을 새롭게 다시 참조(커서가 BOF)
			
			rs.next();
			rs.next();
			
			System.out.println();
			System.out.println(rs.getString("name") + ":" + rs.getString("buseo"));

			
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m8()");
			e.printStackTrace();
		}
		
	} //m8

	private static void m7() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select m.name as mname, v.name as vname from tblMember m inner join tblRent r on m.seq = r.member inner join tblVideo v on v.seq = r.video";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
				
//				System.out.println(rs.getString("m.name"));
//				System.out.println(rs.getString("v.name"));
				
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("name"));
				
				System.out.println();
				
			}
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m7()");
			e.printStackTrace();
		}
		
	} //m7

	private static void m6() {
		
		//오류가 발생할만한 부분
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//컬럼명 오타
			//java.sql.SQLSyntaxErrorException: ORA-00904: "NAMEG": invalid identifier
			//테이블명 오타
			//java.sql.SQLSyntaxErrorException: ORA-00942: table or view does not exist
			String sql = "select name, buseo, jikwi from tblInsa";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				//java.sql.SQLException: 부적합한 열 이름
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("buseo"));
				System.out.println(rs.getString("jikwi"));
				System.out.println();
				
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m6()");
			e.printStackTrace();
		}
		
		
		
	} //m6

	private static void m5() {
		
		//tblInsa + tblBonus
		//요구] 특정 직원에게 보너스를 지급하시오.
		//1. 모든 직원 명단 출력
		//2. 선택(직원 번호 입력)
		//3. 보너스 금액 입력
		//4. 보너스 지급
		//5. 지급내역 출력
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			
			//1. 모든 직원 명단 출력
			String sql = "select num, name, buseo, jikwi from tblInsa order by num asc";
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			rs = stat.executeQuery(sql);
			
			System.out.println("[번호]\t[이름]\t[부서]\t[직위]");
			
			while (rs.next()) {
				System.out.printf("%s\t%s\t%s\t%s\n", rs.getString("num"), rs.getString("name"), rs.getString("buseo"), rs.getString("jikwi"));
			}
			
			rs.close();
			
			
			//2. 선택(직원 번호 입력)
			System.out.print("번호입력 : ");
			String num = scan.nextLine();
			
			//3. 보너스 금액 입력
			System.out.print("보너스 금액 : ");
			String bonus = scan.nextLine();
			
			//4. 보너스 지급
			sql = String.format("insert into tblBonus (seq, num, bonus) values (seqBonus.nextVal, %s, %s)", num, bonus);
			
			int result = stat.executeUpdate(sql);
			
			//5. 지급내역 출력
			if (result > 0) {
				System.out.println("보너스 지급 성공");
				System.out.println();
				
				System.out.println("[직원]\t[보너스]");
				
				sql = "select (select name from tblInsa where num = tblBonus.num) as name, bonus from tblBonus order by seq desc"; //상관서브쿼리 -> 속도 빠름
				//sql = "select i.name, b.bonus from tblInsa i inner join tblBonus b on i.num = b.num order by seq desc"; //join -> 속도 느림
				
				rs = stat.executeQuery(sql);
				
				while (rs.next()) {
					System.out.printf("%s\t%,9d\n", rs.getString("name"), rs.getInt("bonus"));
				}
				
				rs.close();
				stat.close();
				conn.close();
				
				System.out.println();
				System.out.println("프로그램 종료");
				
			} else {
				System.out.println("보너스 지급 실패");
			}
			
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m5()");
			e.printStackTrace();
		}
		
		
		
	} //m5

	private static void m4() {
		
		//4. n행 n열
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select * from tblAddress order by seq asc";
			
			rs = stat.executeQuery(sql);
			
			System.out.println("[번호]\t[이름]\t[나이]\t[성별]\t[전화번호]\t[등록일]\t\t[주소]");
			
			while (rs.next()) {
				
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
								, rs.getString("seq")
								, rs.getString("name")
								, rs.getString("age")
								, rs.getString("gender").equals("m") ? "남자" : "여자"
								, rs.getString("tel")
								, rs.getString("regdate")
								, rs.getString("address")
								);
				
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m4()");
			e.printStackTrace();
		}
		
		
	} //m4

	private static void m3() {
		
		//3. n행 1열
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name from tblAddress order by name asc";
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getNString("name"));
			}
			
			rs.close();
			stat.close();
			conn.close();
			
//			rs.next();
//			System.out.println(rs.getString("name"));
//			
//			rs.next();
//			System.out.println(rs.getString("name"));
//			
//			rs.next();
//			System.out.println(rs.getString("name"));
//			
//			rs.next();
//			System.out.println(rs.getString("name"));
//			
//			rs.next();
//			System.out.println(rs.getString("name"));
//			
//			rs.next();
//			System.out.println(rs.getString("name"));
			
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m3()");
			e.printStackTrace();
		}
		
	} //m3

	private static void m2() {
		
		//2. 1행 n열
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			String sql = "select name, age, gender, tel, address from tblAddress where seq = 3";
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				
				System.out.printf("이름 : %s\n나이 : %d\n성별 : %s\n전화번호 : %s\n주소 : %s\n"
						, rs.getString("name")
						, rs.getInt("age") - 1
						, rs.getString("gender").equals("m") ? "남자" : "여자"
						, rs.getString("tel")
						, rs.getString("address"));
				
			} else {
				System.out.println("없음");
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m2()");
			e.printStackTrace();
		}
		
		
	} //m2

	private static void m1() {
		
		//1. 1행 1열
		// - 단일값 반환
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select age from tblAddress where seq = 3";
			
			//반환값 X -> executeUpdate()
			//반환값 O -> executeQuery()
			
			rs = stat.executeQuery(sql);
			
			//ResultSet 탐색 -> 스트림, 이터레이터, 커서 유사
			//Moves the cursor forward one row from its current position
			System.out.println(rs.next());
			
			System.out.println(rs.getString(1)); //컬럼순서
			System.out.println(rs.getString("age")); //컬럼명
			
			rs.close();
			
			
			sql = "select name from tblAddress where seq = 3";
			rs = stat.executeQuery(sql); //stat 재사용(SQL을 여러번 실행 가능)
			
			if (rs.next()) {
				String name = rs.getString("name");
				System.out.println("이름 : " + name);
			} else {
				System.out.println("결과 없음");
			}
			
			
			sql = "select count(*) as count from tblAddress";
			
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println(count);
				
				String count2 = rs.getString("count");
				System.out.println(count2);
			} else {
				System.out.println("no");
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex05_select.m1()");
			e.printStackTrace();
		}
		
	} //m1
	
}
