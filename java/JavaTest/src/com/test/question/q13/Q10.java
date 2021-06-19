package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Q10
		//마방진
		
		//마방진(Magic Square)
		// - 1부터 n*n까지의 숫자를 한번씩만 써서 정사각형에 배치
		// - 가로, 세로, 대각선 합이 같다.
		
		//마방진 규칙
		//1. 첫번째 숫자는 1행 중앙에 넣습니다.
		// -> array[0][n/2]
		
		//2. 숫자가 n의 배수이면 바로 아래의 행으로 이동하여 다음의 수를 넣고
		// -> n의 배수이면 다음에 들어갈 배열 위치에는 무조건 값이 있기 때문
		
		//3. 아니면 우측 대각선 방향으로 이동한 곳에 다음 숫자를 넣습니다. 이때 만약 배열의 위치에 벗어난다면 반대 행이나 열에 숫자를 넣습니다.
		
		//4. 빈칸이 모두 채워질떄까지 2,3단계를 반복합니다.
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//행/열 동일값, 홀수만 입력

		System.out.println("n x n 마방진");
		System.out.print("n 입력(홀수만 입력) : ");
		int length = Integer.parseInt(reader.readLine());

		int[][] nums = new int[length][length];
		
		int n = 1;
		
		//1번에 의한 초기값
		int row = 0;
		int column = length/2;
		
		while (n <= length * length) { //행열 크기만큼 루프 돌리기
			nums[row][column] = n;
			
			if (n % length == 0) { //2번 check
				row++;
			} else { //3번(오른쪽 위 -> row감소, column 증가)
				row--;
				column++;
			}
			
			//3번
			if (row < 0) { //배열을 벗어나면
				row = length-1; //row값을 배열 최하단값으로 변경
			}
			
			if (row >= length) { //배열을 벗어나면
				row = 0; //row값을 배열 최상단값으로 변경
			}
			
			if (column < 0) { //배열을 벗어나면
				column = length-1; //column값을 배열 우측 끝으로 변경
			}
			
			if (column >= length) { //배열을 벗어나면
				column = 0; //column값을 배열 좌측 끝으로 변경
			}
			
			n++;
	
			
		}

		
		output(nums);
		
	} //main
	
	
	private static void output(int[][] nums) {

		for (int i = 0; i < nums.length; i++) { // 행
			for (int j = 0; j < nums[0].length; j++) { // 열

				System.out.printf("%3d", nums[i][j]);

			}
			System.out.println();
		}

	} //output
	
	
} //Q10
