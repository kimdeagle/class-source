package com.test.java;

public class Ex07 {

	public static void main(String[] args) {
		
		// 요구사항] 주변의 데이터를 선정해서 변수생성, 값 대입, 호출하시오.
		
		// 은행 잔고 100,000원
		// 몸무게 70kg
		// 1. 데이터의 형태 or 길이 예측 -> 자료형 결정
		// 2. 변수 생성 -> 변수명 결정
		// 3. 변수 초기화 -> 상수 표기
		// 4. 문장 생성 -> 출력

//		short weight;
//		weight = 56;
//		System.out.println("제 몸무게는 " + weight + "kg입니다.");
		
		// 9개 자료형 각각 10개씩
		
		// 1. byte * 10 : -128 ~ +127
		System.out.println("1. byte 예제");
		
		byte age = 28;
		System.out.println("제 나이는 " + age + "세 입니다.");
		
		byte family = 5;
		System.out.println("제 가족은 총 " + family + "명 입니다.");
		
		byte monitor = 2;
		System.out.println("제 PC의 모니터 수는 " + monitor + "대 입니다.");
		
		byte houseSpace = 25;
		System.out.println("제가 살고있는 집의 평수는 " + houseSpace + "평 입니다.");
		
		byte familyCar = 3;
		System.out.println("제 가족이 보유하고 있는 자동차 수는 " +familyCar + "대 입니다.");
		
		byte dayEat = 3;
		System.out.printf("저는 하루에 %d끼 먹습니다.\n", dayEat);
		
		byte wake = 8;
		System.out.printf("저는 %d시에 일어납니다.\n", wake);
		
		byte sleep = 23;
		System.out.printf("저는 %d시에 취침합니다.\n", sleep);
		
		byte lunch = 13;
		System.out.printf("저는 %d시에 점심을 먹습니다.\n", lunch);
		
		byte dinner = 19;
		System.out.printf("저는 %d시에 저녁을 먹습니다.\n", dinner);
		System.out.println();
		
		// 2. short * 10 : -32768 ~ +32767
		System.out.println("2. short 예제");
		
		short snackPrice = 1800;
		System.out.println("과자의 가격은 " + snackPrice + "원 입니다.");
		
		short dayWalk = 5000;
		System.out.println("저는 하루에 " + dayWalk + "보 걷습니다.");
		
		short drinkWater = 1500;
		System.out.println("저는 하루에 물 " + drinkWater + "ml 마십니다.");
		
		short monitorHertz = 144;
		System.out.println("제 모니터 주사율은 " + monitorHertz + "hz 입니다.");
		
		short height = 173;
		System.out.println("제 키는 " + height + "cm 입니다.");
		
		short youtubeSubscription = 30;
		System.out.printf("내 유튜브 계정에서 구독한 유튜브 채널 수는 %d개 입니다.\n", youtubeSubscription);
		
		short ssdStorage = 500;
		System.out.printf("제 PC에 장착된 SSD 용량은 %dGB 입니다.\n", ssdStorage);
		
		short ramStorage = 16;
		System.out.printf("제 PC에 장착된 RAM 용량은 %dGB 입니다.\n", ramStorage);
		
		short kakaoFriends = 197;
		System.out.printf("제 카카오톡 친구 수는 %d명 입니다.\n", kakaoFriends);
		
		short ramSpeed = 3200;
		System.out.printf("제 PC에 장착된 RAM 동작속도는 %dMHz 입니다.\n", ramSpeed);
		System.out.println();
		
		// 3. int  * 10 : -21억 ~ +21억
		System.out.println("3. int 예제");
		
		int cpuPrice = 250000;
		System.out.println("제 PC에 장착된 CPU 가격은 " + cpuPrice + "원 입니다.");
		
		int graphicPrice = 350000;
		System.out.println("제 PC에 장착된 그래픽카드 가격은 " + graphicPrice + "원 입니다.");
		
		int phonePrice = 1000000;
		System.out.println("제가 사용하는 스마트폰 가격은 " + phonePrice + "원 입니다.");
		
		int koreaPopulation = 51780579;
		System.out.println("한국 총 인구수는 " + koreaPopulation + "명 입니다.");
		
		int dayToSecond = 86400;
		System.out.println("하루는 " + dayToSecond + "초 입니다.");
		
		int gamingLaptopPrice = 2000000;
		System.out.printf("게이밍 노트북 가격은 %d원 입니다.\n", gamingLaptopPrice);
		
		int seoulToBusan = 400000;
		System.out.printf("서울에서 부산까지 거리는 약 %dm 입니다.\n", seoulToBusan);
		
		int accountBalance = 500000;
		System.out.printf("현재 통장 잔고 : %d원\n", accountBalance);
		
		int windows10Price = 189000;
		System.out.printf("윈도우10 가격은 %d원 입니다.\n", windows10Price);
		
		int yearToSecond = 31536000;
		System.out.printf("1년은 %d초 입니다.\n", yearToSecond);
		System.out.println();
				
		// 4. long * 10
		System.out.println("4. long 예제");
		
		long lottoTheFirst = 3390022983L;
		System.out.println("로또 1등 당첨금은 " + lottoTheFirst + "원 입니다.");
		
		long lottoTheSecond = 61797294L;
		System.out.println("로또 2등 당첨금은 " + lottoTheSecond + "원 입니다.");
		
		long worldPopulation = 7794798729L;
		System.out.println("세계 인구수는 " + worldPopulation + "명 입니다.");
		
		long pizzaPrice = 13900L;
		System.out.println("지금 먹고 싶은 피자 가격은 " + pizzaPrice + "원 입니다.");
		
		long highstPriceHouse = 13000000000000L;
		System.out.println("세계에서 가장 비싼 집 가격은 " + highstPriceHouse + "원 입니다.");
		
		long areaOfKorea = 100363710000L;
		System.out.printf("한국 땅 면적은 %dm^2 입니다.\n", areaOfKorea);
		
		long areaOfJapan = 377970000000L;
		System.out.printf("일본 땅 면적은 %dm^2 입니다.\n", areaOfJapan);
		
		long areaOfChina = 9600010800000L;
		System.out.printf("중국 땅 면적은 %dm^2 입니다.\n", areaOfChina);
		
		long naverMarketCapitalization = 49032600000000L;
		System.out.printf("NAVER 시가 총액은 %d원 입니다.\n", naverMarketCapitalization);
		
		long kakaoMarketCapitalization = 32519300000000L;
		System.out.printf("KAKAO 시가 총액은 %d원 입니다.\n", kakaoMarketCapitalization);
		System.out.println();
				
		// 5. float * 10
		System.out.println("5. float 예제");
		
		float pi = 3.14F;
		System.out.println("원주율은 약 " + pi + "입니다.");
		
		float pyeongToSqureMeter = 3.305785F;
		System.out.println("1평은 약 " + pyeongToSqureMeter + "m^2 입니다.");
		
		float inchToMm = 25.4F;
		System.out.println("1인치는 약 " + inchToMm + "mm 입니다.");
		
		float inchToCm = 2.54F;
		System.out.println("1인치는 약 " + inchToCm + "cm 입니다.");
		
		float liToKm = 0.392727F;
		System.out.println("1리는 약 " + liToKm + "km 입니다.");
		
		float liToMile = 0.244029F;
		System.out.printf("1리는 약 %f마일 입니다.\n", liToMile);
		
		float mileToKm = 1.609344F;
		System.out.printf("1마일은 약 %fkm 입니다.\n", mileToKm);
		
		float mileToMeter = 1609.344F;
		System.out.printf("1마일은 약 %fm 입니다.\n", mileToMeter);
		
		float poundToKg = 0.453592F;
		System.out.printf("1파운드는 약 %fkg 입니다.\n", poundToKg);
		
		float poundToGram = 453.59237F;
		System.out.printf("1파운드는 약 %fg 입니다.\n", poundToGram);
		System.out.println();
		
		// 6. double * 10
		System.out.println("6. double 예제");
		
		double intToDouble = 15;
		System.out.println("정수 15를 double형으로 표현하면 " + intToDouble + "입니다.");
		
		double doubleMinValue = Double.MIN_VALUE;
		System.out.println("double형의 최소값은 " + doubleMinValue + "입니다.");
		
		double doubleMaxValue = Double.MAX_VALUE;
		System.out.println("double형의 최대값은 " + doubleMaxValue + "입니다.");
		
		double piDoubleType = 3.141592653589793238462643383279502884197169399375105820974944592307816406286; // 소수점 15자리까지
		System.out.println("원주율을 double형으로 표현하면 약" + piDoubleType + "입니다.");
		
		double oneDivisionThree = 0.3333333333333333333333333333333333; // 소수점 16자리까지, 반올림(or 버림) 발생
		System.out.println("1/3을 double형으로 표현하면 약 " + oneDivisionThree + "입니다.");
		
		double oneDivisionSeven = 0.142857142857142857142857142857142857; // 소수점 17자리까지, 버림 발생
		System.out.printf("1/7을 double형으로 표현하면 약 %.20f입니다.\n", oneDivisionSeven);
		
		double oneDivisionEleven = 0.09090909090909090909; // 소수점 17자리까지, 반올림(or 올림) 발생
		System.out.printf("1/11을 double형으로 표현하면 약 %.20f입니다.\n", oneDivisionEleven);
		
		double oneDivisionThirteen = 0.076923076923076923; // 소수점 17자리까지, 올림 발생
		System.out.printf("1/13을 double형으로 표현하면 약 %.20f입니다.\n", oneDivisionThirteen);
		
		double oneDivisionSeventeen = 0.05882352941176470588235294117647; // 소수점 18자리까지, 버림 발생
		System.out.printf("1/17을 double형으로 표현하면 약 %.20f입니다.\n", oneDivisionSeventeen);
		
		double oneDivisionNineteen = 0.052631578947368421052631578947368421; // 소수점 17자리까지, 반올림(or 버림) 발생
		System.out.printf("1/19을 double형으로 표현하면 약 %.20f입니다.\n", oneDivisionNineteen);
		
		// 소수점 표현되는 자리수가 달라지는 이유가 궁금하다.. -> 정밀도를 보장하지 않는다고 한다.
				
		System.out.println();
		
		// 7. char * 10
		System.out.println("7. char 예제");
		
		char koreanFirstConsonant = 'ㄱ';
		System.out.println("한국어에서 처음 시작하는 자음은 \"" + koreanFirstConsonant + "\" 입니다.");
		
		char koreanLastConsonant = 'ㅎ';
		System.out.println("한국어에서 마지막에 오는 자음은 \"" + koreanLastConsonant + "\" 입니다.");
		
		char koreanFirstVowel = 'ㅏ';
		System.out.println("한국어에서 처음 시작하는 모음은 \"" + koreanFirstVowel + "\" 입니다.");
		
		char koreanLastVowel = 'ㅣ';
		System.out.println("한국어에서 마지막에 오는 모음은 \"" + koreanLastVowel + "\" 입니다.");
		
		char firstSmallAlphabet = 'a';
		System.out.println("알파벳 소문자에서 처음에 오는 단어는 \"" + firstSmallAlphabet + "\" 입니다.");
		
		char lastSmallAlphabet = 'z';
		System.out.printf("알파벳 소문자에서 마지막에 오는 단어는 \"%c\" 입니다.\n", lastSmallAlphabet);
		
		char smallSize = 'S';
		System.out.printf("옷 사이즈 85는 %c사이즈 입니다.\n", smallSize);
		
		char mediumSize = 'M';
		System.out.printf("옷 사이즈 90은 %c사이즈 입니다.\n", mediumSize);
		
		char largeSize = 'L';
		System.out.printf("옷 사이즈 95는 %c사이즈 입니다.\n", largeSize);
		
		char mySize = 'M';
		System.out.printf("제 옷 사이즈는 %c입니다.\n", mySize);
		System.out.println();
		
		// 8. boolean * 10
		System.out.println("8. boolean 예제");
		
		boolean pubg = true;
		System.out.print("배그 하고 싶다. ");
		System.out.println(pubg);
		
		boolean lol = true;
		System.out.print("롤 하고 싶다. ");
		System.out.println(lol);
		
		boolean hungry = true;
		System.out.print("배고프다. ");
		System.out.println(hungry);
		
		boolean cold = true;
		System.out.print("이불밖은 춥다. ");
		System.out.println(cold);
		
		boolean studyInteresting = false;
		System.out.print("공부는 재밌다. ");
		System.out.println(studyInteresting);
		
		boolean studyHard = true;
		System.out.print("그래도 열심히 해야한다. ");
		System.out.println(studyHard);
		
		boolean effort = true;
		System.out.print("노력하고 있는가? ");
		System.out.println(effort);
		
		boolean doWell = true;
		System.out.print("잘 할 자신 있는가? ");
		System.out.println(doWell);
		
		boolean girlFriend = false;
		System.out.print("여자친구가 있는가? ");
		System.out.println(girlFriend);
		
		boolean sad = true;
		System.out.print("슬프다... 공부나 열심히 하자 ");
		System.out.println(sad);
		
		System.out.println();
		
		// 9. String * 10
		System.out.println("9. String 예제");
		
		String hello = "안녕하세요. 반갑습니다";
		System.out.println(hello);
		
		String name = "김주혁";
		System.out.println("내 이름은 " + name + " 입니다.");
		
		String nation = "한국";
		System.out.print("국적은 " + nation + "이고, ");
		
		String city = "충북 충주";
		System.out.println(city + "에서 태어나서 지금까지 살고있습니다. 촌사람 입니다..");
		
		String wantJob = "웹 프로그래머";
		System.out.println("저는 " + wantJob + "가 되기 위해 서울로 올라가 공부하려고 합니다.");
		
		String shit = "코로나";
		System.out.printf("현재 %s로 인해 비대면 수업을 진행하여 아직 충주에 있습니다.\n", shit);
				
		String hobby = "컴퓨터 게임";
		System.out.printf("저는 %s을 정말 좋아하고 잘하기 위해 많이 노력했습니다.\n", hobby);
		
		String favoriteGame1 = "배틀그라운드";
		String favoriteGame2 = "LoL";
		System.out.printf("좋아하는 게임은 %s와 %s입니다. 총은 좀 쏩니다.\n", favoriteGame1, favoriteGame2);
		System.out.printf("게임에 노력한 것 이상 공부하여 %s가 되기 위해 노력할 것입니다.\n", wantJob);
		
		String bye = "감사합니다";
		System.out.printf("간단한 자기소개였습니다. %s\n", bye);
		
		
	}
	
}
