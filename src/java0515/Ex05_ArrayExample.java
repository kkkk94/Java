/*
 	Date : 2020.05.15 
	Author : jisoo 
	Description : 배열 연습문제
	Version : 1.0
 */

package java0515;

import java.util.Scanner;

public class Ex05_ArrayExample {
	
	public static void main (String [] args) {
		//학생 수는 while문 안에서
		//메뉴 입력할 때 => int menu = sc.nextInt();
		//학생 수 입력할 때 => int stuNum = sc.nextInt();
		//scores = new int[stuNum];
		//점수입력,출력할때 for문
		
		int[] scores = null;
		boolean run = true;
		
		int menu;
		int num=0;
		int stuNum=0;
		
		
		
		Scanner sc = new Scanner (System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------------------");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("학생수");
				stuNum = sc.nextInt();
				
				break;
				
			case 2:
					//scores=new int[stuNum];
					//stuNum == scores.length
				scores=new int[stuNum];
				 	for(int i=0; i<scores.length; i++) {
					System.out.println((i +1)+ "번 학생 점수");
					scores[i] = sc.nextInt();
					
				}
				
				break;
			case 3:
				System.out.println("점수리스트");
				for(int i=0; i<scores.length; i++) {
				System.out.println( (i +1)+"번 학생 점수 : " + scores[i] );
					//(i +1)+
				}
				break;
				
			case 4:
				int sum = 0;
				int max = 0;
				double avg = 0;
				
				for(int i=0; i<scores.length; i++) {
					
					if (scores[i] > max) {
						max = scores[i];
						
						//최댓값 2번
						//max = (scores[i] > max ) ? scores[i] : max;
						
						//총점
						sum+= scores[i];
					}
					
					System.out.println("최고점수 : " + max);
					avg = (double)sum / scores.length;
					System.out.println("평균점수 : " + avg);
				}

				break;
				
			case 5:
				System.out.println("종료");
				run = false; 																						
				break; 																									
				
				default:																							
					System.out.println("다시 입력해 주세요");
					break;
				
			}
			
		}
		System.out.println("프로그램을 종료합니다");
		//sc.close();

	}
}

