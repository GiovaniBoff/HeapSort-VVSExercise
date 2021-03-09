package edu.ifrs.vvs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    private HeapSort HeapSort;

    @Before
    public void configTests() {
        HeapSort = new HeapSort();
    }

    /**
     * BubbleSort Test.
     */
    @Test
    public void MustSortNumberPositives() {
        int[] arrayToTest = { 1, 4, 2, 8, 7 };
        HeapSort.sort(arrayToTest);
        int[] expectedValue = { 1, 2, 4, 7, 8 };

        assertArrayEquals(expectedValue, arrayToTest);
    }

    @Test
    public void MustSortNumberNegatives() {
        int[] arrayToTest = { -1, -4, -2, -8, -7 };
        HeapSort.sort(arrayToTest);
        int[] expectedValue = { -8, -7, -4, -2, -1 };

        assertArrayEquals(expectedValue, arrayToTest);
    }
}
