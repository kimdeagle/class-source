package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex37_String {

	public static void main(String[] args) throws IOException {
		
		//Ex37_String.java
		
		
		
		//요구사항] 사용자 문장을 입력 > 몇글자?
		// .length()
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		m14();
		

		
		
	} //main

	private static void m14() {
		
		//형식 문자열
		// - printf() 메서드에서 지원 : 콘솔에서 사용할 수 있는 명령어
		// - String format("형식문자열", 인자)
		
		String name = "홍길동";
		System.out.printf("이름 : %s님\n", name);
		
		//콘솔 이외의 환경에서도 사용 가능
		String result = String.format("이름 : %s님", name);
		
		System.out.println(result);
		
		
	} //m14

	private static void m13() {
		
		//문자열 치환(바꾸기)
		// - 문자열의 일부를 교체하는 메서드
		// - String replace(String old, String new)
		// - 모두 교체(***)
		
		String txt = "안녕하세요. 홍길동입니다.";
		String result = txt.replace("홍길동", "아무개");
		System.out.println(result);
		
		result = txt.replace("안녕하세요", "Hi~");
		System.out.println(result);
		
		System.out.println(txt);
		
		txt = "안녕 길동아. 잘가 길동아";
		System.out.println(txt.replace("길동", "하하"));
		System.out.println(txt.replace("길동", "")); //삭제
		
		
		txt = "     하나     둘     ";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim()); //좌우 공백 제거
		System.out.printf("[%s]\n", txt.replace(" ", "")); //모든 공백 제거
		
		String content = "저희는 자바 문법을 공부하는 학생입니다.";
		String word = "자바 문법";
		
		//System.out.println(content.replace(" ", ""));
		//System.out.println(word.replace(" ", ""));
		
		//메서드 체인
		if (content.replace(" ", "").indexOf(word.replace(" ", "")) > -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		
	} //m13

	private static void m12() {
		
		//문자열 추출
		// - char charAt(int index) : 문자 1개 추출
		// - String substring(int begin, int end) : 문자 1개 이상 추출
		//		- begin(inclusive), end(exclusive)
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.charAt(5));
		
		System.out.println(txt.substring(5, 8)); //5부터 8전까지 -> 시작위치는 포함, 끝위치는 포함하지 않음
		
		String jumin = "951220-2020202";
		
		System.out.println(jumin.substring(6, 7) == ("-")); //false
		System.out.println(jumin.substring(6, 7).equals("-")); //true
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		//2자 이상 추출..
		//몇년생?
		System.out.println(jumin.substring(0, 2) + "년생");
		//몇월생?
		System.out.println(jumin.substring(2, 4) + "월생");
		
		//자바 파일의 전체 경로(Full Path)
		String path = "D:\\class\\java\\JavaTest\\src\\com\\test\\java\\Ex11_Input.java";
		
		//위의 경로에서 파일명을 알려주세요. > Ex11_Input.java
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index + 1, path.length());
		System.out.println(fileName);
		
		//확장자? > .java
		index = fileName.lastIndexOf(".");
		
		//fileName.substring(index, fileName.length()); 과 같은 결과
		String ext = fileName.substring(index);
		System.out.println(ext);
		
		//확장자를 뺀 파일명? > Ex11_Input
		String fileNameWithoutExt = fileName.substring(0, index);
		System.out.println(fileNameWithoutExt);
		
		
	} //m12

	private static void m11() {
		
		//검색 방향 : 좌 -> 우
		// - int indexOf(String s)
		// - int indexOf(String s, int fromIndex)
		
		//검색 방향 : 우 -> 좌
		// - int lastIndexOf(String s)
		// - int lastIndexOf(String s, int fromIndex)
		
		String txt = "안녕 길동아 잘가 길동아";
		
		//첫번째 만나는 길동이가 어딨는지?
		System.out.println(txt.indexOf("길동"));
		
		//마지막에 있는 길동이가 어딨는지?
		System.out.println(txt.lastIndexOf("길동"));
		
		
		//파일이 이미지인지 아닌지 구분		
		String file = "dog.jpg.test.exe.jpg";
		
		//if (file.indexOf(".jpg") > -1) { //파일명에 .jpg가 들어있을 수 있기 때문에 사용하면 안된다!!
		//if (file.indexOf(".jpg") == file.length() - 4) { //위와 같은 의미로 사용X
		//if (file.lastIndexOf(".jpg") == file.length() - 4) { //끝에 4자리
		if (file.endsWith(".jpg")) { //변화(파일 확장자)에 대한 대처가 더 좋다.
			System.out.println("이미지 O");
		} else {
			System.out.println("이미지 X");
		}
		
		
	} //m11

	private static void m10() {
		
		//패턴 검색
		// - boolean startsWith(String word)
		// - boolean endsWith(String word)
		
		String name = "홍길동";
		
		//이름이 '홍'씨?
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf("홍") == 0);
		
		//"안녕"으로 시작하는가?
		String txt = "안녕하세요. 홍길동님.";
		System.out.println(txt.startsWith("안녕"));
		System.out.println(txt.charAt(0) == '안' && txt.charAt(1) == '녕');
		System.out.println(txt.indexOf("안녕") == 0);
		
		System.out.println();
		
		//이름이 '동'으로 끝나는가?
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length()-1);
		
		
	} //m10

	private static void m9() {
		
		//대소문자 변경
		// - String toUpperCase()
		// - String toLowerCase()
		
		String txt = "Hello World";
		
		System.out.println(txt);
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		//1. 대소문자 변환X -> 검색 : 정확도O, 검색율X
		//2. 대소문자 변환O -> 검색 : 정확도X, 검색율O
		
		String content = "우리가 배우는 과목은 Java입니다.";
		String word = "java";
		
		//한쪽으로 통일시켜 검색
		content = content.toUpperCase(); //Java -> JAVA
		word = word.toUpperCase(); //java -> JAVA
		
		if (content.indexOf(word) > -1) {
			System.out.println("검색 결과 있음");
		} else {
			System.out.println("검색 결과 없음");
		}
		
		
	} //m9

	private static void m8() {
		
		//메서드는 대부분 서로 상호 베타적이다.
		// - 다른 메서드가 한 일의 경과를 본인의 일과 연관짓지 않는다.
		
		//indexOf의 특징
		// - 검색어가 여러개 발견되도 무조건 첫번째 발견의 위치를 반환한다.
		
		//문자열 검색
		// - int indexOf(char c)
		// - int indexOf(String c)
		// - int indexOf(char c, int fromIndex)
		// - int indexOf(String c, int fromIndex)
		
		String txt = "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 잘가세요. 홍길동님. 테스트 홍길동. 몇번있을까 홍길동.";
		
//		int index = txt.indexOf("홍길동");
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동");
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동");
//		System.out.println(index);
//		
//		// - int indexOf(char c, int fromIndex)
//		// - int indexOf(String c, int fromIndex)
//		// - fromIndex -> 검색을 시작할 위치
//		index = txt.indexOf("홍길동", index + "홍길동".length());
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동", index + "홍길동".length());
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동", index + "홍길동".length());
//		System.out.println(index);
		
		//변수 초기값
		// -> 잘못된 상황이 발생해도 피해가 최소화할 수 있는 값으로 초기값을 넣는다.
		int index = -1;
		
		while (true) {
			
			index = txt.indexOf("홍길동", index);
			
			if (index == -1) {
				break;
			}
			
			System.out.printf("%d번째에서 발견\n", index);
			
			index += "홍길동".length();
			
		}

		
	} //m8

	private static void m7() throws IOException {
		
		//게시판 > 글쓰기
		// - 관리자 모드 : 금지어 설정
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("글내용 : ");
		String content = reader.readLine();
		
		//금지어
		String word = "바보";
		
		if (content.indexOf(word) == -1) {
			System.out.println("글쓰기 완료");
		} else {
			System.out.println("금지어 사용 불가!!");
		}
		
		
	} //m7

	private static void m6() throws IOException {
		
		//문자열 검색
		// - 문자열 내에서 원하는 문자(문자열) 검색 -> 어디에 위치했는지?
		// - int indexOf(char c)
		// - int indexOf(String c)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = txt.indexOf('홍'); //문자의 위치 반환
		System.out.println(index);
		
		index = txt.indexOf('녕');
		System.out.println(index);
		
		index = txt.indexOf("하세요"); //문자열의 시작위치 반환
		System.out.println(index);
		
		index = txt.indexOf("아무개"); //없는 경우 -1 반환
		System.out.println(index);
		
		//상황1 - 뉴스 기사 문단 가져오기 -> 
		txt ="모건 오테이거스 미 국무부 대변인은 24일(현지 시각) 트위터에 \"중국 공산당은 70년 전 전쟁이 단순히 ‘발발’했다고 주장한다\"며 \"사실은 북한이 1950년 6월 25일 마오쩌둥을 등에 업고 남한을 침략한 것\"이라고 썼다. 오테이거스 대변인은 \"자유국가들이 이에 맞서 싸우자 중국 공산당은 수십만명의 병사들을 압록강 너머로 보내 한반도에 참화를 불러왔다\"고 했다.";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			System.out.print("검색어 입력 : ");
			String word = reader.readLine();
			
			//txt에서 word가 발견되었냐?
			if (txt.indexOf(word) > -1) { //***
				System.out.println(txt.indexOf(word) + "번째에서 발견했습니다.");
			} else {
				break;
			}
			
		}
		System.out.println("검색 종료");
		
		
		
	} //m6

	private static void m5() {
		
		//공백 제거
		// - String trim()
		// - 문자열의 좌우 끝에 있는 공백 문자(space, tab, enter)를 제거하는 메서드
		// - 문자열 사이의 공백 문자는 제거하지 않는다.(***)
		// - 사용자는 문자열의 좌우 공백을 인식하기 힘들다. -> 편의성 높이기 위해서 개발자가 좌우 공백을 제거하는 경우가 많다.
		// - ex)웹사이트 검색
		
		
		String txt = "      하나    둘	셋	";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
		
	} //m5

	private static void m4() {
		
		//주민등록번호 입력
		// - 반드시 '-'를 입력하세요.
		// - 950101-1010101 //O
		// - 9501011010101 //X
		
		String jumin = "950101-1010101";
		
		System.out.println(jumin.charAt(6)); //'-'는 6에 있다.
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
			
			if (jumin.charAt(7) == '1') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
			
		} else {
			System.out.println("올바르지 않은 주민번호");
		}

		
	} //m4

	private static void m3() throws IOException {
		
		//유효성 검사 - 회원 가입
		// - 이름 입력 -> 2자~5자 이내만 + 한글만
		
		//문자열 -> 영소문자 구성 확인?
		String txt = "teAstB";
		
		//문자열 -> 문자코드 값 제어 불가능
		//문자 -> 문자코드 값 제어 가능

		//범위 벗어난 경우
		//char c = txt.charAt(4);
		//error message : java.lang.StringIndexOutOfBoundsException: String index out of range: 4
		
		
		for (int i=0; i<txt.length(); i++) {
			char c = txt.charAt(i);
			//System.out.println(c);
			//System.out.println((int)c); //해당 문자의 문자 코드
			//System.out.println(c >= 'a' && c <= 'z');
			
			//유효성 검사 -> 잘못된 걸 찾는 것이 편하다.
			if (c < 'a' || c > 'z') {
				System.out.println("잘못된 문자를 발견했습니다.");
				break; //for문 탈출 -> 뒤에 남은 문자는 검사할 가치가 없기 때문
			}
			
			
		}
		
		//유효성 검사 - 회원 가입
		// - 이름 입력 -> 2자~5자 이내만 + 한글만
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean result = true;
		
		System.out.print("이름 입력 : ");
		String name = reader.readLine();
		
		//글자수 검사
		if (name.length() < 2 || name.length() > 5) {
			System.out.println("이름은 2자~5자 이내로 입력하세요.");
			result = false;
		}
		
		
		for (int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			
			//한글 검사
			if (c < '가' || c > '힣') {
				System.out.println("이름은 한글로만 입력하세요.");
				result = false;
				break;
			}
			
		}
		
		//true -> 올바른 이름
		//false -> 올바르지 않은 이름
		
		if (result) {
			System.out.println("회원가입을 진행합니다.");
		} else {
			System.out.println("유효하지 않은 이름 > 재입력");
		}
			
		
	} //m3

	private static void m2() {
		
		//문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메서드
		String str = "안녕하세요. 홍길동입니다. 하하하";
		
		
		System.out.println(str);
		System.out.println(str.charAt(0)); //n번째 위치한 문자 출력 -> '안' 출력
		System.out.println(str.charAt(7)); //'홍' 출력
		
		//문자열의 마지막 문자 추출 -> length 활용
		System.out.println(str.charAt(13)); //'.' 출력 -> 좋은 코드X
		System.out.println(str.charAt(str.length()-1)); //length 활용 -> 문자열 길이-1 -> 좋은 코드O
		
		
	} //m2

	private static void m1() throws IOException {
		
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String statement = reader.readLine();
		
		//유효성 검사(길이)
		if (statement.length() >= 5) {
			//비즈니스 코드(업무 코드)
			// - 프로그램이 하려고 했던 주된 업무를 구현한 코드
			System.out.printf("입력한 문자는 총 %d개의 문자로 구성되었습니다.\n", statement.length());
		} else {
			//예외 처리 코드
			// - 제대로된 사용법을 지키지 않아 발생한 오류를 처리하기 위한 코드
			System.out.println("문장을 5자 이상 입력해주세요.");
		}	
		
		
	} //m1
	
	
}
