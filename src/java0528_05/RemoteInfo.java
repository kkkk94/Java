package java0528_05;

public class RemoteInfo {
	void Info(RemoteControl remote, int volume, boolean mute) {
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	
	void Info2(SmartTV SmartTV, int volume, boolean mute, String url) {
		SmartTV.turnOn();
		SmartTV.search(url);
		SmartTV.setVolume(volume);
		SmartTV.setMute(mute);
		SmartTV.turnOff();
	}
	
//	void RemoteInfo(RemoteControl remote, InternetSearch is, String url, boolean mute, int volume) {
//		remote.turnOn();
//		is.search(url);
//		remote.setMute(mute);
//		remote.setVolume(volume);
//		remote.turnOff();
//	}
}
