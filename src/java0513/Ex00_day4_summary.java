/*
 	Date : 2020.05.14 
	Author : jisoo 
	Description : 4일차 정리
	Version : 1.0
 */
package java0513;

public class Ex00_day4_summary {
	
	public static void main(String [] args) {
		//1.반복문 for
		/*
		 for(초기화식; 조건식; 증감식){
		 수행할 반복문 내용
		 }
		 
		 ①초기화식 int i = 1
		 ②조건식 i <=10
		 ③조건식이 참일 경우 수행할 반복문 내용
		                거짓일 경우 반복문 종료
		 ④증감식
		 ⑤조건식
		 
		 2.중첩for문 ex)구구단
		 
		 for (초기화식; 조건식;증감식){
		 
		 		for(초기화식;조건식;증감식){
		 		수행할 반복문 내용
		 		외부 for문 반복내용
		 		//외부 for문 X 내부for문)횟수
		 		 * (외부 : 1단~9단) (내부 : 1~9까지의 숫자)
		 		}
		 		내부 for문 반복내용
		 		내부 for문 횟수
		 }
		 
		 3.continue문 ex) 홀수,짝수 구하기
		 반복문과 함께 사용
		 continue가 실행되면 이후 반복문 내용은 실행되지 않는다.
		 다시 증감식으로 실행
		 
		 for(초기화식;조건식;증감식){
		 
		 수행할 반복문 내용1;
		 continue;
		 
		 수행할 반복문 내용2;
		 수행할 반복문 내용3;
		 }
		 
		 4.별찍기 예제
		 한줄씩 주석 달기 (어떤 부분이고 어떻게 된다 식으로. 원리파악)
		 
		 5.while
		 (1) for 비슷하게 사용
		 
		 초기화식
		 while(조건식){
		 반복할 내용
		 증감식
		 }
		 */
		int i = 0; //초기화식
		while(i<=10) { //조건식
			//System.out.println(i + ""); //반복내용
			System.out.print(i + " ");
			i++; //증감식
		}
		System.out.println();
		System.out.println("while문 이후 i 값 : " + i);
		
		/*
		 (2) 반복횟수 정하지 않고 사용하는 방법
		 
		 boolean 조건변수 = true;
		 while(조건변수){	//조건변수가 참일 경우 반복
		 반복할 내용
		 
		 //반복문 종료
		 1)조건변수를 false로 만들기
		 2)break;
		 }
		 */
		
		
		
	}

}
