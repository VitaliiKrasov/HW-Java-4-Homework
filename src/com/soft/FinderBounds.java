package com.soft;

public class FinderBounds {
    String find(Reader reader){
        int min = reader.readInt();
        int max = min;
        for(int i = 1; i < 3; i++) {
            int number = reader.readInt();
            if(number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        return String.format("min = %1$s max = %2$s", min, max);
    }
}
