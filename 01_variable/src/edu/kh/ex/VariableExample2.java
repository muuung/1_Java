package edu.kh.ex;

public class VariableExample2 {

	// 글자 크기 조절 : ctrl + (위쪽 숫자 배열) - or +

	// main method(메인 메서드) : 자바 애플리케이션 실행 시 반드시 필요한 구문
	public static void main(String[] args) {

	// **** 변수 명명 규칙 ****
	// 1. 대소문자가 구분되며 길이 제한이 없음 (단, 띄어쓰기X)
	int num1;
	int Num1;

	int abcdefg;
	int showMeTheMoney;
	int rkewjflsdjfkjsdlkgasg; //길이 제한 X
	
	/* 2. 예약어 사용 금지
	int int
	int ture */
	
	// 3. 숫자로 시작하면 안됨
	 int age1;
	 //int 1age; 
	 //Syntax error on token "1", delete this token
	 // Syntax error : 문법 오류
	 
	// 4. 특수문자는 '$', '_'만을 허용함
	 // -> $는 내부클래스 사용 시 자동으로 붙는 기호 (직접 사용 X)
	 // _는 상수 단어 구분 외에는 사용X
	 double $dNum;
	 float f_num;
	 //long longNum!;
	 
	 // 5. 여러 단어 이름은 단어의 첫 글자는 대문자로 함
	 // 단, 첫 시작 글자는 소문자
	 // ==카멜 표기법
	 // 오류는 발생하지 않음(개발자 간의 약속/관례)
	 
	 int userAge;
	 int helloworld;
	 
	 // 참고 : 변수명은 언어 제한이 없음
	 // 단, 코드 공유 시 글자 깨짐이 발생할 수 있어서 권장X
	 int 정수1;
	 boolean 참거짓;
	 
	 // ** 변수는 한 개의 데이터만 보관 가능
	 int iNum = 30;
	 System.out.println(iNum);
	 
	 iNum = 50;
	 System.out.println(iNum); //마지막 대입한 값만 보관됨
	 
	 // 문자열 자료형 String
	 // 기본 자료형X, 참조형O
	 // String의 리터럴 : 문자열
	 // String의 리터럴 표기법 : "쌍따옴표"
	 
	 String str1;
	 str1 = "안녕하세요"; // str1 변수의 초기화(최초 값 대입)
	 
	 System.out.println(str1);
	 
	 str1 = "String도 기본 자료형 변수처럼 값을 변경할 수 있습니다.";
	 System.out.println(str1);
	 
	 // 변수 선언과 동시에 초기화
	 String name = "김현진";
	 
	 int age = 25;
	 
	 char gender = '여';
	 
	 // 김현진님은 25세 여성입니다.
	 
	 System.out.println("-----------------------------------");
	 
	 System.out.println(age + 10); // 숫자 + 숫자 = 두 숫자의 합
	 
	 System.out.println(name + "입니다."); // 문자열 + 문자열 = 이어쓰기
	 
	 System.out.println(name + age); // 문자열 + 숫자 = 이어쓰기
	 
	 System.out.println(age + 10 + name); // 숫자 + 숫자 + 문자열
	 									  // = 숫자합 + 문자열 (이어쓰기)
	 
	 System.out.println(name + age + 10); // 문자열 + 숫자 + 숫자 = 이어쓰기
	 
	 System.out.println(name + "님은 " + age + "세 " + gender + "성입니다.");
	 
	 System.out.println("-----------------------------------");
	 
	 // 상수(fianl) : 항[상] 같은 [수]
	 // Java에서는 한 번 값을 기록하면 값을 바꿀 수 없는 변수
	 
	 // 일반 변수
	 int num2 = 200;
	 num2 = 300; // 새로 대입 가능
	 
	 // 상수(대문자로 표기, 여러 단어면 _로 구분)
	 final int CONSTANT_NUMBER = 100000000; //1억
	 // 마ㅣ막으로 값을 대입하는 변수 = 다시는 값을 대입 받지 않겠다
	 // = 변하지 않는 수(상수)
	 
	 // CONSTANT_NUMBER = 0; // 에러 발생
	 
	 System.out.println(CONSTANT_NUMBER);
	 
	 // 상수 예제
	 final int up = 10;
	 final int down = -10;
	 final int INIT = 0;
	 
	 int num3 = INIT;
	 System.out.println(num3);
	 
	 num3 = num3 + up;

	 System.out.println(num3);
	 
	 num3 = down + down * 3; //사칙연산 우선순위(*, / 먼저)
	 
	 System.out.println(num3);
	
	}
}
