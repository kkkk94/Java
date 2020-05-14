package java0508;

public class ex02_변수 {
	public static void main(String[] args) {
		
		//변수 : 프로그램 실행에 필요한 데이터를 저장하기
		//위해 메모리 공간을 할당하고, 이름을 부여한것
		
		//var num = 0; (변수타입 : var, 변수명:num, 변수값:0)
		//[변수타입] [변수명] = [변수값];
		
		int age = 35;
		
		int age1; //변수선언
		age1=35; //변수초기화
		
		//변수타입
		//1.정수형
		//2.실수형
		//3.문자형
		//4.논리형
		
		//byte
		//1byte = 8bit
		//1byte = 2^7 ~ (2^7)-1
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		//short
		//2byte = 16bit
		//2byte = 2^15 ~ (2^15)-1
		short sNum1 = -32768;
		short sNum2 = 32767;
		//short sNum3 = -32769
		//short sNum4 =32768;
		
		
		
		//4byte = 32bit
		//4byte = 2^32~(2^31)-1
		//int : -2,147,483,648 ~ 2,147,483,647
		int bNum3 = -129;
		int bNum4 = 128;
		
		//long : 매우 크다
		//8byte = 64bit
		
		int iNum1 = -2147483648;
		int iNum2= -2147483647;
		
		long iNum3 = -13221474000083648L;
		//변수값에는 L을 썼지만 출력은 되지 않는다.
		long iNum4 = 21231000047483648L;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		//실수형
		//float(4byte), double(8byte)
		//double > float
		
		float pi1 = 3.14f;
		double pi2 = 3.14;
		
		float pi3 = 3.1234567890123456789f;
		double pi4 = 3.143217189704512345678132;
		
		System.out.println(pi3);
		System.out.println(pi4);
		
		//long은 L 추가
		//float는 f 추가


	}

	}
