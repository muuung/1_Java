package edu.kh.control.condition;

import java.util.Scanner;

public class IntegerExample {

	public void ex4() {
		// 산술 연산 계산기 만들기
		// 두 정수(int)와 1개의 연산자(+ - * / % (String))를 입력받아서
		// 연산 결과를 출력
		// 단, 나누기(/) 연산 시 0으로는 나눌 수 없도록 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		String result = null;
		
		switch(op) {
		case "+" :
			result = Integer.toString(num1 + num2); break;
		case "-" :
			result = Integer.toString(num1 - num2); break;
		case "*" :
			result = Integer.toString(num1 * num2); break;
		case "/" : 
			if(num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다."); break;
			} else {
				result = Integer.toString(num1 / num2); break;
			}
		case "%" :
			result = Integer.toString(num1 % num2); break;
		default :
			System.out.println("존재하지 않는 연산자 입니다.");
		}
		
		if(result != null) {
			System.out.printf("%d %s %d = %s", num1, op, num2, result);
		}
		
	}

}
