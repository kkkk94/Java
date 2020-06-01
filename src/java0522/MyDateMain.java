package java0522;

import java.util.Scanner;

public class MyDateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//입력 
		MyDate today = new MyDate();
		
		System.out.println("년을 입력하세요");
		int year = sc.nextInt();
		today.setYear(year);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		today.setMonth(month);
		
		System.out.println("일을 입력하세요");
		int day = sc.nextInt();
		today.setDay(day);
		
		System.out.println("## 확인중 ## \n " + today.toString());
		System.out.println(today.getYear() + "년" + today.getMonth() + "월" + today.getDay() + "일");
		System.out.println();
		System.out.println(today.isValid());
		
			}

}
