/*
 	Date : 2020.05.08 (날짜)
	Author : jisoo (만든사람)
	Java : 증감연산자 
	Version : 1.0
 */
package java0511;

public class ex02_increaseoperation {

	public static void main(String[] args) {
		//단항연산자 (항이1개)
		//증가와 감소 연산자 (++,--)
		
		//++num : num이 가지고 있는 값에 1을 증가한 뒤 연산에 적용
		//num++ : num이 가지고 있는 값을 연산에 적용한 뒤 1을 증가 

		int num = 5;
		System.out.println("num값 : " + num); 
		
		++num;
		System.out.println("++num 값" + num); 
		
		num++;
		System.out.println("num++값 : " +num); 
		
		int num1 = 5;
		int result1;
		
		result1 = ++num1;
		System.out.println("++num1 result1 :"+result1);
		//result1 = ++num1;
		//num1 = num + 1;
		//result1 = num1;
		
		result1 = num1++;
		System.out.println("num1++ result1 : " +result1);
		//result1 = num1++;
		//result1 = num1;
		//num1 = num1 + 1;
		
		//ex
		
		int num2= 10;
		--num2;
		System.out.println(num2); //9
		//num2 = num2 - 1;
		//num2 = 10 - 1;
		//num2 = 9;
		
		int result2;
		result2 = --num2;
		System.out.println(result2); //8
		//result2 = --num2;
		//num2 = 9 - 1;
		//num2 = 9 - 1;
		//result2 = num2;
		//result2 = 8;
		
		result2 = num2--;
		System.out.println(result2); //8
		//result2 = num2--;
		//result2 = num2;
		//result2 = 8;
		//num2 = num2 - 1;
		//num2 = 8 - 1;
		
		//ex
		int result3;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		result3 = ++num1 + ++num2; //16
		// num1 = num1 + 1;
		// + 
		// num2 = num2 + 1;
		// =
		// result3 = num1 + num2;
		
		System.out.println("num1"); // 8
		System.out.println("num2"); //8
		System.out.println("result"); //16
		
		// num1 = 8, num2 = 8
		result3 = num1++ + num2++; // 9+9=18
		// num1 = num1 + 1;
		// + 
		// num2 = num2;
		// =
		// result3;
		
		//num1 = num1 + 1;
		//num2 = num2 + 1;
		
		
		
		
		result3 = num1++ + ++num2; // 9+10=19
		//num1 = 9
			//+
		//num2 = 10
		//=
		// result3 = num1 + num2
		
		//num1 = num1 + 1
		//num2 
		
		
		
		result3 = ++num1 + num2++; //11+10=21
		//num1 = 11
		//+
		//num2 = 10
		//=
		//result3 = num1 + num2
		
		//num1 = 11 
		//nulm2 = 10 + 1
		
		int num3 = 5;
		int num4 = 11;
		int result4;
		
		result4 = ++num3 + --num4; // 6+10=16
		System.out.println("++num3+ --num4 : "+ result4);
		
		
		result4 = num4++ - num3--; 
		//num4 = 10 
		//num3 =6
		//result4 = 4
		
		//num4 = 11 , num3 = 5
		System.out.println("num4++ - num3 : "+ result4);
		
		result4 = num3++ - ++num4; //
		//num3 = 5
		//num4 = 12
		//result4 = -7
		//num3 = 6 , num4 =12
		System.out.println("num3++ ++num4 : "+ result4);
		
		
		
		
		
	

	}

}
