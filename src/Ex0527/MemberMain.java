package Ex0527;

public class MemberMain {

	public static void main(String[] args) {
		//생성자
		Member member1 = new Member("황인철","inchoriya");	//name과 id
		Member member2 = new Member("임훈","hoonzzang");
		
		member1.password = "12345";
		
		boolean result = member1.login("inchoriya","12345");
		
		if (result) {
			System.out.println("로그인성공!");
			member1.logout("inchoriya");
		}else {
			System.out.println("id또는 password가 올바르지 않습니다");
		}

	}

}
