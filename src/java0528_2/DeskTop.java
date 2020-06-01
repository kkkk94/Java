package java0528_2;

public class DeskTop extends Computer{	//빨간줄 맨위에꺼 클릭
	//computer 상속
	
		//display()
		//sysout => "DeskTop display()"
		
		//typing()
		//sysout => "DeskTop typing()"
	

	@Override
	public void display() {
		System.out.println("DeskTop display");
		
		
	}

	@Override
	public void typing(){
		System.out.println("DeskTop typing");
		
	}
	
}
