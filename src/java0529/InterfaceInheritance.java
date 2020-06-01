package java0529;

public class InterfaceInheritance {

	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		//ImplementationC imp = null;
		//imp = new ImplementationC();
		
		
		InterfaceA iA = imp;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = imp;
		iB.methodB();
		System.out.println();
		
		InterfaceC iC = imp;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		
		System.out.println();
		
		System.out.println();
		

	}

}
