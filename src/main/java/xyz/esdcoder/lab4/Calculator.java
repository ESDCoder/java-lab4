package xyz.esdcoder.lab4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for geometric calculations.
 */
public class Calculator {

    /**
     * Calculates the area of a parallelogram.
     *
     * @param a The length of side a.
     * @param b The length of side b.
     * @param alpha The angle between side a and side b in degrees.
     * @return The calculated area.
     */
    public static double calculateParallelogramArea(double a, double b, double alpha) {
        double radians = Math.toRadians(alpha);
        return a * b * Math.sin(radians);
    }

    /**
      * Saves the calculation result to a file in the project root.
      *
      * @param result The result to save.
      */
    public static void saveResult(String result) throws IOException {
        try (FileWriter writer = new FileWriter("result.txt")) {
            writer.write(result);
        }
    }
}