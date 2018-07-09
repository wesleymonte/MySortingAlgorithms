package algorithms;

import sort.AbstractSort;
import util.Util;

public class QuickSort<T extends Comparable<T>> extends AbstractSort<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validateInput(array, leftIndex, rightIndex)) {
			int pi = partition(array ,leftIndex, rightIndex);
			sort(array, leftIndex, pi - 1);
			sort(array, pi + 1, rightIndex);
		}
	}
	
	private int partition(T[] array, int leftIndex, int rightIndex) {
		int pivot = rightIndex;
		int i = leftIndex - 1;
		
		for(int j = leftIndex; j < rightIndex; j++) {
			if(array[j].compareTo(array[pivot]) <= 0) {
				Util.swap(array, ++i, j);
			}
		}
		Util.swap(array, pivot, ++i);
		return i;
	}
	
}
