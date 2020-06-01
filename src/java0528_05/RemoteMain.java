package java0528_05;

public class RemoteMain {

	public static void main(String[] args) {
		//1
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(11);
		tv.setMute(false);
		tv.turnOff();
		
		System.out.println();
		
		//인터페이스 변수 선언
		RemoteControl rc = null;
		//Audio객체를 인터페이스 타입에 대입
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		System.out.println();
		System.out.println("3번째 다형성");
		//TV, Audio
		//3번째 방법 : 다형성, 유틸클래스
		
		RemoteInfo info = new RemoteInfo();
		info.Info(tv, 6, false);
		//info.Info(rc, 3, false);
		info.Info(new Audio(), -1, true);
		
		System.out.println();
		//smartTV에 대한 다형성 메소드
		info.Info2(new SmartTV(), 5, true, "네이버");
		
//		SmartTV smartTv = new SmartTV();
//		info.RemoteInfo(smartTv, smartTv, "Naver", false, 8);
	}

}
