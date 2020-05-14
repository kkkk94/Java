package java0513;

public class ex03_continue {
	
	public static void main (String[] args) {
		
		
		/*
		 continue문은 반복문과 함께 사용
		 
		반복문 안에서 continue문을 만나면 이후 문장은 수행하지 않고
		for문의 증감식을 수행한다.
		
		for(초기화식;조건식;증감식){
		
				특정조건
				continue;
				
				반복문 수행
				}
		*/
//		
//		
//		for(int i=1; i<=10; i++) {
//		
//		
//			if(i%2 == 0) {
//				continue;
//			}
//			System.out.println(i);  //1 3 5 7 9
//		
//		
//	}
		//1부터 100까지 숫자중에 짝수의 합을 구하는 문제
	
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if (i%2==1) {
				continue;
			}
			sum += i;	
			
		}
			//System.out.println("1부터 100까지의 합 : " + sum);
		System.out.println("1부터 100까지의 합 : " + sum);
			
	}
}


