package com.test.servlet;

import java.util.Scanner;

public class Temp {

	public static Scanner scanner = new Scanner(System.in);

    public static void testCase(int caseNum)
    {   //하나의 테스트케이스를 처리하는 함수 
        //각 테스트케이스에 대하여 데이터를 입력받고 정답을 출력하세요
				int ln = scanner.nextInt();
				int[] temp = Integer.parseInt(scanner.nextLine().split("-"));
        
    }

    public static void main(String[] args)
    {   //프로그램의 시작부 
        int tn = scanner.nextInt(); //테스트케이스의 수를 입력받는다
        for(int caseNum = 1 ; caseNum <= tn ; caseNum++)
        {   //테스트케이스의 수 만큼 반복 수행한다
            testCase(caseNum);
        }
    }
	
}
