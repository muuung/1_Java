package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 양수일 때
		System.out.print("정수 입력 : ");
		int i1 = sc.nextInt();

		String s1 = i1 == 0 ? "0" : i1 > 0 ? "양수" : "음수";
		System.out.println(s1 + " 입니다.\n");
		
		
		// 음수일 때
		System.out.print("정수 입력 : ");
		int i2 = sc.nextInt();
		
		String s2 = i2 == 0 ? "0" : i2 > 0 ? "양수" : "음수";
		System.out.println(s2 + " 입니다.\n");
		
		
		// 0일 때
		System.out.print("정수 입력 : ");
		int i3 = sc.nextInt();
		
		String s3 = i3 == 0 ? "0" : i3 > 0 ? "양수" : "음수";
		System.out.println(s3 + " 입니다.");
		
		

	}

}
