package com.main.payment;

import com.concrete.payment.AmazonPay;
import com.concrete.payment.GooglePay;
import com.concrete.payment.PhonePe;
import com.context.payment.PaymentContext;

public class Main {

	public static void main(String[] args) {
		
		PaymentContext context = new PaymentContext(new PhonePe());
         context.Payment(5000);//paid $5000.0 via Phone Pe 
         
         context.setPaymentStrategy(new GooglePay());
         context.Payment(8000);//paid $8000.0 via Google Pay 
         
         context.setPaymentStrategy(new AmazonPay());
         context.Payment(90000);//paid $90000.0 via Amazon Pay
	}

}
/***
+----------------------+
|   PaymentStrategy    |  <-- Interface
+----------------------+
|  + pay(double amt)   |
+----------------------+
          ^
+------------+-------------+---------
|            |             |        |
+-----------+ +-------------+ +-----------+
| PhonePe   | | GooglePay   | | AmazonPay |
+-----------+ +-------------+ +-----------+
| + pay()   | | + pay()     | | + pay()   |
+-----------+ +-------------+ +-----------+

+------------------------+
|     PaymentContext     |
+-----------------------------+
| - strategy: PaymentStrategy |
| + setPaymentStrategy()      |
| + payAmount()               |
+-----------------------------+


**/