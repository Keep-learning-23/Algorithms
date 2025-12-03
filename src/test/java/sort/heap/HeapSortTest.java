package sort.heap;

import org.junit.Assert;
import org.junit.Test;

public class HeapSortTest {
    @Test
    public void should_sort_array_successfully() {
        int[] array = new int[] {1, 2, 6, 8, 3, 5, 4};
        HeapSort.sort(array);
        Assert.assertArrayEquals(array, new int[]{1, 2, 3, 4, 5, 6, 8});
    }
}
