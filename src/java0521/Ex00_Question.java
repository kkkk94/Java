package java0521;

public class Ex00_Question {
	//1.class파일에서 main함수 만들 수 있지만 
	//각 class에서 모은 것을 main에서 사용하기 위해
	//class와 main 따로 사용
	
	//2.void에는 return값이 없어서 return X
	
	
	//필드
	String company;
	
	//생성자
	Ex00_Question(){
		
	}
	
	//메소드 
	void showInfo() {	
		System.out.println("정보출력");
	}	//void에도 return 존재. 삭제해도 상관없음
	
	int add(int x, int y) {
		return x+y;  
		
	}
	
	//메인
	public static void main(String[] args) {
		
		//객체생성
		Ex00_Question eq = new Ex00_Question();
		
		//초기화
		eq.company = "ICIA";
		System.out.println(eq.company);
		
		//호출
		eq.showInfo();
		
		//return값 확인
		eq.add(10, 5);
		System.out.println(eq.add(10, 5));  
		//return값을 x+y라고 했기 때문에 15 출력
		
		int mul = eq.add(2, 3) * 10;
		System.out.println("mul : " + mul);
		
	} 
}
