package com.chain.concrete;


import com.chain.abst.CurrencyDispenser;

public class Dispenser100 extends CurrencyDispenser {

	@Override
	public void dispense(int amount) {
		if(amount>=100) {
			int rem = amount%100;
			System.out.println("Dispensing "+amount/100+ "x Rs100 notes. ");
			if(rem != 0) {
				System.out.println("Remaining ₹" + rem + " cannot be dispensed.");
			}
		}else {
			System.out.println(" can not dispense amount invalid !!!!!");
		}
		
	}

}