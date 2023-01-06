package JAVA_221219;

public class People {
	public String name;
	public String ssn;
	
//	부모 클래스의 생성자가 하나도 없을 경우 자식 생성자에서 super()를 생략 가능
//	부모 클래스에서는 생성자가 없는데 자식 클래스에서 super() 사용 시 오류 발생
//	부모 클래스에서 생성자가 있을 경우 자식 클래스에서 반드시 super()를 사용해야 함
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
