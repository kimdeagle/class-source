package com.test.spring.di3;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileDAO {

	public int getData() {

		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("member.dat"));
			
			int num = 0;
			
			while (reader.readLine() != null) {
				num++;
			}
			
			return num;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return 0;
	}

}
