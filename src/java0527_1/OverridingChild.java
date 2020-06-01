package java0527_1;

public class OverridingChild extends OverridingParent { 					//상속
	
	String size="20평";
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	String parentMethod() {											//int오류 밑줄 - int를 String로
		return "오버라이딩으로 자식메소드 재정의";
	}
	
	
	void pM() {
		System.out.println("pM상속 후 호출");						//이거 지우면 Parent의 Pm호출 출력
	}
	} 
















