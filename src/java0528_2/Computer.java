package java0528_2;

public abstract class Computer {
//추상메소드
	//display(), typing()
	
	//메소드
	//turnOn(), turnOff()
	
	//public, void
	
	public void turnOn() {		
		System.out.println("전원을 킵니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
		
		
	}
	public abstract void display();
	public abstract void typing();
	
}
