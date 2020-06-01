package java0520;

public class Ex01_FieldIntitValueMain {
	
	//Main함수

	public static void main(String[] args) {
		
		//객체생성
		Ex01_FieldIntitValue fIV = new Ex01_FieldIntitValue();
		// fIV 에 자기가 원하는 이름 넣어도 됨.
		//class에 있는 필드를 main함수에 가져오기.

		//출력작업
		//정수형 초기값 확인
		System.out.println("\n정수형 초기값 확인");
		System.out.println("byteField : " + fIV.byteField);
		System.out.println("shortField : " + fIV.shortField);
		System.out.println("intField : " + fIV.intField);
		System.out.println("longField : " + fIV.longField);
		
		//실수형 초기값 확인
		System.out.println("\n실수형 초기값 확인");
		System.out.println("floatField : " + fIV.floatField);
		System.out.println("doubleField : " + fIV.doubleField);
		
		//논리형 초기값 확인
		System.out.println("\n논리형 초기값 확인");
		System.out.println("booleanField : " + fIV.booleanField);
		
		//문자형 초기값 확인
		System.out.println("\n문자형 초기값 확인");
		System.out.println("charField : " + fIV.charField); 
		//아무것도 없어보이지만 출력된 값에 공백 발생
		
		//배열 초기값 확인
		System.out.println("\n배열 초기값 확인");
		System.out.println("arrField : " + fIV.arrField);
		
		//참조형 초기값 확인
		System.out.println("\n참조형 초기값 확인");
		System.out.println("referenceField : " + fIV.referenceField);
		
		
	}

}
