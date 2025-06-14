package com.concrete.sort;

import com.strategy.sort.ShortStrategy;

public class QuickSort implements ShortStrategy{
	@Override
	public int[] sort(int[] arr) {
	    quickSort(arr, 0, arr.length - 1);
	    System.out.println("Quick sort:: ");
	    return arr;
	}

	private void quickSort(int[] arr, int low, int high) {
	    if (low < high) {
	        // Partition the array and get the pivot index
	        int pi = partition(arr, low, high);

	        // Recursively sort elements before and after partition
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}

	private int partition(int[] arr, int low, int high) {
	    int pivot = arr[high]; // Choosing the last element as pivot
	    int i = low - 1; // Index of smaller element

	    for (int j = low; j < high; j++) {
	        // If current element is smaller than or equal to pivot
	        if (arr[j] <= pivot) {
	            i++;

	            // Swap arr[i] and arr[j]
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }

	    // Swap arr[i+1] and arr[high] (or pivot)
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;

	    return i + 1;
	}

}
