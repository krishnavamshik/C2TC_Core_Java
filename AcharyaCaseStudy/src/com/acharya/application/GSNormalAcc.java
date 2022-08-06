package com.acharya.application;

import com.acharya.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("Dear Normal User,Your Product Charges:" + getCharges() + 
				 " and delivery charge is:" + deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}
