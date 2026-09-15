package Lab05;

public class SearchStrategies {

    /**
     * Searches for the first occurrence of val in the array.
     * 
     * @param arr the array to search through
     * @param val the target value to locate
     * @return the first index where val is found, or arr.length if not found
     */
    public static int findFirst(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return arr.length;
    }

    /**
     * Searches for the last occurrence of val in the array.
     * 
     * @param arr the array to search through
     * @param val the target value to locate
     * @return the last index where val is found, or -1 if not found
     */
    public static int findLast(int[] arr, int val) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}