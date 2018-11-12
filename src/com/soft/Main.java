/**
 * Read 3 float numbers and check are they all belong to the range [-5, 5]
 * Read 3 int numbers and write max and min of them
 * Read number of HTTP Error (400, 401, 402, ...) and write the name of this error
 * (Declare enum HTTPError)
 */
package com.soft;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();

        System.out.println("Enter three float numbers:");
        Range range = new Range(-5, 5);
        for (int i = 0; i < 3; i++) {
            range.belongTo(reader.readFloat());
        }
        System.out.println(range.checkAll());

        System.out.println("\nEnter three integers:");
        FinderBounds finderBounds = new FinderBounds();
        System.out.println(finderBounds.find(reader));

        System.out.println("\nEnter number of HTTP Error:");
        System.out.println(HTTPError.of(reader.readHTTPError()));
    }
}
