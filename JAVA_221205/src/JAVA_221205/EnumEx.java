package JAVA_221205;

import java.util.Calendar;

//열거형은 사용자가 생성하는 데이터 타입
//한정된 데이터만 사용할 수 있는 형태의 데이터 타입
//열거형으로 변수를 생성 시 해당 열거형에 지정된 데이터만 저장할 수 있음
//열거형도 참조 타입이므로 null값을 가질 수 있음
enum Week { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

public class EnumEx {

	public static void main(String[] args) {
		Week today = null;
		
//		자바에서 사용하는 날짜 및 시간을 표시하기 위한 클래스
		Calendar cal = Calendar.getInstance();
//		현재 시간을 기준으로 오늘의 요일을 가져옴 (int타입으로 반환, 1 ~ 7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUESDAY;
			break;
		case 4 :
			today = Week.WEDNESDAY;
			break;
		case 5 :
			today = Week.THURSDAY;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		case 7 :
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("일요일에는 놉니다.");
		}
		else {
			System.out.println("자바 공부를 합니다.");
		}
		
		
		
		

	}

}