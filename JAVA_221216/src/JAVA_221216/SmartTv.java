package JAVA_221216;

public class SmartTv extends Tv{
//	문제 1) SmartTv를 만들기 위해 App 실행 메소드와 InterNet 메소드를 생성하고, Tv의 기본 기능을 구현하기 위해서 Tv 클래스를 생성하여 전체 기능을 가지고 있는 SmartTv를 만들어 출력하세요
//	Tv 클래스 : 필드 - channel, volume, state, 메소드 - power On/Off, channel Up/Down, volume Up/Down
//	SmartTv 클래스 : 필드 - url, userId, 메소드 - InterNet On/Off, urlChange, gameStart/End/Play
	public String url;
	public String userId;
	
	public SmartTv() {
		url = "www.naver.com";
		userId = "홍길동";
	}
	public void InterNetOn() {
		System.out.println("인터넷을 시작합니다");
	}
	
	public void InterNetOff() {
		System.out.println("인터넷을 종료합니다");
	}
	
	public void urlChange(String url) {
		this.url = url;
		System.out.println("url을 " + url + "로 변경합니다.");
	}
	
	public void gameStart() {
		System.out.println("게임을 시작합니다.");
	}
	
	public void gameEnd() {
		System.out.println("게임을 종료합니다.");
	}
	
	public void gamePlay() {
		System.out.println(userId + "이 게임을 시작합니다.");
	}
}
