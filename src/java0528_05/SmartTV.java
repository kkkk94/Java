package java0528_05;

//extends 상속은 하나만 가능하다. implements 여러개 가능.
public class SmartTV implements RemoteControl, InternetSearch {

	//필드선언
	int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 스마트TV 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("스마트TV 음소거 합니다.");
		} else {
			System.out.println("스마트TV 음소거 해제합니다.");
		}
	}
	
}
