package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
			if(i == input) {
				System.out.println(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}
		}

	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		int big, small;
		
		if(input1 >= 1 && input2 >= 1) {
			if(input1 > input2) {
				big = input1;
				small = input2;
			} else if (input1 < input2) {
				big = input2;
				small = input1;
			} else {
				big = small = input1;
			}
			
			for(int i = small; i <= big; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("===== " + input + "단 =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}

	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		
		for(int i = sc.nextInt(); i <= 9; i++) {
			System.out.println("===== " + i + "단 =====");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		for(int i = sc.nextInt(); i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = input; y > x; y--) {
				System.out.print(" ");
			}
			
			for(int z = 1; z <= x; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int a = 1; a <= (2 * input -1); a++) {
			if(a <= input) {
				for(int b = 1; b <= a; b++) {
					System.out.print("*");
				}	
			} else {
				for(int b = input; b > a - input; b--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		for(int a = 1; a <= input; a++) {
//			for(int b = 1; b <= a; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int c = input; c > 1; c--) {
//			for(int d = 1; d < c; d++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int i = 1; i <= input*2-1; i++) {
				if(input-x >= i || input+x <= i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		for(int x = 1; x <= input; x++) {
//			for(int y = input; y > x; y--) {
//				System.out.print(" ");
//			}
//			
//			for(int z = 1; z <= x; z++) {
//				if(z == 1) {
//					System.out.print("*");
//				} else {					
//					System.out.print("**");
//				}
//			}
//			System.out.println();
//		}

	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int a = 1; a <= input; a++) {
			if(a == 1 || a == input) {
				for(int b = 1; b <= input; b++) {
					System.out.print("*");
				}
			} else {
				for(int c = 1; c <= input; c++) {
					if(c == 1 || c == input) {
						System.out.print("*");
					} else {
						System.out.print(" ");
						}
					}
				}
			System.out.println();
		}
		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		
		System.out.println("\ncount : " + count);

	}
	
}
