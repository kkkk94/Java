package java0522;

public class AirCon {
/*
 	1.get,set설정
 	2.기본생성자
 	3.매개변수 생성자
 	4.toString()
 
 */
	String company;
	int size;
	String color;
	int price;
	int temp;
	
	// 	1.get,set설정
	//오른쪽 마우스 - 소스 - Generate getter and setters (모두선택)
	//메소드
	public String getCompany() {	//get 앞으로 입력될 값 출력
		return company;
	}
	public void setCompany(String company) {	//set (매개변수) → 컴퍼니(필드값)에 넣겠다
		this.company = company;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	//기본생성자
	//오른쪽 마우스 클릭 - Source -  Generate Constructor using Fields 에서
	//체크 다 해제
	public AirCon() {
		super();
	}
	
	//매개변수 생성자
	//오른쪽 마우스 클릭 - Source -  Generate Constructor using Fields
	public AirCon(String company, int size, String color, int price, int temp) {
		super();
		this.company = company;
		this.size = size;
		this.color = color;
		this.price = price;
		this.temp = temp;
	}

	
	//ToString 
	//오른쪽 마우스 클릭 - Source - Generate toString()
	@Override
	public String toString() {
		return "AirCon [company=" + company + ", size=" + size + ", color=" + color + ", price=" + price + ", temp="
				+ temp + "]";
		

	}
	
	
	
}
