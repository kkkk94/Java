/*
 	Date : 2020.05.15 
	Author : jisoo 
	Description : 배열찾기
	Version : 1.0
 */
package java0515;

import java.util.Scanner;

public class Ex02_ArraySearch {
	
	public static void main(String [] args) {
		
		int num[] = {8, 2, 6, 1, 9, 3, 4, 10, 7, 5};		//1~10까지 변수값 지정
		
		int value;														//값
		int index = 0;												//몇번째에 있는지
		
		Scanner sc = new Scanner(System.in);							//입력하기 위해 선언
		System.out.println("1~10사이 숫자 입력");						//출력
		value = sc.nextInt();												//값(1~10사이)을 입력
		
		for(int i=0; i<num.length; i++) {					
			if(value==num[i]) {												// 값이 num과 같은지 확인
				index = i+1;														// index는 몇번째에 있는지 확인
			}
		}
		System.out.println(value + "는" + index + "번째 있다");		//출력 ( 값은 몇번째(index=i+1)에 있다)
	}

}
