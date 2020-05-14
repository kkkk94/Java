/*
 	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Java : 증감연산자 
	Version : 1.0
 */
package java0511;

public class ex04_calculationcoperation {

	public static void main(String[] args) {
		//정수형 변수를 2개 선언
		//+, -, x, /, % 연산수행
		
		int num1 = 7;
		int num2 = 2;
		int result;
		
		//덧셈
		result = num1 + num2;
		System.out.println("+결과:"+result);
		
		//뺄셈(-)
		result = num1 - num2;
		System.out.println("-결과:"+result);
		
		//곱셈(*)
		result = num1 * num2;
		System.out.println("*결과:"+result);
		
		//나눗셈(/)
		result = num1 /num2;
		System.out.println("/결과"+result);
		
		//나머지(%)
		result= num1 % num2;
		System.out.println("%결과"+result);

	}

}
