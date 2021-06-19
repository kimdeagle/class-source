package com.test.mvc;

//AddressVO -> Value Object - 읽기 전용 상자
//AddressDTO -> Data Transfer Object - 수정 가능한 상자

//Data Transfer Object
// - 계층(Main)과 계층(AddressDAO) 사이에 데이터를 전달할 때 사용하는 상자

//오라클 테이블 1개 -> DTO 1개 
//----------------------(1, 2번 필수)
//1. 멤버 변수 private
//2. getter/setter 구현
//----------------------(3, 4번 선택)
//3. 생성자 -> O, X
//4. toString() -> O, X
public class AddressDTO {
	
	private String seq;
	private String name;
	private String age;
	private String gender;
	private String tel;
	private String address;
	private String regdate;
	
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
} //AddressDTO






















