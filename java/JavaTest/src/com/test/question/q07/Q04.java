package com.test.question.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//자판기 프로그램
		
		
		vendingMachine();
		
	}

	private static void vendingMachine() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int cola = 700;
		int cyder = 600;
		int vita = 500;
		
		for(;;) {
			
			System.out.println("========================");
			System.out.println("         자판기       ");
			System.out.println("========================");
			System.out.printf("1. 콜라\t\t : %d원\n", cola);
			System.out.printf("2. 사이다\t : %d원\n", cyder);
			System.out.printf("3. 비타500\t : %d원\n", vita);
			System.out.println("------------------------");
			System.out.print("금액 투입(원)\t : ");
			int cash = Integer.parseInt(reader.readLine());
			System.out.println("------------------------");
			System.out.print("음료 선택(번호)\t : ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num == 1) {
				if (cash >= 700) {
					System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %,d원을 제공합니다.\n\n", cash - cola);
					
					System.out.println("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					if (enter.equals("")) {
						continue;
					}
				} else {
					System.out.println("투입하신 금액이 음료 가격보다 적습니다.\n");
					System.out.println("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					if (enter.equals("")) {
						continue;
					}
				}
			} else if (num == 2) {
				if (cash >= 600) {
					System.out.println("+사이다를 제공합니다.");
					System.out.printf("+잔돈 %,d원을 제공합니다.\n\n", cash - cyder);
					
					System.out.println("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					if (enter.equals("")) {
						continue;
					}
				} else {
					System.out.println("투입하신 금액이 음료 가격보다 적습니다.\n");
					System.out.println("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					if (enter.equals("")) {
						continue;
					}
				}
			} else if (num == 3) {
				if (cash >= 500) {
					System.out.println("+비타500을 제공합니다.");
					System.out.printf("+잔돈 %,d원을 제공합니다.\n\n", cash - vita);
					
					System.out.println("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					if (enter.equals("")) {
						continue;
					}
				} else {
					System.out.println("투입하신 금액이 음료 가격보다 적습니다.\n");
					System.out.println("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					if (enter.equals("")) {
						continue;
					}
				}
			} else {
				System.out.println("번호를 잘못 입력하셨습니다.");
				System.out.println("계속하시려면 엔터를 입력하세요.");
				String enter = reader.readLine();
				if (enter.equals("")) {
					continue;
				}
			}
			
			
		}
		
		
		
	}
	
	
	
}
