package java0527_3;

public class Employee2 {
	String name;	//이름
	String dept; //부서
	int salary; //급여
	
	//기본생성자
	public Employee2() {
		super();
	}
	
	//매개변수 생성자
	public Employee2(String name, 
			String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	//직원정보메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", "
				+ "부서 : " + dept + ", "
				+ "연봉 : " + salary;
	}

	


}
