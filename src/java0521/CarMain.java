package java0521;

public class CarMain {

	public static void main(String[] args) {
		//()매개변수
		Car jh_car = new Car();
		Car oh_car = new Car("sky", 250);//
		Car yj_car = new Car("white", "기아");
		Car sj_car = new Car("gray", 300, "전기차", "SJ8", "테슬라");
		
		Car js_car = new Car(300,"bleak");  //타입 같은게 있으면 오류 ( int, Sting)
		
		//Car ic_car = null;
		//ic_car = new Car();

		//재현car 
		//색상 : 검정
		//제조사 : BMW
		//최고속도 : 200
		jh_car.color = "Bleak";
		jh_car.company = "BMW";
		jh_car.speed = 200;
		
//		System.out.println("jh_car.color : " + jh_car.color);
//		System.out.println("jh_car.company : " + jh_car.company);
//		System.out.println("jh_car.speed : " + jh_car.speed);
		System.out.println("jh_car : " + jh_car.toString());
		
		//은희car 
		//색상 : 하늘 (매개변수)
		//최고속력 : 250 (매개변수)
		//타입 : 수소차
		//모델 : R8
		//제조사 : 아우디
		
		//직접 지정
		oh_car.type = "수소차";
		oh_car.model = "R8";
		oh_car.company = "아우디";
		
		//실행
		System.out.println("oh_car : " + oh_car.toString());
		
				
		
		//유진car
		//색상 : 흰색(매개변수)
		//속도 : 210
		//타입 : 가솔린
		//모델 : K5
		//제조사 : 기아(매개변수)
		
		yj_car.speed = 210;
		yj_car.type = "가솔린";
		yj_car.model = "K5";
		System.out.println("yj_car : " + yj_car.toString());
		
		
		//성진car
		//색상 : 회색(매개변수)
		//속도 : 300(매개변수)
		//타입 : 전기차(매개변수)
		//모델 : SJ8(매개변수)
		//제조사 : 테슬라(매개변수)
		System.out.println("sj_car : " + sj_car.toString());
		
		//=================================
		System.out.println(jh_car.gas);
		
		System.out.println("재현's ");
		System.out.println("gas: " + jh_car.gas);	//0
		
		jh_car.setGas(10);
		System.out.println("gas충전 : " + jh_car.gas);		//10
		
		boolean gasState = jh_car.isLeftGas();
		
		if(gasState) {
			System.out.println("===");
			System.out.println("출발");
			jh_car.run();
		}
		

	}

}
