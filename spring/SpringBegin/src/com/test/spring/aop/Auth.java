package com.test.spring.aop;


//인증 처리 보조 업무
public class Auth {

	public void check() {
		//글쓴이 확인
		// - 세션 -> 검사 -> 사후 처리
		System.out.println("[auth] 글쓴이 확인 완료");
	}
	
	public void doSomething() {
		System.out.println("[auth] 어떤일을 합니다.");
	}
	
}
