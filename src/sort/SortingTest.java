package sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import algorithms.SimultaneousBubbleSort;
import algorithms.SimultaneousSelectionSort;
import algorithms.ThreeWayQuickSort;

public class SortingTest {

	private Integer[] evenLengthArray;
	private Integer[] oddLengthArray;
	private Integer[] repeatedValuesArray;
	private Integer[] equalValuesArray;
	private Integer[] emptyArray = {};

	public AbstractSorting<Integer> implementation;

	@Before
	public void setUp() throws Exception {
		populateEvenLengthArray(new Integer[] {9, 3, 6, 5, 20, 10, 78, 74, 30, 0}); // 10
		populateOddLengthArray(new Integer[] {52, 78, 20, 15 ,19, 1, 0, 99, 100});  //  9
		populateRepeatedValuesArray(new Integer[] {9, 6, 2, 2, 9, 10, 6, 20});	    //  8
		populateEqualValuesArray(new Integer[] {9, 9, 9, 9, 9, 9, 9});				//  7
		getImplemetation();
	}
	
	private void getImplemetation() {
		this.implementation = new ThreeWayQuickSort<Integer>();
	}

	public void populateEvenLengthArray(Integer[] array) {
		this.evenLengthArray = Arrays.copyOf(array, array.length);
	}

	public void populateOddLengthArray(Integer[] array) {
		this.oddLengthArray = Arrays.copyOf(array, array.length);
	}

	public void populateEqualValuesArray(Integer[] array) {
		this.equalValuesArray = Arrays.copyOf(array, array.length);
	}

	public void populateRepeatedValuesArray(Integer[] array) {
		this.repeatedValuesArray = Arrays.copyOf(array, array.length);
	}

	public void genericTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		implementation.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}
	
	public void genericTest(Integer[] array, int leftIndex, int rightIndex) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		implementation.sort(array, leftIndex, rightIndex);
		Arrays.sort(copy1, leftIndex, rightIndex + 1);
		Assert.assertArrayEquals(copy1, array);
	}
	
	@Test
	public void testSortEvenArray01() {
		genericTest(evenLengthArray);
	}
	
	@Test
	public void testSortEvenArray02() {
		genericTest(evenLengthArray, 1, 9);
	}
	
	@Test
	public void testSortEvenArray03() {
		genericTest(evenLengthArray, 0, 7);
	}
	
	@Test
	public void testSortEvenArray04() {
		genericTest(evenLengthArray, 0, 1);
	}

	@Test
	public void testSortOddArray01() {
		genericTest(oddLengthArray);
	}
	
	@Test
	public void testSortOddArray02() {
		genericTest(oddLengthArray, 1, 8);
	}
	
	@Test
	public void testSortOddArray03() {
		genericTest(oddLengthArray, 0, 5);
	}
	
	@Test
	public void testSortOddArray04() {
		genericTest(oddLengthArray, 0, 1);
	}

	@Test
	public void testSortRepeatedValues01() {
		genericTest(repeatedValuesArray);
	}
	
	@Test
	public void testSortRepeatedValues02() {
		genericTest(repeatedValuesArray, 1, 6);
	}
	
	@Test
	public void testSortRepeatedValues03() {
		genericTest(repeatedValuesArray, 0, 4);
	}
	
	@Test
	public void testSortRepeatedValues04() {
		genericTest(repeatedValuesArray, 0, 1);
	}

	@Test
	public void testSort04() {
		genericTest(equalValuesArray);
	}

	@Test
	public void testSort05() {
		genericTest(emptyArray);
	}

}
