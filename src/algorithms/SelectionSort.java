package algorithms;

import sort.AbstractSorting;
import util.Util;

public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (Util.validateInput(array, leftIndex, rightIndex)) {
			for (int i = leftIndex; i < rightIndex; i++) {
				int smaller = i;
				for (int j = i + 1; j <= rightIndex; j++) {
					if (array[j].compareTo(array[smaller]) < 0) {
						smaller = j;
					}
				}
				Util.swap(array, i, smaller);
			}
		}
	}
}
