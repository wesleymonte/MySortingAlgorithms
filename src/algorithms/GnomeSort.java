package algorithms;

import sort.AbstractSorting;
import util.Util;

public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int i = leftIndex;
		while(i <= rightIndex) {
			if(i == leftIndex) {
				i++;
			}
			if(array[i].compareTo(array[i - 1]) >= 0) {
				i++;
			} else {
				Util.swap(array, i, i - 1);
				i--;
			}
		}	
	}

}
