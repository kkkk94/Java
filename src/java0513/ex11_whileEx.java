package java0513;

public class ex11_whileEx {
	
	public static void main(String [] args) {
		//while문을 이용해서 주사위를 던졌을 때 (랜덤) 5가 나오면 종료하는 프로그램
		
		
		int cnt = 0;
		boolean run = true;			//boolean ( Y / N ) => true / false
		int dice = 0;
		
		
		//while(false) 일때 반복문 종료.
		//while(false) 일때 반복문 종료.
		
		
		while(run) {
		dice = (int)(Math.random()*6) + 1;
		cnt++;
		System.out.println("주사위 값은 " + dice + "입니다");
		
		if(dice == 5) {
			//run = false;  
			break;
		}
		}
		
		System.out.println("\n던진 횟수는" + cnt);
		System.out.println("종료합니다");
			
		
		
		
	}
	
}
