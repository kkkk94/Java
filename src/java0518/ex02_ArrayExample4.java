/*
 	Date : 2020.05.18 
	Author : jisoo 
	Description : 배열 구구단(모르겠다......)
	Version : 1.0
 */
package java0518;

public class ex02_ArrayExample4 {

	public static void main(String[] args) {
		
		//int multi[][] = new int[9][8];				//원래 [10][10]	//가로로 할땐 new int [8][9]  //세로 : [9][8]
		int[][]multi = new int [9][8];
		
		//System.out.println("multi.length : " + multi.length); //배열의 길이
		
		for(int i=0; i<multi.length; i++) {		//9
			for(int j=0; j<multi[i].length; j++) { //8
				multi[i][j] = (i+1) * (j+2); 	//세로로
				System.out.print((j+2) + " x " + (i+1) + " = " + multi[i][j] + "\t\t");  //세로로
//				multi[i][j] = (i+2) * (j+1); 			//가로로								// 이 전에는 i*j;
//				System.out.print((i+2) + " x " + (j+1) + " = " + multi[i][j] + "\t\t");  //가로로  (2단 1줄,3단 한줄 . . . )
				//System.out.print (i + " x " + j + " = " + multi[i][j] + "\t\t" );
				
				//System.out.println("multi.length : " + multi.length);
				//System.out.println("multi[i].length : " +multi[i].length);
			}System.out.println();
			
		}
		System.out.println("multi[0][0] : " + multi[0][0]);
}
		
				
				
		}

