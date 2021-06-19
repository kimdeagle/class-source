package com.test.question.q22;

public class Example02 {

	public static void main(String[] args) throws Exception
    {       
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("홍길동");
        System.out.println(s2);

        Student s3 = new Student(100, 90, 80);
        System.out.println(s3);

        Student s4 = new Student(100, 90, 80, "아무개");
        System.out.println(s4);
    } //main
	
}

class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student() {
        this("익명", 0, 0, 0);
    }

	public Student(String name) {
        this("name", 0, 0, 0);
    }

    public Student(int kor, int eng, int math) {
        this("익명", kor, eng, math);
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Student(int kor, int eng, int math, String name) {
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    	this.name = name;
	}

	public String toString() {
        return this.name + "," + this.kor + "," + this.eng + "," + this.math;
    }
}