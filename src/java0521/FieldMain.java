package java0521;

public class FieldMain {

	public static void main(String[] args) {
	//로컬변수 지정
		//int temp; //초기화전
		int temp = 0; //초기화
				
		
		Field fd = new Field();
		//필드 사이즈 출력
		System.out.println("fd.size = " + fd.size);	//18
		System.out.println("fd.price = " + fd.price);	//200
		
		//static변수
		System.out.println("Field.pride = " + Field.price);

		//새로운 객체 만들기
		Field fd2 = new Field(99); //int size = 99인 객체 2번
		System.out.println("(1)new Field() : " + fd.size);
		System.out.println("(2)new Field(99) : " + fd2.size);
		//System.out.println("fd2.size = " + fd2.size);
		
		fd2.size = 13;
		System.out.println("fd2.size = " + fd2.size); //3번
		
		//로컬변수  temp 출력
		System.out.println("temp : " + temp); 
		//로컬변수 temp가 초기화되지 않으면 오류
		
		//새로운 객체 만들기
		//Field numbers = new Field(15);  //byte bNum
		Field numbers = new Field((byte)15);
											//	↑에 원하는 타입 적으면 그 타입에 대입
		
		
		numbers.showInfo();
	}

}
