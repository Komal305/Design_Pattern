package com.main.sort;

import com.concrete.sort.BubbleSort;
import com.concrete.sort.InsertionSort;
import com.concrete.sort.QuickSort;
import com.context.sort.ShortingContext;

public class Main {
public static void main(String[] args) {
	
	ShortingContext context = new ShortingContext(new BubbleSort());
	context.ShortArray(new int[]{3,4,5,2,1});
	System.out.println("---------------------------------------");
	context.setShortStrategy(new InsertionSort());
	context.ShortArray(new int[]{3,4,5,2,1});
	System.out.println("---------------------------------------");
	context.setShortStrategy(new QuickSort());
	context.ShortArray(new int[]{3,4,5,2,1});
	System.out.println("---------------------------------------");
	
}
}
/** UML DIAGRAM **
+------------------------+
|     SortStrategy       | <-- Interface
+------------------------+
| + sort(int[] data)     |
+------------------------+
         ^
+----------+-----------+
|          |           |
+------------+ +------------+ +-------------+
| BubbleSort | | QuickSort  | | MergeSort   |
+------------+ +------------+ +-------------+

+--------------------------+
|     SortContext          |
+--------------------------+
| - strategy: SortStrategy |
| + setStrategy()          |
| + executeSort()          |
+--------------------------+
**/