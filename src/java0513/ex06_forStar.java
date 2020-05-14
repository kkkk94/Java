package java0513;

public class ex06_forStar {
	
	public static void main(String[] args) {
		//*
		//**					5줄 (5번 반복)
		//***
		//****
		//*****
												////i가 층(줄).  j가 갯수
		for (int i=1; i<=5; i++) {   		//1층부터 시작, 5층까지 증가 ( 5번 반복)
												//i =1 에서 j = 1개
												//i=2에서 j =2개
												//i=5에서 j = 5개
			
			for (int j=1; j<=i; j++) {		//별 출력하는 for문 
												
				
				System.out.print("*"); //프린트는 가로로 출력  ,
				
				
			}
			System.out.println(""); // println은 세로로
		}
		
		
		
		
	}

}
