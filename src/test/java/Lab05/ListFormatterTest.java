package Lab05;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListFormatterTest {

    @Test
    public void testToLowerCaseDoesNotMutateOriginalList() {
        // Create initial mutable list
        List<String> originalList = new ArrayList<>(Arrays.asList("APPLE", "BANANA", "CHERRY"));
        List<String> originalCopy = new ArrayList<>(originalList);

        // Execute non-mutating method
        List<String> resultList = ListFormatter.toLowerCase(originalList);

        // Verify the result list contains lowercase elements
        assertEquals(Arrays.asList("apple", "banana", "cherry"), resultList);

        // Assert that the original list remains completely unchanged
        assertEquals(originalCopy, originalList, "The original list should not be modified by toLowerCase");
    }

    @Test
    public void testSortInPlaceMutatesOriginalList() {
        List<String> originalList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));

        // Execute mutating method
        ListFormatter.sortInPlace(originalList);

        // Assert that the original list was modified directly
        assertEquals(Arrays.asList("Apple", "Banana", "Cherry"), originalList);
    }
}