package java0528_2;

public abstract class NoteBook extends Computer {
	//Comouter 상속받아서 display만 재정의
	//노트북클래스도 추상클래스 만들기
	
	@Override
	public void display() {
		System.out.println("NoteBook display");
		
	}

}
