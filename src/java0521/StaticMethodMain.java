package java0521;

public class StaticMethodMain {

	public static void main(String[] args) {
		StaticMethod st = new StaticMethod();
		st.memMethod1(); //메소드
		st.memVar=0; //변수

		//static
		st.staticVar = 0;
		st.staticMethod1();
		
		StaticMethod.staticVar = 0;
		StaticMethod.staticMethod1();
		
		StaticMethod.staticMethod2();
		
		
//		staticMethod2();
		//같은 클래스에서는 바로 호출 가능
		//StaticMethod.java에서 main을 만들 경우
		
		//int local =staticVar;
		//int local =StaticMethod.staticVar;
		//int local =st.memVar;


	}

}
