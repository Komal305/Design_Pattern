package com.observer.concrete;

import com.observer.StockObserver;

public class MobileAppClient implements StockObserver{

	private String appName;
	
	public MobileAppClient(String appName) {
		this.appName = appName;
	}
	
	
	
	@Override
	public void update(String stockname, double price) {
		System.out.println(appName+" stock alert "+stockname+" is now rs "+price);	
	}

}
