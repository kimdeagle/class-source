package com.test.question.q16;

public class Macaron {

	private int size;
	private String color;
	private int thickness;
	
	
	public int getSize() {
		return size;
	}
	
	public void setSize() {
		this.size = (int)(Math.random() * 11) + 5;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor() {
		switch ((int)(Math.random() * 8)) {
			case 0:
				this.color = "black";
				break;
			case 1:
				this.color = "red";
				break;
			case 2:
				this.color = "blue";
				break;
			case 3:
				this.color = "yellow";
				break;
			case 4:
				this.color = "white";
				break;
			case 5:
				this.color = "pink";
				break;
			case 6:
				this.color = "purple";
				break;
			case 7:
				this.color = "green";
				break;	
		} //switch
		
	} //setColor

	public int getThickness() {
		return thickness;
	}

	public void setThickness() {
		this.thickness = (int)(Math.random() * 20) + 1;
	}
}
