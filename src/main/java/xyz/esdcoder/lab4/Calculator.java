package xyz.esdcoder.lab4;

public class Calculator {

    public static double calculateParallelogramArea(double a, double b, double alpha) {
        double radians = Math.toRadians(alpha);
        return a * b * Math.sin(radians);
    }
}
