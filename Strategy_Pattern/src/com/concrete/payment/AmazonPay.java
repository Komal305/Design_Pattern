package com.concrete.payment;

import com.strategy.payment.PaymentStrategy;

public class AmazonPay implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		System.out.println("paid $"+amount+" via Amazon Pay ");
	}

}