package edu.kh.poly.ex1.model.vo;

public class Car extends Object {
	private int wheel;
	private int seat;
	private String fuel;
	
	public Car() {}
	
	// alt + shift + s -> o
	public Car(int wheel, int seat, String fuel) {
		super();
		this.wheel = wheel;
		this.seat = seat;
		this.fuel = fuel;
	}

	// alt + shift + s -> r
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	// Object의 toString 메서드
	// 객체의 문자열 표현을 반환합니다.
	// 객체가 가지고 있는 필드 정보를
	// 하나의 문자열로 반환할 수 있도록
	// JAVA에서 제공해주는 메소드
	// 자식 클래스에서 오버라이딩 해서 사용
	
	@Override
	public String toString() {
		return "wheel : " + wheel + " / seat : " + seat + " / fuel : " + fuel;
		// wheel : 4 / seat : 5 / fuel : 6
	}
	
}
