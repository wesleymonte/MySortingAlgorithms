package algorithms;

import sort.AbstractSort;
import util.Util;

public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (Util.validateInput(array, leftIndex, rightIndex)) {
			for (int i = leftIndex + 1; i <= rightIndex; i++) {
				int j = i - 1;
				while (j >= leftIndex && array[j].compareTo(array[j + 1]) > 0) {
					Util.swap(array, j, j + 1);
					j--;
				}
			}
		}
	}

}
