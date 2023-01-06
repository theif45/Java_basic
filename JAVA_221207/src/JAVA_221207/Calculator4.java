package JAVA_221207;

public class Calculator4 {
//	문제 1. 클래스 Calculator4을 생성하고 사칙연산을 하기 위한 메서드 4개를 각각 생성 후 사칙 연산을 진행하세요
//	메서드 명 : sum, sub, multi, div
//	메서드 형태 : div = 1번형태, sum = 2번형태, sub = 3번형태, multi = 4번형태
//	변수 : int x, int y, int result
	void sum(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
	int sub() {
		int x = 20;
		int y = 10;
		int result = x - y;
		return result;
	}
	
	int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	
	void div() {
		int x = 20;
		int y = 10;
		int result = x / y;
		System.out.println("두 수의 나눗셈은 : " + result);
	}
	
	

}
