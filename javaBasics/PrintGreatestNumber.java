package dsa.course.javabasics1;

import java.util.Scanner;

public class PrintGreatestNumber {
    /**
     * 4. Take three numbers from the user and print the greatest number.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Greatest number is: " + greatestNumber());
    }

    private static int greatestNumber() {
        int max = 0;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        max = Math.max(max,scanner.nextInt());
        max = Math.max(max,scanner.nextInt());
        max = Math.max(max,scanner.nextInt());
        return max;
    }
}
