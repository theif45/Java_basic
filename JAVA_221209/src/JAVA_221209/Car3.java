package JAVA_221209;

public class Car3 {
	public String name;
	public String type;
	public String size;
	public String color;
	public int maxSpeed;
	
	public Car3() {
		this("아반떼");
	}
	
	public Car3(String name) {
		this(name, "세단");
	}
	
	public Car3(String name, String type) {
		this(name, type, "회색");
	}
	
	public Car3(String name, String type, String color) {
		this(name, type, color, "준중형");
	}
	
	public Car3(String name, String type, String size, String color) {
		this(name, type, color, size, 250);
	}
	
	public Car3(String name, String type, String size, String color, int maxSpeed) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void ptrCarInfo() {
		System.out.println("차명 : " + name);
		System.out.println("차종 : " + type);
		System.out.println("크기 : " + color);
		System.out.println("컬러 : " + size);
		System.out.println("최고속도 : " + this.maxSpeed);
	}
		
	
	
}
