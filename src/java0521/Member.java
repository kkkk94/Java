package java0521;

public class Member {
//필드 private로 
	private String name;
	private int age;
	private int height;
	private String addr;
	
	
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//기본생성자
	public Member() {
		super();
	}
	
	//매개변수 name, age, height, addr
	public Member(String name, int age, int height, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.addr = addr;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", addr=" + addr + "]";
	}
	
	
	

	
	
	
	
	

}
