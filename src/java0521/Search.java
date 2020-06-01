package java0521;
//Member - Search 흐름 파악하기

public class Search {

	//[]배열로 받기
	Member[] members = new Member[4];
	//members : Member 압축해서 가져온것
	
	public Search() {
		members[0] = new Member("황인철", 35 , 179, "인천시 남동구");
		members[1] = new Member("양기두", 35 , 176, "부천시 원미구");
		members[2] = new Member("임훈짱", 51 , 183, "서울시 노원구");
		members[3] = new Member("아이씨", 8 , 5, "인천시 미추홀구");
		//이름이 같으면 두명 다 출력
	}

	
	boolean searchMember(String name) {
		boolean boolResult = false;
		for(int i=0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				boolResult = true;
			}
		}
		return boolResult;
}


	private void printInfo(Member member) {
		System.out.println(member.getName() + "으로 찾은 결과");
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		System.out.println("키 : " + member.getHeight());
		System.out.println("주소 : " + member.getAddr());
		
	}
}