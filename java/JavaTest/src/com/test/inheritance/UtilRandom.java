package com.test.inheritance;

import java.util.Random;

public class UtilRandom extends Random {

	//Ex55에 있는 2. 3 ~ 12 난수
	public int nextTinyInt() {
		
		Random rnd = new Random();
		
		return rnd.nextInt(10) + 3;
		
	}
	
	//Ex55에 있는 3. color 난수
	public String nextColor() {
		
		Random rnd = new Random();
		
		String[] colors = { "red", "yellow", "blue", "orange", "green" };
		
		return colors[rnd.nextInt(colors.length)];
		
	}
	
	
}
