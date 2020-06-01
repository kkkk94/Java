package Ex0527;

public class NaverMember {
	/*
 	1.필드
 	String 타입의 아이디, 비밀번호, 이름, 생년월일, 성별, 이메일, 휴대전화 (비밀번호는 private로 설정)
 	
 	2.getter, setter 지정
 	
 	3.기본생성자와 모든 매개변수를 가지고 있는 생성자
 	
 	4.toString()메소드 생성
	 */
	
	//필드
	
	String id;
	private String pw;
	String name;
	String birth;
	String gender;
	String email;
	String number;
	
	//getter setter 지정
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
//	//기본생성자
	
	public NaverMember() {
		super();
		}
	
	//모든 매개변수를 가지고 있는 생성자
	public NaverMember(String id, String pw, String name, String birth, String gender, String email, String number) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.number = number;
	}
	
	//toString()메소드 생성
	@Override
	public String toString() {
		return "NaverMember [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + ", gender=" + gender
				+ ", email=" + email + ", number=" + number + "]";
	}
	
	
	
	
}
