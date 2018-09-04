package algorithms;

import sort.AbstractSorting;
import util.Util;

public class CountingSort extends AbstractSorting<Integer> {
	
	private Integer max(Integer[] array, int leftIndex, int rightIndex) {
		Integer max = Integer.MIN_VALUE;
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
			Integer maxValue = max(array, leftIndex, rightIndex);
			Integer[] count = new Integer[maxValue + 1];
			Integer[] output = new Integer[rightIndex - leftIndex + 1];
			
			initialize(count);
			initialize(output);
			
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
	
	private void initialize(Integer[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}

}
