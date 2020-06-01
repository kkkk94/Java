package java0521;

public class Car {
//필드
	//색상(color), 속도(speed), 연료타입(type), 모델명(model)
	String color;
	int speed;
	String type;
	String model;
	String company = "테슬라";
	
	//생성자(오버로딩)
	//기본생성자
	Car(){
		
	}
	
	//매개변수 : color, speed
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	//매개변수 : color, company
	Car(String color, String company){
		this.color = color;
		this.company = company;	
	}
	//매개변수 : color, speed,type,model,company
	Car(String color, int speed, String type, String model, String company){
		this.color = color;
		this.speed = speed;
		this.type = type;
		this.model = model;
		this.company = company;	
		
		}
	Car(int speed, String color){
		this.speed = speed;
		this.color = color;
	}
//메소드 ( 마우스 오른쪽 - Source - 밑에서 4번째 클릭 + 필드 모두 선택 ) 
	//오버라이드 : 상속에서 사용. 부모기능 재정의 
	//오버라이드(상속에서 사용,부모기능 재정의)와 오버로드(중복되지 않은 생성자 여러개 만들 수 있음) 차이점 
	@Override 
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + ", company="
				+ company + "]";
	}
	
	
	//=====================================
	
	//필드추가
	int gas;
	
	//메소드 추가
	void setGas (int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {	
			System.out.println("gas가 없습니다");
			return false;
		}else {
			System.out.println("gas가 있습니다");
			return true;
		}
		
	}
	//메소드 추가
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("달립니다. ( gas 잔량 : " + gas + " ) ");
				gas--;
			} else {
	System.out.println("멈춥니다. ( gas 잔량 : " + gas + " ) ");
	return; // 메소드 종료
		}
		}
	}
	}
