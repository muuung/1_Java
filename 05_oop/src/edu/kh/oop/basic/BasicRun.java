package edu.kh.oop.basic;

public class BasicRun {
	
	public static void main(String[] args) {
		KHJ khj = new KHJ();
		// heap 영역에 KHJ 클래스에 정의된 내용을 이용하여
		// KHJ 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + khj.name);
		System.out.println("나이 : " + khj.age);
		System.out.println("생년월일 : " + khj.birthday);
		// System.out.println("비밀번호 : " + khj.password);
		// The field KHJ.password is not visible
		
		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		khj.showPassword();
		
		// 기능 수행
		khj.eat();
		khj.study();
		khj.plus(50, 100);
	}
	
}
