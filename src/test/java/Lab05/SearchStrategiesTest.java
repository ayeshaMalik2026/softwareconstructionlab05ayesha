package Lab05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchStrategiesTest {

    @Test
    public void testDifferentResultsWhenDuplicatesExist() {
        int[] arr = {10, 20, 30, 20, 50};
        int target = 20;

        int firstIndex = SearchStrategies.findFirst(arr, target);
        int lastIndex = SearchStrategies.findLast(arr, target);

        // findFirst returns 1, findLast returns 3
        assertEquals(1, firstIndex);
        assertEquals(3, lastIndex);
        assertNotEquals(firstIndex, lastIndex);
    }

    @Test
    public void testSameResultWhenElementAppearsOnce() {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int firstIndex = SearchStrategies.findFirst(arr, target);
        int lastIndex = SearchStrategies.findLast(arr, target);

        // Both methods return 2
        assertEquals(2, firstIndex);
        assertEquals(2, lastIndex);
        assertEquals(firstIndex, lastIndex);
    }

    @Test
    public void testDifferentResultsWhenElementNotFound() {
        int[] arr = {10, 20, 30};
        int target = 99;

        int firstIndex = SearchStrategies.findFirst(arr, target);
        int lastIndex = SearchStrategies.findLast(arr, target);

        // findFirst returns arr.length (3), findLast returns -1
        assertEquals(3, firstIndex);
        assertEquals(-1, lastIndex);
        assertNotEquals(firstIndex, lastIndex);
    }
}