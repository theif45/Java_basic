package JAVA_221123;

public class BreakEx {

	public static void main(String[] args) {
		
		System.out.println("----- break/continue -----");
		
		System.out.println("----- break -----");
		
		for (int i = 0; i < 10; i++ ) {
			if (i == 5) {
//				만나면 즉시 종료
				break;
			}
			else {
				System.out.println("현재 i의 값 : " + i);
			}
		}
		
		System.out.println("----- continue -----");
		
		for (int i = 0; i < 10; i++ ) {
			if (i == 5) {
//				만나면 현재만 종료하고 다음으로 넘어감
				continue;
			}
			else {
				System.out.println("현재 i의 값 : " + i);
			}
		}
		
		System.out.println("----- while문으로 break/continue -----");
		
		System.out.println("----- break -----");
		
		int count =0;
		
		while (count < 10) {
			count++;
			if (count == 5) {
				break;
			}
			else {
				System.out.println("현재 count의 값 : " + count);
			}
//			count ++;
		}
		
		System.out.println("----- continue -----");
		
		count = 0;
		
		while (count < 6) {
			count++;
			if (count == 3) {
				continue;
			}
			else {
				System.out.println("현재 count의 값 : " + count);
			}
//			count ++; // count의 값이 3이 되면 위의 if문과 continue문 때문에 무한반복함
		}

	}

}
