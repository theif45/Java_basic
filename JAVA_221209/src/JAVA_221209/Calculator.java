package JAVA_221209;

public class Calculator {
//	두 수의 덧셈의 연산 결과를 출력하는 메소드
	public void sum() {
		int x = 10;
		int y = 20;
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
//	두 수의 덧셈 결과를 출력하는 메소드
	public void plus(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
//	두 수의 덧셈 결과를 출력하는 메소드(실수)
	public void plusDouble(double x, double y) {
		double result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
	
}
