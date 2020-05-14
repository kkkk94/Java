/*
 	Date : 2020.05.14 
	Author : jisoo 
	Description : while문 예제2
	Version : 1.0
 */
package java0514;

import java.util.Scanner;

public class ex01_WhileEx {
	
	   //While문 사용(1-4번 반복적으로 나오게)
		//switch-case문 사용
	
	public static void main (String [] args) {
		int account=0;  										//통장 0원
		int balance; 											 //(잔고)
		boolean run = true;						//while문 사용하기 위해서 run(조건변수)선언 ,true 초기화
		int menu;  									//1-4번
						

		
		Scanner sc = new Scanner(System.in);
		
		//while문 사용
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-----------------------------------");
			System.out.println("번호를 입력하세요");
			menu = sc.nextInt();		//menu 변수선언, 입력
			
			//switch-case문 사용
			switch(menu) {
			case 1 : 
				System.out.print("예금액을 넣어주세요");
				//int a = sc.nextInt();
				//account = +=a;
				account += sc.nextInt();														//돈을 넣어야 하니까 +, 예금액 입력
				break;																								//switch문 탈출
				
				
			case 2:
				System.out.println("출금액을 입력하세요");
				account -= sc.nextInt();																					//출금이니까 -
				break;
				
			case 3:
				System.out.println("잔고액은 : " + account + "입니다");
				break;
				
			case 4:
				run = false; 																						//4 입력 시 run값이 false로 변한다.
				break; 																									//여기서 break를 사용하면 나갈 수가 없음.
				
				default:																								// default : case에서 어떤 조건도 맞지 않을 때 실행 + break;
					System.out.println("다시 입력해 주세요");
					break;
				} //switch문 종료
			
			System.out.println("switch문 종료");   
							
			
				}
		
		System.out.println("프로그램을 종료합니다");
		}
		}


