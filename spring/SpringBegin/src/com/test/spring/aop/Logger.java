package com.test.spring.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

	//특정 업무를 수행한 뒤 해당 시각을 기록
	public void logTime() {
		
		//DB -> insert
		System.out.printf("[log] %tF %tT\n", Calendar.getInstance(), Calendar.getInstance());
		
	}
	
	//around 보조 업무일 때
	public void executeTime(ProceedingJoinPoint joinPoint) throws Throwable {
		
		//보조 업무 -> 주 업무 -> 보조 업무
		
		long start = System.nanoTime();
		System.out.println("[log] 시간 기록을 시작합니다.");
		
		//주 업무 실행
		// - 주 업무를 대신할 수 있는 대리자(Proxy) 위치(호출)
		try {
			
			joinPoint.proceed(); //주 업무 실행 코드의 추상화
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		long end = System.nanoTime();
		System.out.println("[log] 시간 기록을 종료합니다.");
		
		System.out.printf("[log] 주 업무 소요 시간 : %s\n", (end - start) + "ns");
		
	}
	
	//obj : 주 업무 반환값
	public void logSearch(Object obj) {
		System.out.printf("[log] %s번 메모를 검색했습니다.\n", obj);
	}
	
	public void notfound(Exception e) {
		System.out.printf("[log] '%s' 예외 발생. 관리자 메일을 발송했습니다.\n", e.getMessage());
	}
	
	
}
