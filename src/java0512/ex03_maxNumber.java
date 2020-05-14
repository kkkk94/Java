package java0512;

import java.util.Scanner;

public class ex03_maxNumber {
	
	public static void main(String[] args) {
//			//두 수를 입력받아 큰 수를 출력하기
		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2, max;
//		System.out.println("첫번째 숫자 >>");
//		num1 = sc.nextInt();
//		System.out.println("두번째 숫자 >>");
//		num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		System.out.println("최댓값 : " + max);
		
		//숫자 3개를 입력받아서 최댓값 구하기
		
		int num1, num2, num3, max;
		System.out.println("첫번째 숫자>>");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자>>");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자>>");
		num3 = sc.nextInt();
		
//		if(num1 > num2 ) {		//1 과 2가 비교했을 때 = 1이 큼
//			if(num1 > num3) {		//1과 3을 비교했을때 = 1이 큼
//			max = num1;			//최댓값 = 1
//			} else {					//그게 아니면 최댓값 = 3
//				max = num3;
//			}			
//		}else if (num2 > num3){  //2와 3을 비교했을때 = 2가 큼
//			max = num2;			//그러면 최댓값 = 2
//			
//		}else {							//그게 아니면 최댓값 = 3
//			max = num3;
//		}
		


		
		if(num1 >num2 && num1 > num3) {
			max = num1;
		} else if ( num1 > num3) {
			max = num2;
		} else {
			max = num3;
		}
			
		System.out.println("최댓값 : " + max);

//		//최댓값, 중간값, 최솟값 구해보기			
		}
}
