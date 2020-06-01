package java0521;

import java.util.Scanner;

public class FactrorialMain {

	public static void main(String[] args) {
		// 숫자를 입력받아서 getFactorial 함수 호출
		//getPower 함수 호출

		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int number = sc.nextInt();
		
		Factorial fc = new Factorial(number);
		System.out.println(fc.getFactorial(number));
		System.out.println(fc.getPower(number));
		

		
		
	}

}
