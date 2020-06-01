package java0515;

import java.util.Scanner;

public class Ex01_CoinChange {
	
	public static void main(String [] args) {
		//동전 갯수를 구하는 예제
		//어떤 금액을 입력하게 되면 각 동전이 몇개씩 필요한지 출력하는 문제
		//배열을 이용해서 해결 / for문

		//ex. 2680원 
		//500원 : 5개
		//100원 : 1개
		//50원 : 1개
		//10원 : 3개
		

		
		
		//2680 - 2500(500X5) = 180
		//180 - 100(100X1) = 80
		//80 - 50(50X1) = 30
		//30 - 30(10X3) = 0
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		
		int[] coin = {500,100,50,10};  //coin 0번부터 3번
		//coin[0] = 500
		//coin[1] = 100
		//coin[2] = 50
		//coin[3] = 10
		
		//for(int i=0; i<=coin.length-1; i++) {	
		for(int i=0; i<coin.length; i++) {	
			int cCount = money / coin[i];
			System.out.println(coin[i] + "원은" + cCount + "개");
			
			//2680-2500(500X5)
			money -= coin[i] * cCount;
			//money = money % coin[i];
			
			System.out.println("남은 금액 : " + money );
			
			
		


		}

	}

}
