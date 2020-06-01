package java0528_4;

public class Constant {
	/*
	 final : 마지막, 더이상 수정을 할 수 없다.
	 final 변수 : 상수를 의미 ex) PI(대문자) = 3.14 
	 final 메소드 : final메소드는 하위클래스에서 재정의 할 수 없다. 클래스 그대로 사용
	 final 클래스 : final클래스는 상속할 수 없다.
	 */

	int num = 10;
	final int NUM = 100;
	static final int MAX_NUM = 1000;
	
	public static void main (String[] args) {
		
		Constant cons = new Constant();
		cons.num = 50;
		//cons.NUM = 200; 												//final로 지정됐기 때문에 값을 바꿀 수 없다.
		
		System.out.println("num : " + cons.num);
		System.out.println("NUM : " + cons.NUM);
		

		
		
		
	}

}
