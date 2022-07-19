package dsa.course.javabasics1;

import java.util.Scanner;

public class SwapNumbers {
    /**
     * 6. Write a Java program to swap two numbers.
     * @param args
     */

    public static void main(String[] args) {
	    swapNumbers();
    }

    private static void swapNumbers() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        int temp=second;
        second=first;
        first=temp;
        System.out.println("First number is: " + first);
        System.out.println("Second number is: " + second);
    }
}
