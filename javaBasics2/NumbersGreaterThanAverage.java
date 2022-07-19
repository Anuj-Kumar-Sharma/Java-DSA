package dsa.course.javabasics2;

import java.util.Scanner;

public class NumbersGreaterThanAverage {
    /**
     * 1. Write a Java program to find the numbers greater than the average of the numbers of a given array.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Average of given numbers is: "+ findAverage());
    }

    private static double findAverage() {
        int sum =0;
        int[] arr= new int[5];

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter five numbers :");

        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        return sum/5;
    }
}
