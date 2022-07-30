package dsa.course.javabasics1;

import java.util.Scanner;

public class ProductOfNumbers {
    /**
     * 1. Write a Java program that takes two numbers as input and display the product of two numbers.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Product of numbers: "+productOfNumbers());
    }

    private static int productOfNumbers() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        return first *second;
    }
}
