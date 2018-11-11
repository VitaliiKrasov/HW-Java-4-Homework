package com.soft;

public class Range {
    private static float rangeMin = -5;
    private static float rangeMax = -5;

    public static boolean belongTo(float number) {
        if (rangeMin <= number && number <= rangeMax) {
            return true;
        } else return false;
    }

}
