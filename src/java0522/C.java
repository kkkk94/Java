package java0522;

public class C extends A{	//extends A 작성 , C클래스가 A클래스 상속
									//C가 자식, A가 부모

	public static void main(String[] args) {
		A a = new A();
		
		a.public1 = 10;	
		a.protected1 = 10;
		a.default1 = 10;	//상속 받았을 때 실행
		//a.private1 = 10;
		
		//메소드 불러오기
		a.public2();
		a.protected2();
		a.default2();
		//a.private2();

	}

}
