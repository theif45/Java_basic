package JAVA_221223;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------------------------------");
		
//		Animal 클래스는 추상 클래스이기 때문에 객체 생성은 불가능
//		Animal 클래스 타입의 변수 선언은 문제가 없음
		Animal animal = null;
		
		animal = new Dog();//자식 클래스의 객체는 부모 클래스 타입의 변수에 저장가능(대입)
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("------------------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
