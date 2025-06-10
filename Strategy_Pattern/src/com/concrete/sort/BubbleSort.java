package com.concrete.sort;

import com.strategy.sort.ShortStrategy;

public class BubbleSort implements ShortStrategy {

	
	@Override
	public int[] sort(int[] arr) {
	    int n = arr.length;
	    boolean swapped;

	    // Outer loop for each pass
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;

	        // Inner loop for comparing adjacent elements
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // Swap arr[j] and arr[j + 1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	                swapped = true;
	            }
	        }

	        // If no two elements were swapped, the array is sorted
	        if (!swapped) break;
	    }
        System.out.println("Bubble sort:: ");
	    return arr;
	}

}
