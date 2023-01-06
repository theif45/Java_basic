package JAVA_221221;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
//		해당 클래스 타입의 객체를 생성 후 객체의 멤버를 호출해야함
//		bus.run();
//		taxi.run();
		
//		Bus, Taxi 클래스의 부모 클래스인 Vehicle 클래스의 객체를 생성
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		
//		부모 클래스의 객체에 자식 클래스의 객체를 대입함
//		겉은 부모 클래스의 객체이지만 실제 데이터는 자식 클래스의 객체임
		vehicle = bus;
		vehicle.run();
		vehicle = taxi;
		vehicle.run();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
