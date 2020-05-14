package java0514;

import java.util.Scanner;

public class Ex05_ArraryEx {
	
	public static void main(String [] args) {
		//3열 1차원 배열을 선언하고
		//3개의 값을 입력받아서 
		//입력받은 값의 총합, 평균을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = new int[3];    
		int sum = 0;
		//arr.length = 3;
		
		System.out.println("정수"+arr.length+"개를 입력하시오");
		
		//for문 사용
		for(int i=0; i<arr.length; i++) {	
			System.out.println(i+1 + "번째 정수를 입력하세요");
			arr[i]=sc.nextInt(); 
			//arr[0] <=입력값1
			//arr[1] <=입력값2
			//arr[2] <= 입력값3
			
			sum+=arr[i];
			//arr[0] 일때 sum = 입력값1
			//arr[1] 일때 sum = 입력값1+입력값2
			//arr[2] 일때 sum = 입력값1+입력값2+입력값3
			
		}
		 
		//double avg = sum/arr.length;		//소수점X
		double avg = (double)sum / arr.length; //소수점까지
	
		
		System.out.println(" 총합은 "+ sum );
		System.out.println(" 평균은 " + avg );
		
		
	}

}
