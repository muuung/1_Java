package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{
	
	private double discountOffer;
	
	public Spark() {}

	public Spark(int wheel, int seat, String fuel, double discountOffer) {
		super.setWheel(wheel);
		super.setSeat(seat);
		super.setFuel(fuel);
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / 할인혜택 : " + discountOffer;
	}
	
	public void dc() {
		System.out.println(discountOffer * 100 + "% 할인됩니다.");
	}
}
