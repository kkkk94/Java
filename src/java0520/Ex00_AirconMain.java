package java0520;

import java.util.Scanner;

//import java0519_1.Ex01_Aircon1;
//import 패키지명, 클래스명;
//같은 패키지일 경우 따로 import하지 않아도 된다.

public class Ex00_AirconMain {
	//클래스는 한 파일에 두 개 이상도 선언도 가능
	//파일당 하나의 클래스만 선언

	public static void main(String[] args) {
		
		int num;
		num = 10;
		//Ex01_AirCon airCon; //필드선언
		//airCon = new Ex01_AirCon(); //객체생성
		
		int num11;
		//Ex00_AirCon airCon = new Ex00_AirCon();
		Ex00_AirCon airCon = new Ex00_AirCon();
		System.out.println("airCon.color : " + airCon.color);
		
		//클래스명 객체명 = new 클래스명(); (객체를 만든다)
		
		//Scanner sc = new Scanner(System.in);
		//Ex01_Aircon1 airCon1= new Ex01_Aircon1();
		
		//변수초기화
		//객체의 멤버(필드)에 접근 방법 : . (도트연산자)사용
		
//		airCon.color = "Purple";	//에어컨색깔
//		airCon.temp = 20;	//에어컨온도
//		airCon.price = 160;	//에어컨가격
		
		System.out.println("airCon.color : " + airCon.color);
		System.out.println("airCon.temp : " + airCon.temp);
		System.out.println("airCon.price : " + airCon.price);
		System.out.println();
		
		//메소드 호출
		//객체의 멤버(메소드)에 접근방법 :  . 도트 연산자 사용
		airCon.onPower();
		airCon.offPower();
		System.out.println("=====================");
		airCon.downTemp();
		System.out.println("현재온도(down) : " + airCon.temp);
		airCon.upTemp();
		System.out.println("현재온도(up) : " + airCon.temp);
		
		
		
	}

}

