package java0521;

public class Calculator {

	//메소드 
	//순서 상관없음
//	int add(int x, int y) {
//		//x + y
//		int result = x + y;
//		return 0;
		
		//2번째 방법
		//return x+y;
	//}
	double avg(int x,int y) {
		double sum = add(x,y); //int result = x + y;
		double result = sum/2;
		return result;
	}
	int add(int x, int y) {
		//x + y
		int result = x + y;
		return result;
	
}
//	void excute() {
//		double result = avg(7,10);
//		System.out.println("실행결과 : " + result);
//	}
	
	void excute(int x, int y) {
	double result = avg(x,y);
	//return; void + return : 이후 값은 오류 
	//System.out.println("return 이후 오류");
	System.out.println("실행결과 : " + result);
}
}