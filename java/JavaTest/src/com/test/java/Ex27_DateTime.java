package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex27_DateTime {

	public static void main(String[] args) {
		
		//Ex27_DateTime.java
		
		//자바 자료형
		// - 숫자형, 논리형, 문자형
		// - 문자열, 날짜시간형
		
		//날짜 시간형
		//1. Date 클래스(구경만.. legacy)
		//2. Calendar 클래스(***)
		//3. 다음 세대 클래스
		
		/*
		
		1. 시간 - 양 -> 포인트와 포인트 사이 간격
		2. 시각 - 포인트
		
		ex) 2020-10-20 10:43:15 -> 시각
		ex) 하루 수업은 8시간 -> 시간
		
		//날짜/시간 연산
		
		틱(Tick), 에포크(Epoch), 타임 스탬프(Time Stamp) : 특정 시각으로부터 흐른 누적 시간
		
		시각 + 시각 : X
		시각 - 시각 = 시간 : O -> 기준점 필요(Java의 경우 1970.01.01 00:00:00)
		시각 * 시각 : X
		시각 / 시각 : X
		
		시간 + 시간 = 시간 : O
		시간 - 시간 = 시간 : O
		시간 * 시간 : X
		시간 / 시간 : X
		
		시각 + 시간 = 시각 : O
		시각 - 시간 = 시각 : O
		시각 * 시간 : X
		시각 / 시간 : X
		
		*/
		
		//m1();
		m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
		
		
	} //main
	
	
	private static void m6() {
		
		//시간 + 시간 = 시간
		//2:10 + 1:30 = 3:40
		
		//시간 계산 -> Calendar 사용 금지! -> int 변수 사용 O
		
		//2:10 + 30 = 2:40
		
//		int hour = 2;
//		int min = 10;
//		
//		min = 10 + 30;
//		
//		System.out.printf("%d시간 %d분\n", hour, min);
		
		//2:30 + 50 = 3:20
		//단위 재정비(자리올림)
		
		int hour = 2;
		int min = 30;
		
		min = min + 50;
		
		hour = hour + (min / 60);
		min = min % 60;
		
		System.out.printf("%d시간 %d분\n", hour, min);	
		
		
	}


	private static void m5() {
		
		//어떠한 값을 산술 연산을 하다보면..(연산자 or 메서드)
		//1. 연산의 결과를 반환하는 타입 (ex. int m = n + 1;)
		//2. 연산의 결과를 해당 요소에게 직접 적용하는 타입 (ex. ++n;)
		
		//Calendar 연산 특징
		// - 대부분 2번 타입
		
		
		
		//시각 - 시각 = 시간
		
		//내가 태어난지 며칠이 지났는지?
		
		//현재
		Calendar now = Calendar.getInstance();
		
		//생일
		Calendar birthday = Calendar.getInstance();
		birthday.set(1993, 4, 26, 10, 0, 0); //내 생일로 수정하기
		
		//System.out.println(now - birthday); //자바에서 지원 X
		
		//tick -> getTimeInMillis 사용 -> long 자료형 취급 확인!!
		long nowTick = now.getTimeInMillis();
		System.out.println(nowTick);
		
		long birthdayTick = birthday.getTimeInMillis();
		System.out.println(birthdayTick);
		
		long gap = nowTick - birthdayTick;
		System.out.println(gap / 1000 / 60 / 60 / 24);
		
		//올해 크리스마스가 며칠 남았는지?
		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2020, 11, 25, 0, 0, 0);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("올해 크리스마스는 %d일 남았습니다\n", (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
		
		
	}


	private static void m4() { //*** 연습 많이 하기!! -> 자주 써먹는다
		
		//날짜시간 연산
		// - void add(int, int)
		
		//시각 + 시간
		Calendar now = Calendar.getInstance(); //현재 시각 가져오기
		
		now.add(Calendar.DATE, 100); //덮어쓰기(수정)
		
		System.out.printf("%tF\n", now);
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MINUTE, 45);
		
		System.out.printf("%tT\n", now);
		
		now = Calendar.getInstance();
		
		now.add(Calendar.HOUR, 3);
		
		System.out.printf("%tT\n", now);
		
		
		//시각 - 시간
		
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -7); //빼는 것도 add를 쓰고, amount에 음수를 입력
		
		System.out.printf("%tF\n", now);
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MONTH, -3);
		
		System.out.printf("%tF\n", now);
		
		
		
		
		
		
	}


	private static void m3() {
		
		//1. 현재 시각 만들기
		//2. 특정 시각 만들기
		
		//1. 현재 시각 만들기
		
		Calendar now = Calendar.getInstance();
		
		//2020-10-20
		System.out.printf("%d-%d-%d\n"
							, now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH) + 1
							, now.get(Calendar.DATE));
		
		//15:8:5
		System.out.printf("%d:%d:%d\n"
							, now.get(Calendar.HOUR_OF_DAY)
							, now.get(Calendar.MINUTE)
							, now.get(Calendar.SECOND));
		
		//15:08:10 -> 2자리로 맞추기
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%s:%s:%s\n"
				, hour < 10 ? "0" + hour : hour + "" // "" -> 문자열 처리
				, minute < 10 ? "0" + minute : minute + ""
				, second < 10 ? "0" + second : second + "");
		
		//15:08:10 -> 2자리로 맞추기 -> %02d : 2자리만큼 차지하는데 빈자리는 0으로 채우기
		System.out.printf("%02d:%02d:%02d\n"
				, now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE)
				, now.get(Calendar.SECOND));
		
		//*** 가장 많이 써먹는 Format
		
		//1. 년도-월-일 출력해주는 문장 2020-10-20
		System.out.printf("%tF\n", now);
		
		//2. 시-분-초 출력해주는 문장 15:22:08
		System.out.printf("%tT\n", now);
		
		
		//2. 특정 시각 만들기
		
		//내 생일
		
		Calendar birthday = Calendar.getInstance();
		
		//수정
		// - void set(int, int)
		// - void set(변경하고싶은 항목, 변경값)

		birthday.set(Calendar.YEAR, 1993);
		birthday.set(Calendar.MONTH, 4); //하나 작은 숫자 입력!! -> 1월이 0부터 시작
		birthday.set(Calendar.DATE, 26);
		
		System.out.printf("%tF\n", birthday);
		
		// - void set(int, int, int)
		// - void set(년, 월, 일)

		birthday.set(1998, 5, 22);
		
		System.out.printf("%tF\n", birthday);
		
		// - void set(int, int, int, int, int, int)
		// - void set(년, 월, 일, 시, 분, 초)
		
		birthday.set(1995, 3, 20, 15, 22, 17);
		
		System.out.printf("%tF %tT\n", birthday, birthday);
		
		
	} //m3


	private static void m2() {
		
		//현재시각 얻어오기
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1);
		
		//java.util.GregorianCalendar[time=1603163204752,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=6,SECOND=44,MILLISECOND=752,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		//Calendar 값에 들어있는 여러 데이터 중 원하는 항목만 가져오는 방법
		// - int get(int)
		
		System.out.println(c1.get(1)); //년
		System.out.println(c1.get(2)); //월
		System.out.println(c1.get(3)); //주차
		
		int year = 1;
		System.out.println(c1.get(year)); //가독성
		
		//캘린더 변수(상수)
		System.out.println(Calendar.YEAR); //1
		
		System.out.println(c1.get(Calendar.YEAR));
		
		System.out.println();
		
		//자주 쓰는 요소 출력
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH)); //0부터 시작 -> 1월이 0으로 표기
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.HOUR)); //12시간 표기법
		System.out.println(c1.get(Calendar.MINUTE));
		System.out.println(c1.get(Calendar.SECOND));
		System.out.println(c1.get(Calendar.MILLISECOND));
		System.out.println(c1.get(Calendar.AM_PM)); //오전(0), 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //이번주 며칠 -> 요일
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //24시간 표기법
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //주차
		
		//요구사항] 오늘은 '2020년 10월 20일입니다.' 출력
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n", c1.get(Calendar.YEAR), c1.get(Calendar.MONTH)+1, c1.get(Calendar.DATE));
		
	} //m2


	public static void m1() {
		
		//Date or Calendar
		
		//현재 컴퓨터의 시간을 가져오는 명령어
		Date d1 = new Date();
		
		System.out.println(d1);
		
	} //m1
	
	
	
	
	
}
