package Ex0527;

import java.util.Scanner;

public class NaverMemverMain {

	public static void main(String[] args) {
		/*
		 1.member1은 기본생성자로 객체 생성
		 도트연산자를 이용하여 값 설정하기
		 Ex) member1.id="inchoriya";
		 
		 2.member2는 객체를 생성할 때 매개변수 생성자 이용하여 값 설정
		 
		 3.member3은 set메소드를 사용하여 값 설정
		 
		 4.member4는 초기값(null)을 사용하여 생성
		 
		 5.NaverMemver 클래스 타입의 members 배열선언
		 ex)String타입=> String[]arr = new String[4];
		 
		 6.for문을 이용하여 배열의 i번 인덱스에 저장된 id를 출력
		 
		 7.for문을 이용하여 배열의 i번 인덱스에 저장된 toString 출력
		 */

		//member1은 기본생성자로 객체 생성
		
		//members[0]
		NaverMember member1 = new NaverMember();
		member1.id=" 1번id ";
		//member1.pw="1234";
		member1.name=" 강지수 ";
		member1.birth=" 940427 ";
		member1.gender=" 여자 ";
		member1.email=" zgzg0427@naver.com ";
		member1.number=" 010-4221-9128 ";
		
		//member2는 객체를 생성할 때 매개변수 생성자 이용하여 값 설정
		//members[1]
		NaverMember member2 = new NaverMember(" 2번id "," 4567 "," 2번이름 "," 0428 ",
																	" 여자 "," j_s427@daum.net "," 010-1234-5678 ");
		
		
		//member3은 set메소드를 사용하여 값 설정
		//members[2]
		NaverMember member3 = new NaverMember();
		member3.setId(" 3번id ");
		member3.setPw(" 3번pw ");
		member3.setName(" 3번name ");
		member3.setBirth(" 3번birth ");
		member3.setGender(" 3번gender ");
		member3.setEmail(" 3번email ");
		member3.setNumber(" 3번number ");
		
		
		//member4 결과값 모두 null
		//members[3]
		
		NaverMember member4 = null;
		member4=new NaverMember();
		
		//NaverMemver 클래스 타입의 members 배열선언
		
		NaverMember [] members = new NaverMember[4];
		members[0] = member1;
		members[1] = member2;
		members[2] = member3;
		members[3] = member4;
		
		//for문을 이용하여 배열의 i번 인덱스에 저장된 id를 출력
		
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].getId());
			}
		
		
		//.for문을 이용하여 배열의 i번 인덱스에 저장된 toString 출력
		
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].toString());
		}
		
				
	}

}
