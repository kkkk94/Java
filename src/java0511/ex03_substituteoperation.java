/*
 	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Java : 대입연산자 ( assignmentOperation)
	Version : 1.0
 */
package java0511;

public class ex03_substituteoperation {

	public static void main(String[] args) {
		int age = 35;
		int num = 1;
		
		//나이를 의미하는 변수 age가 변수값 35를 대입
		//왼쪽변수 = 오른쪽변수(또는 정수,식)
		//Ivalue(항상 변수) = rvalue (상수,변수,식) 

		age = num;
		age = 1+25; 
		
		//부호연산자 : (+) , (-)
		int num1 = 10;
		
		System.out.println(+num1); //+num : 10
		System.out.println(-num1); //-num : -10
		System.out.println(num1); //num1 : 10
		
		num1 = -num1;
		//num1 = -(10);
		System.out.println(num1);
		
		
		
	}

}
