package java0522;

public class B {

	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		
		a.public1 = 10;
		a.protected1 = 10;
		a.default1 = 10;
		//a.private1 = 10;		//자기 클래스
		
		//메소드 불러오기
		a.public2();
		a.protected2();
		a.default2();
		//a.private2();
	}

}
