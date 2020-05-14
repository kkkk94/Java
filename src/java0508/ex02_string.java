/*
	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Description : Java 기본설정 (설명)
	Version : 1.0
 */
package java0508;

public class ex02_string {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "재미있어";
		String str3 = "너무 어려워";
		//string = 문장
		
		String result;				//변수선언
		result = str1 + str2;	//변수초기화
		System.out.println(result);
		//자바 재미있어
		
		result =  str1 + str3;	//변수초기화
		System.out.println(result);
		//자바 너무 어려워

		result = str1 + 8.0;
		System.out.println(result);
		//자바 8.0
		
		System.out.println(str1+str2);
		System.out.println(str1 + " 너무 " + str2);
		// 자바 너무 재미있어
		
		
	}

}
