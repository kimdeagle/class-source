package com.test.obj;

public class Ex48_Class {

	public static void main(String[] args) {
		
		//Ex48_Class.java
		
		Baby b1 = new Baby();
		
		b1.setName("홍길동");
		b1.setWeight(4);
		b1.setHeight(50);
		
//		String[] parent = new String[2];
//		parent[0] = "홍아빠";
//		parent[1] = "김엄마";
//		
//		b1.setParent(parent);
		
//		String[] parent = { "홍아빠", "김엄마" };
//		
//		b1.setParent(parent);
		
//		b1.setParent({ "홍아빠", "김엄마" }); //X
		
//		b1.setParent(new String[] { "홍아빠", "김엄마" });
		
		b1.setParent("홍아빠", "김엄마");
		
		
		//출력
		System.out.println("이름 : " + b1.getName());
		System.out.println("몸무게(kg) : " + b1.getWeight());
		System.out.println("키(cm) : " + b1.getHeight());
		System.out.println("아빠 : " + b1.getParent()[0]);
		System.out.println("엄마 : " + b1.getParent()[1]);
		
		for (String name : b1.getParent()) {
			System.out.println(name);
		}
		
		//부모 모두
		System.out.println(b1.getParent());
		
		//아빠만
		System.out.println(b1.getParent()[0]);
		System.out.println(b1.getFather());
		System.out.println(b1.getParent(1));
		System.out.println(b1.getParent("아빠"));
		
		//엄마만
		System.out.println(b1.getParent()[1]);
		System.out.println(b1.getMother());
		System.out.println(b1.getParent(2));
		System.out.println(b1.getParent("엄마"));
		
		
	} //main
	
} //Ex48


//아기 클래스
class Baby {
	
	private String name;	//이름
	private int weight;		//몸무게
	private int height;		//키
	
//	private String father;	//아빠
//	private String mother;	//엄마
	
	private String[] parent;	//아빠, 엄마

	
	public String getName() {
		return name;
	}

	public void setParent(String father, String mother) {
		
		this.parent = new String[] { father, mother };
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String[] getParent() {
		return parent;
	}
	
	public String getParent(int n) {
		if (n == 1) {
			return this.parent[0]; //getFather
		} else {
			return this.parent[1]; //getMother
		}
	}
	
	public String getParent(String n) {
		if (n.equals("아빠")) {
			return this.parent[0]; //getFather
		} else {
			return this.parent[1]; //getMother
		}
	}
	
	public String getFather() {
		return this.parent[0];
	}
	
	public String getMother() {
		return this.parent[1];
	}

	public void setParent(String[] parent) {
		this.parent = parent;
	}
	

} //Baby









