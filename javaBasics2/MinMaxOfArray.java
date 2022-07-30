package dsa.course.javabasics2;

import java.util.Scanner;

public class MinMaxOfArray {
    /**
     * 4. Write a Java program to find the maximum and minimum value of an array.
     * @param args
     */

    public static void main(String[] args) {
	    printMinMaxOfArray();
    }

    private static void printMinMaxOfArray() {
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr= new int[5];
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter five numbers :");

        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            min = Math.min(min, arr[i] );
            max=Math.max(max,arr[i]);
        }
        System.out.println("Min is: " + min+ ". Max is : " + max + ".");

    }
}
