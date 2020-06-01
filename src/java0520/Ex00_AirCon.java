/*
 	Date : 2020.05.20
	Author : jisoo 
	Description : 에어컨 클래스
	Version : 1.1
 */
package java0520;

public class Ex00_AirCon {
	
	/*

	 필드(특성, 상태, 속성)
	 */
	String company; 	//데이터타입을 String로 지정
	String color;
	int price;				//데이터타입을 int로 지정
	int size;
	int temp;
	

	/*
	생성자
	
	 클래스명(매개변수){
	 }
	 */
	//생성자는 리턴타입을 쓰지 않는다.
	//기본생성자 : Java 컴파일러가 기본적으로  
	//생성자 메소드가 없으면 하나를 자동으로 만들어준다.
	//매개변수를 써도 되고 안써도 된다 ( 기본생성자)
	//생성자를 생성해 줄때() 안에 넣는 것을 매개변수
//	Ex00_AirCon(){
//	}
//	Ex00_AirCon(String cl){
//		color = cl;
//	}
	//생성자 "오버로딩" : 각각 다른 매개변수로 생성자를 여러 개 만드는 것 (p191)
	//기본생성자
	Ex00_AirCon(){
	}
	//매개변수(int s)
	Ex00_AirCon(int size){
		this.size = size;
		//size 안에 17을 넣는다

	}
	//main클래스에서 객체생성하기
	//매개변수(String company, String color)
	Ex00_AirCon(String company, String color){
		this.company = company;
		this.color=color;
		//처음 입력 값 : company에 입력
		//두번째 입력 값 : color에 입력
		
		//매개변수 순서만 바꿔 사용할 수 있다.
		
		
		}
	//Ex00_AirCon(모든 필드 값 매개변수로 작성)
	Ex00_AirCon(String company, String color,int price,int size,int temp ) {
		this.company = company;
		this.color = color;
		this.price = price;
		this.size = size;
		this.temp = temp;
	}

	
	
	
	//메소드
	void showInfo() {
		System.out.println("\ncompany : " + company 
				+ "\ncolor : " + color + "\nsize : " + size 
				+ "\nprice : " + price + "\ntemp : " + temp);
	}
	
	
	//Main에서 필드값 설정 하면 자동으로 바뀌면서 출력됨.
	
	/*
	 메소드(기능, 동작, 행동,)
	 리턴타입 메소드명(){
	 실행내용
	 }
	 
	 int 타입의 데이터를 반환 → int 메소드명(){  }
	 
	 */
	//메소드 타입을 void로 지정
	void onPower() {
		System.out.println("Power on!");
		
	}
	void offPower() {
		System.out.println("Power off!");
	}
	void upTemp() {
		temp++;
	}
		void downTemp() {
			temp--;
		}
		int addUser() {				
			System.out.println("유저추가");
			return 0;
			//void가 아니면 return값을 받는다.
			//int가 void로 바뀜
			
		}
	}

