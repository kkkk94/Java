package java0527_4;

public class Salesman3 extends Employee3  {
																			//Employee

	String name = "이은솔";									//this
	
	String getNameLocal() {	
		String name = "임훈짱";
		return name;
	}
	
	String getNameThis() {
		String name = "임훈짱";
		return this.name;
	}
	
	String getNameSuper() {
		String name = "임훈짱";
		return super.name;
	}
	
}
