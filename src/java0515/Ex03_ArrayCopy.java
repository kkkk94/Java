package java0515;

public class Ex03_ArrayCopy {

	public static void main(String[] args) {
		
		String[] str1 = {"강지수", "이은솔", "유제상"};
		String[] str2 = new String[3]; //앞으로 들어올 것이다 라고 선언
		
		//str1 = 사람1 사람2 사람3
		//str2 = ㅇ1 ㅇ2 ㅇ3 //빈 값에 넣으려고 함
		
		for(int i=0; i<str1.length; i++) {
			str2[i] = str1[i];							//str1에 있는 애들이 str2에 있는 집으로 들어가는것
			System.out.print("str1[" + i + "] = " + str1[i]);
			System.out.println("\t str2[" + i + "] = " +str2[i]);
		}
		
		//2번째 방법
		
		//System.arraycopy(str1, 0, str2, 0, str1.length);		//이거만 써도 출력됨
		//복사할배열명 , 복사 시작할 인덱스번호 , 붙여넣을배열명 , 붙여넣기 시작할 인덱스번호 , 복사배열크기)
		
		System.arraycopy(str1, 2, str2, 2, str1.length-2);  //str1에 있는 사람이름을 str2에 있는 방에 넣을 시 n번째부터 넣고 싶을 때 위에있는 내용
																	//모두 주석처리 하고 실행
		
		
		
		
//				str1[0] = 강지수	 str2[0] = 이은솔
//				str1[1] = 이은솔	 str2[1] = 유제상
//				str1[2] = 유제상	 str2[2] = 강지수
		
		//str1[0]->str2[2]로
		//str1[1]->str2[0]로
		//str1[2]->str2[1]로
		

		
//		System.arraycopy(str1,2, str2, 1, str1.length-2);
//		System.arraycopy(str1,1, str2, 0, str1.length-2);
//		System.arraycopy(str1,0, str2, 2, str1.length-2);
		

		System.arraycopy(str1,1, str2, 0, str1.length-1);
		System.arraycopy(str1,0, str2, 2, str1.length-2);		//위에것을 더 간소화 시키는 방법
		
		
		
			for (int i=0; i<str1.length; i++) {
			System.out.print("str1[" + i + "] = " + str1[i]);
			System.out.println("\t str2[" + i + "] = " +str2[i]);
		}

	}

}
