package java0521;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		Search sm = new Search();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("검색할 회원 이름 >>");
			String name = sc.next();
			
			boolean searchResult = sm.searchMember(name);
			if(searchResult) {
				break;
			}
			System.out.println("해당 회원이 없습니다.");
		} while(true);

	}

}
