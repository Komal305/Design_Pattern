package com.chain.main;

import com.chain.abst.CurrencyDispenser;
import com.chain.concrete.Dispenser100;
import com.chain.concrete.Dispenser200;
import com.chain.concrete.Dispenser500;

public class ATM {

	public static void main(String[] args) {
		CurrencyDispenser d500 = new Dispenser500();
		CurrencyDispenser d200 = new Dispenser200();
		CurrencyDispenser d100 = new Dispenser100();
		
		d500.setNext(d200);
		d200.setNext(d100);
		
		int amount = 1870;
		System.out.println("requestig amount : "+amount);
		d500.dispense(amount);
	}

}
