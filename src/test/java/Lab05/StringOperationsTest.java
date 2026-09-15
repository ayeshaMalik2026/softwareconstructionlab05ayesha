package Lab05;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest {

    @Test
    public void testJoinStringsWithMultipleElements() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String result = StringOperations.joinStrings(words, ", ");
        assertEquals("apple, banana, cherry", result);
    }

    @Test
    public void testJoinStringsWithSingleElement() {
        List<String> words = Collections.singletonList("apple");
        String result = StringOperations.joinStrings(words, ", ");
        assertEquals("apple", result);
    }

    @Test
    public void testJoinStringsWithEmptyList() {
        List<String> words = Collections.emptyList();
        String result = StringOperations.joinStrings(words, ", ");
        assertEquals("", result);
    }
}