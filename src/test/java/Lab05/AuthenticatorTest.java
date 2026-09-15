package Lab05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticatorTest {

    @Test
    public void testInsecureMitIdModificationCorruptsCache() {
        Authenticator auth = new Authenticator();

        // Retrieve mutable char array from the insecure method
        char[] mitId = auth.getMitId("student1");

        // Client modifies the first 5 digits to '*'
        for (int i = 0; i < 5; i++) {
            mitId[i] = '*';
        }

        // Verify that the client unintentionally corrupted the internal cached state inside Authenticator
        char[] internalCache = auth.getInternalCachedArray();
        assertEquals('*', internalCache[0], "Internal cache was corrupted because mutable array was returned");
        assertEquals("*****4321", new String(internalCache));
    }

    @Test
    public void testSecureMitIdIsImmutable() {
        Authenticator auth = new Authenticator();

        // Retrieve immutable String from the secure method
        String mitId = auth.getMitIdSecure("student1");

        // Modify local string variable using replacement
        String modifiedId = "*****" + mitId.substring(5);

        // Assert that the original returned string and internal state remain untampered
        assertEquals("987654321", mitId);
        assertEquals("987654321", auth.getMitIdSecure("student1"));
        assertNotEquals(mitId, modifiedId);
    }
}