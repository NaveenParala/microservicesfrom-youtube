package com.app.naveen.util;

import java.util.HashMap;
import java.util.Map;

import com.app.naveen.exception.InsuficientFundException;

public class PaymentUtil {
	
	private static Map<String, Double> paymentMap=new HashMap<String, Double>();
	
	static {
		paymentMap.put("acc1", 12000.00);
		paymentMap.put("acc2", 10000.00);
		paymentMap.put("acc3", 11000.00);
		paymentMap.put("acc4", 6000.00);
	}
	
	public static boolean validatePayment(String accountNo,Double amount) {
		
		if(amount>paymentMap.get(accountNo)) {
			throw new InsuficientFundException("Insuficient fund..!");
		}
		else return true;
	}

}
