package JAVA_221219;

public class SupersonicAirplane extends Airplane {
//	상수 설정
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
//			오버라이딩 시 상속받은 부모 클래스의 멤버 메소드를 호출
			super.fly();
		}
	}
}
