package com.soft;

public class Range {
    private static float min = -5;
    private static float max = 5;
    private static boolean allBelongTo = true;
    private static int count = 0;

    static String checkAll() {
        if (allBelongTo) {
            return String.format("All %1$s numbers are belong to the range [%2$s : %3$s]",
                    count, min, max);
        } else {
            return "Is not belong in range";
        }
    }

    static boolean belongTo(float number) {
        if (min <= number && number <= max) {
            count ++;
            return true;
        } else {
            return allBelongTo = false;
        }
    }


}
