/*
 	Date : 2020.05.14 
	Author : jisoo 
	Description : DoWhile문 예제( Up & Down게임 )
	Version : 1.0
 */
package java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		// 3번안에 맞추면 통과
		// 그 이후에 맞추면 벌칙

		int answer = (int) (Math.random() * 45) + 1; // 랜덤숫자
		int input = 0; // 정답
		int count = 0;// 시도한 횟수
		boolean run = true; // 몇번만에 맞추는지

		Scanner sc = new Scanner(System.in);
		System.out.println("Up & Down게임 시작!");

		do {
			System.out.println("1부터 45까지 숫자를 말하세요");
			input = sc.nextInt(); 	// 1-45까지의 숫자 중 한 숫자를 입력
			count++; 				// 시도한 횟수 증가

			if (answer > input) { 														// 랜덤숫자가 말한 숫자보다 클 경우 (조건식이 참일 경우)
				System.out.println("Up! 더 큰 수를 말하세요"); 					// 더 큰 수를 말하라는 명령
			} else if (answer < input) { 												// 랜덤숫자가 말한 숫자보다 작을 경우
				System.out.println("Down!더 작은 수를 말하세요");				// 더 작은 수를 말하라는 명령(조건식 2가 참일 경우)
				
			} else { 																		// 조건식 1과 2가 거짓일 경우
				System.out.println("정답은" + answer + " 입니다 "); 			// 1.정답을 맞췄을때
				System.out.println("시도한 횟수는" + count + "번 입니다. "); // 시도한 횟수
			}
				if(count<=3) {  //3번안에 맞추면 통과, 그 이후에 맞추면 벌칙
					System.out.println("통과입니다");
				
				
				}else {
					System.out.println("벌칙입니다");
				
				run = false;
				//break;
				
				}}

		while (run); // 종료
		
//		if(count<=3) {  //3번안에 맞추면 통과, 그 이후에 맞추면 벌칙
//		System.out.println("통과입니다");
//	
//	
//	}else {
//		System.out.println("벌칙입니다");

				
		
		}
}
