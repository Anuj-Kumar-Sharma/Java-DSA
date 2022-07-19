package dsa.course.javabasics1;

import java.util.Scanner;

public class InchesToMeter {
    /**
     * 3. Write a Java program that reads a number in inches, converts it to meters.
     * @param args
     */

    public static final double INCH_TO_METER = 0.0254;
    public static void main(String[] args) {
        System.out.println("Converted Meter: " + inchesToMeter());
    }

    private static double inchesToMeter() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the Inch ");
        double inch = scanner.nextDouble();
        return INCH_TO_METER*inch;
    }
}
