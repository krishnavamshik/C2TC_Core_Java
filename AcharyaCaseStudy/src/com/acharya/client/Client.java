package com.acharya.client;

import com.acharya.application.GSNormalAcc;
import com.acharya.application.GSPrimeAcc;
import com.acharya.application.GSShopFactory;
import com.acharya.framework.NormalAcc;
import com.acharya.framework.PrimeAcc;
import com.acharya.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf =new GSShopFactory();

		PrimeAcc pa = new GSPrimeAcc(21, "Krishna", 4000, true);
		NormalAcc na = new GSNormalAcc(33, "Nikki", 9000, 100);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
		
	}

}
