package JAVA_221118;

public class IfEx {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		int money = 10000;
		System.out.println("중화요리점에 갔습니다.");
		
		System.out.println("요리를 주문합니다.");
		
		if (money >= 11000) {
			System.out.println("군만두를 주문합니다.");
		}
	
		System.out.println("자장면을 주문합니다.");
	
		System.out.println("음식을 맛있게 먹습니다.");
	}
}
