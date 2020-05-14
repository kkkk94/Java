/*
  	Date : 2020.05.08
	Author : jisoo
	Description : ifexample02
	Version : 1.0
 */
package java0512;

import java.util.Scanner;

public class ex01_ifexample02 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 국어,영어,수학점수를 입력받아서 총점,평균을 구하시오
		// 평균점수를 이용하여 A+,A,B+,B,C+,C,D+,D,F
		// 프로그램 만들기 ( 총점과 평균은 실수형으로)
		// A+ : 95~100
		// A : 90~94
		// B+ : 85~89
		// B : 80~84
		// C+ : 75~79
		// C : 70~74
		// D+ : 65~69
		// D : 60~64
		// F : 60 미만

		Scanner sc = new Scanner(System.in);
		double korscore;
		double engscore;
		double matscore;   //int kor,eng,mat;

		double sum;			//double sum,avg;
		double avg;

		String grade;

		System.out.println("국어 점수를 입력하세요");
		korscore = sc.nextInt();

		System.out.println("영어 점수를 입력하세요");
		engscore = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		matscore = sc.nextInt();

		sum = korscore + engscore + matscore;  //위치는 항상 입력받은 값 아래
		avg = sum / 3;

		if (avg <= 100) {
			if (avg >= 90) {

				if (avg >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (avg >= 80) {
				if (avg >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}

			} else if (avg >= 70) {
				if (avg >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}

			} else if (avg >= 60) {
				if (avg >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			System.out.println("당신의 총점은" + sum + "입니다");
			System.out.println("당신의 평균은" + avg + "입니다");
			System.out.println("당신의 학점은" + grade + "입니다");
			
		} else {
			System.out.println("입력범위를 초과했습니다");
		}


	}

}

