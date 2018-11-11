package com.soft;

import java.util.Scanner;

public class Reader {
    static Scanner scanner = new Scanner(System.in);

    static int readHTTPError() {
        System.out.println("Enter number of HTTP Error:");
        return scanner.nextInt();
    }
}
