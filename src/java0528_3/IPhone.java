package java0528_3;
//구현클래스
public class IPhone extends SmartPhone{
	//방법1
	@Override
	String getPrice() {
		String price = "180만원";
		return price;
	}

	@Override
	String getBrend() {
		String price = "애플";
		return price;
		
	}

	@Override
	String getName() {
		
		String price = "아이폰12";
		return price;
		
	}

}
