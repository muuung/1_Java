package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	// for문 : 끝이 정해져 있는 경우 사용하는 반복문(== 반복 횟수가 지정되어 있는 경우)

	// [작성법]
	// for(초기식; 조건식; 증감식) {
	//	 조건식이 true일 때 반복 수행할 코드;
	// }

	// 초기식 : for문을 제어하는 용도의 변수 선언

	// 조건식 : for문의 반복 여부를 지정하는 식
	// 조건식이 true인 경우에 반복을 수행함
	// 보통 초기식에 사용된 변수를 이용해서 조건식을 작성

	// 증감식 : for문이 끝날 때마다 특정 값을 변화시키는 식
	// 보통 초기식에 사용된 변수를 증가/감소 시켜 조건식의 결과를 변하게 만듬
	
	public void ex1() {
		// for문 기초 사용법1
		// 1 ~ 10까지 반복 출력
		
		for(int i = 1; i <= 10; i++) {
			// 1)초기식;  2)조건식; 4)증감식
			
			// 3)반복 수행할 코드
			System.out.println(i + "출력");
			
			// 1출력
		}
		
	}
	
	public void ex2() {
		// for문 기초 사용법2
		// 5부터 12까지 1식 증가하면서 출력
		
		for (int i = 5; i <= 12; i++) {
			System.out.println(i + "출력");
		}
		
		System.out.println("===============");
		
		// 1부터 100까지의 모든 정수의 합
		
		int sum = 0;
		// 합계 저장용 변수
		// 왜 0으로 초기화하는가?
		// 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어
		// 누적이 필요한 상황에서 기준점으로 사용하기 적합
		
		for(int i = 1; i <= 100; i++ ) {
			sum += i;
			// i 값이 1 ~ 100까지 1씩 증가
			// i 값을 sum 변수에 계속 누적
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		
	}
	
	public void ex3() {
		// for문 기초 사용법3
		// 두 정수를 입력 받아
		// 두 정수 사이의 모든 정수 합을 출력
		// 단, 첫 번째 입력이 두 번째 입력보다 작아야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0; // 합계 저장용 변수
		
		if(num1 > num2) {
			System.out.println("첫 번째 숫자가 너무 크다구!!!!!!!!!!");
		} else {
			for(int i = num1; i <= num2; i++) {
				sum += i; //누적
			}
			System.out.printf("%d부터 %d까지의 합 : %d\n", num1, num2, sum);
		}

	}
	
	public void ex4() {
		// for문 기초 사용법4
		// 1부터 100까지 3씩 증가하며 출력
		
		for(int i = 1; i <= 100; i += 3) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n===============");
		
		// 10부터 20까지 0.5씩 증가
		
		for(double i = 10.0; i <= 20.0; i += 0.5) {
			System.out.print(i + " ");
		}
		
	}
	
	public void ex5() {
		// for문 + char + 자동/강제 형변환 응용
		// A ~ Z까지 출력
		
//		for(int i = 'A'; i <= 'Z'; i++) {
//			System.out.println((char)i);
//		}
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex6() {
		// 10부터 1까지 1씩 감소하면서 출력
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
	
	public void ex7() {
		// 입력, sum, for 응용
		// 정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.printf("입력%d : ", i);
			sum += sc.nextInt();
			// 입력 버퍼에서 다음 정수를 얻어와
			// sum 변수에 누적
		}
		
		System.out.println("합계 : " + sum);

	}
	
	public void ex8() {
	    // 정수를 몇 번 입력 받을지 먼저 입력 받고
	    // 입력된 정수의 합계를 출력
	      
	    // ex)
	    // 입력 받을 정수의 개수 : 3
	    // 입력 1 : 10
	    // 입력 2 : 20
	    // 입력 3 : 30
	    // 합계 : 60
	      
		// ex)
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 10
	    // 입력 2 : 20
	    // 합계 : 30
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int gaesu = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= gaesu; i++) {
			System.out.printf("입력 %d : ", i);
			sum += sc.nextInt();
		}

		System.out.println("합계 : " + sum);
		
	}
	
	public void ex9() {
		// 1부터 20까지 1씩 증가하며 출력
		// 단, 5의 배수에는 ()를 붙여서 출력
		// for, %(나머지), if-else
		
		for(int i = 1; i <= 20; i++) {
			if(i%5 == 0) {
				System.out.printf("(%d) ", i);
			} else {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void ex10() {
		// 구구단 출력
		// for, if, Scanner, 논리 연산자, print 메서드
		// 2 ~ 9 사이 수를 하나 입력 받아 해당하는 수의 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이가 아니라면
		// "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if (dan >= 2 && dan <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		System.out.println("===============");
		
		System.out.print("단 입력 : ");
		int ddan = sc.nextInt();
		
		if (ddan >= 2 && ddan <= 9) {
			for(int i = 9; i >= 1; i--) {
				System.out.printf("%d X %d = %d\n", ddan, i, ddan * i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	//========================================
	//========================================
	
	// [중첩 반복문]
	
	public void ex11() {
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
				}
			System.out.println();
			}
		
	}
	
	public void ex12() {
		// 구구단 2단부터 9단까지 모오오두 출력
		
		for(int x = 2; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				System.out.printf("%dX%d=%2d ", x, y, x * y);
				// %2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			}
			System.out.println(); // 줄 바꿈
		}
		
	}
	
	public void ex13() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요.
		// 1
		// 12
		// 123
		// 1234
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void ex14() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요.
		// 4
		// 43
		// 432
		// 4321
		
		for(int i = 4; i >= 1; i--) {
			for(int j = 4; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void ex15() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void ex16() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요.
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	public void ex17() {
		// 합계 : sum
		// 개수 : count
		// 1부터 20 사이 3의 배수의 개수 출력
		// count, %(나머지), for문
		
		int sum = 0;
		int count = 0; // 수를 셀 때는 0부터 1씩 증가시키면서 세는 것이 보통
		
		for(int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				sum += i; // 누적
				count++; // 1증가
			}
		}
		
		// \n : 개행문자
		System.out.println("\nsum : " + sum);
		System.out.println("count : " + count);
		
	}
	
	public void ex18() {
		// 2중 for문과 count를 이용해서 아래 모양 출력하기
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		
		int count = 1;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.printf("%3d ", count++);
				// 후위 증감 연산을 이용하여
				// 출력 후 count 값을 1 증가
			}
			System.out.println();
		}
		
	}
	
}
