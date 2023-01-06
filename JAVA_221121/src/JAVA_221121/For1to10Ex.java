package JAVA_221121;

import java.util.Scanner;

public class For1to10Ex {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("----- 1 ~ 10까지 출력 -----");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		System.out.println("-------------------------------");
//	문제 1) for문을 사용하여 1 ~ 100까지를 출력하는 프로그램을 작성하세요
	
//	문제 2) 반복문을 사용하여 1 ~ 10까지의 총합을 구하는 프로그램을 작성하세요
//	총합을 저장할 변수가 1개 추가로 필요함 (int total)
	
//	문제 3) 키보드로 숫자를 하나 입력받아 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요
		
//		문제 1
		System.out.println("------------문제 1-------------------");
		
		for (int i = 1; i <= 100; i++) {
		System.out.println(i);
		}
		
//		문제 2
		System.out.println("------------문제 2-------------------");
		
		int total = 0;
		
		for (int i = 0; i <= 10; i++) {
			total += i;
		}
		System.out.println("1 ~ 10까지의 합은 : " + total);
		
//		문제 3
		System.out.println("------------문제 3-------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하시오 : ");
		int num = sc.nextInt();
		int multi = 0;
		
		for (int i = 1; i<=9; i++) {
			multi = num * i;
			System.out.println(num + " * " + i + " = " + multi);
		}
	}
}
