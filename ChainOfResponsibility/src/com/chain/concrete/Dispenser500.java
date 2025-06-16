package com.chain.concrete;

import com.chain.abst.CurrencyDispenser;

public class Dispenser500 extends CurrencyDispenser {

	@Override
	public void dispense(int amount) {
		if(amount>=500) {
			int rem = amount%500;
			System.out.println("Dispensing "+amount/500+ "x Rs500 notes. ");
			if(rem != 0 && next != null) {
				next.dispense(rem);
			}
		}else if (next != null ) {
			next.dispense(amount);
		}
		
	}

}
