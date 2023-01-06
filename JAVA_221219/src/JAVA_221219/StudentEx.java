package JAVA_221219;

public class StudentEx {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("이름 : " + student.name);
		System.out.println("주민번호 : " + student.ssn);
		System.out.println("학번 : " + student.studentNo);
		
		People p = new People("임꺽정", "123456-1234567");
		
		System.out.println("이름 : " + p.name);
		System.out.println("주민번호 : " + p.ssn); 
		
	}
	

}
