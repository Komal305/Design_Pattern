package com.observer.context;

import java.util.ArrayList;
import java.util.List;

import com.observer.StockObserver;

public class StockTicker {

	private List<StockObserver> observer = new ArrayList<>();
	
	public void addObserver(StockObserver ob) {
		 observer.add(ob);
	}
	
	public void removeObserver(StockObserver ob) {
		observer.remove(ob);
	}
	public void setStockPrice(String stockname, double price) {
		System.out.println("Ticker "+stockname+" is now rs "+price);
		notifyObserver(stockname, price);
	}

	private void notifyObserver( String stockname, double price) {
		for(StockObserver ob : observer) {
			ob.update(stockname, price);
		}
		
	}
}
