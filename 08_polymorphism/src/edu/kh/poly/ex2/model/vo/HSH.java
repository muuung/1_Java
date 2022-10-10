package edu.kh.poly.ex2.model.vo;

//클래스 상속 : extends(확장하다)
//부모가 완성한 기능을 자식이 물려받아서 사용
//자식 기능 + 부모 기능(객체의 크기 확장)

//인터페이스 상속 : implement(구현하다)
//부모가 이름만 있는 완성 기능을 물려줌
//자식이 이름만 있는 메서드를 구현(오버라이딩)해서 완성시켜야됨

public class HSH implements KH {
	public HSH() {
		super();
	}
	
	@Override
	public void lesson() {
		System.out.println("A강의장에서 풀스택 웹개발 과정 수강");
	}
}