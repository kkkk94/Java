/*
  	Date : 2020.05.12
	Author : [강지수], [이은솔], [유제상]
	Description : [분식집 키오스크]
	Version : 1.0
 */
package java0512;

import java.util.Scanner;

public class ex07_iciafood {

	public static void main(String[] args) {
		//떡볶이 3,000원, 주먹밥 1,500원, 순대 2,500원, 모둠튀김 2,000원, 김밥 1,500원
		
		Scanner sc = new Scanner(System.in);
		int num;
		int price = 0;
		int choice;
		String menu = "";
		
		System.out.println("♡ ICIA 분식집에 오신 것을 환영합니다 ♡");
		System.out.println("\n주문을 도와드리겠습니다");
		System.out.println("1. 떡볶이 \t 2. 주먹밥");
		System.out.println("3. 순대 \t 4. 모둠튀김 \t\t 5.김밥");
		
		System.out.print("메뉴를 선택해 주세요 >>");
		num = sc.nextInt();
			
		switch(num) {
		case 1:
			menu = "떡볶이";
			price = 3500;
			break;
		case 2:
			menu = "주먹밥";
			price = 1500;
			break;
		case 3:
			menu = "순대";
			price = 2500;
			break;
		case 4:
			menu = "모둠튀김";
			price = 2000;
			break;
		case 5:
			menu = "김밥";
			price = 1500;
			break;
			
			default :
				System.out.println("\n해당 메뉴는 없습니다. ㅠㅁㅠ");
				break;
				
				
		}
		if(num>=1 && num<=5) {
			System.out.println("\n주문하신 메뉴는 " + menu + "입니다.");
			System.out.println("가격은 " + price + "원 입니다.");
			
			
			System.out.println("\n 1. 매장 \t 2. 포장");
			System.out.print("매장 혹은 포장을 선택해 주세요 >>");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("\n주문한 메뉴를 매장에서 먹습니다.");
				break;
			case 2:
				System.out.println("\n주문한 메뉴를 포장합니다.");
				break;
			default :
					System.out.println("선택사항이 없습니다.");
			}
					}
				
		System.out.println("♡이용해주셔서 감사합니다. ^ㅁ^♡");
	}

}
