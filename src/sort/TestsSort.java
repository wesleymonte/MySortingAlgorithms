package sort;

import java.util.Arrays;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import algorithms.SimultaneousBubbleSort;
import algorithms.SimultaneousSelectionSort;

public class TestsSort {

	public static void main(String[] args) {
//		AbstractSorting<Integer> sorting = new MergeSort<Integer>();
//		Integer[] array1 = {3, 90, 4, 1, 100, 99, 85, 0, 2};
//		sorting.sort(array1, 3, 7);
//		System.out.println(Arrays.toString(array1));
//		
//		Integer[] array2 = {3, 90, 4, 1, 100, 99, 85, 0, 2};
//		sorting.sort(array2);
//		System.out.println(Arrays.toString(array2));
		
		Integer[] oddLengthArray = new Integer[] {52, 78, 20, 15 ,19, 1, 0, 99, 100};
		SimultaneousSelectionSort<Integer> sort = new SimultaneousSelectionSort<Integer>();
		sort.sort(oddLengthArray, 0, 5);
		System.out.println(Arrays.toString(oddLengthArray));
	}

}
