package utils.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public void bubbleSortArrayIsEmpty() throws Exception {
        int[] data = new int[]{};
                Sorting.bubbleSort(data);
        assertArrayEquals(new int[]{}, data);
    }

    @Test
    public void bubbleSortArrayIsNull() throws Exception {
        int[] data = null;
        Sorting.bubbleSort(data);
        assertArrayEquals(null, data);
    }

    @Test
    public void bubbleSortArrayHasSameElements() throws Exception {
        int[] data = new int[]{2, 2, 2};
        Sorting.bubbleSort(data);
        assertArrayEquals(new int[]{2, 2, 2}, data);
    }

    @Test
    public void bubbleSortArrayHasDifferentElements() throws Exception {
        int[] data = new int[]{2, 3, 4, 5, 1};
        Sorting.bubbleSort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }
}