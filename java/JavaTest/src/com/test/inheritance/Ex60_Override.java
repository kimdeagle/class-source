package com.test.inheritance;

import java.util.Random;

public class Ex60_Override {

	public static void main(String[] args) {
		
		UserRandom rnd = new UserRandom();
		
		System.out.println(rnd.nextBoolean()); //주로 사용
		System.out.println(rnd.nextDouble()); //주로 사용
		
		//System.out.println(rnd.nextKoreaNumber);
		
		System.out.println(rnd.nextInt()); //1~10 random, 고민?(메서드명에서 오는 혼란)
		
		
		
	}
	
}

class UserRandom extends Random {
	
	//확신(100%) -> nextInt() 사용 안함
	//확신(100%) -> nextKoreaNumber() 메서드명 맘에 안듬
	//nextKoreaNumber() -> nextInt() : 개명
	
	//숫자 랜덤 -> 1~10
	@Override
	public int nextInt() {
		
		//String[] nums = { "일", "이", "삼", "사", "오", "육", "칠", "팔", "구", "영" };
		
		//Random rnd = new Random();
		
		//return nums[rnd.nextInt(nums.length)]; //되도록 암기
		
		Random rnd = new Random();
		
		return rnd.nextInt(10) + 1;
		
	}
	
}












