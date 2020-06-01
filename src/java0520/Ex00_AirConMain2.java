package java0520;

public class Ex00_AirConMain2 {

	public static void main(String[] args) {
		Ex00_AirCon airCon1 = new Ex00_AirCon();
		                  // ↑어떠한 이름으로 바꿔도 상관 없음
		Ex00_AirCon airCon2 = new Ex00_AirCon();
		
		airCon1.color = "Black";
		airCon2.color = "White";
		System.out.println("airCon1.color : " + airCon1.color);
		System.out.println("airCon2.color : " + airCon2.color);
		
		//airCon1 
		//필드값 초기화 (5개)
		//메소드호출(4개)
		//airCon2 
		//필드값 초기화(5개)
		//매소드호출(4개)
		
		//airCon1 
		//필드값 초기화 (5개)
		airCon1.company = "Samsung";
		airCon1.color = "White";
		airCon1.size = 50;
		airCon1.price = 200;
		airCon1.temp = 16;
		
		//매소드호출(4개)
		airCon1.onPower();
		airCon1.offPower();
		//airCon1.upTemp();
		airCon1.downTemp();
		
		//airCon2 
		//필드값 초기화(5개)
		airCon2.company = "LG";
		airCon2.color = "Black";
		airCon2.size = 55;
		airCon2.price = 250;
		airCon2.temp = 20;
		
		//매소드호출(4개)
		airCon2.onPower();
		airCon2.offPower();
		airCon2.upTemp();
		//airCon2.downTemp();
		

		System.out.println("---------여기부터 출력---------");
		System.out.println("airCon1.company : " + airCon1.company);
		System.out.println("airCon1.color : " + airCon1.color);
		System.out.println("airCon1.price : " + airCon1.price);
		System.out.println("airCon1.size : " + airCon1.size);
		System.out.println("airCon1.temp : " + airCon1.temp);
		System.out.println();
		System.out.println("airCon2.company : " + airCon2.company);
		System.out.println("airCon2.color : " + airCon2.color);	
		System.out.println("airCon2.price : " + airCon2.price);
		System.out.println("airCon2.size : " + airCon2.size);
		System.out.println("airCon2.temp : " + airCon2.temp);
		System.out.println();

		

		airCon2 = airCon1;
		System.out.println("---------airCon2=airCon1---------");
		System.out.println("airCon2.company : " + airCon2.company);
		System.out.println("airCon2.color : " + airCon2.color);
		System.out.println("airCon2.price : " + airCon2.price);
		System.out.println("airCon2.size : " + airCon2.size);
		System.out.println("airCon2.temp : " + airCon2.temp);

		
		
		
		
		
		

	}

}
