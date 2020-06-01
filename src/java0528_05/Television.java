package java0528_05;

//구현클래스
public class Television implements RemoteControl {

	//필드선언
	private int volume;
	
	//추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; //static 상수필드여서 객체없이 바로 불러옴
		} else if (volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	//default 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV 음소거 합니다.");
		} else {
			System.out.println("TV 음소거 해제 합니다.");
		}
	}
	
}
