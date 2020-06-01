package java0520;

public class Ex04_IciaStuMain {

	public static void main(String[] args) {
		//객체생성
		Ex04_IciaSTu stu1= new Ex04_IciaSTu("이은솔","드라마보기","인천주안8동",25,"0618"); 
		Ex04_IciaSTu stu2= new Ex04_IciaSTu("유제상","독서","인천계양구",27,"1204");

		stu1.showInfo();
		stu1.age();
		
		stu2.downage2();
		stu2.showInfo();
		
	
	}

}
//class : 메모리 
// main : 실행되는 창