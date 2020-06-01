package java0527_4;

public class SuperMain3 {

	public static void main(String[] args) {
		Salesman3 sales3 = new Salesman3();
		
		System.out.println("local.name : " + sales3.getNameLocal());			//임훈짱
		System.out.println("this.name : " + sales3.getNameThis());				//이은솔
		System.out.println("super.name : " + sales3.getNameSuper());				//강지수

	}

}


