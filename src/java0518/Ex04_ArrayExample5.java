/*
 	Date : 2020.05.18 
	Author : jisoo 
	Description : 2차원 배열 고등학교 성적표
	Version : 1.0
 */
package java0518;

import java.util.Scanner;

public class Ex04_ArrayExample5 {
	
	public static void main (String[] args) {
		
		//1.스캐너를 이용하여 / 고등학교 3년간의 학기별 점수를 입력하고 /
		//2.총점을 출력
		//3.고등학교 성적의 평균 출력
		
		double scores[][] = new double[3][2]; //1~3학년, 1~2학기
		Scanner sc = new Scanner(System.in);
		
		double sum =0;
		System.out.println("성적을 입력하세요");
		
		for(int i =0; i<scores.length; i++) {		//학년을 나타내기 위한 반복문
			//scores.length=>학년
			for(int j=0; j<scores[i].length; j++) {		//학기를 나타내기 위한 반복문
				//scores[i].length=>학기 (i학기)
				
				System.out.println((i+1) + " 학년 " + (j+1) + " 학기 점수입력 ");
				scores[i][j]=sc.nextDouble();
				sum += scores[i][j];
				
			}
		}
		double avg = sum / (scores.length*scores[0].length);
//		System.out.println("scores.length : " + scores.length);//행 확인:3
//		System.out.println("scores[0].length : " + scores[0].length);//열 확인:2
		System.out.println(" 총점 : " + sum + " 평균 : " + avg );
	}

}
