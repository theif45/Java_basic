package JAVA_221118;

import java.util.Scanner;

public class ElseIfEx {

	public static void main(String[] args) {
//		else if 문의 else문은 생략이 가능함
//		else가 나오기 전의 조건문에서 모든 조건을 다 사용하였을 경우 생략 가능
//		특정 영역까지만 사용하고자 할 경우 생략 가능
		
//		else if 사용 시 주의 사항
//		조건문을 단계적으로 사용해야 함
		int score = 75;
		
		if (score >= 90) {
			System.out.println("당신의 점수가 90 보다 크고, 등급은 A입니다.");
		}
		else if (score >= 80) {
			System.out.println("당신의 점수가 80 보다 크고, 등급은 B입니다.");			
		}
		else if (score >= 70) {
			System.out.println("당신의 점수가 70 보다 크고, 등급은 C입니다.");
		}
		else if (score >= 60) {
			System.out.println("당신의 점수가 60 보다 크고, 등급은 D입니다.");
		}
		else {
			System.out.println("당신의 점수가 60 보다 작고, 등급은 F입니다.");
		}
		
		System.out.println("---------------------------------------");
//		문제 1) 점수를 국어, 영어, 수학 점수의 평균을 구하고, 평균 점수를 기반으로 등급을 구하는 프로그램을 작성하세요
//		조건 : A+ 95이상, A 90이상, B+ 85이상, B 80이상, C는 70이상, D는 60이상, F는 60미만
//		국어, 영어, 수학 점수는 임의의 숫자로 사용
		
//		사용자 키보드 입력을 받는 명령어
		Scanner sc = new Scanner(System.in);
		
//		nextInt() : 키보드의 입력을 정수로 받음
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avgScore = total / 3;
		
		System.out.println("당신의 평균은 : " + avgScore);
		
		if(avgScore >= 95) {
			System.out.println("당신의 점수는 95 보다 크고, 등급은 A+입니다.");
		}
		else if(avgScore >= 90) {
			System.out.println("당신의 점수는 90 보다 크고, 등급은 A입니다.");
		}
		else if(avgScore >= 85) {
			System.out.println("당신의 점수는 85 보다 크고, 등급은 B+입니다.");
		}
		else if(avgScore >= 80) {
			System.out.println("당신의 점수는 80 보다 크고, 등급은 B입니다.");
		}
		else if(avgScore >= 70) {
			System.out.println("당신의 점수는 70 보다 크고, 등급은 C입니다.");
		}
		else if(avgScore >= 60) {
			System.out.println("당신의 점수는 60 보다 크고, 등급은 D입니다.");
		}
		else {
			System.out.println("당신의 점수는 60 보다 작고, 등급은 F입니다.");
		}
	}

}
