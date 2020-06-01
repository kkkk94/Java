package java0528_1;

public abstract class Animal { //abstract 추가 ( →접근제한자 뒤, 클래스 앞에도 abstract를 선언해야 오류 해결 )
	

	/*
	 추상클래스(abstract calss)
	 구체적이지 않은 클래스
	 추상메소드를 꼭 포함해야 한다
	 추상메소드 재정의(자식클래스에서 반드시 재정의 해야함)
	 자식메소드(실체클래스)의 규격을 정의
	 : 메소드를 어떻게 구체화 할 지 틀을 제공
	 ex)동물은 소리를 낸다
	 추상메소드는 객체를 생성할 수 없다. (Main)
	 
	 abstract void 메소드명();
	 
	 */
	
	//메소드
	void breath() {
		System.out.println("숨을 쉽니다");
	}
	//추상메소드
	abstract void sound();

	//{구현부}없이 이름만 선언하는 메소드
	//메소드 맨 앞에 abstract 를 붙인다.
	
}
