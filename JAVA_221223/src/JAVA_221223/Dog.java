package JAVA_221223;

//추상 메소드 sound()를 가지고 있는 추상 클래스 Animal을 상속받아 추상 메소드를 구현함
public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
		
		
	}
	
}
