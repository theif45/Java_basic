package JAVA_221216;

public class Tv {
//	문제 1) SmartTv를 만들기 위해 App 실행 메소드와 InterNet 메소드를 생성하고, Tv의 기본 기능을 구현하기 위해서 Tv 클래스를 생성하여 전체 기능을 가지고 있는 SmartTv를 만들어 출력하세요
//	Tv 클래스 : 필드 - channel, volume, state, 메소드 - power On/Off, channel Up/Down, volume Up/Down
//	SmartTv 클래스 : 필드 - url, userId, 메소드 - InterNet On/Off, urlChange, gameStart/End/Play
	public int channel;
	public int volume;
	public String state;
	
	public Tv() {
		channel = 5;
		volume = 5;
		
	}
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("채널이 " + ++channel + "번입니다");
	}
	
	public void channelDown() {
		System.out.println("채널이 " + --channel + "번입니다");
	}
	
	public void volumeUP() {
		System.out.println("볼륨이 " + ++volume + "입니다");
	}
	
	public void volumeDown() {
		System.out.println("볼륨이 " + --volume + "입니다");
	}
	
}
