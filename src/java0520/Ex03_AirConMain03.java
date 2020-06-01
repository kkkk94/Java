package java0520;


//Ctrl + shift + S 전체저장

public class Ex03_AirConMain03 {

	public static void main(String[] args) {
		Ex00_AirCon airCon = new Ex00_AirCon(); 
		//기본생성자
		
		
		//Ex00_AirCon : 불러온class이름 ( 압축파일 ) 
		//airCon : 객체이름(아무거나가능) ( 압축파일 이름 )
		//new : 새로운 생성자(객체)를 만들겠다는 뜻
		//Ex00_AirCon(); : 기본생성자
		
		Ex00_AirCon ac = new Ex00_AirCon(17);
		//매개변수(int s)
		//int s = 17;
		//불러온class이름, ac= 객체이름, 가져오는 생성자 (매개변수)	
		
		airCon.showInfo();
		ac.showInfo();
		
		Ex00_AirCon AC = new Ex00_AirCon("LG", "white");
		AC.showInfo();
		
		Ex00_AirCon all = new Ex00_AirCon("삼성", "black",10,150,20);
		all.showInfo();
		
		//숫자는 ""없이 쓰기
		
		
		
		
		System.out.println("ac.size : " + ac.size);
		//ac.size 출력
		
	}

}
