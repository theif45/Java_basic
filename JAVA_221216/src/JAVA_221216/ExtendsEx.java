package JAVA_221216;

public class ExtendsEx {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("클래스 a의 field1 : " + a.field1);
		a.method1();
		
		B b = new B();
		System.out.println("클래스 b의 field2 : " + b.field2);
		b.method2();
		System.out.println("클래스 b의 field1 : " + b.field1);
		b.method1();
		
		
	}

}
