package JAVA_221116;

public class opEx {
//	main 메서드 : 프로그램의 시작, 끝
	public static void main(String[] args) {
		int a = 100;
		int b = 30;
		
		int c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c= a * b;
		System.out.println(c);
		
		c = a / b;
		System.out.println(c);
		
		c = a % b;
		System.out.println(c);
		
		
		System.out.println("---------------------------------------");
		
		String str1 = "안녕하세요";
		String str2 = "자바 저녁 강의입니다";
		System.out.println(str2);
		System.out.println(str1);
		String str3 = str2 + str1;
		System.out.println(str3);
		
		System.out.println("이제 곧 9시 50분 입니다." + "종료 시간이네요");
		
		str1 = "100"; // 숫자이지만 실제 데이터 타입은 문자열 타입인 데이터
		str2 = "200";
//		문자열은 연산이 불가능한, 연결만 가능함
		str3 = str1 + str2;
		System.out.println(str3);
//		문자열과 숫자를 연산 시 문자열을 연산할 수 없으니 둘다 문자열로 변경하여 문자열을 연결함
		System.out.println("100" + 200);
	}

}
