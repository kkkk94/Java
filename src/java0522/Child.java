package java0522;

public class Child extends Parent{ 	//extends라고 적고 Parent(상속받을class이름)
//child가 parent한테 상속받음 (부모-자식)
	//필드
	
	int childVar = 20;
	
	//메소드
	void childMethod() {
		System.out.println("childMethod");
	}
}
