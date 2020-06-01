package java0527_3;

public class Salesman2 extends Employee2 {

	int commission; //수당
	
	
		String getsalesmanInfo() {
		return "이름 : " + name + ", "
				+ "부서 : " + dept + ", "
				+ "연봉 : " + salary + ", "
				+ "수당 : " + commission;
	}


		public Salesman2(String name, String dept, 
								int salary, int commission) {
			//super(name, dept, salary)
			super();
			this.commission = commission;
		}
	
	
	//기본생성자
//	public Salesman2() {
//		super();
//	}
	
	//매개변수 생성자
	
	
	
	
	
	
}
