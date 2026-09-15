package Lab05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testValidAltitude() {
        double altitude = 10.0;
        double expectedEnergy = 98.1;
        
        double actualEnergy = MathUtils.calculateGravitationalPotentialEnergy(altitude);
        
        assertEquals(expectedEnergy, actualEnergy, 0.001);
    }

    @Test
    public void testNegativeAltitudeFailsFast() {
        // Storing the thrown exception in a variable removes the NetBeans warning
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.calculateGravitationalPotentialEnergy(-5.0);
        });
        
        // Optional: verify the error message
        assertNotNull(exception.getMessage());
    }
}