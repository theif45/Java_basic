package JAVA_221230;

//인터페이스 선언
public interface MyInter {
//	추상메소드 선언
	public void method1();
	
//	기능 추가를 위해서 추가한 기본 메소드
	public default void method2() {
		System.out.println("MyInter - method2() 실행");
	}
}
