package com.context.payment;

import com.strategy.payment.PaymentStrategy;

public class PaymentContext {

	PaymentStrategy strategy;
	
	//constructor injection and dependency injection
	public PaymentContext(PaymentStrategy strategy) {
     this.strategy = strategy;
	}
	
	
	//setter method for runtime strategy change
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void Payment(double amount) {
		strategy.pay(amount);
	}
}
