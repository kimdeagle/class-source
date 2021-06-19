package com.test.mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner scan;
	private static AddressDAO dao;
	
	static {
		scan = new Scanner(System.in);
		dao = new AddressDAO(); //*** DB 담당자(전문가)
	}

	public static void main(String[] args) {
		
		boolean loop = true;
		
		while (loop) {
			
			System.out.println("[주소록]");
			System.out.println("1. 주소록 추가하기");
			System.out.println("2. 주소록 목록보기");
			System.out.println("3. 주소록 삭제하기");
			System.out.println("4. 주소록 수정하기");
			System.out.println("5. 주소록 검색하기");
			System.out.println("6. 종료");
			
			System.out.print("입력 : ");
			
			String sel = scan.nextLine();
			
			System.out.println();
			
			if (sel.equals("1")) {
				add();
			} else if (sel.equals("2")) {
				list();
			} else if (sel.equals("3")) {
				delete();
			} else if (sel.equals("4")) {
				edit();
			} else if (sel.equals("5")) {
				search();
			} else {
				loop = false;
			}
			
		} //while
		
		System.out.println("프로그램 종료...");
		
		
	} //main

	private static void add() {
		
		System.out.println("[주소록 추가하기]");
		
		//1. scan -> 입력
		//2. Connection 연결
		//3. SQL 작성
		//4. Statement 생성 + 실행
		//5. 결과 받음
		//6. 마무리 작업
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("나이 : ");
		String age = scan.nextLine();
		
		System.out.print("성별(m|f) : ");
		String gender = scan.nextLine();
		
		System.out.print("전화번호 : ");
		String tel = scan.nextLine();
		
		System.out.print("주소 : ");
		String address = scan.nextLine();
		
		//int result = dao.add(name, age, gender, tel, address);
		
		AddressDTO dto = new AddressDTO();
		dto.setName(name);
		dto.setAge(age);
		dto.setGender(gender);
		dto.setTel(tel);
		dto.setAddress(address);
		
		//현재 프로그래밍 방식 -> 계층과 계층간의 관계가 단순화 추구
		
		//주소록 추가하기
		int result = dao.add(dto);
		
		if (result == 1) {
			System.out.println("주소록 추가 성공");
		} else {
			System.out.println("주소록 추가 실패");
		}
		
		pause();
	}

	private static void list() {
		
		System.out.println("[주소록 목록보기]");
		
		//주소록 목록 보기
		//ResultSet -> (변환) -> ArrayList<AddressDTO>
		//ResultSet -> 레코드의 집합 -> 레코드 -> 컬럼(셀)의 집합
		//ArrayList -> AddressDTO의 집합 -> AddressDTO -> 컬럼의 집합
		ArrayList<AddressDTO> list = dao.list(null);
		
		//ResultSet -> 탐색 + 조작
		//ArrayList -> 탐색 + 조작 *****
		
		for (AddressDTO dto : list) {
			System.out.printf("%s, %s, %s, %s\n"
							, dto.getSeq()
							, dto.getName()
							, dto.getTel()
							, dto.getAddress()
							);
		}
		System.out.println();
		
		
		pause();
	}

	private static void delete() {
		
		System.out.println("[주소록 삭제하기]");
		
		ArrayList<AddressDTO> list = dao.list(null);
		
		for (AddressDTO dto : list) {
			System.out.printf("%s - %s\n", dto.getSeq(), dto.getName());
		}
		System.out.println();
		
		System.out.print("삭제할 직원 번호 : ");
		String seq = scan.nextLine();
		
		int result = dao.delete(seq);
		
		if (result > 0) {
			System.out.println("주소록 삭제 성공");
		} else {
			System.out.println("주소록 삭제 실패");
		}
		
		pause();
	}

	private static void edit() {
		
		System.out.println("[주소록 수정하기]");
		
		//1. 목록 출력
		//2. 직원 번호 입력
		//3. 기존 정보 출력
		//4. 수정값 입력
		//5. update
		//6. 종료
		
		ArrayList<AddressDTO> list = dao.list(null);
		
		for (AddressDTO dto : list) {
			System.out.printf("%s, %s, %s, %s\n"
							, dto.getSeq()
							, dto.getName()
							, dto.getTel()
							, dto.getAddress()
							);
		}
		System.out.println();
		
		System.out.print("수정할 직원 번호 : ");
		String seq = scan.nextLine();
		
		System.out.println();
		
		AddressDTO dto = dao.get(seq);
		
		System.out.println("번호 : " + dto.getSeq());
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());
		System.out.println("성별 : " + dto.getGender());
		System.out.println("전화 : " + dto.getTel());
		System.out.println("주소 : " + dto.getAddress());
		System.out.println();
		
		System.out.println("*** 수정을 하지 않는 컬럼은 그냥 엔터를 입력하시오.");
		
		System.out.print("수정할 이름 : ");
		String name = scan.nextLine();
		
		if (name.equals("")) {
			name = dto.getName();
		}
		
		System.out.print("수정할 나이 : ");
		String age = scan.nextLine();
		
		if (age.equals("")) {
			age = dto.getAge();
		}
		
		System.out.print("수정할 성별 : ");
		String gender = scan.nextLine();
		
		if (gender.equals("")) {
			gender = dto.getGender();
		}
		
		System.out.print("수정할 전화 : ");
		String tel = scan.nextLine();
		
		if (tel.equals("")) {
			tel = dto.getTel();
		}
		
		System.out.print("수정할 주소 : ");
		String address = scan.nextLine();
		
		if (address.equals("")) {
			address = dto.getAddress();
		}
		
		AddressDTO dto2 = new AddressDTO();
		
		dto2.setSeq(seq);
		dto2.setName(name);
		dto2.setAge(age);
		dto2.setGender(gender);
		dto2.setTel(tel);
		dto2.setAddress(address);
		
		int result = dao.edit(dto2);
		
		if (result > 0) {
			System.out.println("주소록 수정 성공");
		} else {
			System.out.println("주소록 수정 실패");
		}
		
		pause();
	}

	private static void search() {
		
		System.out.println("[주소록 검색하기]");
		
		//어떤 컬럼에서? -> 주소 검색
		System.out.print("검색어 : ");
		String word = scan.nextLine();
		
		ArrayList<AddressDTO> list = dao.list(word);
		
		for (AddressDTO dto : list) {
			System.out.printf("%s, %s, %s, %s\n"
							, dto.getSeq()
							, dto.getName()
							, dto.getTel()
							, dto.getAddress()
							);
		}
		System.out.println();
		
		pause();
	}

	private static void pause() {
		
		System.out.println("계속하시려면 엔터를 눌러주세요..");
		scan.nextLine();
		
	}
	
} //Main.java
