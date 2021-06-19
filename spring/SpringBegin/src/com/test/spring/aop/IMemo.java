package com.test.spring.aop;

public interface IMemo {

	void add(String memo); //쓰기
	void edit(String memo); //수정
	void del(int seq); //삭제
	void read(int seq) throws Exception; //읽기
	int search(String word); //검색
	
}
