/*
	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Description : Java 기본설정 (설명)
	Version : 1.0
 */

package java0508;

public class ex02_char {

	public static void main(String[] args) {
		
		// 문자형 변수타입 char(2byte)
		char ch1;
		ch1 = 'A'; //65
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int)ch1);
		//문자형을 숫자로 바꿀때 변수명 앞에 (int)
		
		char ch2 = 'B'; //66
		System.out.println((int)ch2);
		
		char ch3 = 'a'; //97
		char ch4 = 'b'; //98
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		
		int num1 = 65;
		System.out.println((char)num1);
		// 숫자를 문자형으로 바꿀 때 변수명 앞에 (char)
		
		
		//본인 이름을 숫자로 표시
		char ch5 = '강'; //숫자 몇인지 표시
		char ch6 = '지';
		char ch7 = '수';
		System.out.println((int)ch5);
		System.out.println((int)ch6);
		System.out.println((int)ch7);
		
		int num2 = 44053;
		System.out.println((char)num2);
		int num3 = 51648;
		System.out.println((char)num3);
		int num4 = 49688;
		System.out.println((char)num4);
				
		char ch8 = '知';
		System.out.println((int)ch8);
		
		
		
		

	}

}
