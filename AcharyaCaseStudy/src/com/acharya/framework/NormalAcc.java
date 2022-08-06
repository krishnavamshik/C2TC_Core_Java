package com.acharya.framework;

public abstract class NormalAcc extends ShopAcc{

	private final float deliveryCharge;
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("The charges of the product is : " + deliveryCharge);
	}
	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
}
