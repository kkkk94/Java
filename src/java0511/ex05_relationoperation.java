/*
 	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Description : Java 기본설정 (설명)
	Version : 1.1
 */

package java0511;

public class ex05_relationoperation {

	public static void main(String[] args) {
		//정수형 변수 2개 선언
		int num1 = 7;
		int num2 = 2;
		
		//>,<,<=,>=,==,!=연산 수행
		boolean result;
		
		result = num1 > num2;
		System.out.println(">결과 : "+ result);
		
		result = num1 < num2;
		System.out.println("<결과 : "+ result);
		
		result = num1 <= num2;
		System.out.println("<=결과 : "+ result);
		
		result = num1 >= num2;
		System.out.println(">=결과 : "+ result);
		
		result = num1 == num2;
		System.out.println("==결과 : "+ result);
		
		result = num1 != num2;
		System.out.println("!=결과 : "+ result);
		
		
		

	}

}
