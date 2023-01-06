package JAVA_221216;

public class Car {
	private int speed;
	private boolean stop; //클래스의 멤버 변수는 초기값을 가지고 있음
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//	외부에서는 멤버 변수 speed에 직접 접근이 불가능 하기 때문에 해당 멤버 변수에 접근할 수 있는 멤버 메소드를 생성하여 우회접근하도록 함
//	우회접근 시 해당 데이터에 대한 추가 연산 및 데이터 검증을 진행할 수 있음
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
