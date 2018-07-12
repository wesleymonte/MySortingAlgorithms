package algorithms;

import sort.AbstractSorting;
import util.Util;

public class SimultaneousBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (Util.validateInput(array, leftIndex, rightIndex)) {
			boolean swapped = true;
			int i = 0;
			while (swapped && i < (rightIndex - leftIndex)) {
				swapped = false;
				for (int j = leftIndex + i; j < rightIndex - i; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						Util.swap(array, j, j + 1);
						swapped = true;
					}
					int k = rightIndex - (j - leftIndex);
					if(array[k].compareTo(array[k - 1]) < 0) {
						Util.swap(array, k, k - 1);
						swapped = true;
					}
				}
				i++;
			}
		}
	}

}
