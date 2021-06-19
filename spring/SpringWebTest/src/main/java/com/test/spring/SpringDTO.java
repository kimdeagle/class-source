package com.test.spring;

public class SpringDTO {

	private String seq;
	private String name;
	private String point;
	
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
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "SpringDTO [seq=" + seq + ", name=" + name + ", point=" + point + "]";
	}
	
}
