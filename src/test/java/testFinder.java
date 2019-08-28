import org.junit.*;

import static org.junit.Assert.assertEquals;

public class testFinder {

    @Test
    public void test_findMax_valid() {
        Finder finder = new Finder();
        int[] arr = {2, 3, 5, 8, 9, 10, 1, 0, 6, 7};
        Integer expectedResult = 10;
        Integer actualResult = finder.findMax(arr);
        // test
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMax_null() {
        Finder finder = new Finder();
        int[] arr = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(arr);
        // test
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMax_empty() {
        Finder finder = new Finder();
        int[] arr = {};
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(arr);
        // test
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_valid() {
        Finder finder = new Finder();
        int[] arr = {2, 3, 5, 8, 9, 10, 1, 0, 6, 7};
        Integer expectedResult = 0;
        Integer actualResult = finder.findMin(arr);
        // test
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_null() {
        Finder finder = new Finder();
        int[] arr = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(arr);
        // test
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_empty() {
        Finder finder = new Finder();
        int[] arr = {};
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(arr);
        // test
        assertEquals(actualResult, expectedResult);
    }
}
