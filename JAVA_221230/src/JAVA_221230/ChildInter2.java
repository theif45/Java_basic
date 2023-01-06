package JAVA_221230;

public interface ChildInter2 extends ParentInter {
//	부모 인터페이스에서 상속받은 추상 메소드와 디폴트 메소드가 존재
	
//	상속받은 디폴트 메소드를 오버라이딩
	@Override
	public default void method2() {
		System.out.println("ChildInter2 - method2()");
	}
	
//	전용 추상 메소드 선언
	public void method3();
	
	
	
	
}
