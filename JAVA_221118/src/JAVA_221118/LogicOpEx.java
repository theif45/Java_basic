package JAVA_221118;

public class LogicOpEx {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 97) && (charCode <= 90)){
			System.out.println("소문자 입니다.");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0 ~ 9 숫자 입니다.ㅣ");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 입니다.");
		}
	}

}
