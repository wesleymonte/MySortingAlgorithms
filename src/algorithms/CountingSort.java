package algorithms;

import sort.AbstractSorting;
import util.Util;

public class CountingSort extends AbstractSorting<Integer> {
	
	private int max(Integer[] array, int leftIndex, int rightIndex) {
		int max = Integer.MIN_VALUE;
		for(int i = leftIndex; i <= rightIndex; i++) {
			if(array[i].compareTo(max) > 0) {
				max = array[i];
			}
		}
		return max;
	}
	
	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		if(Util.validateInput(array, leftIndex, rightIndex)) {
			int maxValue = max(array, leftIndex, rightIndex);
			int[] count = new int[maxValue + 1];
			int[] output = new int[rightIndex - leftIndex + 1];
			
			for(int i = leftIndex; i <= rightIndex; i++) {
				count[array[i]]++;
			}
			for(int i = 1; i < count.length; i++) {
				count[i] += count[i - 1];
			}
			for(int i = leftIndex; i <= rightIndex; i++) {
				output[count[array[i]] - 1] = array[i];
				count[array[i]]--;
			}
			for(int i = leftIndex; i <= rightIndex; i++) {
				array[i] = output[i - leftIndex];
			}
		}
	}

}
