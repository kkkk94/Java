/*
 	Date : 2020.05.13
	Author : jisoo 
	Description : forSnumToLnum
	Version : 1.1
 */
package java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {

	public static void main(String[] args) {
		//for문 사용해서 두개의 정수(시작값,끝나는값)를 입력받아서 
		//총합을 구하는 프로그램을 만들어 보시오.
		
		Scanner sc = new Scanner(System.in);
		
		int start;
		int end;
		int sum =0;
		
		System.out.println("시작값 : ");
		start = sc.nextInt();	
		System.out.println("종료값 : ");
		end = sc.nextInt();
		
		
		for(int i=start; i<=end; i++){
			sum = sum + i;		//sum +=i;
			//System.out.print(i);  //12345678910 으로 출력
			//System.out.println("+"); // 1+2+3+4+5+6+7+8+9+10+ 으로 출력
			
//			if(i==end){
//				System.out.println(i + "=" + sum);  //println 한줄띄기
//				
//			} else {
//				System.out.print(i + "+" ); //print 이어서 작성
//			}
//			
//			//다른방법
//			//if(i<lNum) {
//			//System.out.print("+");
//		//	} else { //i >=lNum
//	
//		}
//		System.out.println("시작값부터 종료값의 총합은" + sum);
//		
		}
	} 
}
