package com.acharya.application;

import com.acharya.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	private static final float charges=50.0f;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
	public void bookProduct(float charges ) {
		System.out.println("Dear Prime User,Your product charges are: "+ charges);
	}

	


	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
}
