package JAVA_221223;

//인터페이스는 스스로 객체를 생성할 수 없기 때문에 반드시 자식 클래스가 상속받아 멤버를 구현하여 사용해야 함
//인터페이스를 상속받아 사용하는 클래스가 인터페이스의 구성 멤버 중 추상 메소드를 구현하지 않으면 해당 클래스는 추상 클래스로 선언해야 함
public class TVRemoteControl implements RemoteControl {
	
	public void ptrField() {
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		System.out.println(TVRemoteControl.MAX_VOLUME);
		System.out.println(TVRemoteControl.MIN_VOLUME);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 " + volume + "으로 설정합니다.");
	}
}
