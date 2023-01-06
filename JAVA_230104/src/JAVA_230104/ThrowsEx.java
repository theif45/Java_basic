package JAVA_230104;

public class ThrowsEx {

//	throws : 메소드의 매개변수 뒤에 throws Exception을 사용하면 예외가 발생하는 메소드에서 try ~ catch를 통해서 예외처리를 하는 것이 아니라 해당 메소드를 실행하는 곳에서 try~catch를 사용하여 예외처리를 대신 함
//	throws를 사용 시 각각의 메소드에서 예외처리를 하던 것을 한곳에서 예외처리를 할 수 있기 때문에 각각의 메소드의 소스코드가 간단해 짐
	public static void main(String[] args) {

		System.out.println("----- main 메소드 -----");
//		method1()에서 발생한 예외를 대신 처리하기 위한 try ~ catch문을 사용
		try {
			method1(10, 0);
		} catch (Exception e) {
			System.out.println("main 메소드 실행 시 오류가 발생했습니다.");
		}

		System.out.println("\n----- main 메소드 정상 실행 완료 -----\n");
	}

//	throws Exception을 사용하여 해당 메소드가 아닌 메소드를 호출한 곳에서 예외처릴르 하도록 예외를 떠 넘김
//	예외 처리를 하지 않기 때문에 소스코드가 간단해짐
	public static void method1(int a, int b) throws Exception {

		System.out.println("\n----- method1 -----\n");

//		예외가 발생할 수 있는 소스코드
//		try ~ catch 구문을 사용하여 예외처리를 메소드 내부에서 진행
//		try {
//			int result = 0;
//			result = a / b;
//			System.out.println("method1의 result 값 : " + result);
//		} catch (Exception e) {
//			System.out.println("method1연산 시 오류가 발생했습니다.");
//		}

		int result = 0;
		result = a / b;
		System.out.println("method1의 result 값 : " + result);

		System.out.println("\n----- method1 실행 완료 -----\n");
	}
}
