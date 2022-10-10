package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (input % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n"
							+ "수학 : %d\n"
							+ "영어 : %d\n"
							+ "합계 : %d\n"
							+ "평균 : %.1f\n"
							+ "축하합니다, 합격입니다!\n", kor, mat, eng, sum, avg);
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		String day = null;
		
		switch(input) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = "31"; break;
		case 4 : case 6 : case 9 : case 11 :
			day = "30"; break;
		case 2 :
			day = "28"; break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.\n", input);
		}
		
		if(day != null) {
		System.out.printf("%d월은 %s일까지 있습니다.\n", input, day);
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		System.out.println("BMI 지수 : " + bmi);
		
		String jisu;
		
		if(bmi < 18.5) {
			jisu = "저체중";
		} else if(bmi < 23) {
			jisu = "정상체중";
		} else if(bmi > 23 && bmi < 25) {
			jisu = "과체중";
		} else if(bmi > 25 && bmi < 30) {
			jisu = "비만";
		} else {
			jisu = "고도비만";
		}
		
		System.out.println(jisu);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int jj = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int kk = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int gg = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int cc = sc.nextInt();
		
		System.out.println("=============== 결과 ===============");
		
		double jjsc = jj * 0.2;
		double kksc = kk * 0.3;
		double ggsc = gg * 0.3;
		double score = jjsc + kksc + ggsc + cc;
		
		if(cc > 14) {
			if(score >= 70) {
				print(jjsc, kksc, ggsc, cc, score);
				System.out.println("PASS");
			} else {
				print(jjsc, kksc, ggsc, cc, score);
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]\n", cc);
		}
		
	}
	
	public void print(double jsc, double ksc, double gsc, double c, double sco) {
	System.out.println("중간 고사 점수(20) : " + jsc);
	System.out.println("기말 고사 점수(30) : " + ksc);
	System.out.println("과제 점수(30) : " + gsc);
	System.out.println("출석 횟수(20) : " + (double)c);
	System.out.println("총점 : " + sco);
	}
	
}
