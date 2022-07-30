package dsa.course.javabasics1;

import java.util.Scanner;

public class LeapYearCheck {
    /**
     * 5. Write a Java program that takes a year from user and print whether that year is a leap year or not.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Provided year is "+ (leapYearCheck()?"leap year.":"not leap year."));
    }

    private static boolean leapYearCheck() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        return year%4==0;
    }
}
