package JAVA_221219;

public class ComputerEx {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
//		System.out.println("원 면적 : " + com.areaCircle1(r));
//		System.out.println("원 면적 : " + com.areaCircle(r, r));
		
	}

}
