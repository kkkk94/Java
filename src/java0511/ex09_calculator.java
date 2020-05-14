/*
 	Date : 2020.05.08 
	Author : jisoo 
	Description :계산기 
	Version : 1.0
 */
package java0511;

import java.util.Scanner;


public class ex09_calculator {

	public static void main(String[] args) {
			//두 개의 정수를 입력받아서 결과를 출력

		int num1;
		int num2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력 : ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력 : ");
		num2 = sc.nextInt();
		
		//+ - x / %
		result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		
		result = num1 - num2;
		System.out.println("뺄셈 결과 : " + result);
		
		result = num1 * num2;
		System.out.println("곱셈 결과 : " + result);
		
		result = (double)num1 / num2; //(double)num1=10.0
		System.out.println("나눗셈 결과 : " + result);
		
		result = num1 % num2;
		System.out.println("나머지 결과 : " + result);
		
		
	}

}
