/*
 	Date : 2020.05.15 
	Author : jisoo 
	Description : 배열최댓값찾기
	Version : 1.0
 */

package java0515;

import java.util.Scanner;

public class Ex04_ArrayMAx {
	
	public static void main(String [] args) {
		//5열짜리 1차원 배열을 선언 (5개 집이 있다)
		//스캐너를 이용하여 값 5개를 입력
		//입력한 값중 가장 큰값을 구하는 문제
		
		int[]arr = new int[5];	//나중에 값이 들어오는 배열 만들 것 (5)
		Scanner sc = new Scanner(System.in);
		
		int max = 0;		//가장 큰값 선언
		int num; 			//입력받을 정수 선언
		
		System.out.println("정수" + arr.length + "개를 입력해주세요>>");
		
		for(int i=0;i<arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;		//입력받은 정수를 arr[i]에 저장
			//arr[1] = 2
			
			//System.out.println("입력받은 정수는" + arr[i] + "입니다");
			System.out.println("입력받은 정수 arr["+i+"] = " + arr[i]  );   //심화
				
			
			//최대값 찾기
//			if(arr[i] > max) {
//				max = arr[i];
//			}
			
			//max = (arr[i] > max ) ? arr[i] : max;
			//(arr[i]가 크면 max = arr[i]
			//max가 크면 max = max;
		}
		//System.out.println("가장 큰 수는" + max + "입니다");
	}

}
