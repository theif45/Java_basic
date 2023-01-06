package JAVA_221223;

//추상 클래스 선언
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
//	추상 메소드
//	추상 메소드는 실행 소스코드가 있는 코드 블럭이 없음
	public abstract void sound();
	
}
