package com.soft;

import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    int readHTTPError() {
        return scanner.nextInt();
    }

    int readInt() {
        return scanner.nextInt();
    }

    float readFloat() {
        return scanner.nextFloat();
    }
}
