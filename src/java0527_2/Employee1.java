package java0527_2;

public class Employee1 {
	
	//필드
	String name;								//이름
	String dept; 								//부서
	int salary; 								//급여
	
	//직원정보메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", "
				+ "부서 : " + dept + ", "
				+ "연봉 : " + salary;
	}
}





