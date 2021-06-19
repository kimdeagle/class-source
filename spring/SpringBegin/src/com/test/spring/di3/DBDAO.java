package com.test.spring.di3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDAO {

	public int getData() {
		
		try {
			
			Connection conn = DBUtil.open();
			
			String sql = "select count(*) as cnt from tblMember";
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				return rs.getInt("cnt");
			}

			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return 0;
		
	} //getData()
	
} //DBDAO
