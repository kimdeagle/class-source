package com.test.spring.di3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SpringDAO {

	public int getNum() {

		//*** 고용 관계(=의존 관계)
		// - 업무의 일부가 변경이 되는 경우?? > 의존 객체의 업무가 변경되는 상황이 발생하는 경우??
		
		
		//상황 + 관계
		// - 회원 정보 관리 -> 오라클
		// - 회원 정보 관리 -> 텍스트 파일
		
		//Ex03 -> SpringDAO -> DBDAO
		//Ex03 -> SpringDAO -> FileDAO
		
		//주업무
		// - DB -> count(*) -> 반환
		//DBDAO db = new DBDAO();
		
		//추가 업무
		//int num = db.getData();
		
		// - File -> count(*) -> 반환
		FileDAO file = new FileDAO();
		
		int num = file.getData();
				
		return num * 2;
		
	}	
	
}
