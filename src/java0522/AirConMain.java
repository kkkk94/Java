package java0522;

public class AirConMain {

	public static void main(String[] args) {
		//객체 생성
		AirCon ac = new AirCon();

		ac.company = "제조사";
		System.out.println(ac.company);
		
		ac.setCompany("제조사"); //메소드 사용해서 한번에
		System.out.println(ac.getCompany());
	}

}
