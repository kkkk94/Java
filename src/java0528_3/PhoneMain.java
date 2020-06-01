package java0528_3;

public class PhoneMain {

	public static void main(String[] args) {
		//기능 : 3가지 방법으로 출력하기(2번보단 1번). 객체생성, 자동타입변환(비추), 유틸클래스 사용(추천)
		//1.아이폰
		//2.갤럭시
		//3.둘다
		
		IPhone I = new IPhone();
		Galaxy G = new Galaxy();
		
		
		
		System.out.println("객체생성");
		I.getPrice();
		System.out.println("가격 : " + I.getPrice());
		I.getBrend();
		System.out.println("제조사 : " + I.getBrend());
		I.getName();
		System.out.println("이름 : " + I.getName());
		
		
		
		System.out.println();		
		System.out.println("타입변환");
		SmartPhone smtp = null;
		smtp = new Galaxy();
		
		I.getPrice();
		System.out.println("가격 : " + G.getPrice());
		I.getBrend();
		System.out.println("제조사 : " + G.getBrend());
		I.getName();
		System.out.println("이름 : " + G.getName());
		
		
		
		
	
		System.out.println();
		System.out.println("다형성(유틸클래스)");
		
		PhoneInfo Pinfo = new PhoneInfo();
		Pinfo.phoneInfo(I);
		System.out.println();
		Pinfo.phoneInfo(G);
		
		
		
		
		
		

	}

}
