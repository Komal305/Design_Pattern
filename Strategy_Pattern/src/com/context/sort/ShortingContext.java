package com.context.sort;

import com.strategy.sort.ShortStrategy;

public class ShortingContext { 
	
	ShortStrategy strategy;
	
	public ShortingContext(ShortStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void setShortStrategy(ShortStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void ShortArray(int[] arr) {
		strategy.sort(arr);
		for (int i : arr) {
			System.out.print(i+", ");
		}
		
	}
}
