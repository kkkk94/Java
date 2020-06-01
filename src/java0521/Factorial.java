package java0521;

public class Factorial {
// 40-32/2=4
	//4! (4x3x2x1) = 24
	
	/*
	 메소드
	 1.int getFactorial (int num)
	 매개변수로 전송된 숫자의 팩토리얼 값을 구해서 리턴하기
	 //int = 5 인경우 5*4*3*2*1
	  
	  2.int gerPower(int num)
	  매개변수로 전송된 값까지 제곱의 합을 구해서 리턴하기
	  int num = 3인 경우 1*1 + 2*2 + 3*3]
	  
	 for문 사용
	 */
	
	int num;
	int fact = 1;
	int multi = 0;
	
	Factorial(int num){
		this.num = num;
	}
	
	int getFactorial(int num) {
		int fact = 1;
		
		for(int i=num; i>0; i--) {
			//fact = fact * i ;
			fact *= i;
			
			if(i==1) {
				System.out.print(i + " = ");
			}else {
				System.out.print(i + " * ");
			}
		}
		return fact;
		
	}
	
	//2.int gerPower(int num)
	//매개변수로 전송된 값까지의 제곱의 합을 구해 리턴
	//int num = 3인 경우 1*1+2*2+3*3
	
	int getPower(int num) {
		int multi = 0;
		for(int i=1; i<=num; i++) {
			multi += i*i ;
	
		if(i==num) {
			System.out.print(i + "*" + i + " = ");
		}else {
			System.out.print(i + "*" + i + " + ");
		}
			
		}
	return multi;
	
	
}
}
