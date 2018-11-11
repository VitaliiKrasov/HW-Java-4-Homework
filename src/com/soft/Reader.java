package com.soft;

import java.util.Scanner;

public class Reader {
    static Scanner scanner = new Scanner(System.in);

    static int readHTTPError() {
        System.out.println("Enter number of HTTP Error:");
        return scanner.nextInt();
    }

    static int readInt() {
        System.out.println("Ebter integer number:");
        return scanner.nextInt();
    }

    static float readFloat() {
        System.out.println("Enter float number:");
        return scanner.nextFloat();
    }
}
