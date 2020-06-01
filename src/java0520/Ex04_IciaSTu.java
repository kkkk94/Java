package java0520;

public class Ex04_IciaSTu {
	//ICIA 교육원에 다니는 JS반 훈련생에 대한 클래스를 만들고 
	//메인 클래스에서 각자 같은 조원들에 대한 객체를 각각 선언해서 출력
	//이름, 나이, 취미, 주소, 생년월일
	//그 사람 정보를 모두 출력하는 메소드 생성
	//호출 시 나이를 한살 추가하도록 하는 메소드 생성
	//void
	
	//필드 작성
	String name;
	String hobby;
	String address;
	String birth;
	int age;
	
	//기본생성자
	Ex04_IciaSTu() {
	}
	
   //생성자(틀)
	Ex04_IciaSTu(String name, String hobby, String address, int age, String birth) {
		this.name = name;
		this.hobby = hobby;
		this.address = address;
		this.age = age;
		this.birth = birth;
		
	}
	//메소드추가
	void showInfo() {
		System.out.println("\nname : " + name + "\nhobby : " + hobby +  "\naddress : " + address +
								"\nage : " + age + "\nbirth : " + birth); 
	}
		
	//나이 한살 빼는 메소드
	//방법1
	int age() {
		System.out.println("나이(-1) : " + (age-1) );
		return 0;
	}
	//방법2
	int downage2() {
		int result = age--;
		return result;
	}
	
}

