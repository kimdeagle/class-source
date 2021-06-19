package com.test.sql;

import java.util.Random;

public class Dummy {

	public static void main(String[] args) {
		
		//testPercent();
		
		//testScore();
		
		test();
		//test2();

		
		
	}
	

	private static void test2() {
		
		Random rnd = new Random();

		for (int i=1; i<=30; i++) {
			System.out.printf("insert into tblTestScore (seqTestScore, seqTestPercent, writtenScore, practicalScore, attendanceScore) values (seqTestScore.nextVal, %d, %d, %d, %d);\n", i, rnd.nextInt(11)+30, rnd.nextInt(11)+30, rnd.nextInt(11)+10);			
		}
		
	}


	private static void test() {

		String[] date = { "2020-02-21", "2020-03-20", "2020-05-08"};
		
		
		for (int i=1; i<=3; i++) { //3문제
			for (int j=1; j<=10; j++) { //수강번호(수료자)
				System.out.printf("insert into tblTestPercent (seqTestPercent, seqRegCourse, seqBasicTest, writtenPercent, practicalPercent, attendancePercent, testDate) values (seqTestPercent.nextVal, %d, %d, %d, %d, %d, '%s');\n", j, i, 40, 40, 20, date[i-1]);
				
			}
		}
		
	}


	private static void testScore() {
		
		//시험성적정보
		
		Random rnd = new Random();
		
		int[] writtenS = { 30, 35, 40 };
		int[] practicalS = { 30, 35, 40 };
		int[] attendanceS = { 20, 15, 10 };
		for (int i=1; i<=150; i++) {
			int b = rnd.nextInt(writtenS.length);
			System.out.printf("insert into tblTestScore (seqTestScore, seqTestPercent, writtenScore, practicalScore, attendanceScore) values (seqTestScore.nextVal, %d, %d, %d, %d);\n", i, writtenS[b], practicalS[b], attendanceS[b]);			
		}
		
	}

	private static void testPercent() {
		
		//시험배점정보

		Random rnd = new Random();
		
		int[] written = { 35, 40, 40 };
		int[] practical = { 40, 40, 45 };
		int[] attendance = { 25, 20, 15 };
		String[] date = { "2020-01-20", "2020-02-11", "2020-03-20", "2020-03-11", "2020-04-02", "2020-04-25", "2020-05-07", "2020-05-26", "2020-06-22", "2020-07-10" };
		
		
		for (int i=1; i<=10; i++) { //10문제
			for (int j=11; j<=30; j++) { //수강번호
				int a = rnd.nextInt(written.length);
				System.out.printf("insert into tblTestPercent (seqTestPercent, seqRegCourse, seqBasicTest, writtenPercent, practicalPercent, attendancePercent, testDate) values (seqTestPercent.nextVal, %d, %d, %d, %d, %d, '%s');\n", j, i, written[a], practical[a], attendance[a], date[i-1]);
				
			}
		}
		
	}
	
}
