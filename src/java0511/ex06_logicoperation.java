/*
 	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Java : 대입연산자 ( assignmentOperation)
	Version : 1.0
 */
package java0511;

public class ex06_logicoperation {

	public static void main(String[] args) {
		//논리연산자 AND연산, OR연산, NOT연산
		
		//AND연산 : && (7)
		//A && B 일때 , A , B 모두 true여야 결과가 true
		//A, B 중에 하나라도 false가 있으면 결과는 false
		
		boolean result;
		result = true && true;
		System.out.println("true && true : " + result);
		
		result = true && false;
		System.out.println("true && false : " + result);
		
		result = false && false;
		System.out.println("false && false : " + result);
		
		result = (5>3) && (3>1);
		System.out.println("(5>3) && (3>1) : " + result);
				
		result = (5<3) && (3<1);
		System.out.println("(5<3) && (3<1) : " + result);
		
		//OR연산 : || 
		//A || B 일때 A, B 중에 하나라도 true 가 있으면 true
		//A,B 모두 false여야 결과가 false
		result = true || true;
		System.out.println("true || true : " + result);
		
		result = false || true;
		System.out.println("false || true : " + result);
		
		result = false || false;
		System.out.println("false || false : " + result);
		
		//NOT연산 : !
		//boolean 변수 앞에 사용하면 true가 false로,  false가 true로 바뀜
		result = true;
		
		result = !result;
		System.out.println("!result : " + result);
		
		result = !result;
		System.out.println("!result : " + result);
		//-(-1) =>>+1
		//!(!result) =>> result
		
		result = !false;
		System.out.println("!false : " +result);
		

	}

}
