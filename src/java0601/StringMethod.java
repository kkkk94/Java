package java0601;

public class StringMethod {

	public static void main(String[] args) {
		//String 메소드
		String str = "자바는 재밌다.";	
		System.out.println(str);		//자바는 재밌다.
				
		//String 변수 글자수 확인
		System.out.println("str 글자수 : " + str.length());		//공백, 점 포함해서 글자 수 : 8
		
		//일부 문자 교체 메소드
		String newStr = str.replace("자바","Java");		//바꾸고 싶은 글자 : 앞("자바"), 변경할 글자 : 뒤("Java")
		System.out.println("교체 전 : " +str);			//교체 전 : 자바는 재밌다.
		System.out.println("교체 후 : " + newStr);		//교체 후 : Java는 재밌다.
		
		
		
		//글자 잘라내기
		String str1 = str.substring(1, 6);		//str.substring(start, end) : 문자열에서 원하는 index범위 만큼 출력
		System.out.println("str1 : " + str1);		
		
		
		
		String str2 = str.substring(1);			//index값이 () 위치 이후 값을 불러옴
		System.out.println("str2 : " + str2); 	
		
		
		//영어 대소문자 변경 (소문자)
		String str3 = "abcdEFGHijkLMN";
		String str3Lower = str3.toLowerCase();
		System.out.println("str3 : " + str3);						//변경전
		System.out.println("소문자 변경 : " + str3Lower);		//변경후( 모두 소문자로 변경)
		
		//대문자
		String str3Upper = str3.toUpperCase();
		System.out.println("대문자 변경 : " + str3Upper);	//변경후(모두 대문자로 변경)
				
		//공백 제거
		String str4 = "     자바";
		String str5 = "JAVA     ";
		String str6 = "     이클립스";
		
		String str7 = str4+str5+str6; 
		
		System.out.println("str7 :" + str7);		//str4,5,6 더해진 값(공백 포함)
		
		String str8 = str4.trim() + str5.trim() + str6.trim();	//trim 공백제거
		System.out.println("str8 :" + str8);		//공백 제거된 후 str4,5,6더해진 값
		
		System.out.println("str7.trim() :" + str7.trim()); 	//앞뒤 공백 제거
		
		
		//parseInt
		String str9 = "1111";
		System.out.println("str9+1 : " + str9+2);
		
		int num = Integer.parseInt("11");
		System.out.println(num+2); 		//숫자로 계산
	}

}
