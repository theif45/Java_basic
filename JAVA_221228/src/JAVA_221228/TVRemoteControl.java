package JAVA_221228;

//RemoteControl 인터페이스를 상속받음
//해당 인터페이스에서 상속받은 추상 메소드를 구현하거나, 클래스에 abstract 키워드를 추가해야 함(해당 클래스도 추상 클래스가 됨)
public class TVRemoteControl implements RemoteControl {
	private int useCount = 10;
	
//	부모인 RemoteControl 인터페이스에서 상속받은 메소드를 오버라이딩하여 사용함
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
		useRemoteControl();
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
		useRemoteControl();
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("TV 볼륨을 " + volume + "(으)로 조절합니다.");
		useRemoteControl();
	}
	
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			useRemoteControl();
		}
		else {
			System.out.println("무음을 해제합니다.");
			useRemoteControl();
		}
	}
	
	private void useRemoteControl() {
		useCount--;
		
		if (useCount < 0) {
			RemoteControl.changeBattery();
			useCount = 10;
		}
	}
}
