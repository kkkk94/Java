package java0513;

public class ex09_forProject {
	
	public static void main(String [] args) {
		
		//        	 *
		//       	***
		//  	   *****
		//        ******* 
		

		
		
		for(int i=1; i<=4; i++) { //줄1-2-3-4
			System.out.print(" ");
			
			for (int j=1; j<=4-i; j++) { //공백3-2-1-0
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++){  //별 : 1-3-5-7
				System.out.print("*" );
			}
			
//			for (int j=1; j<=4-i; j++) { 
//				System.out.print("□");
//				
//				for (int k=1; k<=2*i-1; k++){  
//					System.out.print("■" );
//				}
//				for (int j=1; j<=4-i; j++) { 
//					System.out.print("□");
//				}
//				
			
			
				System.out.println();
		}
		
			
		}
		
	}
	

