package com.test.spring.di5;

public class SpringDAO {
	
	//DBDAO or FileDAO -> 의존
	private IData data;
	
	public SpringDAO(IData data) {
		this.data = data;
	}
	
	public int getNum() {
		
		int num = data.getData();
				
		return num * 2;
		
	}	
	
}
