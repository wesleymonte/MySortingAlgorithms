package algorithms;

import sort.AbstractSort;
import util.Util;

public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (Util.validateInput(array, leftIndex, rightIndex)) {
			boolean swapped = true;
			int i = 0;
			while (swapped && i < rightIndex - leftIndex) {
				swapped = false;
				for (int j = leftIndex; j < rightIndex - i; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						Util.swap(array, j, j + 1);
						swapped = true;
					}
				}
				i++;
			}
		}
	}

}
