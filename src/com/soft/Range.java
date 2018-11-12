package com.soft;

public class Range {
    private float min = -5;
    private float max = 5;
    private boolean allBelongTo = true;
    private int count = 0;

    public Range() {
    }

    public Range(float min, float max) {
        this.min = min;
        this.max = max;
    }

    String checkAll() {
        if (allBelongTo) {
            return String.format("All %1$s numbers are belong to the range [%2$s : %3$s]",
                    count, min, max);
        } else {
            return "Is not belong in range";
        }
    }

    boolean belongTo(float number) {
        if (min <= number && number <= max) {
            count ++;
            return true;
        } else {
            return allBelongTo = false;
        }
    }


}
