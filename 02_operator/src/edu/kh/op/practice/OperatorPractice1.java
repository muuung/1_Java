package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int pe = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int ca = sc.nextInt();
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + (ca / pe));
		System.out.println("남은 사탕 개수 : " + (ca % pe));
		
	}

}
