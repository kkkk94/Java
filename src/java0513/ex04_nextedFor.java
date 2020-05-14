package java0513;

public class ex04_nextedFor {
	
	public static void main(String [] args) {
		//중첩for문
		/*
		 for(초기화식;조건식;증감식){
		 
		 	for(초기화식;조건식;증감식){
		 	실행할 반복문						//조건-반복-증감 순서
		 }
		 */
		
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=3; j++) {
				//실행할 반복문
				System.out.print("i값 : " + j);
				System.out.println("\t\tj값 : " + j);
			}
		System.out.println("================");	
		
	}
		}
}
