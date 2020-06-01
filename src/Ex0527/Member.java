package Ex0527;

public class Member {
	
	//11.필드
	String name;
	String id;
	String password;
	int age;
	
	//12.생성자
	Member(String name, String id) {
		this.name = name;	//매개변수에서 넣어준 name값
		this.id = id;	//매개변수에서 넣어준 id값
	}

	//13-1메소드
	boolean login(String id, String password){
		if(id=="inchoriya" && password.equals("12345")) {
			return  true;
			}else {
				return false;
			}
	
			}
	
	//13-2 메소드
	void logout(String id) {
		if(id.equals("inchoriya")) {
			System.out.println("로그아웃");
		}
	}
	
	
	
	
	
	
	
	
	

	
}
