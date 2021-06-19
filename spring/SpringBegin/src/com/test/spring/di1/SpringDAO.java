package com.test.spring.di1;

import java.util.Random;

public class SpringDAO {

	public int getNum() {
		
		//Ex01 -> (의존관계) -> SpringDAO -> (의존관계) -> Random
		//Ex01 <- (의존객체) <- SpringDAO <- (의존객체) <- Random
		
		//DB -> select 가정
		
		//rnd는 SpringDAO의 의존 객체다.
		
		//의존 객체의 생성에 대해서..
		// -> 의존 객체를 누가 만드는가?
		//a. 직접 생성 : SpringDAO가 rnd를 만들었음. > 필요한 당사자가 직접 의존 객체를 생성했음.
		//b. 외부로부터 공급 : DI, IoC
		Random rnd = new Random();
		
		return rnd.nextInt(100);
		
	}

	
	
}
