package Lab05;

import java.util.List;

public class StringOperations {

    /**
     * BAD OPERATIONAL SPECIFICATION:
     * This method initializes an empty StringBuilder. It then iterates over the list of 
     * strings using a standard for-loop from index 0 to size()-1. Inside the loop, it 
     * checks if the current index is equal to 0; if not, it appends the delimiter string 
     * first to avoid trailing or leading extra delimiters. Then it appends the string 
     * at the current index. Finally, it converts the StringBuilder to a String and 
     * returns it.
     * 
     * GOOD DECLARATIVE SPECIFICATION:
     * Returns the concatenation of elements in order, with the delimiter inserted 
     * between each adjacent pair. If the list is empty, returns an empty string.
     * 
     * @param words the list of strings to join
     * @param delimiter the string separator to place between elements
     * @return the joined string formatted with the delimiter
     */
    public static String joinStrings(List<String> words, String delimiter) {
        if (words == null || words.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            if (i > 0) {
                result.append(delimiter);
            }
            result.append(words.get(i));
        }
        
        return result.toString();
    }
}