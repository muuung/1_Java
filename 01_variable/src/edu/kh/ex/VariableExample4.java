package edu.kh.ex;

import java.util.Scanner; // 자바에서 미리 만들어 둔 Scanner를 얻어옴
						  // 해당 클래스에 사용 가능
public class VariableExample4 {

	public static void main(String[] args) {
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// 1) class 위에 import java.util.Scanner; 작성
		
		// 2) 얻어온 Scanner 생성
		Scanner sc = new Scanner(System.in);
		// sc라는 이름으로 Scanner 사용 가능
		
		// 3) Scanner로 입력 받음
		// 정수 : sc.nextInt();
		
		System.out.println("입력 받은 두 정수의 합");
		
		System.out.print("정수 입력 1 : ");
		int x = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int y = sc.nextInt();
		
		int z = x + y;
		System.out.printf("%d + %d = %d\n", x, y, z);
		
		System.out.println("입력 받은 두 실수의 합");
		
		System.out.print("실수 입력 1 : ");
		double a = sc.nextDouble();
		System.out.print("실수 입력 2 : ");
		double b = sc.nextDouble();
		// 키보드로부터 다음 실수를 입력 받아 그 값을 변수에 대입

		double c = x + y;
		System.out.printf("%.2f + %.2f = %.2f\n", a, b, c);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next(); // 다음 입력되는 단어 하나를 name 변수에 저장
								 // 단어 : 띄어쓰기 없는 문자열

		System.out.println(name + "님 오늘 하루도 고생하셨습니다");
		
	}

}
