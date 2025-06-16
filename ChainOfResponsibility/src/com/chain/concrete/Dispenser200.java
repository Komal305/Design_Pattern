package com.chain.concrete;


import com.chain.abst.CurrencyDispenser;

public class Dispenser200 extends CurrencyDispenser {

	@Override
	public void dispense(int amount) {
		if(amount>=200) {
			int rem = amount%200;
			System.out.println("Dispensing "+amount/200+ "x Rs200 notes. ");
			if(rem != 0 && next != null) {
				next.dispense(rem);
			}
		}else if (next != null ) {
			next.dispense(amount);
		}
		
	}

}