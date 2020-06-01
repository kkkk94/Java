package java0515;

import java.util.Scanner;

public class Ex06_Array {

	public static void main(String[] args) {
		// 2차원 배열
		// 타입[][] 배열명 = new int[i][j];

		// 타입[] 배열명 = new int[i];

		int[][] num1 = new int[2][3];
		int[][] num2 = new int[3][3];

		num1[0][0] = 1;
		num1[0][1] = 2;
		num1[0][2] = 3;
		num1[1][0] = 4;
		num1[1][1] = 5;
		num1[1][2] = 6;

		for (int i = 0; i < num1.length; i++) {

			for (int j = 0; j < num1.length; j++) {
				// System.out.println("words[" + i + " ][" + j + "] =" + num1 [i] [j]);
			}
		}

		String[][] words = {
					{ "chair", "의자" }, 
					{ "desk", "책상" },
					{ "coffee", "커피" }, 
					{ "computer", "컴퓨터" } 
				};
		Scanner sc = new Scanner(System.in);
		//System.out.println("words.length : " + words.length);

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				//System.out.println();
				//System.out.println("words[" + i + "].length : " + words[i].length);
				//System.out.println("words[" + i + " ][" + j + "] =" + words[i][j]);
				//System.out.println();
				
				// words[i][0] =>> 단어
				// words[i][1] =>> 뜻
				
				
			}
		} // for

		for (int i = 0;  i < words.length;  i++) {
			System.out.println("문제" + (i + 1) +". "+ words[i][0] + "의 뜻은 무엇일까요");
			String answer = sc.next();

			if (answer.equals(words[i][1])) {
				System.out.println("정답입니다");
			} else {
				System.out.println("틀렸습니다");
				System.out.println("정답은" + words[i][1] + "입니다");
			}


		}

	}
}