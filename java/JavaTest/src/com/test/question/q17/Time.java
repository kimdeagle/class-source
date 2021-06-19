package com.test.question.q17;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		if (hour >= 0 && minute >= 0 && second >= 0) {
			this.hour = (hour + (minute + (second / 60)) / 60) % 60;
			this.minute = (minute + (second / 60)) % 60;
			this.second = second % 60;
		}
	}
	
	public Time(int minute, int second) {
		if (minute >= 0 && second >= 0) {
			this.hour = (minute + (second / 60)) / 60 % 60;
			this.minute = (minute + (second / 60)) % 60;
			this.second = second % 60;
		}
	}
	
	public Time(int second) {
		if (second >= 0) {
			this.hour = (second / 60 / 60) % 60;
			this.minute = (second / 60) % 60;
			this.second = second % 60;
		}
	}
	
	public String info() {
		
		return String.format("%d:%d:%d", hour, minute, second);
		
	}
	
	
	
	
} //Time
