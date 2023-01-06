package JAVA_221205;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();

		Car yourCar = new Car();
		yourCar.model = "쏘랜토";
		yourCar.color = "은색";
		yourCar.speed = 100;

		System.out.println(myCar);
		System.out.println(yourCar);

		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		myCar.speed = 50;

		System.out.println("현재속도 : " + myCar.speed);

		System.out.println("제작회사 : " + yourCar.company);
		System.out.println("모델명 : " + yourCar.model);
		System.out.println("색상 : " + yourCar.color);
		System.out.println("최고속도 : " + yourCar.maxSpeed);
		System.out.println("현재속도 : " + yourCar.speed);

	}

}
