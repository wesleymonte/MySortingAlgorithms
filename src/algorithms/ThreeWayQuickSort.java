package algorithms;

import sort.AbstractSorting;
import util.Util;

public class ThreeWayQuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validateInput(array, leftIndex, rightIndex)) {
			Integer[] limits = partition(array ,leftIndex, rightIndex);
			sort(array, leftIndex, limits[0] - 1);
			sort(array, limits[1] + 1, rightIndex);
		}
	}
	
	private Integer[] partition(T[] array, int leftIndex, int rightIndex) {
		T pivot = array[rightIndex];
		int lesser = leftIndex;
		int greater = rightIndex;
		
		int i = leftIndex;
		while(i <= greater) {
			if(array[i].compareTo(pivot) > 0) {
				Util.swap(array, i--, greater--);
			} else if(array[i].compareTo(pivot) < 0) {
				Util.swap(array, i, lesser++);
			}
			i++;
		}
		
		return new Integer[] {lesser, greater};
	}

}
