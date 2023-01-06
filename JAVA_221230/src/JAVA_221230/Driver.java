package JAVA_221230;

public class Driver {
//	Driver 클래스 전용 메소드인 drive 메소드
//	매개변수로 인터페이스인 Vehicle을 사용함
//	Vehicle 인터페이스를 상속받아 구현한 객체를 매개변수로 받을 수 있음
//	Bus, Taxi 클래스를 매개변수로 사용할 수 있음
	public void drive(Vehicle vehicle) {
//		매개변수로 받은 데이터가 Bus 클래스 타입의 객체인지 확인
		if (vehicle instanceof Bus) {
//			Bus클래스 타입 객체로 강제 형변환
			Bus bus = (Bus) vehicle;
//			Bus클래스의 전용 메소드인 checkFare() 실행
			bus.chechFare();
		}

		vehicle.run();

	}
}
