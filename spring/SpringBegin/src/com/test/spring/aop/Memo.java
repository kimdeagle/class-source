package com.test.spring.aop;

public class Memo implements IMemo {

	@Override
	public void add(String memo) {

		System.out.printf("메모 쓰기 : %s\n", memo);
		
	}

	@Override
	public void edit(String memo) {

		System.out.printf("메모 수정 : %s\n", memo);
		
	}

	@Override
	public void del(int seq) {

		System.out.printf("메모 삭제 : %d\n", seq);
		
	}

	@Override
	public void read(int seq) throws Exception {

		if (seq != 5) {
			System.out.printf("메모 읽기 : %d\n", seq);			
		} else {
			throw new Exception("존재하지 않는 메모");
		}
		
	}

	@Override
	public int search(String word) {
		
		if (word.indexOf("메모") > -1) {
			return 3;
		} else if (word.indexOf("길동") > -1) {
			return 10;
		}
		
		return 0;
	}

	
	
}
