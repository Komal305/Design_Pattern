package com.observer.concrete;

import com.observer.StockObserver;

public class InvesterClient implements StockObserver {

	
	private String name;
	
	public InvesterClient(String name) {
		this.name = name;
	}
	@Override
	public void update(String stockname, double price) {
System.out.println(name+" Recived update "+stockname+" is now rs "+price);	

	}

}
