package dsa.course.javabasics2;

import java.util.Scanner;

public class SumOfArray {
    /**
     * 3. Write a Java program to sum values of an array.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Sum of given numbers is: "+ findSum());
    }

    private static double findSum() {
        int sum =0;
        int[] arr= new int[5];

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter five numbers :");

        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        return sum;
    }
}
