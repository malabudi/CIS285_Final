package final_package;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testPositive() {
		SelectionSort selectionSort = new SelectionSort();
		
		int[] arr = {8, 3, 1, 6, 5, 2};
		int[] sortedArr = {1, 2, 3, 5, 6, 8};
		
		selectionSort.selectionSort(arr);
		
		assertArrayEquals(sortedArr, arr);
	}
	
	@Test
	public void testNegative() {
		SelectionSort selectionSort = new SelectionSort();
		
		int[] arr = {-7, -5, -2, -1, -9, -11};
		int[] sortedArr = {-11, -9, -7, -5, -2, -1};
		
		selectionSort.selectionSort(arr);
		
		assertArrayEquals(sortedArr, arr);
	}
	
	@Test
	public void testMixed() {
		SelectionSort selectionSort = new SelectionSort();
		
		int[] arr = {-9, 0, 4, -2, 5, -6};
		int[] sortedArr = {-9, -6, -2, 0, 4, 5};
		
		selectionSort.selectionSort(arr);
		
		assertArrayEquals(sortedArr, arr);
	}
}
