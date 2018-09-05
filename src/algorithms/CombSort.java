package algorithms;

import sort.AbstractSorting;
import util.Util;

public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validateInput(array, leftIndex, rightIndex)) {
			int gap = rightIndex - leftIndex + 1;
			boolean swapped = true;
			while(gap != 1 || swapped == true) {
				gap = getNextGap(gap);
				swapped = false;
				for(int i = leftIndex; i <= rightIndex - gap; i++) {
					if(array[i].compareTo(array[i + gap]) > 0) {
						Util.swap(array, i, i + gap);
						swapped = true;
					}
				}
			}
		}
	}
	
	private int getNextGap(int gap) {
		gap = (gap * 4) / 5;
		if(gap < 1) {
			gap = 1;
		}
		return gap;
	}

}
