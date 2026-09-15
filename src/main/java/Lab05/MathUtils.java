/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05;

public class MathUtils {

    /**
     * Calculates the gravitational potential energy of an object.
     * 
     * @param altitude altitude in meters relative to sea level. Requires altitude >= 0
     * @return the calculated potential energy value
     * @throws IllegalArgumentException if altitude < 0 (failing fast)
     */
    public static double calculateGravitationalPotentialEnergy(double altitude) {
        if (altitude < 0) {
            throw new IllegalArgumentException("Altitude must be non-negative: " + altitude);
        }
        
        // Standard gravitational constant g = 9.81 m/s^2 (assuming mass = 1 kg for reference)
        double g = 9.81;
        return g * altitude;
    }
}



