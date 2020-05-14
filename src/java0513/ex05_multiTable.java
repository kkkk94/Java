/*
  	Date : 2020.05.13
	Author : jisoo
	Description : 구구단
	Version : 1.0
 */
package java0513;

public class ex05_multiTable {
	
	public static void main(String [] args) {
		//중첩for문을 이용하여 2단부터 9단까지의 구구단을 작성해라
/*

		int result;
		
		for(int i=1; i<=9; i++) {					//2단부터 9단 (i=2 초기화식, i<=9조건식, i++증감식)
			for(int j=2; j<=9; j++){ 				//j<=9가 n*1,n*2~n*9를 뜻함 (j=1부터 시작, j가 9까지의 조건, j++증감)
				result = i * j;							//결과 : i (2단~9단) * j ( 1~9) 
															//result를 안썼을때 출력칸에 그냥 i*j로 써도 됨
				
				//System.out.println(i + " X " + j + " = " + result);	//세로로 작성
				
				
				//System.out.print(i + " X " + j + " = " + result);   //가로로 작성
				System.out.print(j + " X " + i + " = " + result);    //세로로 작성 , for문에서 i값과 j값도 바꿔줘야 한다. (i=1, j=2로)
				System.out.print("\t\t");
			}
			System.out.println();		
	}
	*/
		//응용문제1
		//홀수만 출력
		
//		for(int i=2; i<=9; i++) {
//			if(i%2==0) {
//				continue;
//			}
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "X" + j + "=" + i*j);
//		}
//			System.out.println("=========================");
		
		//응용2
		for(int i=1; i<=9; i++) {
			
			for(int j=2; j<=9; j++) {
				if(i%2==0) {
					continue;
				}
				int result = i * j;
				System.out.print(j + " X " + i + " = " + result);  //곱하기랑 = 양쪽 띄어주기
				System.out.print("\t");
			}
			System.out.println();
		
		

			}
				}
			

}
		
	

