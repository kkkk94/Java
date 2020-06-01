package java0528_2;

public class ComputerMain {

	public static void main(String[] args) {
		/*
		 1.추상클래스는 객체(인스턴스)를 생성하지 못한다
		 2.추상클래스는 단순히 상속만을 하기 위해 만든 클래스다.
		 3.하위클래스가 어떤 클래스냐에 따라 구현코드를 다르게 한다.  (어려우면 넘겨도 되는 부분)
		 */
		
		//Computer, DeskTop, NoteBook, MyNoteBook 객체 만들기
		
		//Computer C = new Computer();	//추상클래스라서 안됨
		DeskTop D = new DeskTop();
		//NoteBook N = new NoteBook();		//추상클래스라서 안됨
		MyNoteBook M = new MyNoteBook();
		
		//3가지 방법으로 display(), typing() 호출
		//객체생성
		System.out.println("객체생성");
		D.display();
		D.typing();
		M.display();
		M.typing();
		
		//자동 타입 변환
		System.out.println();
		System.out.println("자동 타입 변환");
		
		Computer C = null;
		//com = new DeskTop;
		
		C = new DeskTop();
		C.display();
		C.typing();
		M.display();
		M.typing();
		
		//다형성(유틸클래스)
		System.out.println();
		System.out.println("다형성(유틸클래스)");
		
		ComputerInfo Cinfo = new ComputerInfo();
		Cinfo.computer(D);
		Cinfo.computer(M);
		
		
	}

}
