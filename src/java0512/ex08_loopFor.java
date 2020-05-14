/*
  	Date : 2020.05.08
	Author : jisoo
	Description : 반복문 for (loopFor)
	Version : 1.0
 */
package java0512;

public class ex08_loopFor {

	public static void main(String[] args) {
		//안녕하세요 간략히 10번 출력

		//System.out.println("안녕하세요!");
		//반복문 for
		/*
		 for(초기화식; 조건식; 증감식;){
		 	반복할 수행문
		 }
		 
		 */
		int i;
		
		for (i=1; i<=10; i++) {				
			System.out.println(i + "안녕하세요!");
			
		}
		//i = inum(10번) + 1
		System.out.println("반복문 이후 i값 : " + i );
		
		//1부터 10까지 합을 출력
		int sum=0;
		for(i=1; i<=10; i++) {
			sum +=i;			//sum = sum + i;
			System.out.print("i : " + i + "\t=>");
			System.out.println("\t: " + sum);
			
		}
		System.out.println("1부터 10까지 합은"  + sum );
		

	}

}
