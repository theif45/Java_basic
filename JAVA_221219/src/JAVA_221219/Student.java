package JAVA_221219;

public class Student extends People{
	public int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
//		부모 클래스의 생성자가 없을 경우 자식 클래스에서 부모 클래스의 생성자(super()) 사용하지 않는 것이 아니라 생략된 것임
		super(name, ssn); //부모 클래스의 객체를 생성할 수 없어서 오류 발생
		this.studentNo = studentNo;
//		super(name, ssn); //부모 클래스의 객체를 가장 먼저 호출해야 함
	}
}
