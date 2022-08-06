package com.acharya.application;

import com.acharya.framework.NormalAcc;
import com.acharya.framework.PrimeAcc;
import com.acharya.framework.ShopFactory;

public  class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}

	

}
