package JAVA_221207;

public class FieldInitValue {
//	기본 정수형 필드
	byte byteField;
	short shortField;
	int intField;
	long longField;
	char charField;
	
//	기본 논리형 필드
	boolean booleanField;
	
//	기본 실수형 필드
	float floatField;
	double doubleField;
	
//	참조형 필드
	int[] arrField;
	String stringField;
	
	public void test() {
		intField = 10;
		System.out.println(intField);
	}
	

}
