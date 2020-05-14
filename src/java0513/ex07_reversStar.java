package java0513;

public class ex07_reversStar {

	public static void main(String[] args) {
//		*****
//		****
//		***
//		**
//		*
		// i층 j갯수
		for (int i = 1; i <= 5; i++) {
						//j=5, i=1
						//j=4, i=2
						//j=3, i=3
						//j=2, i=4
						//j=1, i=5
			for (int j = 5; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println("");

		}
	}

}
