package JAVA_221216.package2;

import JAVA_221216.package1.A;

public class D {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.classCvalA);
		System.out.println(c.classCvalB);
		
		A a = new A();
		System.out.println(a.classAvalA);
//		A 클래스의 멤버 변수인 classAvalB의 접근 제한자가 default이므로 다른 패키지에서 클래스A를 호출하여 사용 시 해당 변수에 접근할 수 없음
//		System.out.println(a.classAvalB);
		
	}

}
