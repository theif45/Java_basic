package JAVA_221123;

public class ArrayCreate2Ex {

	public static void main(String[] args) {
//		문제 1) 이름이 numbers 이고, 크기가 10인 int 타입의 배열을 1개 선언하고, 원하는 숫자를 10개 입력한 후 배열의 내용을 모두 출력하는 프로그램을 작성하세요
//		배열을 선언과 동시에 데이터를 입력(1번 방식)
		
//		문제 2) 이름이 numArr이고, 크기가 5인 int 타입의 배열을 1개 선언하고, 원하는 숫자를 입력 후 반복문을 사용하여 모든 내용을 출력하세요
//		배열을 선언과 동시에 크기를 지정, 데이터를 따로 입력 (3번 방식)
		
		System.out.println("----- 문제 1 -----");
		
		int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("----- 문제 2 -----");
		
		int[] numArr = new int[5];
		
		numArr[0] = 1;
		numArr[1] = 3;
		numArr[2] = 5;
		numArr[3] = 7;
		numArr[4] = 9;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(numArr[i]);
		}
		
		int[] numArr2 = new int[5];
		System.out.println(numArr2[0]);
		System.out.println(numArr2[1]);
		
		String[] strArr = new String[5];
		System.out.println(strArr[0]);
		
//		배열의 길이 : 배열이름.length;
		
		int size = numArr2.length;
		System.out.println(size);
		
		System.out.println(numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
