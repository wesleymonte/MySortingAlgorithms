package algorithms;

import sort.AbstractSorting;
import util.Util;

public class SimultaneousSelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validateInput(array, leftIndex, rightIndex)) {
			int i = 0;
			while(i < ((rightIndex - leftIndex + 1) / 2)) {
				int smaller = leftIndex + i;
				int bigger = leftIndex + i;
				for(int j = leftIndex + i + 1; j <= rightIndex - i; j++) {
					if(array[j].compareTo(array[smaller]) < 0) {
						smaller = j;
					}
					if(array[j].compareTo(array[bigger]) > 0) {
						bigger = j;
					}
				}
				Util.swap(array, smaller, leftIndex + i);
				if(leftIndex + i == bigger) {
					bigger = smaller;
				}
				if(!(bigger == leftIndex + i && rightIndex - i == smaller)) {
					Util.swap(array,  bigger, rightIndex - i);
				}
				i++;
			}
		}
	}
	
}
