/*
 	Date : 2020.05.18 
	Author : jisoo 
	Description : 로또 당첨번호
	Version : 1.0
 */
package java0518;

public class Ex03_Lotto {
	
	public static void main(String[] args) {
		//for문 사용
		//배열은 7개
		
		//(int)(Math.random()*N) + S;
				//S : 시작, N : 끝
		
		//로또 번호
//		int lot = (int)(Math.random()*45) + 1;
//		System.out.println("로또 당첨번호는" + lot + "번 입니다" );
		
		int[] lotto = new int[7];	//배열7개
		System.out.println("lotto length : " + lotto.length);//배열의 크기 확인
		System.out.println("이번주 당첨번호는");
		
		for(int i=0; i<lotto.length; i++) {	
			lotto[i] = (int)(Math.random() * 45)+1; //시작:1, 끝45
			
			//중복값 제거를 위한 반복문
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;		//다시 올라가서 실행
					break;
				}
			}	
		}
		
		for(int k=0; k<lotto.length; k++) {
		if(k<lotto.length-1) {
			System.out.println(lotto[k] + "");
			}else {
				System.out.println("보너스 번호는 " + lotto[k]);
			}
		}
		System.out.println("입니다.");
		
	}

}
