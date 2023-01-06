package JAVA_221214;

//main의 실질적 사용법
//TestEx te = new TestEx();
//te.main();

public class TestEx {

	public static void main(String[] args) {
//		객체 생성을 통해서 인스턴스 필드에 접근
		Test t1 = new Test();
		System.out.println("객체 t1의 value1 값 : " + t1.value1);
		System.out.println("객체 t1의 value2 값 : " + t1.value2);
		System.out.println("객체 t1의 value3 값 : " + t1.value3);
		System.out.println("객체 t1의 value4 값 : " + t1.value4);
		
//		정적 필드에 접근
		System.out.println("정적 멤버 value3 값 : " + Test.value3);
		System.out.println("정적 멤버 value4 값 : " + Test.value4);
//		value1, value2는 정적 멤버가 아니므로 클래스명으로 직접 접근이 불가능함
//		System.out.println("정적 멤버 value3 값 : " + Test.value1);
//		System.out.println("정적 멤버 value4 값 : " + Test.value2);
		
//		객체를 통한 멤버 메소드 호출
		t1.sum();
		t1.sub();
		
//		클래스의 정적 멤버 메소드 호출
		Test.sub();
//		sum() 메소드는 Test 클래스의 정적 멤버가 아니므로 클래스명으로 직접 접근이 불가능함
//		Tes.sum();
		
		System.out.println();
		
		Test t2 = new Test();
		
		t1.value1 = 10;
		t1.value2 = 20;
		
		t2.value1 = 100;
		t2.value2 = 200;
		
		System.out.println("객체 t1의 value1 값 : " + t1.value1);
		System.out.println("객체 t1의 value2 값 : " + t1.value2);
		System.out.println("객체 t2의 value1 값 : " + t2.value1);
		System.out.println("객체 t2의 value2 값 : " + t2.value2);
		
		System.out.println("\nt1의 멤버 값 변경\n");
		
		t1.value1 = 1000;
		t1.value2 = 2000;
		
		System.out.println("객체 t1의 value1 값 : " + t1.value1);
		System.out.println("객체 t1의 value2 값 : " + t1.value2);
		System.out.println("객체 t2의 value1 값 : " + t2.value1);
		System.out.println("객체 t2의 value2 값 : " + t2.value2);
		
		System.out.println("\nt1과 t2의 정적멤버 값 확인\n");
		
		System.out.println("객체 t1의 정적 멤버 value3 값 : " + t1.value3);
		System.out.println("객체 t1의 정적 멤버 value4 값 : " + t1.value4);
		System.out.println("객체 t2의 정적 멤버 value3 값 : " + t2.value3);
		System.out.println("객체 t2의 정적 멤버 value4 값 : " + t2.value4);
		
		System.out.println("\nt1의 정적 멤버 데이터 수정\n");
		
		t1.value3 = 300000;
		t1.value4 = 400000;
		
//		정적 멤버는 클래스의 멤버이므로 메모리 공간이 하나로 되어 있음
		System.out.println("객체 t1의 정적 멤버 value3 값 : " + t1.value3);
		System.out.println("객체 t1의 정적 멤버 value4 값 : " + t1.value4);
		System.out.println("객체 t2의 정적 멤버 value3 값 : " + t2.value3);
		System.out.println("객체 t2의 정적 멤버 value4 값 : " + t2.value4);
		System.out.println("클래스 Test의 정적 멤버 value3 : " + Test.value3);
		System.out.println("클래스 Test의 정적 멤버 value4 : " + Test.value4);
		
		
		
	}

}
