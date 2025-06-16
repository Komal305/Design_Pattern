package com.observer.main;

import com.observer.StockObserver;
import com.observer.concrete.InvesterClient;
import com.observer.concrete.MobileAppClient;
import com.observer.context.StockTicker;

public class ObserverMain {

	public static void main(String[] args) {
		StockTicker st = new StockTicker();

		StockObserver komal = new InvesterClient("komal");
		StockObserver groww = new MobileAppClient("groww");
		st.addObserver(komal);
		st.addObserver(groww);

		st.setStockPrice("Tata steel", 151.84);
		st.setStockPrice("Infosys", 1603.90);
		st.setStockPrice("MRF", 136985.00);
		
		st.removeObserver(komal);//Unsubscribes

		st.setStockPrice("Suzlon", 64.60);
		
//		Ticker Tata steel is now rs 151.84
//		komal Recived update Tata steel is now rs 151.84
//		groww stock alert Tata steel is now rs 151.84
//		Ticker Infosys is now rs 1603.9
//		komal Recived update Infosys is now rs 1603.9
//		groww stock alert Infosys is now rs 1603.9
//		Ticker MRF is now rs 136985.0
//		komal Recived update MRF is now rs 136985.0
//		groww stock alert MRF is now rs 136985.0
//		Ticker Suzlon is now rs 64.6
//		groww stock alert Suzlon is now rs 64.6

	}
}
