package com.test.spring.di4;

public class SpringDAO {

	public int getNum() {
		
		//주업무
		// - DB -> count(*) -> 반환
		//IData data = new DBDAO();
		
		// - File -> count(*) -> 반환
		IData data = new FileDAO();
		
		int num = data.getData();
				
		return num * 2;
		
	}	
	
}
