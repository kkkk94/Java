package java0513;

public class ex10_while {
	
	public static void main (String[] args) {
		//while
		/*
		 while반복조건{
		 
		 실행 내용
		 }
		 */
		
		//while문으로 1부터 10까지의 합 
		int i= 1;
		int sum = 0;
		
		while(i<=10) {
			sum += i;
			System.out.println(i + " ");
			i++;
			
		}
		System.out.println("sum : " + sum);
		
		//for(초기화식;조건식;증감식)
		//초기화식
		//while(조건식){
		//		증감식
		//}
	}

}
