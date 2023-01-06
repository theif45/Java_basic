package JAVA_221216;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dCP = new DmbCellPhone("자바폰", "검정", 10);
		
//		CellPhone 클래스에서 상속받은 필드 사용
		System.out.println("모델 : " + dCP.model);
		System.out.println("색상 : " + dCP.color);
		
//		DmbCellPhone 클래스 자체적으로 존재하는 필드 사용
		System.out.println("채널 : " + dCP.channel);
		
//		CellPhone클래스에서 상속받은 메소드 실행
		dCP.powerOn();
		dCP.bell();
		dCP.sendVoice("여보세요");
		dCP.receiveVoice("안녕하세요!!, 저 홍길동인데요");
		dCP.sendVoice("아.... 네... 반갑습니다.");
		dCP.hangUp();
		
//		DmbCellPhone 클래스가 자체적으로 가지고 있는 메소드 실행
		dCP.turnOnDmb();
		dCP.changeChannelDmb(11);
		dCP.turnOffDmb();
	}

}
//문제 1) SmartTv를 만들기 위해 App 실행 메소드와 InterNet 메소드를 생성하고, Tv의 기본 기능을 구현하기 위해서 Tv 클래스를 생성하여 전체 기능을 가지고 있는 SmartTv를 만들어 출력하세요
//Tv 클래스 : 필드 - channel, volume, state, 메소드 - power On/Off, channel Up/Down, volume Up/Down
//SmartTv 클래스 : 필드 - url, userId, 메소드 - InterNet On/Off, urlChange, gameStart/End/Play