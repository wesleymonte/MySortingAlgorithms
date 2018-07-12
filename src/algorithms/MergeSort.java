package algorithms;

import sort.AbstractSorting;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int middle = (rightIndex + leftIndex) / 2;
			
			sort(array, leftIndex, middle);
			sort(array, middle + 1, rightIndex);
			
			mergeSort(array, leftIndex, middle, rightIndex);
		}

	}

	private void mergeSort(T[] array, int leftIndex, int middle, int rightIndex) {
		
		int s1 = middle - leftIndex + 1;
		int s2 = rightIndex - middle;
		
		T[] h1 = (T[]) new Comparable[s1];
		T[] h2 = (T[]) new Comparable[s2];
		
		for(int i = 0; i < s1; i++) {
			h1[i] = array[leftIndex + i]; 
		}
		
		for(int j = 0; j < s2; j++) {
			h2[j] = array[middle + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = leftIndex;
		
		while(i < s1 && j < s2) {
			if(h1[i].compareTo(h2[j]) <= 0) {
				array[k] = h1[i++];
			} else if(h1[i].compareTo(h2[j]) > 0) {
				array[k] = h2[j++];
			}
			k++;
		}
		
		while(i < s1) {
			array[k++] = h1[i++];
		}
		
		while(j < s2) {
			array[k++] = h2[j++];
		}
	}

}
