/*
 	Date : 2020.05.08 
	Author : jisoo 
	Description :입력 
	Version : 1.0
 */
package java0511;

import java.util.Scanner;
//2.Scanner 클래스는 java.util 패키지에 있는 입력 클래스

public class ex08_Scanner {

	public static void main(String[] args) {
		//1.스캐너를 사용하기 위해 스캐너 객체 선언
		Scanner sc = new Scanner(System.in); //in : 입력할때 사용
		//Scanner scan = new Scanner(System.in); 이렇게 써도 가능
		
		String name;
		int age;
		String address;
		//임의로 정한것들
		
		System.out.println("println");
		System.out.println("print");
		System.out.println("두 개의 차이점 확인");
		
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		//3.변수에 입력한 값을 담는다.
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		sc.nextLine().trim();
		//trim() : 앞뒤 공백을 제거한다.
		
		System.out.println("주소를 입력하세요");
		address = sc.nextLine();
		
		System.out.println();
		System.out.println("========출력내용==========");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + address);
		
		

		
	}

}
