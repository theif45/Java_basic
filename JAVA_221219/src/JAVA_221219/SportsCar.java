package JAVA_221219;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
//		maxSpeed는 final 필드이기 때문에 수정이 불가능함
//		maxSpeed = 300;
	}
	
//	부모 클래스인 Car의 멤버 메소드인 stop()이 final 메소드이므로 오버라이딩이 불가능함
//	@Override
//	public void stop() {
//		
//	}
}
