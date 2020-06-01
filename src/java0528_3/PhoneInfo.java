package java0528_3;

public class PhoneInfo {

	//구현메소드
	void phoneInfo(SmartPhone smtp) {
		System.out.println("이름 : " + smtp.getName() );
		System.out.println("제조사 : " + smtp.getBrend());
		System.out.println("가격 : " + smtp.getPrice());
		
//		smtp.getPrice();
//		smtp.getBrend();
//		smtp.getName();	이거 쓰면 출력 안됨
	}
}
