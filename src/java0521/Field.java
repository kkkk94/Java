package java0521;

public class Field {
/*
 1.멤버변수(필드) : 객체가 생성될 때 각 객체별로 초기화
 						  선언시 초기화 하지 않으면 초기값 설정
 						  ( ex) String company 등 )
 						  
 2.static변수 : 객체를 생성하지 않아도 참조 가능
 
 3.로컬변수 : 클래스영역이 아닌 부분에서 선언되는 변수
 				  메소드나 초기화 블록에서 선언되는 변수
 */
	
//멤버변수
	int size = 18;
	
	long lNum = 10000;
	int iNum = 1000;
	short sNum = 100;
	byte bNum = 10;
	
	
	//static변수
	static int price = 200;
	
	//기본생성자
	Field(){
		
	}
	//매개변수 : size
	//Field(int size){
	//	this.size = size;
	//}
	
	//매개변수 : bNum
	Field(int iNum){
		this.iNum = iNum;
	}
	//매개변수 : sNum
	Field(short sNum){
		this.sNum = sNum;
	}
	//매개변수 : iNum
	Field(byte bNum){
		this.bNum = bNum;
	}
	
	//매개변수 : lNum
	Field(long lNum){
		this.lNum = lNum;
	}
	
	void showInfo() {
		System.out.println();
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
			return;
				
	}
	
}
