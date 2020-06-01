package java0527_2;

public class Salesman1 extends Employee1{	
	//extends Employee1 추가 ( 상속)

	int commission; //수당
	
	
	//직원정보메소드
	String getEmployeeInfo() {
	return super.getEmployeeInfo() + ", "
					+ "수당 : " + commission;
			//super : employee1에서 가져온 상속된 것
		}
	
	String getsalesmanInfo() {
		return "이름 : " + name + ", "
				+ "부서 : " + dept + ", "
				+ "연봉 : " + salary + ", "
				+ "수당 : " + commission;
	}
}



