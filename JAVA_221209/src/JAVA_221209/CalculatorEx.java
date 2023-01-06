package JAVA_221209;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator cal1 = new Calculator();
		
		cal1.sum();
		cal1.plus(10, 20);
		cal1.plusDouble(10.0, 20.0);
		
		Calculator2 cal2 = new Calculator2();
		cal2.sum();
		cal2.sum(10, 20);
		cal2.sum(5.5, 10.3);
		cal2.sum(5, 10.3);
		cal2.sum(5.5, 10);
		
		cal2.sub(20, 10);
		cal2.sub(20.5, 10.2);
		cal2.sub(20, 10.2);
		cal2.sub(20.5, 10);
		
	}
	
	
}
