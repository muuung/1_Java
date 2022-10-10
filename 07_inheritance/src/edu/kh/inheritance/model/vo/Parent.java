package edu.kh.inheritance.model.vo;

// final 클래스 : 상속 불가 클래스
public /*final*/ class Parent {
	
	public static final int TEMP = 100;
	
	// final 메서드(마지막 메서드)
	// 자식이 오버라이딩을 할 수 없음
	
	public /*final*/ void method1() {
		
		// final 변수 : 상수(변하지 않는 수)
		final int NUM = 10;
		
		System.out.println("부모의 메서드");
	}
}
