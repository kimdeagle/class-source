package com.test.question.q09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q05
		//은행 프로그램
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean loop = true;
		
		int money = 100000;
		
		String password = "1234";
		
		while (loop) {
			
			System.out.println("My Bank를 시작합니다.");
			System.out.println();
			System.out.println("==========================");
			System.out.println("         My Bank");
			System.out.println("==========================");
			System.out.println("1. 계좌 입금");
			System.out.println("2. 계좌 출금");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			System.out.println("==========================");
			System.out.print("선택(번호) : ");
			int num = Integer.parseInt(reader.readLine());
		
			switch (num) {
				case 1:
					money = insertMoney(money, password);
					break;
				case 2:
					money = deleteMoney(money, password);
					break;
				case 3:
					viewMoney(money);
					break;
				case 4:
					loop = false;
			}
		
		}
		
		System.out.println("My Bank를 종료합니다.");
		
	} //main
	

	private static void viewMoney(int money) throws IOException {
		System.out.printf("현재 잔액 : %,d원\n", money);
		goHome();
		
	} //viewMoney
	
	
	private static int deleteMoney(int money, String password) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("비밀번호 4자리 입력 : ");
		String inputPassword = reader.readLine();
		
		if (inputPassword.equals(password)) {
			System.out.print("출금액(숫자만 입력) : ");
			int outputMoney = Integer.parseInt(reader.readLine());
			if (outputMoney > money) {
				System.out.println("잔액이 부족합니다.");
				goHome();
			} else {
				money -= outputMoney;
				System.out.printf("%,d원이 출금되었습니다.\n", outputMoney);
				goHome();
			}
		} else {
			wrongPassword();
			goHome();
		}
		
		return money;
		
	} //deleteMoney
	

	private static int insertMoney(int money, String password) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("비밀번호 4자리 입력 : ");
		String inputPassword = reader.readLine();
		
		if (inputPassword.equals(password)) {
			System.out.print("입금액(숫자만 입력) : ");
			int inputMoney = Integer.parseInt(reader.readLine());
			money += inputMoney;
			System.out.printf("%,d원이 입금되었습니다.\n", inputMoney);
			goHome();
		} else {
			wrongPassword();
			goHome();
		}
		
		return money;
		
	} //insertMoney
	

	private static void goHome() throws IOException {
		System.out.println("계속하시려면 엔터를 입력하세요..");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine();
		
	} //goHome
	
	
	private static void wrongPassword() {
		System.out.println("비밀번호가 일치하지 않습니다. ");
		
	} //wrongPassword


	
}
