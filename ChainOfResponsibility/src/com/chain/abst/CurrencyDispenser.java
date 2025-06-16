package com.chain.abst;

public abstract class CurrencyDispenser {
	public CurrencyDispenser next;

	public void setNext(CurrencyDispenser dispenser) {
		this.next = dispenser;
	}

	public abstract void dispense(int amount);

}
