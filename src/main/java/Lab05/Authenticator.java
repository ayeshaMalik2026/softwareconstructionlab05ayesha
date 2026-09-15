package Lab05;

public class Authenticator {

    // Internal cache simulating stored user IDs
    private final char[] cachedIdArray = {'9', '8', '7', '6', '5', '4', '3', '2', '1'};
    private final String cachedIdString = "987654321";

    /**
     * Insecure method: Returns a direct reference to the mutable char array.
     * Clients can modify the returned array and corrupt internal state.
     * 
     * @param username user requesting the ID
     * @return 9-digit ID as a char array
     */
    public char[] getMitId(String username) {
        return cachedIdArray; // Insecure: leaks reference to internal state
    }

    /**
     * Secure method: Returns an immutable String.
     * Clients cannot modify the underlying state of the return value.
     * 
     * @param username user requesting the ID
     * @return 9-digit ID as an immutable String
     */
    public String getMitIdSecure(String username) {
        return cachedIdString; // Secure: String is immutable
    }

    /**
     * Helper method to read the current state of the internal char array cache.
     * @return 
     */
    public char[] getInternalCachedArray() {
        return cachedIdArray;
    }
}
