import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void test1BinarySearch() {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        
        int result = BinarySearch.binarySearch(arr, 16);
        assertEquals(4, result);
    }
    @Test
    public void test2BinarySearch() {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        int result = BinarySearch.binarySearch(arr, 2);
        assertEquals(0, result);
    }
    @Test
    public void test3BinarySearch() {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        
        int result = BinarySearch.binarySearch(arr, 91);
        assertEquals(9, result);
    }
    @Test
    public void test4BinarySearch() {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };   
        int result = BinarySearch.binarySearch(arr, 20);
        assertEquals(-1, result);
    }
}