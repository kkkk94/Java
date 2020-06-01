/*
 	Date : 2020.05.20
	Author : jisoo 
	Description : 윤년 구하기 ( 97p) ( parseInt 정리 )
	Version : 1.1
 */
package java0520;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		//int year = Integer.parseInt(args[0]); 
		//args[0]은 String 타입
		//args[0]대신에 String 타입 데이터 입력
		int year = Integer.parseInt("2023"); 
		System.out.println("Integer.parseInt : " + year);
		
		boolean leapYear = false;
		leapYear = (year%4==0 && year % 100 != 0 || year % 400 == 0);
		
		if(leapYear) {
			System.out.println(year + "년은 윤년입니다.");
			
		}else {
			System.out.println(year + "년은 윤년이 아닙니다");
	

	}
	}

}
