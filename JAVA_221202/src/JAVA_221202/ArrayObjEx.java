package JAVA_221202;

public class ArrayObjEx {

	public static void main(String[] args) {
//		기본 타입으로 배열을 생성 시 배열의 요소에 값(데이터 자체)가 저장됨
//		참조 타입으로 배열을 생성 시 배열의 요소에 주소가 저장됨
		String[] strArr = new String[3];
		strArr[0] = "Java";
		strArr[1] = "Java";
		strArr[2] = new String("Java");
		
//		0번 index와 1번 index에 저장된 주소가 같음
		System.out.println(strArr[0] == strArr[1]);
//		0번 index와 2번 index에 저장된 주소가 다름
		System.out.println(strArr[0] == strArr[2]);
//		0번 index와 2번 index에 저장된 주소가 가지고 있는 데이터 자체를 비교
		System.out.println(strArr[0].equals(strArr[2]));
		
		
		
		

	}

}
