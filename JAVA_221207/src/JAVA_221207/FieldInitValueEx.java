package JAVA_221207;

public class FieldInitValueEx {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		FieldInitValue fiv2 = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("charField : " + fiv.charField);
		
		System.out.println("booleanField : " + fiv.booleanField);
		
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("stringField : " + fiv.stringField);
		
//		필드 (객체의 멤버 변수)는 초기값이 존재하지만 일반 변수는 초기값이 없음
//		변수의 초기화 : 변수를 사용하기 위해서 선언 후 해당 변수에 데이터를 처음 저장하는 행위
		byte byteValue = 0;
		short shortValue = 0;
		int intValue = 0;
		long longValue = 0L;
		char charValue = '\0';
		
		boolean booleanValue = false;
		
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		int[] arrValue = null;
		String stringValue = "";
		
//		일반적인 변수는 초기화를 하지 않으면 사용할 수 없음
		System.out.println("byteValue : " + byteValue);
		System.out.println("shortValue : " + shortValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		System.out.println("charValue : " + charValue);
		
		System.out.println("booleanValue : " + booleanValue);
		
		System.out.println("floatValue : " + floatValue);
		System.out.println("doubleValue : " + doubleValue);
		
		System.out.println("arrValue : " + arrValue);
		System.out.println("stringValue : " + stringValue);
		
		

	}

}
