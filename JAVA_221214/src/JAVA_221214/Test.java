package JAVA_221214;

public class Test {
//	일반 멤버 변수, 인스턴스 멤버
	public int value1 = 100;
	public int value2 = 200;
	
//	정적 멤버 변수, 클래스 필드
	public static int value3 = 300;
	public static int value4 = 400;
	
	public void sum() {
		System.out.println("두 수의 덧셈은 : " + (value1 + value2));
	}
	
	public static void sub() {
		System.out.println("두 수의 뺄셈은 : " + (value3 - value4));
	}
	
	
	
}
