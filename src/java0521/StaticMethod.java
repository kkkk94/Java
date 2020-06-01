package java0521;

public class StaticMethod {
//인스턴트 멤버 변수
	int memVar;
	//스태틱 멤버 변수
	static int staticVar;
	
	//인스턴트 메소드
	void memMethod1() {
		int local = memVar; //멤버변수
		local = staticVar;	//static변수
		staticMethod1();	//static 메소드
		memMethod1();	//메소드
		System.out.println("memMethod1");
}
	void memMEthod2() {
		System.out.println("memMethod2");
	}
	//static메소드
	static void staticMethod1() {	
		StaticMethod st = new StaticMethod();
		//멤버변수와 메소드를 사용하기 위한 객체생성
		
		int local1 = staticVar; //static변수
		staticMethod2();	//static 메소드
		
		//int local = memVar; //멤버변수
		int local = st.memVar;
		//memMethod2(); //메소드
		st.memMEthod2();
		
		staticMethod2();
		System.out.println("staticMethod1");
		
	}
	static void staticMethod2() {
		System.out.println("staticMethod2");
	}
	}

