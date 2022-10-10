package edu.kh.inheritance.model.vo;

// The type Child cannot subclass the final class Parent
public class Child extends Parent {
	
	@Override
	public void method1() {
		// Cannot override the final method from Parent
		System.out.println("자식의 메서드");
	}
}
