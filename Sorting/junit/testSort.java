import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class testSort {
    int[] array0 = {2,3,4};
	int[] array1 = {7,6,5,9};
	int[] array2 = {11,6,7,5,1,2,8,9,10,4,3,12};
	int[] array3 = {11,10,9,8,7,6,5,4,3,2,1};
	Object[] o = {array0,array1,array2,array3};
	Sorting s;
	@Before
	public void sort(){
		s = new Sorting();
	}
	
	@Test
	public void test(){
		s.insertionSort(array0);
		assertEquals(true,s.isSorted(array0));
		s.insertionSort(array1);
		assertEquals(true,s.isSorted(array1));
		s.quicksort(array2);
		assertEquals(true,s.isSorted(array2));
		s.quicksort(array3);
		assertEquals(true,s.isSorted(array3));
		s.swapReferences(o,0,1);
	}
}