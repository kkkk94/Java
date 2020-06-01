package java0522;

public class SubSubMain {

	public static void main(String[] args) {
		SubSub ss = new SubSub();

		System.out.println("ss.x : " + ss.x);
		System.out.println("ss.y : " + ss.y);
		System.out.println("ss.z : " + ss.z);
		
		ss.supMethod();
		ss.subMethod();
		ss.subSubMethod();
	}

}
