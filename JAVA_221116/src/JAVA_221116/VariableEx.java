package JAVA_221116;

public class VariableEx {

	public static void main(String[] args) {
// 		변수 선언 방법;
//		데이터타입 변수이름; // 변수를 선언만 함
//		데이터타입 변수이름 = 데이터; // 변수를 선언과 동시에 데이터를 저장(초기화)

//		변수 사용 방법:
//		변수명; //변수에 저장되어 있는 데이터를 가져오기
//		변수명 = 데이터; // 기존 변수에 새로운 데이터를 저장
//		한변 선언된 변수를 계속 활용할 수 있음
		
		int a; // 메모리에 변수 선언
		int b = 20; // 변수 선언 및 초기화 // 초기화는 변수에 데이터 저장하여 사용할 준비가 된 상태
		
		a = 10; // 변수 a를 초기화 함
		
		System.out.println(a);
		System.out.println(b);
		
		a = 100;
		b = 200;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = a + b;
		System.out.println(c);
		
		System.out.println("---------------------------------------------------");
		
//		자동 타입 변환
//		크기가 작은 데이터 타입에서 크기가 큰 데이터 타입으로 변환되는 것
//		Java 컴파일러가 자동으로 변환함 (사용자는 신경 안써도 됨)
//		Java의 기본데이터 타입은 정수 int, 실수 double임
//		데이터 타입에 상관없이 정수의 연산 시 기본 데이터 타입인 int형으로 자동 타입 변환 후 연산이 실행됨
		byte bValue1 = 50;
		byte bValue2 = 100;
		byte bResult = (byte) (bValue1 +bValue2); // byte 타입의 최대값을 넘어서서 반대값인 음수로 표현됨
		int iResult = 0;
		System.out.println(bValue1);
		System.out.println(bValue2);
		System.out.println(bResult);
		
		iResult = bValue1 + bValue2; // 자동 타입 변환 발생
		System.out.println(iResult);
		
		System.out.println("---------------------------------------------------");
		
		byte bValue =10;
		int iValue = bValue;
		System.out.println(iValue);
		
		char charValue = 'A';
		iValue = charValue;
		System.out.println(iValue);
		
		iValue = 500;
		long lValue = iValue;
		System.out.println(lValue);
		
		iValue = 500;
		double dValue = iValue;
		System.out.println(dValue);
		
		System.out.println("---------------------------------------------------");
		
//		강제 타입 변환
//		크기가 큰 데이터 타입에서 크기가 작은 데이터 타입으로 변환하는 것
//		Java 컴파일러가 자동으로 변환하지 않음 (사용자가 직접 변환을 진행해야 함)
//		강제 타입 변환 방법
//		작은 타입의 변수 = (작은 타입) 큰 타입의 데이터
		
		iValue = 100;
		charValue = (char) iValue; //char 타입으로 강제 형변환한다고 명시
		System.out.println(charValue);
		
		lValue = 500L;
		iValue = (int) lValue;
		System.out.println(iValue);
		
		dValue = 3.14;
		iValue = (int) dValue;
		System.out.println(iValue);
		
		System.out.println("---------------------------------------------------");		
		
		double dResult = 0.0;
		int iValue1 = 10;
		double dValue1 = 5.5;
		
//		iValue1이 더 큰 타입인 double 타입으로 자동 타입 변환을 진행하고 연산 함
		dResult = iValue1 + dValue1;
		System.out.println(dResult);
	}

}
