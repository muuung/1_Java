package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int ko = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		System.out.print("수학 : ");
		int ma = sc.nextInt();
		
		System.out.println();
		System.out.println("합계 : " + (ko + en + ma));
		System.out.println("평균 : " + (ko + en + ma)/3.0);
		
		String ok = (ko >= 40) && (en >= 40) &&
				    (ma >= 40) && (((ko + en + ma)/3.0) >= 60) ?
				    "합격" : "불합격";

		System.out.println(ok);
	}

}
