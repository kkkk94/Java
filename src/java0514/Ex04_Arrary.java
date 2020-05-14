package java0514;

public class Ex04_Arrary {
	
	public static void main (String [] args) {
		//배열(Arrary) : 같은 변수 타입의 데이터를 하나의 변수에 저장하는 구조
		
		//배열 선언
		//(1)타입[] 배열이름;
			int[]num1;
		//(2)타입 배열이름[];
			int num2[];
		
		//변수 선언 초기화
		//int i = 0;
		//변수 선언 : int i;
		//(변수타입) (변수명) = (변수값);
			
			//배열 초기화
			num1 = new int[] {10,20}; 
			System.out.println("첫번째 집 : " + num1[0]);
			System.out.println("두번째 집 : " + num1[1]);
			
			
			//변수 초기화
			//i=0;
			//변수명 = 변수값;
			
			//배열 선언 초기화
			int num3[] = {10,11,12,13};
			System.out.println("첫번째 집 : " + num3[0]);
			System.out.println("두번째 집 : " + num3[1]);
			System.out.println("세번째 집 : " + num3[2]);
			System.out.println("네번째 집 : " + num3[3]);
//			System.out.println("다섯째 집 : " + num3[4]);		//에러 : 집 없는데 들어가서 살라
			
			//변수 선언 초기화
			//int j = 0;
			
			//int k; 오류
//			int k=0;
//			System.out.println(k);
//			
//			char ch = ' ';
//			String str = "";
//			
//			//배열초기화
//			int[] a = null;
//			int b[] = {};
		
			//배열 값 입력 시 타입을 맞춰서 입력
			char[] ch1 = {'훈','짱'}; //문자타입 배열
			String[] str1 = {"인덱스0","인덱스1","인덱스2"};		//String타입
			
			System.out.println("String타입 str1에서 2번째 집에 저장된 값 : " ); //0부터 시작하기 때문에 인덱스1
			System.out.println(str1[1]);
			
			//int num3[] = {10,11,12,13};
			//length : 배열의 길이를 나타낸다.
			int lNum3 = num3.length;  
			System.out.println("num3[]의 길이 : " + lNum3);
			
			//for문을 사용해서 num3배열에 저장된 값을 모두 출력
			//i=0, length사용
				for(int i=0; i<num3.length; i++) {
				System.out.println("num3[ " + i + " ] = " + num3[i] );
				}
				//국어 영어 수학 점수를 저장하고 
				//배열변수에 저장된 모든 값의 총점과 평균을 구하여라. (for문 사용)
				int[] numbers = {90,80,87}; //number - 점수들
				int sum = 0;
				//double avg = sum / numbers.length;
				
			 for(int i=0; i<numbers.length; i++) {
				 System.out.println("numbers[" + i + " ] :  " + numbers[i] );
				 sum +=numbers[i];
				 
			 }
			 //double avg = sum / numbers.length; 소수점 없이
			double avg = (double)sum / numbers.length; //소수점까지
			
			System.out.println("numbers[] 총점 : " + sum);
			System.out.println("numbers[] 평균 : " + avg);
			 
			}
			
	}


