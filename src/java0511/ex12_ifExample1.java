package java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {

		// 문제 성적출력 예제
		// 점수를 입력받아서 90점 이상이면 "A학점입니다" 출력
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 60 미만

		Scanner sc = new Scanner(System.in);
		int num;

		// int score = sc.next.Int();

		System.out.println(" 점수를 입력하세요 : ");
		num = sc.nextInt();

		if (num >= 90) {
			System.out.println("A학점입니다");

		} else if (num >= 80) {
			System.out.println("B학점입니다");

		} else if (num >= 70) {
			System.out.println("C학점입니다");
		} else if (num >= 60) {
			System.out.println("D학점입니다");

		} else
			System.out.println("F학점입니다");
	}

}
