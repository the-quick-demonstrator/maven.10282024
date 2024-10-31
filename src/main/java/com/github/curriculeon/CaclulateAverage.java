package com.github.curriculeon;

public class CaclulateAverage {
    /**
     * This method is deprecated, please use the respective
     * `CaclulateAverage.average(double a, double b)` method as a replacement
     */
    @Deprecated
    public static double average(Integer a, Integer b) {
        return average(a.doubleValue(),b.doubleValue());
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        double average = average(2, 1);
        System.out.println(average);
    }
}
